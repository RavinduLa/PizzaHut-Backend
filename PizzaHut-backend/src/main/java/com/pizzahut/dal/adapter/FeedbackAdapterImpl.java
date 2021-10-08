package com.pizzahut.dal.adapter;

import com.pizzahut.dal.model.FeedbackModel;
import com.pizzahut.dal.repository.FeedbackRepository;
import com.pizzahut.domain.FeedbackDataAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.util.List;

@Component
public class FeedbackAdapterImpl implements FeedbackDataAdapter {

    private final FeedbackRepository repository;

    @Autowired
    public FeedbackAdapterImpl(FeedbackRepository repository) {
        this.repository = repository;
    }

    @Override
    public String create(FeedbackModel feedbackModel) {
        FeedbackModel model = new FeedbackModel();

        model.setUser(feedbackModel.getUser());
        model.setMessage_type(feedbackModel.getMessage_type());
        model.setDescription(feedbackModel.getDescription());
        model.setDatetime(LocalDateTime.now());

        model = repository.save(model);

        return model.getId();
    }

    @Override
    public List<FeedbackModel> getAll() {
        return repository.findAll();
    }

    @Override
    public FeedbackModel getById(String id) {
        return repository.findById(id).get();
    }
}
