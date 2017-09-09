package xmlws.firma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import xmlws.firma.jaxws.BankaWsService;

//pravi mi erore
//import xmlws.firma.ws.SOAPTestI;
//import xmlws.firma.ws.SOAPTestService;




@Controller
@RequestMapping(value = "/uplataCtrl")
public class UplataCtrl {
	
	public UplataCtrl(){	
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes=MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<HttpStatus> add(@RequestBody String xmlName) {
		
		BankaWsService bwss = new BankaWsService();
		String response = bwss.getBankaWsPort().handleUplata(xmlName);
		System.out.println(response);
		
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	/*public static String getName(){
		return bbb;
	}
	
	public String posaljiIme(String ime){
		return ime;
	}*/
	
}
