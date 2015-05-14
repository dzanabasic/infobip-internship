package org.infobip.internship.controller;

import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ubuntu
 */
@Controller
public class WeatherController {
	
	@RequestMapping(value = "/weather", method = RequestMethod.GET)
	public String get(ModelMap model) throws IOException {

		model.addAttribute("test", "tt");
		return "weather";

	}
	
}
