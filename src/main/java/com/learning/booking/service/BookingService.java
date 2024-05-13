package com.learning.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.learning.booking.model.MovieData;
import com.learning.booking.repository.BookingRepository;

@Service
public class BookingService {

	@Autowired
	BookingRepository repo;
	
	public String loginUserFromURL(String id , String password) {
		if(id.equals("user") && password.equals("123"))
			return "Logged in successfully";
		else
			return "Wrong id or password";
	}
	
	public HttpStatus loginUserFromHeader(String id , String password) {
		if(id.equals("user") && password.equals("123"))
			return HttpStatus.ACCEPTED;
		else
			return HttpStatus.BAD_REQUEST;
	}
	
	public List<MovieData> fetchAllMovies(){
		return repo.findAll();
	}
	
	public List<MovieData> fetchMovieByType(String type) {
		return repo.findByMovieType(type);
	}
	
	
	public List<MovieData> fetchMoviesByOrder(String orderBy) {
		System.out.println(orderBy);
		return repo.findAllMoviesByOrder(orderBy);
	}
	
	public void addNewMovie(MovieData movieData) {
		repo.save(movieData);
	}
}
