package org.infobip.internship.controller;

import com.google.gson.Gson;
import java.io.IOException;
import static org.infobip.internship.controller.Const.DATA2;
import static org.infobip.internship.controller.Const.DATA;

import org.infobip.internship.openweather.api.WeatherApi;
import org.infobip.internship.openweather.api.WeatherApiTemp;
import org.infobip.internship.openweather.model.Temperature;
import org.infobip.internship.openweather.model.WeatherFull;
import org.infobip.internship.openweather.model.WeatherFullChart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ubuntu
 */
@Controller
public class ChartController {

	private static final Gson GSON = new Gson();
	private WeatherApiTemp weatherapitemp;

	@Autowired
	public ChartController(WeatherApiTemp weatherApiTemp) {
		this.weatherapitemp = weatherApiTemp;
	}

	@RequestMapping(value = "/chart", method = RequestMethod.GET)
	public String get(ModelMap model) throws IOException {
	
		return "chart";
	}

	@RequestMapping(value = "/chart/city/{city}")
	public @ResponseBody
	String getTemperature(ModelMap model,
			@PathVariable(value = "city") String city) throws IOException {
		final WeatherFullChart temperature = weatherapitemp.getTemperature(city);

		return GSON.toJson(temperature);
	}

}
