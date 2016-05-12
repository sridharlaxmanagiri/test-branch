package com.kewill.cdr.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class DocumentServiceResponse {
	
	private byte[] document;

	private String responseMessage;
	
	@XmlElement (name = "document")
	public byte[] getDocument() {
		return document;
	}

	@XmlElement (name = "responseMessage")
	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public void setDocument(byte[] document) {
		this.document = document;
	}
	
	

}
