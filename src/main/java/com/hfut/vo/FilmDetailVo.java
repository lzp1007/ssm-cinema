package com.hfut.vo;

import java.util.Date;

public class FilmDetailVo {
	private String filmId;
	private String filmName;
	private String imgPath;
	private String director;
	private String player;
	private String country;
	private int length;
	private String type;
	private String synopsis;
	private Date playTime;
	
	@Override
	public String toString() {
		return "FilmDetailVo{" + "filmId='" + filmId + '\'' + ", filmName='" + filmName + '\'' + ", imgPath='" + imgPath + '\'' + ", director='" + director + '\'' + ", player='" + player + '\'' + ", country='" + country + '\'' + ", length=" + length + ", type='" + type + '\'' + ", synopsis='" + synopsis + '\'' + ", playTime=" + playTime + '}';
	}
	
	public String getFilmId() {
		return filmId;
	}
	
	public void setFilmId(String filmId) {
		this.filmId = filmId;
	}
	
	public String getFilmName() {
		return filmName;
	}
	
	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}
	
	public String getImgPath() {
		return imgPath;
	}
	
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public String getPlayer() {
		return player;
	}
	
	public void setPlayer(String player) {
		this.player = player;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getSynopsis() {
		return synopsis;
	}
	
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	
	public Date getPlayTime() {
		return playTime;
	}
	
	public void setPlayTime(Date playTime) {
		this.playTime = playTime;
	}
	
	public FilmDetailVo(String filmId, String filmName, String imgPath, String director, String player, String country, int length, String type, String synopsis, Date playTime) {
		this.filmId = filmId;
		this.filmName = filmName;
		this.imgPath = imgPath;
		this.director = director;
		this.player = player;
		this.country = country;
		this.length = length;
		this.type = type;
		this.synopsis = synopsis;
		this.playTime = playTime;
	}
	
	public FilmDetailVo() {
	}
}
