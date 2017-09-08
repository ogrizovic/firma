package xmlws.firma.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.castor.CastorMarshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

import xmlws.firma.wsclient.TestClient;

@Configuration
@ComponentScan(basePackages = {"xmlws.firma"})
public class TestSoapConfig {

	
	

//	@Bean(name="testClient")
//	public TestClient testClient(Jaxb2Marshaller unmarshaller) {
////		Jaxb2Marshaller myMarshaller = new Jaxb2Marshaller();
////		myMarshaller.setContextPath("xmlws.firma.wsgenerated");
//		
//		TestClient client = new TestClient();
//		client.setDefaultUri("http://localhost:8001/poslovna/ws/tests.wsdl");
//		client.setMarshaller(unmarshaller);
//		client.setUnmarshaller(unmarshaller);
//		return client;
//	}
	
//	@Bean(name="marshaller")
//	public Jaxb2Marshaller marshaller() {
//		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//		// this package must match the package in the <generatePackage> specified in
//		// pom.xml
//		marshaller.setContextPath("xmlws.firma.wsgenerated");
//		return marshaller;
//	}
	
//	@Bean
//	public CastorMarshaller marshaller() {
//		return new CastorMarshaller();
//	}
	
	
//	@Bean
//	public SaajSoapMessageFactory soapMessageFactory() {
//		SaajSoapMessageFactory smf = new SaajSoapMessageFactory();
//		smf.setSoapVersion(SoapVersion.SOAP_11);
//		return smf;
//	}
	
//	@Bean 
//	public WebServiceTemplate webServiceTemplate(SaajSoapMessageFactory soapMessageFactory, Jaxb2Marshaller marshaller) {
//		WebServiceTemplate wst = new WebServiceTemplate(soapMessageFactory);
//		wst.setDefaultUri("http://localhost:8001/poslovna/ws/tests.wsdl");
//		wst.setMarshaller(marshaller);
//		wst.setUnmarshaller(marshaller);
//		return wst;
//	}
}
