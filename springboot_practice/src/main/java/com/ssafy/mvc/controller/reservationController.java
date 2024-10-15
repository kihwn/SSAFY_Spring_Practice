package com.ssafy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ssafy.mvc.model.dto.Reservation;

import jakarta.servlet.http.HttpSession;

@Controller
public class reservationController {
	
	@GetMapping("/reservation")
	public String reservationForm() {
		return "/movie/reservationForm";
	}
	
	@PostMapping("/reservation")
	public String reservation(@ModelAttribute Reservation reservation, HttpSession session) {
		session.setAttribute("reservationMovie", reservation.getName());
		return "redirect:/default";
	}
	
	
	
	@GetMapping("/default")
	public String defaultPage() {
		return "default";
	}
	
	@PostMapping("/cancle")
	public String cancle(HttpSession session) {
		session.removeAttribute("reservationMovie");
		return "redirect:/default";
	}
	
	
	

}
