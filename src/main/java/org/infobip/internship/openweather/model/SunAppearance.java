package org.infobip.internship.openweather.model;

import java.util.Objects;

/**
 *
 * @author ubuntu
 */
public class SunAppearance {

	private double message;
	private String country;
	private long sunrise;
	private long sunset;

	public SunAppearance() {
	}

	public double getMessage() {
		return message;
	}

	public void setMessage(double message) {
		this.message = message;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getSunrise() {
		return sunrise;
	}

	public void setSunrise(long sunrise) {
		this.sunrise = sunrise;
	}

	public long getSunset() {
		return sunset;
	}

	public void setSunset(long sunset) {
		this.sunset = sunset;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 59 * hash + (int) (Double.doubleToLongBits(this.message) ^ (Double.doubleToLongBits(this.message) >>> 32));
		hash = 59 * hash + Objects.hashCode(this.country);
		hash = 59 * hash + (int) (this.sunrise ^ (this.sunrise >>> 32));
		hash = 59 * hash + (int) (this.sunset ^ (this.sunset >>> 32));
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
		final SunAppearance other = (SunAppearance) obj;
		if (Double.doubleToLongBits(this.message) != Double.doubleToLongBits(other.message)) {
			return false;
		}
		if (!Objects.equals(this.country, other.country)) {
			return false;
		}
		if (this.sunrise != other.sunrise) {
			return false;
		}
		if (this.sunset != other.sunset) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Sys{" + "message=" + message + ", country=" + country + ", sunrise=" + sunrise + ", sunset=" + sunset + '}';
	}
}
