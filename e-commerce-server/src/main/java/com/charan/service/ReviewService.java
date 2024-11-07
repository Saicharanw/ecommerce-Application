package com.charan.service;

import java.util.List;

import com.charan.exception.ProductException;
import com.charan.modal.Review;
import com.charan.modal.User;
import com.charan.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
