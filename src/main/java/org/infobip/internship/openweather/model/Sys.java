package org.infobip.internship.openweather.model;

/**
 *
 * @author ubuntu
 */
public class Sys {

	private int population;

	@Override
	public String toString() {
		return "Sys{" + "population=" + population + '}';
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 11 * hash + this.population;
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
		final Sys other = (Sys) obj;
		if (this.population != other.population) {
			return false;
		}
		return true;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public Sys(int population) {
		this.population = population;
	}
}
