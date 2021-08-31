package com.hfut.service.impl;

import com.hfut.mapper.FilmMapper;
import com.hfut.model.Film;
import com.hfut.service.FilmService;
import com.hfut.vo.FilmDetailVo;
import com.hfut.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {
	
	@Autowired
	private FilmMapper filmMapper;
	
	@Override
	public List<FilmVo> selectAll() {
		List<Film> filmList = filmMapper.getFilms();
		List<FilmVo> filmVoList = new ArrayList<>(filmList.size());
		//iter快捷键生成
		for (Film film : filmList) {
			FilmVo vo = new FilmVo();
			vo.setFilmId(film.getFilm_id());
			vo.setImgPath(film.getImg_path());
			vo.setName(film.getFilm_name());
			vo.setDirector(film.getDirector());
			vo.setSynopsis(film.getSynopsis());
			filmVoList.add(vo);
		}
		return filmVoList;
	}
	
	public FilmDetailVo selectById(String filmId) {
		Film film = filmMapper.getFilmById(filmId);
		FilmDetailVo detailVo = new FilmDetailVo();
		detailVo.setFilmId(filmId);
		detailVo.setFilmName(film.getFilm_name());
		detailVo.setDirector(film.getDirector());
		detailVo.setPlayer(film.getPlayer());
		detailVo.setImgPath(film.getImg_path());
		detailVo.setType(film.getType());
		detailVo.setSynopsis(film.getSynopsis());
		detailVo.setCountry(film.getCountry());
		detailVo.setLength(film.getLength());
		detailVo.setPlayTime(film.getPlay_time());
		return detailVo;
	}
}
