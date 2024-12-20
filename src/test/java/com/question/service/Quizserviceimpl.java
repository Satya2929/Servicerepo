package com.question.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.question.service.quiz.quizservice;
@Service

public class Quizserviceimpl  implements quizservice{
	private quizrepository repo;

	public Quizserviceimpl(quizrepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public entities add(entities quiz) {
		// TODO Auto-generated method stub
		return repo.save(quiz);
	}

	@Override
	public List<entities> get() {
		// TODO Auto-generated method stub
		return  repo .findAll();
	}

	@Override
	public entities grt(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(()->new RuntimeException("quiz not found"));
	}

}
