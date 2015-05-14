package org.infobip.internship.controller;

import com.google.gson.Gson;
import java.io.IOException;
import org.infobip.internship.openweather.api.WeatherApi;
import org.infobip.internship.openweather.model.WeatherFull;
import org.infobip.internship.util.PropertiesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	private static final Gson GSON = new Gson();
	private WeatherApi weatherApi;

	@Autowired
	public IndexController(WeatherApi weatherApi) {
		this.weatherApi = weatherApi;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String get(ModelMap model) throws IOException {
		return "index";

	}

	@RequestMapping(value = "/index/city/{city}/code/{code}")
	public @ResponseBody String findCity(ModelMap model,
			@PathVariable(value = "city") String city,
			@PathVariable(value = "code") String code) throws IOException {
		
		return GSON.toJson(weatherApi.getCurrentWeather(city, code));
	}

}

