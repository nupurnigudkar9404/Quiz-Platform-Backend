package com.example.quizapp.repository;

import com.example.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRespository extends JpaRepository<Quiz, Integer> {
}
