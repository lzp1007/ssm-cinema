package com.hfut.vo;

public class FilmVo {
	private String filmId;
	private String name;
	private String imgPath;
	private String director;
	private String synopsis;
	
	public String getFilmId() {
		return filmId;
	}
	
	public void setFilmId(String filmId) {
		this.filmId = filmId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
	
	public String getSynopsis() {
		return synopsis;
	}
	
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	
	@Override
	public String toString() {
		return "FilmVo{" + "filmId='" + filmId + '\'' + ", name='" + name + '\'' + ", imgPath='" + imgPath + '\'' + ", director='" + director + '\'' + ", synopsis='" + synopsis + '\'' + '}';
	}
	
	public FilmVo(String filmId, String name, String imgPath, String director, String synopsis) {
		this.filmId = filmId;
		this.name = name;
		this.imgPath = imgPath;
		this.director = director;
		this.synopsis = synopsis;
	}
	
	public FilmVo() {
	}
}
