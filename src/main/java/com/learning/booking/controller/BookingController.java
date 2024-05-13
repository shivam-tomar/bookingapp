package com.learning.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.booking.model.MovieData;
import com.learning.booking.service.BookingService;

@RestController
@RequestMapping("/bookingapp")
public class BookingController {

	@Autowired
	BookingService service;

	@GetMapping("/login/{id}/{password}")
	public String loginFromURL(@PathVariable String id, @PathVariable String password){
		return service.loginUserFromURL(id, password);
	}
	
	@GetMapping("/login")
	public HttpStatus loginFromHeader(@RequestHeader String id, @RequestHeader String password){
		return service.loginUserFromHeader(id, password);
	}
	
	@GetMapping("/allmovies")
	public List<MovieData> allMovies(){
		return service.fetchAllMovies();
	}
	
	@GetMapping("/movietype/{type}")
	public List<MovieData> movieByType(@PathVariable String type){
		return service.fetchMovieByType(type);
	}
	
	@GetMapping("/moviesby/{orderby}")
	public List<MovieData> movieByOrder(@PathVariable String orderby){
		return service.fetchMoviesByOrder(orderby);
	}
	
	@PutMapping("addMovie")
	public void addMovie(@RequestBody MovieData movieData) {
		service.addNewMovie(movieData);
	}
	
}
