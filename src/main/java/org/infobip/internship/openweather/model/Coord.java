package org.infobip.internship.openweather.model;

public class Coord {

	private double lon;
	private double lat;

	public Coord() {
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 13 * hash + (int) (Double.doubleToLongBits(this.lon) ^ (Double.doubleToLongBits(this.lon) >>> 32));
		hash = 13 * hash + (int) (Double.doubleToLongBits(this.lat) ^ (Double.doubleToLongBits(this.lat) >>> 32));
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
		final Coord other = (Coord) obj;
		if (Double.doubleToLongBits(this.lon) != Double.doubleToLongBits(other.lon)) {
			return false;
		}
		if (Double.doubleToLongBits(this.lat) != Double.doubleToLongBits(other.lat)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Coord{" + "lon=" + lon + ", lat=" + lat + '}';
	}
}
