package dullegil.biz;

import java.util.List;

import dullegil.domain.User;

public interface IMemberService {
	int count();
	List<User> getAllMember();
	User getMember(String user_id);
	boolean modifyMember(User user);
	boolean removeMember(String user_id);
	boolean newMember(User user);
	
}
