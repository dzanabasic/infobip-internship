package org.infobip.internship.openweather.model;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 *
 * @author ubuntu
 */
public class WeatherFullChart {

	private int cod;
	private double message;
	private City city;
	private int cnt;
	private List[] list;

	public WeatherFullChart() {
	}

	public WeatherFullChart(int cod, double message, City city, int cnt, List[] list) {
		this.cod = cod;
		this.message = message;
		this.city = city;
		this.cnt = cnt;
		this.list = list;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public void setMessage(double message) {
		this.message = message;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public void setList(List[] list) {
		this.list = list;
	}

	public int getCod() {
		return cod;
	}

	public double getMessage() {
		return message;
	}

	public City getCity() {
		return city;
	}

	public int getCnt() {
		return cnt;
	}

	public List[] getList() {
		return list;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 97 * hash + this.cod;
		hash = 97 * hash + (int) (Double.doubleToLongBits(this.message) ^ (Double.doubleToLongBits(this.message) >>> 32));
		hash = 97 * hash + (this.city != null ? this.city.hashCode() : 0);
		hash = 97 * hash + this.cnt;
		hash = 97 * hash + Arrays.deepHashCode(this.list);
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
		final WeatherFullChart other = (WeatherFullChart) obj;
		if (this.cod != other.cod) {
			return false;
		}
		if (Double.doubleToLongBits(this.message) != Double.doubleToLongBits(other.message)) {
			return false;
		}
		if (this.city != other.city && (this.city == null || !this.city.equals(other.city))) {
			return false;
		}
		if (this.cnt != other.cnt) {
			return false;
		}
		if (!Arrays.deepEquals(this.list, other.list)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "WeatherFullChart{" + "cod=" + cod + ", message=" + message + ", city=" + city + ", cnt=" + cnt + ", list=" + list + '}';
	}

}
