package com.hfut.service.impl;

import com.hfut.mapper.FilmMapper;
import com.hfut.mapper.PlayMapper;
import com.hfut.mapper.RoomMapper;
import com.hfut.model.Film;
import com.hfut.model.Play;
import com.hfut.model.Room;
import com.hfut.service.PlayService;
import com.hfut.vo.PlayDetailVo;
import com.hfut.vo.PlayVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlayServiceImpl implements PlayService {
	
	@Autowired
	private PlayMapper playMapper;
	@Autowired
	private FilmMapper filmMapper;
	@Autowired
	private RoomMapper roomMapper;
	
	@Override
	public List<PlayVo> getPlaysByFilmId(String filmId) {
		List<Play> plays = playMapper.getPlaysByFilmId(filmId);
		List<PlayVo> playVos = new ArrayList<>();
		Film film = filmMapper.getFilmById(filmId);
		for(Play play : plays) {
			PlayVo playVo = new PlayVo();
			playVo.setFilmName(film.getFilm_name());
			//将play表的同名属性赋值给playVo
			BeanUtils.copyProperties(play, playVo);
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			playVo.setPlayTimeStr(format.format(play.getPlayTime()));
			playVos.add(playVo);
		}
		return playVos;
	}
	
	@Override
	public PlayDetailVo getDetailById(String playId) {
		Play play = playMapper.selectByPlayId(playId);
		Film film = filmMapper.getFilmById(play.getFilmId());
		PlayDetailVo playDetailVo = new PlayDetailVo();
		BeanUtils.copyProperties(play, playDetailVo);
		playDetailVo.setFilmName(film.getFilm_name());
		playDetailVo.setImgPath(film.getImg_path());
		
		Room room = roomMapper.selectById(play.getRoomId());
		playDetailVo.setSeatInfo(room.getSeatInfo());
		return playDetailVo;
	}
	
	
}
