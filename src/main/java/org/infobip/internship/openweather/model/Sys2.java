package org.infobip.internship.openweather.model;

/**
 *
 * @author ubuntu
 */
public class Sys2 {
private String pod;

	public Sys2() {
	}

	public Sys2(String pod) {
		this.pod = pod;
	}

	public void setPod(String pod) {
		this.pod = pod;
	}

	public String getPod() {
		return pod;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 17 * hash + (this.pod != null ? this.pod.hashCode() : 0);
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
		final Sys2 other = (Sys2) obj;
		if ((this.pod == null) ? (other.pod != null) : !this.pod.equals(other.pod)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Sys2{" + "pod=" + pod + '}';
	}

}
