package com.project.quizApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.quizApp.model.Quiz;

public interface QuizDao  extends JpaRepository<Quiz, Integer> {

}
