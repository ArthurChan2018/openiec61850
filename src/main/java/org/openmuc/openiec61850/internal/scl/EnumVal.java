/*
 * Copyright 2011-17 Fraunhofer ISE, energy & meteo Systems GmbH and other contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.openmuc.openiec61850.internal.scl;

import org.openmuc.openiec61850.SclParseException;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public final class EnumVal {

    private final String id;
    private int ord;

    public EnumVal(String id, int ord) {
        this.id = id;
        this.ord = ord;
    }

    public EnumVal(Node xmlNode) throws SclParseException {
        id = xmlNode.getTextContent();

        NamedNodeMap attributes = xmlNode.getAttributes();

        Node node = attributes.getNamedItem("ord");

        if (node == null) {
            throw new SclParseException("Required attribute \"ord\" not found!");
        }

        try {
            ord = Integer.parseInt(node.getNodeValue());
        } catch (NumberFormatException e) {
            throw new SclParseException("EnumVal contains invalid \"ord\" number.");
        }
    }

    public String getId() {
        return id;
    }

    public int getOrd() {
        return ord;
    }
}
