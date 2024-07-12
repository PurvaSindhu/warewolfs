package com.xworkz.movies.dto;

public class MoviesDto {

	
	private String movieName;
	private String hero;
	private String heroin;
	private int ticketPrice;
	public MoviesDto(String movieName, String hero, String heroin, int ticketPrice) {
		super();
		this.movieName = movieName;
		this.hero = hero;
		this.heroin = heroin;
		this.ticketPrice = ticketPrice;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getHeroin() {
		return heroin;
	}
	public void setHeroin(String heroin) {
		this.heroin = heroin;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	@Override
	public String toString() {
		return "MoviesDto [movieName=" + movieName + ", hero=" + hero + ", heroin=" + heroin + ", ticketPrice="
				+ ticketPrice + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hero == null) ? 0 : hero.hashCode());
		result = prime * result + ((heroin == null) ? 0 : heroin.hashCode());
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		result = prime * result + ticketPrice;
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
		MoviesDto other = (MoviesDto) obj;
		if (hero == null) {
			if (other.hero != null)
				return false;
		} else if (!hero.equals(other.hero))
			return false;
		if (heroin == null) {
			if (other.heroin != null)
				return false;
		} else if (!heroin.equals(other.heroin))
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		if (ticketPrice != other.ticketPrice)
			return false;
		return true;
	}
	
}
