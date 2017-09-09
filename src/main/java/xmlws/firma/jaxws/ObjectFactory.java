
package xmlws.firma.jaxws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xmlws.firma.jaxws package. 
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

    private final static QName _HandleUplataResponse_QNAME = new QName("http://soap.service.poslovna.com/", "handleUplataResponse");
    private final static QName _HandleUplata_QNAME = new QName("http://soap.service.poslovna.com/", "handleUplata");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xmlws.firma.jaxws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HandleUplata }
     * 
     */
    public HandleUplata createHandleUplata() {
        return new HandleUplata();
    }

    /**
     * Create an instance of {@link HandleUplataResponse }
     * 
     */
    public HandleUplataResponse createHandleUplataResponse() {
        return new HandleUplataResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleUplataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.poslovna.com/", name = "handleUplataResponse")
    public JAXBElement<HandleUplataResponse> createHandleUplataResponse(HandleUplataResponse value) {
        return new JAXBElement<HandleUplataResponse>(_HandleUplataResponse_QNAME, HandleUplataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleUplata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.poslovna.com/", name = "handleUplata")
    public JAXBElement<HandleUplata> createHandleUplata(HandleUplata value) {
        return new JAXBElement<HandleUplata>(_HandleUplata_QNAME, HandleUplata.class, null, value);
    }

}
