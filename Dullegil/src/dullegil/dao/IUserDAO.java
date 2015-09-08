package dullegil.dao;

import java.util.List;

import dullegil.domain.User;

public interface IUserDAO {
	boolean createUser(String user_id);
	List<User> selectAllUser();
	User selectUser(String user_id);
	User updateUser(String user_id);
	boolean deleteUser(String user_id);

}
