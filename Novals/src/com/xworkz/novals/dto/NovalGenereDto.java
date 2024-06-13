package com.xworkz.novals.dto;

public class NovalGenereDto {

	private String fantasy;
	private String horror;
	private String mystery;
	private String scienceFiction;
	private String comedy;
	private String nonFiction;
	private String thriller;
	private String historicalmystery;
	private String romance;
	private boolean EnjoyReading;

	public NovalGenereDto() {
		System.out.println("this is a no args");
	}

	public NovalGenereDto(String fantasy, String horror, String mystery, String scienceFiction, String comedy,
			String nonFiction, String thriller, String historicalmystery, String romance, boolean EnjoyReading) {
		this.fantasy = fantasy;
		this.horror = horror;
		this.mystery = mystery;
		this.scienceFiction = scienceFiction;
		this.comedy = comedy;
		this.nonFiction = nonFiction;
		this.thriller = thriller;
		this.historicalmystery = historicalmystery;
		this.romance = romance;
		this.EnjoyReading = EnjoyReading;
	}

	public String getFantasy() {
		System.out.println("fantasy" + fantasy);
		return fantasy;
	}

	public void setFantasy(String fantasy) {
		this.fantasy = fantasy;
	}

	public String getHorror() {
		System.out.println("horror" + horror);
		return horror;
	}

	public void setHorror(String horror) {
		this.horror = horror;
	}

	public String getMystery() {
		System.out.println("mystery" + mystery);
		return mystery;
	}

	public void setMystery(String mystery) {
		this.mystery = mystery;
	}

	public String getScienceFiction() {
		System.out.println("scienceFiction" + scienceFiction);
		return scienceFiction;
	}

	public void setScienceFiction(String scienceFiction) {
		this.scienceFiction = scienceFiction;
	}

	public String getComedy() {
		System.out.println("comedy" + comedy);
		return comedy;
	}

	public void setComedy(String comedy) {
		this.comedy = comedy;
	}

	public String getNonFiction() {
		System.out.println("nonFiction" + nonFiction);
		return nonFiction;
	}

	public void setNonFiction(String nonFiction) {
		this.nonFiction = nonFiction;
	}

	public String getThriller() {
		System.out.println("thriller" + thriller);
		return thriller;
	}

	public void setThriller(String thriller) {
		this.thriller = thriller;
	}

	public String getHistoricalmystery() {
		System.out.println("historicalmystery"+historicalmystery);
		return historicalmystery;
	}

	public void setHistoricalmystery(String historicalmystery) {
		this.historicalmystery = historicalmystery;
	}

	public String getRomance() {
		System.out.println("romance"+romance);
		return romance;
	}

	public void setRomance(String romance) {
		this.romance = romance;
	}

	public boolean isEnjoyReading() {
		System.out.println("EnjoyReading"+EnjoyReading);
		return EnjoyReading;
	}

	public void setEnjoyReading(boolean enjoyReading) {
		EnjoyReading = enjoyReading;
	}

	@Override
	public String toString() {
		return "NovalGenereDto [fantasy=" + fantasy + ", horror=" + horror + ", mystery=" + mystery
				+ ", scienceFiction=" + scienceFiction + ", comedy=" + comedy + ", nonFiction=" + nonFiction
				+ ", thriller=" + thriller + ", historicalmystery=" + historicalmystery + ", romance=" + romance
				+ ", EnjoyReading=" + EnjoyReading + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (EnjoyReading ? 1231 : 1237);
		result = prime * result + ((comedy == null) ? 0 : comedy.hashCode());
		result = prime * result + ((fantasy == null) ? 0 : fantasy.hashCode());
		result = prime * result + ((historicalmystery == null) ? 0 : historicalmystery.hashCode());
		result = prime * result + ((horror == null) ? 0 : horror.hashCode());
		result = prime * result + ((mystery == null) ? 0 : mystery.hashCode());
		result = prime * result + ((nonFiction == null) ? 0 : nonFiction.hashCode());
		result = prime * result + ((romance == null) ? 0 : romance.hashCode());
		result = prime * result + ((scienceFiction == null) ? 0 : scienceFiction.hashCode());
		result = prime * result + ((thriller == null) ? 0 : thriller.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NovalGenereDto other = (NovalGenereDto) obj;
		if (EnjoyReading != other.EnjoyReading)
			return false;
		if (comedy == null) {
			if (other.comedy != null)
				return false;
		} else if (!comedy.equals(other.comedy))
			return false;
		if (fantasy == null) {
			if (other.fantasy != null)
				return false;
		} else if (!fantasy.equals(other.fantasy))
			return false;
		if (historicalmystery == null) {
			if (other.historicalmystery != null)
				return false;
		} else if (!historicalmystery.equals(other.historicalmystery))
			return false;
		if (horror == null) {
			if (other.horror != null)
				return false;
		} else if (!horror.equals(other.horror))
			return false;
		if (mystery == null) {
			if (other.mystery != null)
				return false;
		} else if (!mystery.equals(other.mystery))
			return false;
		if (nonFiction == null) {
			if (other.nonFiction != null)
				return false;
		} else if (!nonFiction.equals(other.nonFiction))
			return false;
		if (romance == null) {
			if (other.romance != null)
				return false;
		} else if (!romance.equals(other.romance))
			return false;
		if (scienceFiction == null) {
			if (other.scienceFiction != null)
				return false;
		} else if (!scienceFiction.equals(other.scienceFiction))
			return false;
		if (thriller == null) {
			if (other.thriller != null)
				return false;
		} else if (!thriller.equals(other.thriller))
			return false;
		return true;
	}

}
