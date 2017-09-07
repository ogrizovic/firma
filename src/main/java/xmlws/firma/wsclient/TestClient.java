package xmlws.firma.wsclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import xmlws.firma.webservices.test.GetTestDataRequest;
import xmlws.firma.webservices.test.GetTestDataResponse;

public class TestClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(TestClient.class);
	
	public GetTestDataResponse getTestData(int index) {
		
		GetTestDataRequest request = new GetTestDataRequest();
		request.setIndexOfTestData(index);
		
		log.info("Request for testData with index: " + index);
		
		GetTestDataResponse response = (GetTestDataResponse) getWebServiceTemplate()
				.marshalSendAndReceive("http://localhost:8001/poslovna/ws", request, new SoapActionCallback(""));
		
		log.info("Response is returned");
		return response;
	}
}
