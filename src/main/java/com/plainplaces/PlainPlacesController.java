package com.plainplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Administrator
 *Handle the /start endpoint
 *@return
 */

@Controller
public class PlainPlacesController {

	
	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public String read() {
		
		
		return "start";
		
	}
	@RequestMapping(value = "/start", method = RequestMethod.GET, params = {"loyalty=blue"})
	public String readBlue() {
		
		
		return "start";
		
	}
	@RequestMapping(value = "/start", method = RequestMethod.GET, params = {"loyalty=silver"})
	public String readSilver() {
		
		
		return "start";
		
	}
	@RequestMapping(value = "/start", method = RequestMethod.GET, headers = {"content-type = text/json"})
	public String readJson() {
		
		
		return "start";
		
	}
	@PostMapping("/start")
	public String create() {
		
		return "start";
		
	}
	/**
	 * Handle the / endpoint
	 *@return
	 */
	@RequestMapping("/index")
	public String index() {
		
		return "start";
	}
}
