
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saludoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saludoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saludar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saludoResponse", propOrder = {
    "saludar"
})
public class SaludoResponse {

    protected String saludar;

    /**
     * Gets the value of the saludar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaludar() {
        return saludar;
    }

    /**
     * Sets the value of the saludar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaludar(String value) {
        this.saludar = value;
    }

}
