
package wsaula;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsaula package. 
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

    private final static QName _DolarParaReal_QNAME = new QName("http://wsaula/", "dolarParaReal");
    private final static QName _DolarParaRealResponse_QNAME = new QName("http://wsaula/", "dolarParaRealResponse");
    private final static QName _EuroParaReal_QNAME = new QName("http://wsaula/", "euroParaReal");
    private final static QName _EuroParaRealResponse_QNAME = new QName("http://wsaula/", "euroParaRealResponse");
    private final static QName _LibrasParaReal_QNAME = new QName("http://wsaula/", "librasParaReal");
    private final static QName _LibrasParaRealResponse_QNAME = new QName("http://wsaula/", "librasParaRealResponse");
    private final static QName _RealParaEuro_QNAME = new QName("http://wsaula/", "realParaEuro");
    private final static QName _RealParaEuroResponse_QNAME = new QName("http://wsaula/", "realParaEuroResponse");
    private final static QName _RealParaLibras_QNAME = new QName("http://wsaula/", "realParaLibras");
    private final static QName _RealParaLibrasResponse_QNAME = new QName("http://wsaula/", "realParaLibrasResponse");
    private final static QName _RealToDolar_QNAME = new QName("http://wsaula/", "realToDolar");
    private final static QName _RealToDolarResponse_QNAME = new QName("http://wsaula/", "realToDolarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsaula
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DolarParaReal }
     * 
     */
    public DolarParaReal createDolarParaReal() {
        return new DolarParaReal();
    }

    /**
     * Create an instance of {@link DolarParaRealResponse }
     * 
     */
    public DolarParaRealResponse createDolarParaRealResponse() {
        return new DolarParaRealResponse();
    }

    /**
     * Create an instance of {@link EuroParaReal }
     * 
     */
    public EuroParaReal createEuroParaReal() {
        return new EuroParaReal();
    }

    /**
     * Create an instance of {@link EuroParaRealResponse }
     * 
     */
    public EuroParaRealResponse createEuroParaRealResponse() {
        return new EuroParaRealResponse();
    }

    /**
     * Create an instance of {@link LibrasParaReal }
     * 
     */
    public LibrasParaReal createLibrasParaReal() {
        return new LibrasParaReal();
    }

    /**
     * Create an instance of {@link LibrasParaRealResponse }
     * 
     */
    public LibrasParaRealResponse createLibrasParaRealResponse() {
        return new LibrasParaRealResponse();
    }

    /**
     * Create an instance of {@link RealParaEuro }
     * 
     */
    public RealParaEuro createRealParaEuro() {
        return new RealParaEuro();
    }

    /**
     * Create an instance of {@link RealParaEuroResponse }
     * 
     */
    public RealParaEuroResponse createRealParaEuroResponse() {
        return new RealParaEuroResponse();
    }

    /**
     * Create an instance of {@link RealParaLibras }
     * 
     */
    public RealParaLibras createRealParaLibras() {
        return new RealParaLibras();
    }

    /**
     * Create an instance of {@link RealParaLibrasResponse }
     * 
     */
    public RealParaLibrasResponse createRealParaLibrasResponse() {
        return new RealParaLibrasResponse();
    }

    /**
     * Create an instance of {@link RealToDolar }
     * 
     */
    public RealToDolar createRealToDolar() {
        return new RealToDolar();
    }

    /**
     * Create an instance of {@link RealToDolarResponse }
     * 
     */
    public RealToDolarResponse createRealToDolarResponse() {
        return new RealToDolarResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DolarParaReal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "dolarParaReal")
    public JAXBElement<DolarParaReal> createDolarParaReal(DolarParaReal value) {
        return new JAXBElement<DolarParaReal>(_DolarParaReal_QNAME, DolarParaReal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DolarParaRealResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "dolarParaRealResponse")
    public JAXBElement<DolarParaRealResponse> createDolarParaRealResponse(DolarParaRealResponse value) {
        return new JAXBElement<DolarParaRealResponse>(_DolarParaRealResponse_QNAME, DolarParaRealResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroParaReal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "euroParaReal")
    public JAXBElement<EuroParaReal> createEuroParaReal(EuroParaReal value) {
        return new JAXBElement<EuroParaReal>(_EuroParaReal_QNAME, EuroParaReal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroParaRealResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "euroParaRealResponse")
    public JAXBElement<EuroParaRealResponse> createEuroParaRealResponse(EuroParaRealResponse value) {
        return new JAXBElement<EuroParaRealResponse>(_EuroParaRealResponse_QNAME, EuroParaRealResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibrasParaReal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "librasParaReal")
    public JAXBElement<LibrasParaReal> createLibrasParaReal(LibrasParaReal value) {
        return new JAXBElement<LibrasParaReal>(_LibrasParaReal_QNAME, LibrasParaReal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibrasParaRealResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "librasParaRealResponse")
    public JAXBElement<LibrasParaRealResponse> createLibrasParaRealResponse(LibrasParaRealResponse value) {
        return new JAXBElement<LibrasParaRealResponse>(_LibrasParaRealResponse_QNAME, LibrasParaRealResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealParaEuro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "realParaEuro")
    public JAXBElement<RealParaEuro> createRealParaEuro(RealParaEuro value) {
        return new JAXBElement<RealParaEuro>(_RealParaEuro_QNAME, RealParaEuro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealParaEuroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "realParaEuroResponse")
    public JAXBElement<RealParaEuroResponse> createRealParaEuroResponse(RealParaEuroResponse value) {
        return new JAXBElement<RealParaEuroResponse>(_RealParaEuroResponse_QNAME, RealParaEuroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealParaLibras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "realParaLibras")
    public JAXBElement<RealParaLibras> createRealParaLibras(RealParaLibras value) {
        return new JAXBElement<RealParaLibras>(_RealParaLibras_QNAME, RealParaLibras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealParaLibrasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "realParaLibrasResponse")
    public JAXBElement<RealParaLibrasResponse> createRealParaLibrasResponse(RealParaLibrasResponse value) {
        return new JAXBElement<RealParaLibrasResponse>(_RealParaLibrasResponse_QNAME, RealParaLibrasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealToDolar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "realToDolar")
    public JAXBElement<RealToDolar> createRealToDolar(RealToDolar value) {
        return new JAXBElement<RealToDolar>(_RealToDolar_QNAME, RealToDolar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealToDolarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsaula/", name = "realToDolarResponse")
    public JAXBElement<RealToDolarResponse> createRealToDolarResponse(RealToDolarResponse value) {
        return new JAXBElement<RealToDolarResponse>(_RealToDolarResponse_QNAME, RealToDolarResponse.class, null, value);
    }

}
