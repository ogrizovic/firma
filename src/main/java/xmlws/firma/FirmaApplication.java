package xmlws.firma;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import xmlws.firma.ws.SOAPTestI;
import xmlws.firma.ws.SOAPTestService;

@SpringBootApplication
public class FirmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirmaApplication.class, args);
		
		SOAPTestService srvc = new SOAPTestService();
		SOAPTestI soap = srvc.getSOAPTestPort();
		ArrayList<String> result = (ArrayList<String>) soap.getTestData();
		
		
//		ArrayList<String> result = (ArrayList)srvc.getSOAPTestPort().getTestData();
		
		System.out.println("RESULT:\n");
		for(String s : result) {
			System.out.println(s);
		}
	}
}
