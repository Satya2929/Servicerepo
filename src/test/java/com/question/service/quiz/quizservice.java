package com.question.service.quiz;

import java.util.List;

import com.question.service.entities;

public interface quizservice {
	entities add(entities quiz);
	List<entities> get();
	entities grt(Long id);
}
