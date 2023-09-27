package com.devsuperior.movieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.dto.MovieCardDTO;
import com.devsuperior.movieflix.dto.MovieDetailsDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.projections.MovieDetailsProjection;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Transactional(readOnly = true)
	public MovieDetailsDTO findById(Long id) {
		Movie movie = movieRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado"));
		return new MovieDetailsDTO(movie);
	}
	
	@Transactional(readOnly = true)
	public Page<MovieCardDTO> findAllByGenre(Long genreId, Pageable pageable) {
		
		 Page<MovieDetailsProjection> page = movieRepository.searchMovies(genreId, pageable);
		    Page<MovieCardDTO> dtoPage = page.map(movieDetailsProjection -> new MovieCardDTO(
		        movieDetailsProjection.getId(),
		        movieDetailsProjection.getTitle(),
		        movieDetailsProjection.getSub_Title(),
		        movieDetailsProjection.getMovie_Year(),
		        movieDetailsProjection.getImg_Url()
		        
		    ));

		    return dtoPage;
		}

	
}
