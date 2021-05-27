
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sumar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sumar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="digito1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="digito2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sumar", propOrder = {
    "digito1",
    "digito2"
})
public class Sumar {

    protected int digito1;
    protected int digito2;

    /**
     * Gets the value of the digito1 property.
     * 
     */
    public int getDigito1() {
        return digito1;
    }

    /**
     * Sets the value of the digito1 property.
     * 
     */
    public void setDigito1(int value) {
        this.digito1 = value;
    }

    /**
     * Gets the value of the digito2 property.
     * 
     */
    public int getDigito2() {
        return digito2;
    }

    /**
     * Sets the value of the digito2 property.
     * 
     */
    public void setDigito2(int value) {
        this.digito2 = value;
    }

}
