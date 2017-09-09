package xmlws.firma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import xmlws.firma.service.FakturaService;


@Controller
@RequestMapping(value = "/fakturaCtrl")
public class FakturaCtrl {

	//@Autowired
	//private FakturaService fakturaService;
	
	
	public FakturaCtrl(){	
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes=MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<HttpStatus> add(@RequestBody String xmlName) {

	System.out.println("Izabrana faktura: " + xmlName);
	
	return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	
}
