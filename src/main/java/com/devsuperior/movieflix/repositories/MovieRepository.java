package com.devsuperior.movieflix.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.projections.MovieDetailsProjection;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	@Query(nativeQuery = true, value = """
			SELECT * FROM (
			SELECT tb_movie.id, tb_movie.title, tb_movie.sub_title, tb_movie.img_Url, tb_movie.movie_year, tb_genre.id AS genre_id 
			FROM tb_movie
			INNER JOIN tb_genre ON tb_movie.genre_id = tb_genre.id
			WHERE (:genreId = 0 OR genre_id = :genreId)
			ORDER BY tb_movie.title
			) AS tb_result
			""", 
			countQuery = """
			SELECT COUNT(*) FROM (
			SELECT tb_movie.id, tb_movie.title, tb_movie.sub_title, tb_movie.img_Url, tb_movie.movie_year, tb_genre.id AS genre_id 
			FROM tb_movie
			INNER JOIN tb_genre ON tb_movie.genre_id = tb_genre.id
			WHERE (:genreId = 0 OR genre_id = :genreId)
			ORDER BY tb_movie.title
			) AS tb_result
					""")
	Page<MovieDetailsProjection> searchMovies(Long genreId, Pageable pageable);
	
	

}
