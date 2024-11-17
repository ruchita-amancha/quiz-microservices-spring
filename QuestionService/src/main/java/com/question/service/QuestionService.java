package com.question.service;

import com.question.entities.Question;

import java.util.List;

public interface QuestionService {

    Question create(Question question);

    List<Question> getAll();

    Question getById(long id);

    List<Question> getQuestionByQuizId(Long quizId);
}
