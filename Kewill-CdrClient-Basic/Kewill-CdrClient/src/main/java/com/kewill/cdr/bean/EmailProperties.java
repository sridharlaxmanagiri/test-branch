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
public class EmailProperties implements Serializable {

    /**
     * Default Serial Version UID
     */
    private static final long serialVersionUID = 1L;

    /** host */
    private String host;

    /** to */
    private String[] to;

    /** from */
    private String from;

    /** cc */
    private String[] cc;

    /** bcc */
    private String[] bcc;

    /** subject */
    private String subject;

    /** body */
    private String body;

    /** port */
    private String port;

    /** protocol */
    private String protocol;

    /** username */
    private String username;

    /** password */
    private String password;

    /** displayName */
    private String displayName;
    
    /** URL of the mail  service */
    private String url;

    public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/** is Authentication Required */
    private boolean authRequired = Boolean.FALSE;

    /** is SSL required */
    private boolean sslRequired = Boolean.FALSE;

    /** is TLS Required */
    private boolean tlsRequired = Boolean.FALSE;

    /**
     * @return the host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host
     *            the host to set
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return the from
     */
    public String getFrom() {
        return from;
    }

    /**
     * @param from
     *            the from to set
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject
     *            the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body
     *            the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * @return the port
     */
    public String getPort() {
        return port;
    }

    /**
     * @param port
     *            the port to set
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * @return the protocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * @param protocol
     *            the protocol to set
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     *            the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     *            the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * @param displayName
     *            the displayName to set
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * @return the to
     */
    public String[] getTo() {
        return to;
    }

    /**
     * @param to
     *            the to to set
     */
    public void setTo(String[] to) {
        this.to = to;
    }

    /**
     * @return the cc
     */
    public String[] getCc() {
        return cc;
    }

    /**
     * @param cc
     *            the cc to set
     */
    public void setCc(String[] cc) {
        this.cc = cc;
    }

    /**
     * @return the bcc
     */
    public String[] getBcc() {
        return bcc;
    }

    /**
     * @param bcc
     *            the bcc to set
     */
    public void setBcc(String[] bcc) {
        this.bcc = bcc;
    }

    /**
     * @return the authRequired
     */
    public boolean isAuthRequired() {
        return authRequired;
    }

    /**
     * @param authRequired
     *            the authRequired to set
     */
    public void setAuthRequired(boolean authRequired) {
        this.authRequired = authRequired;
    }

    /**
     * @return the sslRequired
     */
    public boolean isSslRequired() {
        return sslRequired;
    }

    /**
     * @param sslRequired
     *            the sslRequired to set
     */
    public void setSslRequired(boolean sslRequired) {
        this.sslRequired = sslRequired;
    }

    /**
     * @return the tlsRequired
     */
    public boolean isTlsRequired() {
        return tlsRequired;
    }

    /**
     * @param tlsRequired
     *            the tlsRequired to set
     */
    public void setTlsRequired(boolean tlsRequired) {
        this.tlsRequired = tlsRequired;
    }

}
