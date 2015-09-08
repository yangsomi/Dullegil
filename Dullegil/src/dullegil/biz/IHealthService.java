package dullegil.biz;

import java.util.List;

import dullegil.domain.Health;

public interface IHealthService {
	boolean updateTodayHealth(String user_id, Health health);
	boolean newTodayHealth(String user_id, Health health);
	
	List<Health> getWeekHealth(String user_id);
	Health getTodayHealth(String user_id);
	List<Health> getMonthHealth(String user_id);
	
	boolean deleteHealth(String user_id, Health health);
	boolean checkHealth();
}

	
