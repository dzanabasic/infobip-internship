package org.infobip.internship.openweather.model;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author ubuntu
 */
public class WeatherFull {

	private Coord coord;
	private SunAppearance sys;
	private Weather[] weather;
	private String base;
	private Temperature main;
	private Wind wind;
	private Clouds clouds;
	private long dt;
	private long id;
	private String name;
	private int cod;

	public WeatherFull(Coord coord, SunAppearance sys, Weather[] weather, String base, Temperature main, Wind wind, Clouds clouds, long dt, long id, String name, int cod) {
		this.coord = coord;
		this.sys = sys;
		this.weather = weather;
		this.base = base;
		this.main = main;
		this.wind = wind;
		this.clouds = clouds;
		this.dt = dt;
		this.id = id;
		this.name = name;
		this.cod = cod;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	public void setSys(SunAppearance sys) {
		this.sys = sys;
	}

	public void setWeather(Weather[] weather) {
		this.weather = weather;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public void setMain(Temperature main) {
		this.main = main;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public void setDt(long dt) {
		this.dt = dt;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public Coord getCoord() {
		return coord;
	}

	public SunAppearance getSys() {
		return sys;
	}

	public Weather[] getWeather() {
		return weather;
	}

	public String getBase() {
		return base;
	}

	public Temperature getMain() {
		return main;
	}

	public Wind getWind() {
		return wind;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public long getDt() {
		return dt;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getCod() {
		return cod;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 79 * hash + Objects.hashCode(this.coord);
		hash = 79 * hash + Objects.hashCode(this.sys);
		hash = 79 * hash + Arrays.deepHashCode(this.weather);
		hash = 79 * hash + Objects.hashCode(this.base);
		hash = 79 * hash + Objects.hashCode(this.main);
		hash = 79 * hash + Objects.hashCode(this.wind);
		hash = 79 * hash + Objects.hashCode(this.clouds);
		hash = 79 * hash + (int) (this.dt ^ (this.dt >>> 32));
		hash = 79 * hash + (int) (this.id ^ (this.id >>> 32));
		hash = 79 * hash + Objects.hashCode(this.name);
		hash = 79 * hash + this.cod;
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
		final WeatherFull other = (WeatherFull) obj;
		if (!Objects.equals(this.coord, other.coord)) {
			return false;
		}
		if (!Objects.equals(this.sys, other.sys)) {
			return false;
		}
		if (!Arrays.deepEquals(this.weather, other.weather)) {
			return false;
		}
		if (!Objects.equals(this.base, other.base)) {
			return false;
		}
		if (!Objects.equals(this.main, other.main)) {
			return false;
		}
		if (!Objects.equals(this.wind, other.wind)) {
			return false;
		}
		if (!Objects.equals(this.clouds, other.clouds)) {
			return false;
		}
		if (this.dt != other.dt) {
			return false;
		}
		if (this.id != other.id) {
			return false;
		}
		if (!Objects.equals(this.name, other.name)) {
			return false;
		}
		if (this.cod != other.cod) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "WeatherFull{" + "coord=" + coord + ", sys=" + sys + ", weather=" + Arrays.toString(weather) + ", base=" + base + ", main=" + main + ", wind=" + wind + ", clouds=" + clouds + ", dt=" + dt + ", id=" + id + ", name=" + name + ", cod=" + cod + '}';
	}
}
