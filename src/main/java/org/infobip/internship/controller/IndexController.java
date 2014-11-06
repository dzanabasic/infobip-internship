package org.infobip.internship.controller;

import java.io.IOException;
import org.infobip.internship.util.PropertiesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	private final PropertiesUtils propertiesUtils;

	@Autowired
	public IndexController(PropertiesUtils propertiesUtils) {
		this.propertiesUtils = propertiesUtils;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String get(ModelMap model) throws IOException {

		model.addAttribute("properties", propertiesUtils.getPropertiesFileHtmlContent());
		return "index";

	}
}
