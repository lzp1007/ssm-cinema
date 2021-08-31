package com.hfut.controller;

import com.hfut.service.FilmService;
import com.hfut.vo.FilmDetailVo;
import com.hfut.vo.FilmVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FilmController {
	@Autowired
	FilmService filmService;
	@RequestMapping("queryFilms")
	public String queryFilms(Model model) {
		List<FilmVo> filmVoList = filmService.selectAll();
		model.addAttribute("filmVoList", filmVoList);
		return "list";
	}
	
	@RequestMapping("filmInfo")
	public String info(@RequestParam String filmId, Model model) {
		FilmDetailVo vo = filmService.selectById(filmId);
		model.addAttribute("vo", vo);
		return "detail";
	}
}
