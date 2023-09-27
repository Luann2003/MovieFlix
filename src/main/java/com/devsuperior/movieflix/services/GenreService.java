package com.devsuperior.movieflix.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.dto.GenreDTO;
import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.repositories.GenreRepository;

@Service
public class GenreService {
	
	@Autowired
	private GenreRepository service;
	
	@Transactional(readOnly = true)
	public List<GenreDTO> findAll(GenreDTO dto){
		List<Genre> list = service.findAll();	
		return list.stream().map(x -> new GenreDTO(x)).toList();
	}

}
