package com.ssafy.mvc.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.mvc.model.dao.MovieDao;
import com.ssafy.mvc.model.dto.Movie;

@Service
public class MovieServiceImpl implements MovieService{
	
	private final MovieDao movieDao;
	
	@Autowired
	public MovieServiceImpl(MovieDao movieDao) {
		this.movieDao = movieDao;
	}

	@Override
	public List<Movie> getMovieList() {
		System.out.println("모든 영화 리스트 가져오기!");
		return movieDao.selectAll();
	}

	@Override
	public List<Movie> readMovie(String title) {
		System.out.println("제목으로 특정 영화 정보 가져오기!");
		return movieDao.search(title);
	}

	@Override
	public boolean removeMovie(int id) {
		System.out.println("id로 영화 삭제");
		int result = movieDao.delete(id);
		if (result==1) {
			return true;
		}
		return false;
	}

	@Override
	public void modifyMovie(Movie movie) {
		System.out.println("수정할게요~");
		movieDao.updateMovie(movie);
	}
	
	@Override
	public void insertMovie(Movie movie) {
		System.out.println("영화 추가할게유~");
		movieDao.insert(movie);
	}

	

}
