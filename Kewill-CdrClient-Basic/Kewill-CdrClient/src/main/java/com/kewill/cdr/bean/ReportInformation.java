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
public class ReportInformation implements Serializable {

    /**
     * Default serial version UID
     */
    private static final long serialVersionUID = 1L;

    /** localeLanguage */
    private String localeLanguage;

    /** localeCoountry */
    private String localeCountry;

    /** TENENAT */
    private String tenant = "TENANT";

    /** CUSTOMER */
    private String customer = "CUSTOMER";

    /** USER */
    private String user = "USER";

    /** productIdentifier name of the product */
    private String productIdentifier;

    /**
     * @return the localeLanguage
     */
    public String getLocaleLanguage() {
        return localeLanguage;
    }

    /**
     * @param localeLanguage
     *            the localeLanguage to set
     */
    public void setLocaleLanguage(String localeLanguage) {
        this.localeLanguage = localeLanguage;
    }

    /**
     * @return the localeCountry
     */
    public String getLocaleCountry() {
        return localeCountry;
    }

    /**
     * @param localeCountry
     *            the localeCountry to set
     */
    public void setLocaleCountry(String localeCountry) {
        this.localeCountry = localeCountry;
    }

    /**
     * @return the tenant
     */
    public String getTenant() {
        return tenant;
    }

    /**
     * @param tenant
     *            the tenant to set
     */
    public void setTenant(String tenant) {
        if (tenant != null && !tenant.trim().equals("")) {
            this.tenant = tenant;
        } else {
            this.tenant = "TENANT";
        }
    }

    /**
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @param customer
     *            the customer to set
     */
    public void setCustomer(String customer) {
        if (customer != null && !customer.trim().equals("")) {
            this.customer = customer;
        } else {
            this.customer = "CUSTOMER";
        }
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user
     *            the user to set
     */
    public void setUser(String user) {
        if (user != null && !user.trim().equals("")) {
            this.user = user;
        } else {
            this.user = "USER";
        }
    }

    /**
     * @return the productIdentifier
     */
    public String getProductIdentifier() {
        return productIdentifier;
    }

    /**
     * @param productIdentifier
     *            the productIdentifier to set
     */
    public void setProductIdentifier(String productIdentifier) {
        this.productIdentifier = productIdentifier;
    }

}
