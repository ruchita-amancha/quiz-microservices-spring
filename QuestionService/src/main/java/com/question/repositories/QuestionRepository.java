package com.question.repositories;

import com.question.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question,Long> {

    // Custom query method to find questions by quizId
    List<Question> findByQuizId(Long quizId);
}
