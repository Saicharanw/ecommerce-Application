package com.charan.service;

import java.util.List;

import com.charan.exception.ProductException;
import com.charan.modal.Rating;
import com.charan.modal.User;
import com.charan.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
