package dullegil.biz;

public interface ILoginService {
	String selectUser(String phone_id);
	boolean removeUser(String user_id);
	boolean newUser(String phone_id);
	boolean modifyUser(String user_id);
	boolean login(String user_id, String user_pw);
	boolean auto_login(String phone_id);
	
}
