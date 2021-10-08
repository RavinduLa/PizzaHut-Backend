package com.pizzahut.api;

import com.pizzahut.dal.model.FeedbackModel;
import com.pizzahut.domain.FeedbackDataAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedBackApi {

    private final FeedbackDataAdapter adapter;

    @Autowired
    public FeedBackApi(FeedbackDataAdapter adapter) {
        this.adapter = adapter;
    }

    public String create(FeedbackModel feedbackModel) {
        return adapter.create(feedbackModel);
    }

    public List<FeedbackModel> getAll() {
        return adapter.getAll();
    }

    public FeedbackModel getById(String id) {
        return adapter.getById(id);
    }
}
