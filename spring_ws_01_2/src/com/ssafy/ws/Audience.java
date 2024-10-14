package com.ssafy.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="audience")
public class Audience {
	private Movie movie;
	public Audience() {}
	
	@Autowired
	public Audience (Movie movie) {
		this.movie = movie;
	}
	
	@Autowired
	@Qualifier("comic")
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public void watching() {
		System.out.println(movie.getInfo()+ " 영화를 보는 중 ");
	}
}
