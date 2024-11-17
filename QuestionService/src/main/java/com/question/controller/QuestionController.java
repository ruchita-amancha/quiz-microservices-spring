package com.question.controller;

import com.question.entities.Question;
import com.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
     private QuestionService questionService;

//    create
    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.create(question);
    }

//    get All
    @GetMapping
    public List<Question> getAll(){
        return questionService.getAll();
    }

//    get by Id
    @GetMapping("/{id}")
    public Question getById(@PathVariable long id){
        return questionService.getById(id);
    }

    //    get by Id
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionByQuizId(@PathVariable Long quizId){
        return questionService.getQuestionByQuizId(quizId);
    }
}
