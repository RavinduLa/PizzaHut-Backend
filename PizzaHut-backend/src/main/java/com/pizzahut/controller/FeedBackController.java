package com.pizzahut.controller;

import com.pizzahut.api.FeedBackApi;
import com.pizzahut.dal.model.FeedbackModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/feedback")
@CrossOrigin(origins = "*", allowedHeaders = "*", exposedHeaders = "*")
public class FeedBackController {

    private final FeedBackApi feedBackApi;

    @Autowired
    public FeedBackController(FeedBackApi feedBackApi) {
        this.feedBackApi = feedBackApi;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public String createFeedBack(@RequestBody FeedbackModel model) {
        return feedBackApi.create(model);
    }

    @GetMapping("/get")
    @ResponseStatus(HttpStatus.OK)
    public List<FeedbackModel> getAllFeedback() {
        return feedBackApi.getAll();
    }

    @GetMapping("/getById/{id}")
    @ResponseStatus(HttpStatus.OK)
    public FeedbackModel getFeedbackById(@PathVariable String id) {
        return feedBackApi.getById(id);
    }
}
