package org.infobip.internship.openweather.model;

/**
 *
 * @author ubuntu
 */
public class Wind {

	
	private double speed;
	private double deg;

	public Wind(double speed, int deg) {
		this.speed = speed;
		this.deg = deg;
	}
	

		@Override
	public String toString() {
		return "Wind{" + "speed=" + speed + ", deg=" + deg + '}';
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 23 * hash + (int) (Double.doubleToLongBits(this.speed) ^ (Double.doubleToLongBits(this.speed) >>> 32));
		hash = (int) (23 * hash + this.deg);
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
		final Wind other = (Wind) obj;
		if (Double.doubleToLongBits(this.speed) != Double.doubleToLongBits(other.speed)) {
			return false;
		}
		if (this.deg != other.deg) {
			return false;
		}
		return true;
	}

}


