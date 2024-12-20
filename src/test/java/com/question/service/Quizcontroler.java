package com.question.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.question.service.quiz.quizservice;

@RestController
@RequestMapping("/quiz")
public class Quizcontroler {
	//cretae 
	private quizservice quiz;

	public Quizcontroler(quizservice quiz) {
		super();
		this.quiz = quiz;
	}
	@PostMapping
	public entities create (@RequestBody entities q ) {
		return quiz.add(q);
		
	}
	//get all 
	@GetMapping
	public  String get() {
		return "quiz";
		
	}

}
