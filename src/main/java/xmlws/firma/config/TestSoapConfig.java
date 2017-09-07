package xmlws.firma.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import xmlws.firma.wsclient.TestClient;

@Configuration
public class TestSoapConfig {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in
		// pom.xml
		marshaller.setContextPath("xmlws.firma.webservices.test");
		return marshaller;
	}
	
	@Bean
	public TestClient testClient(Jaxb2Marshaller marshaller) {
		TestClient client = new TestClient();
		client.setDefaultUri("http://localhost:8001/poslovna/ws");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}
