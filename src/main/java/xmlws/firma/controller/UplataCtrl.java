package xmlws.firma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//pravi mi erore
//import xmlws.firma.ws.SOAPTestI;
//import xmlws.firma.ws.SOAPTestService;




@Controller
@RequestMapping(value = "/uplataCtrl")
public class UplataCtrl {
	
	public UplataCtrl(){	
	}
	
	static String bbb = "";
	
	@RequestMapping(method = RequestMethod.POST, consumes=MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<HttpStatus> add(@RequestBody String xmlName) {
		
			System.out.println(xmlName + " AAAAAAAAAAAAAAAAAAAAAAAAAAAA");	
		
			bbb=xmlName;
			
			
			///milanov kod, pravi mi erore
			//SOAPTestService srvc = new SOAPTestService();
			///SOAPTestI soap = srvc.getSOAPTestPort();
			//soap.mojaWebServiceMetodaKojaPozivaUplataService(bbb);
			
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	/*public static String getName(){
		return bbb;
	}
	
	public String posaljiIme(String ime){
		return ime;
	}*/
	
}
