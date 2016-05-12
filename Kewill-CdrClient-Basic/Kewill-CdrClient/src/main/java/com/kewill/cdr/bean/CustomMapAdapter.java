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
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author rangam
 *
 */
public class CustomMapAdapter extends XmlAdapter<MapElements[], Map<String, String>> implements
        Serializable {

    /**
     * Default Serial Version UID
     */
    private static final long serialVersionUID = 1L;

    /**
     * marshal# Called when JAXB marshalling
     * 
     */
    public MapElements[] marshal(Map<String, String> arg0) throws Exception {
        MapElements[] mapElements = new MapElements[arg0.size()];
        int i = 0;
        for (Map.Entry<String, String> entry : arg0.entrySet())
            mapElements[i++] = new MapElements(entry.getKey(), entry.getValue());

        return mapElements;
    }

    /**
     * unmarshal# Called when JAXB unmarshalling
     * 
     */
    public Map<String, String> unmarshal(MapElements[] arg0) throws Exception {
        Map<String, String> r = new HashMap<String, String>();
        for (MapElements mapelement : arg0)
            r.put(mapelement.key, mapelement.value);
        return r;
    }
}
