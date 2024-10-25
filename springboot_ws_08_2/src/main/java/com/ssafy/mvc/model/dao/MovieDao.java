package com.ssafy.mvc.model.dao;

import java.util.List;

import com.ssafy.mvc.model.dto.Movie;

public interface MovieDao {

	int insert(Movie movie);
	
	int delete(int id);

	List<Movie> search(String title); 
	
	List<Movie> selectAll();
	
	void updateMovie(Movie movie); // 영화 수정 메서드가 원래는 없었던 것 같기도 한데 .. U 수행을 위해 추가

}