package com.xworkz.television.dto;

public class TelevisionDto {
	
	private String tvShows;
	private String movies;
	private int adPrice;
	private int connectionPrice;
	public TelevisionDto(String tvShows, String movies, int adPrice, int connectionPrice) {
		super();
		this.tvShows = tvShows;
		this.movies = movies;
		this.adPrice = adPrice;
		this.connectionPrice = connectionPrice;
	}
	public String getTvShows() {
		return tvShows;
	}
	public void setTvShows(String tvShows) {
		this.tvShows = tvShows;
	}
	public String getMovies() {
		return movies;
	}
	public void setMovies(String movies) {
		this.movies = movies;
	}
	public int getAdPrice() {
		return adPrice;
	}
	public void setAdPrice(int adPrice) {
		this.adPrice = adPrice;
	}
	public int getConnectionPrice() {
		return connectionPrice;
	}
	public void setConnectionPrice(int connectionPrice) {
		this.connectionPrice = connectionPrice;
	}
	@Override
	public String toString() {
		return "TelevisionDto [tvShows=" + tvShows + ", movies=" + movies + ", adPrice=" + adPrice
				+ ", connectionPrice=" + connectionPrice + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + adPrice;
		result = prime * result + connectionPrice;
		result = prime * result + ((movies == null) ? 0 : movies.hashCode());
		result = prime * result + ((tvShows == null) ? 0 : tvShows.hashCode());
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
		TelevisionDto other = (TelevisionDto) obj;
		if (adPrice != other.adPrice)
			return false;
		if (connectionPrice != other.connectionPrice)
			return false;
		if (movies == null) {
			if (other.movies != null)
				return false;
		} else if (!movies.equals(other.movies))
			return false;
		if (tvShows == null) {
			if (other.tvShows != null)
				return false;
		} else if (!tvShows.equals(other.tvShows))
			return false;
		return true;
	}
	
}
