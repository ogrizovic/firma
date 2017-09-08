package xmlws.firma.wsclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

import xmlws.firma.wsgenerated.GetTestDataRequest;
import xmlws.firma.wsgenerated.GetTestDataResponse;

@Component
public class TestClient extends WebServiceGatewaySupport {

//	@Autowired
//	private WebServiceTemplate webServiceTemplate;
//	@Autowired
//	private Jaxb2Marshaller marshaller;
	
	private static final Logger log = LoggerFactory.getLogger(TestClient.class);
	
	
	public GetTestDataResponse getTestData(int index) {
		
		GetTestDataRequest request = new GetTestDataRequest();
		request.setIndexOfTestData(index);
		
		log.info("Request for testData with index: " + index);
		
		Jaxb2Marshaller tmp = (Jaxb2Marshaller) getWebServiceTemplate().getMarshaller();
		
		GetTestDataResponse response = (GetTestDataResponse) getWebServiceTemplate().marshalSendAndReceive("http://localhost:8001/poslovna/ws", request);
		
		log.info("Response is returned");
		return response;
	}
}
