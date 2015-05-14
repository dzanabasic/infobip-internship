package org.infobip.internship.openweather.model;

/**
 *
 * @author ubuntu
 */
public class Clouds {

	private int all;

	public Clouds(int all) {
		this.all = all;
	}

	public void setAll(int all) {
		this.all = all;
	}

	public int getAll() {
		return all;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 37 * hash + this.all;
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
		final Clouds other = (Clouds) obj;
		if (this.all != other.all) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Clouds{" + "all=" + all + '}';
	}
}
