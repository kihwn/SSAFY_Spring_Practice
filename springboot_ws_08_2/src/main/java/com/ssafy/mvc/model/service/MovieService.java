package com.ssafy.mvc.model.service;

import java.util.List;

import com.ssafy.mvc.model.dto.Movie;

public interface MovieService {
	
	//영화 전체 조회
	public List<Movie>getMovieList();
	
	// (제목으로) 영화 상세 조회
	public List<Movie> readMovie(String title);
	
	// (id로) 영화 삭제
	public boolean removeMovie(int id);
	
	//영화 수정
	public void modifyMovie(Movie movie);
	
	//영화 추가
	public void insertMovie(Movie movie);
	

}
