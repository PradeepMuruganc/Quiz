package com.aaludra.Quiz.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Data
@Document(collection = "aaludra_test")
@NoArgsConstructor
@AllArgsConstructor
public class QuizEntity {
    @Id
    private ObjectId id;

    @Field(name = "S.no")
    private int Sno;
    @Field(name = "question")
    private String question;
    @Field(name = "correct_answer")
    private String correct_answer;
    @Field(name = "wrong_answer")
    private String wrong_answer[];
}
