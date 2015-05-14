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

/**
 *
 * @author ubuntu
 */
public class WeatherApi {

	private static final String WEAHTER_URI = "http://api.openweathermap.org/data/2.5/weather?q=";
	private static final Gson GSON = new GsonBuilder().create();

	private HttpClient httpClient;

	public WeatherFull getCurrentWeather(String city, String code) throws IOException {
		HttpUriRequest httpUriRequest = new HttpGet(buildUri(city, code));
		final HttpResponse httpResponse = getHttpClient().execute(httpUriRequest);
		return GSON.fromJson(EntityUtils.toString(httpResponse.getEntity()), WeatherFull.class);
	}

	private static String buildUri(String city, String code) {
		return WEAHTER_URI + city + "," + code;
	}

	private HttpClient getHttpClient() {
		if (httpClient == null) {
			httpClient = HttpClientBuilder.create().build();
		}
		return httpClient;
	}
}
