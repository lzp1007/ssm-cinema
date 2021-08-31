package com.hfut.service;

import com.hfut.vo.PlayDetailVo;
import com.hfut.vo.PlayVo;

import java.util.List;

public interface PlayService {
	public List<PlayVo> getPlaysByFilmId(String filmId);
	
	public PlayDetailVo  getDetailById(String playId);
}
