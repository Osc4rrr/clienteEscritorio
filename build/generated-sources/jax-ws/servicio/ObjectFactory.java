
package servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ActualizarStockResponse_QNAME = new QName("http://servicios/", "actualizarStockResponse");
    private final static QName _ConsultarProductos_QNAME = new QName("http://servicios/", "consultarProductos");
    private final static QName _GetProductoResponse_QNAME = new QName("http://servicios/", "getProductoResponse");
    private final static QName _ConsultarProductosResponse_QNAME = new QName("http://servicios/", "consultarProductosResponse");
    private final static QName _ActualizarStock_QNAME = new QName("http://servicios/", "actualizarStock");
    private final static QName _SaludoResponse_QNAME = new QName("http://servicios/", "saludoResponse");
    private final static QName _GetProducto_QNAME = new QName("http://servicios/", "getProducto");
    private final static QName _Saludo_QNAME = new QName("http://servicios/", "saludo");
    private final static QName _SumarResponse_QNAME = new QName("http://servicios/", "sumarResponse");
    private final static QName _Sumar_QNAME = new QName("http://servicios/", "sumar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProducto }
     * 
     */
    public GetProducto createGetProducto() {
        return new GetProducto();
    }

    /**
     * Create an instance of {@link Saludo }
     * 
     */
    public Saludo createSaludo() {
        return new Saludo();
    }

    /**
     * Create an instance of {@link SumarResponse }
     * 
     */
    public SumarResponse createSumarResponse() {
        return new SumarResponse();
    }

    /**
     * Create an instance of {@link Sumar }
     * 
     */
    public Sumar createSumar() {
        return new Sumar();
    }

    /**
     * Create an instance of {@link ActualizarStockResponse }
     * 
     */
    public ActualizarStockResponse createActualizarStockResponse() {
        return new ActualizarStockResponse();
    }

    /**
     * Create an instance of {@link ConsultarProductos }
     * 
     */
    public ConsultarProductos createConsultarProductos() {
        return new ConsultarProductos();
    }

    /**
     * Create an instance of {@link GetProductoResponse }
     * 
     */
    public GetProductoResponse createGetProductoResponse() {
        return new GetProductoResponse();
    }

    /**
     * Create an instance of {@link ConsultarProductosResponse }
     * 
     */
    public ConsultarProductosResponse createConsultarProductosResponse() {
        return new ConsultarProductosResponse();
    }

    /**
     * Create an instance of {@link ActualizarStock }
     * 
     */
    public ActualizarStock createActualizarStock() {
        return new ActualizarStock();
    }

    /**
     * Create an instance of {@link SaludoResponse }
     * 
     */
    public SaludoResponse createSaludoResponse() {
        return new SaludoResponse();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarStockResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "actualizarStockResponse")
    public JAXBElement<ActualizarStockResponse> createActualizarStockResponse(ActualizarStockResponse value) {
        return new JAXBElement<ActualizarStockResponse>(_ActualizarStockResponse_QNAME, ActualizarStockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "consultarProductos")
    public JAXBElement<ConsultarProductos> createConsultarProductos(ConsultarProductos value) {
        return new JAXBElement<ConsultarProductos>(_ConsultarProductos_QNAME, ConsultarProductos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "getProductoResponse")
    public JAXBElement<GetProductoResponse> createGetProductoResponse(GetProductoResponse value) {
        return new JAXBElement<GetProductoResponse>(_GetProductoResponse_QNAME, GetProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProductosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "consultarProductosResponse")
    public JAXBElement<ConsultarProductosResponse> createConsultarProductosResponse(ConsultarProductosResponse value) {
        return new JAXBElement<ConsultarProductosResponse>(_ConsultarProductosResponse_QNAME, ConsultarProductosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarStock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "actualizarStock")
    public JAXBElement<ActualizarStock> createActualizarStock(ActualizarStock value) {
        return new JAXBElement<ActualizarStock>(_ActualizarStock_QNAME, ActualizarStock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaludoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "saludoResponse")
    public JAXBElement<SaludoResponse> createSaludoResponse(SaludoResponse value) {
        return new JAXBElement<SaludoResponse>(_SaludoResponse_QNAME, SaludoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "getProducto")
    public JAXBElement<GetProducto> createGetProducto(GetProducto value) {
        return new JAXBElement<GetProducto>(_GetProducto_QNAME, GetProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Saludo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "saludo")
    public JAXBElement<Saludo> createSaludo(Saludo value) {
        return new JAXBElement<Saludo>(_Saludo_QNAME, Saludo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "sumarResponse")
    public JAXBElement<SumarResponse> createSumarResponse(SumarResponse value) {
        return new JAXBElement<SumarResponse>(_SumarResponse_QNAME, SumarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sumar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "sumar")
    public JAXBElement<Sumar> createSumar(Sumar value) {
        return new JAXBElement<Sumar>(_Sumar_QNAME, Sumar.class, null, value);
    }

}
