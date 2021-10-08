package com.pizzahut.domain;

import com.pizzahut.dal.model.FeedbackModel;
import java.util.List;

public interface FeedbackDataAdapter {
	
	public String create(FeedbackModel feedbackModel);

	public List<FeedbackModel> getAll();

	public FeedbackModel getById(String id);
}
