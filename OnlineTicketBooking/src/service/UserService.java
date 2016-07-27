package service;

import dao.UserDao;
import model.User;
import exception.DatabaseException;

/**
 * <h1> UserService </h1>
 * <p>  
 * service which permits to perform all the User operations
 * </p>
 *
 * @author Sivaranjani
 * 
 * @created 2016-07-23
 */
public class UserService {
	
	UserDao userDao = new UserDao();
	
	public void addUser(String name, String email, long mobileNumber, String password) 
			            throws DatabaseException {
		userDao.insertUser(new User(name, email, mobileNumber, password));
	}
	
	public boolean isValidUser(String email, String password) throws DatabaseException {
		return userDao.isValidUser(email, password);
    }
}
