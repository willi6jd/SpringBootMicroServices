package com.plainplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 *Handle the /start endpoint
 *@return
 */
@Controller
public class PlainPlacesController {

	
	@RequestMapping("/start")
	public String start() {
		
		return "start";
	}
	@RequestMapping("/index")
	public String index() {
		
		return "start";
	}
}
