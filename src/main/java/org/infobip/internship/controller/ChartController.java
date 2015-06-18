package org.infobip.internship.controller;

import com.google.gson.Gson;
import java.io.IOException;
import org.infobip.internship.openweather.api.WeatherApiTemp;
import org.infobip.internship.openweather.model.List;
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
	private WeatherApiTemp weatherApiTemp;

	public ChartController() {
	}

	@RequestMapping(value = "/chart", method = RequestMethod.GET)
	public String get(ModelMap model) throws IOException {
		return "chart";
	}

	@RequestMapping(value = "/chart/city/{city}")
	public @ResponseBody
	String getTemperature(ModelMap model,
			@PathVariable(value = "city") String city) throws IOException {
		final WeatherFullChart temperature = getWeatherApiTemp().getTemperature(city);
		return timeReturn(temperature);
//		return GSON.toJson(temperature);
	}

	public WeatherApiTemp getWeatherApiTemp() {
		if (weatherApiTemp == null) {
			weatherApiTemp = new WeatherApiTemp();
		}
		return weatherApiTemp;
	}

	public String timeReturn(WeatherFullChart time) {
		final List[] list = time.getList();
		String datetime = "";
		for (int i = 0; i < list.length; i++) {
			if (i == 0) {
				datetime += "[" + "[" + list[i].getDt() + "," + list[i].getMain().getTemp_max() + "],";
			}
			if (i == list.length - 1) {
				datetime += "[" + list[i].getDt() + "," + list[i].getMain().getTemp_max() + "]" + "]";
			} else {
				datetime += "[" + list[i].getDt() + "," + list[i].getMain().getTemp_max() + "],";
			}
		}
		return datetime;
	}

}
