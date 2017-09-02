
package xmlws.firma.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xmlws.firma.ws package. 
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

    private final static QName _GetTestDataResponse_QNAME = new QName("http://soap.service.poslovna.com/", "getTestDataResponse");
    private final static QName _GetTestData_QNAME = new QName("http://soap.service.poslovna.com/", "getTestData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xmlws.firma.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTestDataResponse }
     * 
     */
    public GetTestDataResponse createGetTestDataResponse() {
        return new GetTestDataResponse();
    }

    /**
     * Create an instance of {@link GetTestData }
     * 
     */
    public GetTestData createGetTestData() {
        return new GetTestData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTestDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.poslovna.com/", name = "getTestDataResponse")
    public JAXBElement<GetTestDataResponse> createGetTestDataResponse(GetTestDataResponse value) {
        return new JAXBElement<GetTestDataResponse>(_GetTestDataResponse_QNAME, GetTestDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTestData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.service.poslovna.com/", name = "getTestData")
    public JAXBElement<GetTestData> createGetTestData(GetTestData value) {
        return new JAXBElement<GetTestData>(_GetTestData_QNAME, GetTestData.class, null, value);
    }

}
