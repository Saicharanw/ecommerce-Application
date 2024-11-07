package com.charan.service;

import com.charan.exception.ProductException;
import com.charan.modal.Cart;
import com.charan.modal.CartItem;
import com.charan.modal.User;
import com.charan.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
