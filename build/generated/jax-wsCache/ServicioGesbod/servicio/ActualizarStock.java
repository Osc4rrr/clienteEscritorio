
package servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actualizarStock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actualizarStock">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo_produicto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cantidadProducto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarStock", propOrder = {
    "codigoProduicto",
    "cantidadProducto"
})
public class ActualizarStock {

    @XmlElement(name = "codigo_produicto")
    protected int codigoProduicto;
    protected int cantidadProducto;

    /**
     * Gets the value of the codigoProduicto property.
     * 
     */
    public int getCodigoProduicto() {
        return codigoProduicto;
    }

    /**
     * Sets the value of the codigoProduicto property.
     * 
     */
    public void setCodigoProduicto(int value) {
        this.codigoProduicto = value;
    }

    /**
     * Gets the value of the cantidadProducto property.
     * 
     */
    public int getCantidadProducto() {
        return cantidadProducto;
    }

    /**
     * Sets the value of the cantidadProducto property.
     * 
     */
    public void setCantidadProducto(int value) {
        this.cantidadProducto = value;
    }

}
