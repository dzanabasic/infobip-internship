package org.infobip.internship.openweather.model;

/**
 *
 * @author ubuntu
 */
public class Temperature {

	private double temp;
	private double temp_min;
	private double temp_max;
	private double pressure;
	private double sea_level;
	private double grnd_level;
	private double humidity;

	public Temperature(double temp, double temp_min, double temp_max, double pressure, double sea_level, double grnd_level, double humidity) {
		this.temp = temp;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
		this.pressure = pressure;
		this.sea_level = sea_level;
		this.grnd_level = grnd_level;
		this.humidity = humidity;
	}

	public Temperature() {
		// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}

	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public void setSea_level(double sea_level) {
		this.sea_level = sea_level;
	}

	public void setGrnd_level(double grnd_level) {
		this.grnd_level = grnd_level;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public double getTemp() {
		return temp;
	}

	public double getTemp_min() {
		return temp_min;
	}

	public double getTemp_max() {
		return temp_max;
	}

	public double getPressure() {
		return pressure;
	}

	public double getSea_level() {
		return sea_level;
	}

	public double getGrnd_level() {
		return grnd_level;
	}

	public double getHumidity() {
		return humidity;
	}

	@Override
	public String toString() {
		return "Main{" + "temp=" + temp + ", temp_min=" + temp_min + ", temp_max=" + temp_max + ", pressure=" + pressure + ", sea_level=" + sea_level + ", grnd_level=" + grnd_level + ", humidity=" + humidity + '}';
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 73 * hash + (int) (Double.doubleToLongBits(this.temp) ^ (Double.doubleToLongBits(this.temp) >>> 32));
		hash = 73 * hash + (int) (Double.doubleToLongBits(this.temp_min) ^ (Double.doubleToLongBits(this.temp_min) >>> 32));
		hash = 73 * hash + (int) (Double.doubleToLongBits(this.temp_max) ^ (Double.doubleToLongBits(this.temp_max) >>> 32));
		hash = 73 * hash + (int) (Double.doubleToLongBits(this.pressure) ^ (Double.doubleToLongBits(this.pressure) >>> 32));
		hash = 73 * hash + (int) (Double.doubleToLongBits(this.sea_level) ^ (Double.doubleToLongBits(this.sea_level) >>> 32));
		hash = 73 * hash + (int) (Double.doubleToLongBits(this.grnd_level) ^ (Double.doubleToLongBits(this.grnd_level) >>> 32));
		hash = 73 * hash + (int) (Double.doubleToLongBits(this.humidity) ^ (Double.doubleToLongBits(this.humidity) >>> 32));
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
		final Temperature other = (Temperature) obj;
		if (Double.doubleToLongBits(this.temp) != Double.doubleToLongBits(other.temp)) {
			return false;
		}
		if (Double.doubleToLongBits(this.temp_min) != Double.doubleToLongBits(other.temp_min)) {
			return false;
		}
		if (Double.doubleToLongBits(this.temp_max) != Double.doubleToLongBits(other.temp_max)) {
			return false;
		}
		if (Double.doubleToLongBits(this.pressure) != Double.doubleToLongBits(other.pressure)) {
			return false;
		}
		if (Double.doubleToLongBits(this.sea_level) != Double.doubleToLongBits(other.sea_level)) {
			return false;
		}
		if (Double.doubleToLongBits(this.grnd_level) != Double.doubleToLongBits(other.grnd_level)) {
			return false;
		}
		if (Double.doubleToLongBits(this.humidity) != Double.doubleToLongBits(other.humidity)) {
			return false;
		}
		return true;
	}
}
