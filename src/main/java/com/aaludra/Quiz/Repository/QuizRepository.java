package com.aaludra.Quiz.Repository;

import com.aaludra.Quiz.Entity.QuizEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuizRepository extends MongoRepository<QuizEntity,Long> {
}
