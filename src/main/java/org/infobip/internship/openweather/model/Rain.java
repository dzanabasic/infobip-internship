package org.infobip.internship.openweather.model;

/**
 *
 * @author ubuntu
 */
public class Rain {
private String rain;

	@Override
	public String toString() {
		return "Rain{" + "rain=" + rain + '}';
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 23 * hash + (this.rain != null ? this.rain.hashCode() : 0);
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
		final Rain other = (Rain) obj;
		if ((this.rain == null) ? (other.rain != null) : !this.rain.equals(other.rain)) {
			return false;
		}
		return true;
	}

	public String getRain() {
		return rain;
	}

	public void setRain(String rain) {
		this.rain = rain;
	}

	public Rain(String rain) {
		this.rain = rain;
	}

	public Rain() {
	}
}
