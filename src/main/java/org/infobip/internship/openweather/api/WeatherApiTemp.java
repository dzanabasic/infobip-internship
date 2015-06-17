package org.infobip.internship.openweather.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.infobip.internship.openweather.model.WeatherFull;
import org.infobip.internship.openweather.model.WeatherFullChart;

/**
 *
 * @author ubuntu
 */
public class WeatherApiTemp {

	private static final String WEAHTER_URI_TEMP ="http://api.openweathermap.org/data/2.5/forecast?q=";
	private static final Gson GSON = new GsonBuilder().create();

	private HttpClient httpClient;

	public WeatherFullChart getTemperature(String city) throws IOException {
		HttpUriRequest httpUriRequest = new HttpGet(buildUri(city));
		final HttpResponse httpResponse = getHttpClient().execute(httpUriRequest);
		return GSON.fromJson(EntityUtils.toString(httpResponse.getEntity()), WeatherFullChart.class);
	}

	private static String buildUri(String city) {
		return WEAHTER_URI_TEMP + city ;
	}

	private HttpClient getHttpClient() {
		if (httpClient == null) {
			httpClient = HttpClientBuilder.create().build();
		}
		return httpClient;
	}

	
}
	

