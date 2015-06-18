package org.infobip.internship.openweather.model;

import java.util.Arrays;

/**
 *
 * @author ubuntu
 */
public class List {
	private long dt;
	private MainTemperature main;
	private Weather[] weather;
	private Clouds clouds;
	private Wind wind;
	private Rain rain;
	private Sys2 pod;
	private String dt_text;

	public List() {
	}

	public List(long dt, MainTemperature maintemperature, Weather[] weather, Clouds clouds, Wind wind, Rain rain, Sys2 pod, String dt_text) {
		this.dt = dt;
		this.main = maintemperature;
		this.weather = weather;
		this.clouds = clouds;
		this.wind = wind;
		this.rain = rain;
		this.pod = pod;
		this.dt_text = dt_text;
	}

	public void setDt(long dt) {
		this.dt = dt;
	}

	public void setMain(MainTemperature main) {
		this.main = main;
	}

	public void setWeather(Weather[] weather) {
		this.weather = weather;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public void setRain(Rain rain) {
		this.rain = rain;
	}

	public void setPod(Sys2 pod) {
		this.pod = pod;
	}

	public void setDt_text(String dt_text) {
		this.dt_text = dt_text;
	}

	public long getDt() {
		return dt;
	}

	public MainTemperature getMain() {
		return main;
	}

	public Weather[] getWeather() {
		return weather;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public Wind getWind() {
		return wind;
	}

	public Rain getRain() {
		return rain;
	}

	public Sys2 getPod() {
		return pod;
	}

	public String getDt_text() {
		return dt_text;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + (int) (this.dt ^ (this.dt >>> 32));
		hash = 97 * hash + (this.main != null ? this.main.hashCode() : 0);
		hash = 97 * hash + Arrays.deepHashCode(this.weather);
		hash = 97 * hash + (this.clouds != null ? this.clouds.hashCode() : 0);
		hash = 97 * hash + (this.wind != null ? this.wind.hashCode() : 0);
		hash = 97 * hash + (this.rain != null ? this.rain.hashCode() : 0);
		hash = 97 * hash + (this.pod != null ? this.pod.hashCode() : 0);
		hash = 97 * hash + (this.dt_text != null ? this.dt_text.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final List other = (List) obj;
		if (this.dt != other.dt) {
			return false;
		}
		if (this.main != other.main && (this.main == null || !this.main.equals(other.main))) {
			return false;
		}
		if (!Arrays.deepEquals(this.weather, other.weather)) {
			return false;
		}
		if (this.clouds != other.clouds && (this.clouds == null || !this.clouds.equals(other.clouds))) {
			return false;
		}
		if (this.wind != other.wind && (this.wind == null || !this.wind.equals(other.wind))) {
			return false;
		}
		if (this.rain != other.rain && (this.rain == null || !this.rain.equals(other.rain))) {
			return false;
		}
		if (this.pod != other.pod && (this.pod == null || !this.pod.equals(other.pod))) {
			return false;
		}
		if ((this.dt_text == null) ? (other.dt_text != null) : !this.dt_text.equals(other.dt_text)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "List{" + "dt=" + dt + ", maintemperature=" + main + ", weather=" + weather + ", clouds=" + clouds + ", wind=" + wind + ", rain=" + rain + ", pod=" + pod + ", dt_text=" + dt_text + '}';
	}
	
	
}
