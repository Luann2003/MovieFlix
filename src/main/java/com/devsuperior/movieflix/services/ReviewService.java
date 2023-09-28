package com.devsuperior.movieflix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.repositories.ReviewRepository;

@Service
public class ReviewService {

	@Autowired
	private ReviewRepository repository;
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private AuthService service;
	
	@Transactional(readOnly = true)
	public List<ReviewDTO> findByIdReview(Long id) {
		List<Review> list = repository.findByMovieId(id);
		return list.stream().map(x -> new ReviewDTO(x)).toList();
	}
	
	@Transactional
	public ReviewDTO insert(ReviewDTO dto) {
		
		Review review = new Review();
		
		Movie movie = movieRepository.getReferenceById(dto.getMovieId());
		movie.setId(dto.getMovieId());
		
		review.setText(dto.getText());
		review.setMovie(movie);
		
		User user = service.authenticated();
		review.setUser(user);
		
		review = repository.save(review);
		
		return new ReviewDTO(review);
		
	}
}
