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
public class JasperParameters implements Serializable {

    /**
     * Default Serial Version UID
     */
    private static final long serialVersionUID = 1L;

    /** Name of the parameter */
    private String paramName;

    /** Value of the parameter */
    private String paramValue;

    /**
     * JasperParameters # Sets the values
     * 
     * @param paramName
     * @param paramValue
     */
    public JasperParameters(String paramName, String paramValue) {
        this.paramName = paramName;
        this.paramValue = paramValue;
    }

    /**
     * Default Constructor
     */
    public JasperParameters() {

    }

    /**
     * @return the paramName
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * @param paramName
     *            the paramName to set
     */
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    /**
     * @return the paramValue
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * @param paramValue
     *            the paramValue to set
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

}
