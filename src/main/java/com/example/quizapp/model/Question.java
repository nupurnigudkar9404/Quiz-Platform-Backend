package com.example.quizapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "question_title")
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    @Column(name = "right_answer")
    private String rightAnswer;
    private String category;

    public void setId(Integer id) {
        this.id = id;
    }

    // Add getter too if missing
    public Integer getId() {
        return id;
    }

}
