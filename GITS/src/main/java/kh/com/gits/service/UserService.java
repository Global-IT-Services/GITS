package kh.com.gits.service;

import java.util.List;

import kh.com.gits.model.UserModel;


public interface UserService {

	public boolean addUser(UserModel user);
	public boolean deleteUserById(Integer id);
	public boolean updateUser(UserModel article);
	public List<UserModel> getAllUsers();
	public UserModel getUserById(Integer id);
}
