package com.learning.booking.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class MovieData {

	@Id
	private Integer id;
	@Column
	private String movieName;
	@Column
	private String movieType;
	@Column
	private double ticketPrice;
	
	public MovieData() {
		
	}
	
	public MovieData(Integer id, String movieName, String movieType, double ticketPrice) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.movieType = movieType;
		this.ticketPrice = ticketPrice;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieType() {
		return movieType;
	}
	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	@Override
	public String toString() {
		return "MovieData [id=" + id + ", movieName=" + movieName + ", movieType=" + movieType + ", ticketPrice="
				+ ticketPrice + "]";
	}
	
	
	
	
}
