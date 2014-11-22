
package com.cdyne.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentSummary" type="{http://ws.cdyne.com/}DocumentSummary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentSummary"
})
@XmlRootElement(name = "CheckTextBodyResponse")
public class CheckTextBodyResponse {

    @XmlElement(name = "DocumentSummary", required = true, nillable = true)
    protected DocumentSummary documentSummary;

    /**
     * Ruft den Wert der documentSummary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSummary }
     *     
     */
    public DocumentSummary getDocumentSummary() {
        return documentSummary;
    }

    /**
     * Legt den Wert der documentSummary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSummary }
     *     
     */
    public void setDocumentSummary(DocumentSummary value) {
        this.documentSummary = value;
    }

}
