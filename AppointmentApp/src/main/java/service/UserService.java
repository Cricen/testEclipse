package service;

import java.util.List;

import model.User;

public interface UserService {
	
	public List<User> getListUser();
	
	public void saveOrUpdate(User user);
	
	public void deleteUser(int id);
	
	public User findUserById(int id);
}
