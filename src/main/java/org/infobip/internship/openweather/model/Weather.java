package org.infobip.internship.openweather.model;

import java.util.Objects;

/**
 *
 * @author ubuntu
 */
public class Weather {

	private int id;
	private String main;
	private String description;
	private String icon;

	public Weather(int id, String main, String description, String icon) {
		this.id = id;
		this.main = main;
		this.description = description;
		this.icon = icon;
	}

	public Weather() {
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getId() {
		return id;
	}

	public String getMain() {
		return main;
	}

	public String getDescription() {
		return description;
	}

	public String getIcon() {
		return icon;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 11 * hash + this.id;
		hash = 11 * hash + Objects.hashCode(this.main);
		hash = 11 * hash + Objects.hashCode(this.description);
		hash = 11 * hash + Objects.hashCode(this.icon);
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
		final Weather other = (Weather) obj;
		if (this.id != other.id) {
			return false;
		}
		if (!Objects.equals(this.main, other.main)) {
			return false;
		}
		if (!Objects.equals(this.description, other.description)) {
			return false;
		}
		if (!Objects.equals(this.icon, other.icon)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Weather{" + "id=" + id + ", main=" + main + ", description=" + description + ", icon=" + icon + '}';
	}
}
