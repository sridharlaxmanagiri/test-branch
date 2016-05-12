/*
 * Kewill ("COMPANY") CONFIDENTIAL
 * 
 * Unpublished Copyright (c) 2009-2014 Kewill, All Rights Reserved.
 * 
 * NOTICE: All information contained herein is, and remains the property of COMPANY. The
 * intellectual and technical concepts contained herein are proprietary to COMPANY and may be
 * covered by U.S. and Foreign Patents, patents in process, and are protected by trade secret or
 * copyright law.
 * 
 * Dissemination of this information or reproduction of this material is strictly forbidden unless
 * prior written permission is obtained from COMPANY. Access to the source code contained herein is
 * hereby forbidden to anyone except current, authorized COMPANY employees, managers or contractors
 * who have executed Confidentiality and Non-disclosure agreements explicitly covering such access.
 * 
 * The copyright notice above does not evidence any actual or intended publication or disclosure of
 * this source code, which includes information that is confidential and/or proprietary, and is a
 * trade secret, of COMPANY.
 * 
 * ANY REPRODUCTION, MODIFICATION, DISTRIBUTION, PUBLIC PERFORMANCE, OR PUBLIC DISPLAY OF OR THROUGH
 * USE OF THIS SOURCE CODE WITHOUT THE EXPRESS WRITTEN CONSENT OF COMPANY IS STRICTLY PROHIBITED,
 * AND IN VIOLATION OF APPLICABLE LAWS AND INTERNATIONAL TREATIES. THE RECEIPT OR POSSESSION OF THIS
 * SOURCE CODE AND/OR RELATED INFORMATION DOES NOT CONVEY OR IMPLY ANY RIGHTS TO REPRODUCE, DISCLOSE
 * OR DISTRIBUTE ITS CONTENTS, OR TO MANUFACTURE, USE, OR SELL ANYTHING THAT IT MAY DESCRIBE, IN
 * WHOLE OR IN PART.
 */
package com.kewill.cdr.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import com.kewill.cdr.constants.GenerationMode;

/**
 * @author rangam
 *
 */
@XmlRootElement(name = "CustomJasperDataFormatter")
public class ReportDefinition implements Serializable {

    /**
     * Default serial version UID
     */
    private static final long serialVersionUID = 1L;

    /** reportIdentifier for unique identification of report */
    private String reportIdentifier;

    /** Report Format for generating report in that particular */
    private String reportFormat;

    /** XMl data for filling the document/print */
    private Object xmlData;

    /** Specifies which type of data source to be used */
    private String dataSourceType;

    /** date Pattern */
    private String datePattern = "dd-MM-yyyy";

    /** Number Pattern */
    private String numberPattern = "#,##0.##";

    /** Display report name */
    private String reportName;

    /** Mode of generating the report */
    private String generationMode = GenerationMode.FILE;

    /** ReportInformation Common parameters document generation */
    private ReportInformation commonParameters = new ReportInformation();

    /** Jasper Document parameters */
    private List<JasperParameters> params = new ArrayList<JasperParameters>();

    /** EmailProperties for carrying email related parameters */
    private EmailProperties emailProperties;

    /** PrintProperties for carrying remote print related parameters */
    private PrintProperties printProperties;
    
    /** File Name For The Generated Report */
    private String fileName;
    
    private Map allocationCriteriaMap;
    
    private boolean useUdrTemplate;
    
    private String udrCode;

    public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
     * @return the reportIdentifier
     */
    public String getReportIdentifier() {
        return reportIdentifier;
    }

    /**
     * @param reportIdentifier
     *            the reportIdentifier to set
     */
    public void setReportIdentifier(String reportIdentifier) {
        this.reportIdentifier = reportIdentifier;
    }

    /**
     * @return the reportFormat
     */
    public String getReportFormat() {
        return reportFormat;
    }

    /**
     * @param reportFormat
     *            the reportFormat to set
     */
    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

   

    /**
	 * @return the xmlData
	 */
	public Object getXmlData() {
		return xmlData;
	}

	/**
	 * @param xmlData the xmlData to set
	 */
	public void setXmlData(Object xmlData) {
		this.xmlData = xmlData;
	}

	/**
     * @return the dataSourceType
     */
    public String getDataSourceType() {
        return dataSourceType;
    }

    /**
     * @param dataSourceType
     *            the dataSourceType to set
     */
    public void setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    /**
     * @return the datePattern
     */
    public String getDatePattern() {
        return datePattern;
    }

    /**
     * @param datePattern
     *            the datePattern to set
     */
    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }

    /**
     * @return the numberPattern
     */
    public String getNumberPattern() {
        return numberPattern;
    }

    /**
     * @param numberPattern
     *            the numberPattern to set
     */
    public void setNumberPattern(String numberPattern) {
        this.numberPattern = numberPattern;
    }

    /**
     * @return the params
     */
    public List<JasperParameters> getParams() {
        return params;
    }

    /**
     * @param params
     *            the params to set
     */
    public void setParams(List<JasperParameters> params) {
        this.params = params;
    }

    /**
     * @return the reportName
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * @param reportName
     *            the reportName to set
     */
    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    /**
     * @return the generationMode
     */
    public String getGenerationMode() {
        return generationMode;
    }

    /**
     * @param generationMode
     *            the generationMode to set
     */
    public void setGenerationMode(String generationMode) {
        this.generationMode = generationMode;
    }

    /**
     * @return the commonParameters
     */
    public ReportInformation getCommonParameters() {
        return commonParameters;
    }

    /**
     * @param commonParameters
     *            the commonParameters to set
     */
    public void setCommonParameters(ReportInformation commonParameters) {
        this.commonParameters = commonParameters;
    }

    /**
     * @return the emailProperties
     */
    public EmailProperties getEmailProperties() {
        return emailProperties;
    }

    /**
     * @param emailProperties
     *            the emailProperties to set
     */
    public void setEmailProperties(EmailProperties emailProperties) {
        this.emailProperties = emailProperties;
    }

    /**
     * @return the printProperties
     */
    public PrintProperties getPrintProperties() {
        return printProperties;
    }

    /**
     * @param printProperties
     *            the printProperties to set
     */
    public void setPrintProperties(PrintProperties printProperties) {
        this.printProperties = printProperties;
    }

	/**
	 * @return the allocationCriteriaMap
	 */
	public Map getAllocationCriteriaMap() {
		return allocationCriteriaMap;
	}

	/**
	 * @param allocationCriteriaMap the allocationCriteriaMap to set
	 */
	public void setAllocationCriteriaMap(Map allocationCriteriaMap) {
		this.allocationCriteriaMap = allocationCriteriaMap;
	}

	/**
	 * @return the udrCode
	 */
	public String getUdrCode() {
		return udrCode;
	}

	/**
	 * @param udrCode the udrCode to set
	 */
	public void setUdrCode(String udrCode) {
		this.udrCode = udrCode;
	}

	/**
	 * @return the useUdrTemplate
	 */
	public boolean isUseUdrTemplate() {
		return useUdrTemplate;
	}

	/**
	 * @param useUdrTemplate the useUdrTemplate to set
	 */
	public void setUseUdrTemplate(boolean useUdrTemplate) {
		this.useUdrTemplate = useUdrTemplate;
	}

}
