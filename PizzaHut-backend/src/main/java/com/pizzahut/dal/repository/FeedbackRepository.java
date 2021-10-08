package com.pizzahut.dal.repository;

import com.pizzahut.dal.model.FeedbackModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FeedbackRepository extends MongoRepository<FeedbackModel, String> {
}
