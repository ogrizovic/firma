package xmlws.firma;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import xmlws.firma.wsclient.ClientCaller;
import xmlws.firma.wsclient.TestClient;

@SpringBootApplication
public class FirmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirmaApplication.class, args);
		
		//ClientCaller cc = new ClientCaller();
//		
		//TestClient cli = cc.getTestClient();
		
//		TestClient cli = new TestClient();
		
		//GetTestDataResponse res = cli.getTestData(3);
		//System.out.println(res.getTestData());
		
//		SOAPTestService srvc = new SOAPTestService();
//		SOAPTestI soap = srvc.getSOAPTestPort();
//		ArrayList<String> result = (ArrayList<String>) soap.getTestData();
//		
//		
////		ArrayList<String> result = (ArrayList)srvc.getSOAPTestPort().getTestData();
//		
//		System.out.println("RESULT:\n");
//		for(String s : result) {
//			System.out.println(s);
//		}
	}
}
