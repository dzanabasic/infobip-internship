package org.infobip.internship.openweather.model;

/**
 *
 * @author ubuntu
 */
public class City {

	private long id;
	private String name;
	private String country;
	private int population;
	private Coord coord;
	private Sys popul;

	public City() {
	}

	public City(long id, String name, String country, int population, Coord coord, Sys popul) {
		this.id = id;
		this.name = name;
		this.country = country;
		this.population = population;
		this.coord = coord;
		this.popul = popul;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	public void setPopul(Sys popul) {
		this.popul = popul;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public int getPopulation() {
		return population;
	}

	public Coord getCoord() {
		return coord;
	}

	public Sys getPopul() {
		return popul;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 53 * hash + (int) (this.id ^ (this.id >>> 32));
		hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
		hash = 53 * hash + (this.country != null ? this.country.hashCode() : 0);
		hash = 53 * hash + this.population;
		hash = 53 * hash + (this.coord != null ? this.coord.hashCode() : 0);
		hash = 53 * hash + (this.popul != null ? this.popul.hashCode() : 0);
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
		final City other = (City) obj;
		if (this.id != other.id) {
			return false;
		}
		if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
			return false;
		}
		if ((this.country == null) ? (other.country != null) : !this.country.equals(other.country)) {
			return false;
		}
		if (this.population != other.population) {
			return false;
		}
		if (this.coord != other.coord && (this.coord == null || !this.coord.equals(other.coord))) {
			return false;
		}
		if (this.popul != other.popul && (this.popul == null || !this.popul.equals(other.popul))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "City{" + "id=" + id + ", name=" + name + ", country=" + country + ", population=" + population + ", coord=" + coord + ", popul=" + popul + '}';
	}

}
