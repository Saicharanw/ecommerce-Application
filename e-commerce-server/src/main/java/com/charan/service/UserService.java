package com.charan.service;

import java.util.List;

import com.charan.exception.UserException;
import com.charan.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
