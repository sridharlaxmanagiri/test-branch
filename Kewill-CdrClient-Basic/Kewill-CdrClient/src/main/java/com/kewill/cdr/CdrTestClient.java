package com.kewill.cdr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import com.kewill.cdr.bean.JasperParameters;
import com.kewill.cdr.bean.ReportDefinition;
import com.kewill.cdr.bean.ReportInformation;
import com.kewill.cdr.constants.GenerationMode;
import com.kewill.cdr.constants.JasperReportFormats;

public class CdrTestClient {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		ReportDefinition dob = getDefaultCdrBean();
		byte[] documentBytes = CdrServiceClient.invokeService(dob);
		createFile(documentBytes);
	}

	/**
	 * Default format : PDF
	 * Default mode: File
	 * Default Locale: en_us
	 * @return
	 */
	private static ReportDefinition getDefaultCdrBean(){
		ReportDefinition dob = new ReportDefinition();
		dob.setUdrCode("KCM_DEVTEST_ADAEBABFAA");//Mandatory		
		dob.setXmlData(convertXMLFileToString("D:\\DocumentServer\\JRXML\\KW\\temp.xml").getBytes());//Mandatory
		return dob;
		
	}
	
	private static ReportDefinition constructCdrBean(){
		ReportDefinition dob = new ReportDefinition();
		dob.setUdrCode("KW_KAMDELIVERYINST_BCDAFDBADA");//Mandatory
		
		dob.setXmlData(CdrTestClient.convertXMLFileToString("D:\\DocumentServer\\JRXML\\KW\\temp.xml").getBytes());//Mandatory
		dob.setReportFormat(JasperReportFormats.PDF);//Optional Default from UDR Component
		dob.setGenerationMode(GenerationMode.FILE);//Optional Defalt: FILE
		dob.setFileName("Main765123");//Optional

		ReportInformation commonParameters = new ReportInformation();
		commonParameters.setProductIdentifier("KW");//Optional Default from UDR Component
	    commonParameters.setTenant("DML");//Optional Default from UDR Component
		commonParameters.setLocaleCountry("us");//Optional Default: us
	    commonParameters.setLocaleLanguage("en");//Optional Default: en
		dob.setCommonParameters(commonParameters);

		List<JasperParameters> list = new ArrayList<JasperParameters>();
		list.add(new JasperParameters("WHcustId", "TLLSBS"));
		list.add(new JasperParameters("from", "12-Dec-20214"));
		list.add(new JasperParameters("to", "15-Dec-2014"));
		list.add(new JasperParameters("born", "BOTH"));
		dob.setParams(list);
		
		return dob;
		
	}
	

	private static void createFile(byte[] documentBytes){
		try {
			String fileName = "D:\\DocumentServer\\ " + generateRandomFileName() + ".pdf";
			OutputStream outputStream = new FileOutputStream(new File(fileName));
			outputStream.write(documentBytes);
			outputStream.flush();
			outputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String convertXMLFileToString(String fileName) {
		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			InputStream inputStream = new FileInputStream(new File(fileName));
			org.w3c.dom.Document doc = documentBuilderFactory
					.newDocumentBuilder().parse(inputStream);
			StringWriter stw = new StringWriter();
			Transformer serializer = TransformerFactory.newInstance()
					.newTransformer();
			serializer.transform(new DOMSource(doc), new StreamResult(stw));
			return stw.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static String generateRandomFileName() {
		return UUID.randomUUID().toString();
	}
		

}

