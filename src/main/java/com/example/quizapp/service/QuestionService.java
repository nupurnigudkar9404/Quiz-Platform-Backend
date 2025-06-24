package com.example.quizapp.service;

import com.example.quizapp.model.Question;
import com.example.quizapp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;


    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionRepository.findByCategory(category);
    }



    public String addQuestions(Question question) {
        questionRepository.save(question);
        return "success";
    }

    public ResponseEntity<String> deleteQuestion(Integer id) {
        if (questionRepository.existsById(id)) {
            questionRepository.deleteById(id);
            return ResponseEntity.ok("Question deleted successfully");
        } else {
            return ResponseEntity.status(404).body("Question not found");
        }
    }

    public ResponseEntity<String> updateQuestion(Integer id, Question updatedQuestion) {
        if (questionRepository.existsById(id)) {
            updatedQuestion.setId(id);  // Set ID to update the existing record
            questionRepository.save(updatedQuestion);
            return ResponseEntity.ok("Question updated");
        } else {
            return ResponseEntity.status(404).body("Question not found");
        }
    }
}
