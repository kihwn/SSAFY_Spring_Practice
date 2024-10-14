package com.ssafy.ws;

<<<<<<< HEAD
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
=======
import java.util.Random;

public class Audience implements Person{

	@Override
	public void doSomething() throws CallException {
		System.out.println("영화를 본다.");
		if (new Random().nextBoolean()) {
			throw new CallException();
		}
		
	}
	
>>>>>>> a47fe4f (1011_AOP 과제 완료)
}
