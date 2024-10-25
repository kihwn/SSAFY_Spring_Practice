package com.ssafy.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ssafy.mvc.model.dto.Movie;
import com.ssafy.mvc.model.service.MovieService;

@RestController
@RequestMapping("/movie-api")
public class MovieRestController {
	
	private final MovieService movieService;
	
	@Autowired
	public MovieRestController(MovieService movieService) {
		this.movieService=movieService;
	}
	
	@GetMapping("/movie")
	public ResponseEntity<?> selectAll() {
		List<Movie>list = movieService.getMovieList();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@GetMapping("/movie/{title}")
	public ResponseEntity<?> select(@PathVariable("title")String title) {
		List<Movie>list = movieService.readMovie(title);
		if (list == null || list.size()== 0) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	@PostMapping("/movie")
	public ResponseEntity<?> insert(@RequestBody Movie movie,@RequestPart(value="file", required=false) MultipartFile file) {
		movieService.insertMovie(movie);
		return new ResponseEntity<Movie>(movie,HttpStatus.CREATED);
	}

	// DeleteMapping
	// delete(DELETE)
	@DeleteMapping("/movie/{id}")
	public ResponseEntity<?> delete(@PathVariable int id) {
		boolean flag = movieService.removeMovie(id);
		
		if (flag) {
			return ResponseEntity.status(HttpStatus.OK).body("movie deleted");
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed");
	}

}
