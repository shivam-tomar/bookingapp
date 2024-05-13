package com.learning.booking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.learning.booking.model.MovieData;

@Repository
public interface BookingRepository extends CrudRepository<MovieData, Integer> {

	List<MovieData> findAll();
	
	List<MovieData> findByMovieType(String movieType);
	
	@Query(value="SELECT d FROM MovieData d ORDER BY :sortfilter")
	List<MovieData> findAllMoviesByOrder(@Param("sortfilter") String sortfilter);
	
	MovieData save(MovieData movieData);
}
