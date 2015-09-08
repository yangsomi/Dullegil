package dullegil.dao;

import java.util.List;

import dullegil.domain.Stamp;

public interface IStampDAO {
	boolean createStamp(String user_id, int tag_id);
	List<Stamp> selectAllStamp(String user_id);
	Stamp selectStamp(String user_id, int tag_id);
	boolean deleteStamp(String user_id, int tag_id);
	boolean updateStamp(String user_id, int tag_id);
	
	
}
