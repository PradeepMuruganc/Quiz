package com.aaludra.Quiz.Controller;

import com.aaludra.Quiz.Entity.QuizEntity;
import com.aaludra.Quiz.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuizController {
    @Autowired
    private QuizService quizService;

    @GetMapping("/Quiz")
    public List<QuizEntity> getQuiz(QuizEntity quizEntity){
        return quizService.getQuestion();
    }
}
