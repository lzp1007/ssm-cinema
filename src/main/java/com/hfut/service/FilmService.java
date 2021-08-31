package com.hfut.service;

import com.hfut.vo.FilmDetailVo;
import com.hfut.vo.FilmVo;

import java.util.List;

public interface FilmService {
	List<FilmVo> selectAll();
	
	FilmDetailVo selectById(String filmId);
}
