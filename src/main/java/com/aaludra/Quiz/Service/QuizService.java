package com.aaludra.Quiz.Service;

import com.aaludra.Quiz.Entity.QuizEntity;
import com.aaludra.Quiz.Repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;
    public List<QuizEntity> getQuestion(){
        return quizRepository.findAll();
    }
}
