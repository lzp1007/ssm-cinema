package com.hfut.mapper;


import com.hfut.model.Film;

import java.util.List;

public interface FilmMapper {
	
	List<Film> getFilms();
	
	Film getFilmById(String filmId);
}
