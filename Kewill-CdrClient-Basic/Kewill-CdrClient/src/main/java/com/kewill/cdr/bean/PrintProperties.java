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

/**
 * @author rangam
 *
 */
public class PrintProperties implements Serializable {

    /**
     * Default Serial version UID
     */
    private static final long serialVersionUID = 1L;

    /** URL of the remote print service */
    private String url;

    /** Identifiers */
    private String[] identifiers;

    /** Printer ID for printing */
    private String printerId;

    /** Status */
    private boolean status;

    private String uniqueId;
    
    private String paperSource;
    
    

	/**
     * @return the uniqueId
     */
    public String getUniqueId() {
		return uniqueId;
	}

    /**
     * @param uniqueId
     *            the uniqueId to set
     */
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	
	/**
     * @return the paperSource
     */
	public String getPaperSource() {
		return paperSource;
	}

	/**
     * @param paperSource
     *            the paperSource to set
     */
	public void setPaperSource(String paperSource) {
		this.paperSource = paperSource;
	}

	/**
     * @return the printerId
     */
    public String getPrinterId() {
        return printerId;
    }

    /**
     * @param printerId
     *            the printerId to set
     */
    public void setPrinterId(String printerId) {
        this.printerId = printerId;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status
     *            the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the identifiers
     */
    public String[] getIdentifiers() {
        return identifiers;
    }

    /**
     * @param identifiers
     *            the identifiers to set
     */
    public void setIdentifiers(String[] identifiers) {
        this.identifiers = identifiers;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     *            the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
