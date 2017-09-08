package xmlws.firma.wsclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

public class ClientCaller {

	private Jaxb2Marshaller marshaller;
	
	private TestClient testClient;
	
	public ClientCaller() {
		marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("xmlws.firma.wsgenerated");
		this.testClient = new TestClient();
		testClient.getWebServiceTemplate().setMarshaller(marshaller);;
		testClient.getWebServiceTemplate().setUnmarshaller(marshaller);
		testClient.setDefaultUri("http://localhost:8001/poslovna/ws/tests.wsdl");
	}
	
	public TestClient getTestClient() {
		return this.testClient;
	}
}
