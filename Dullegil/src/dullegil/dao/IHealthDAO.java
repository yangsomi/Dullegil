package dullegil.dao;

import dullegil.domain.Health;

public interface IHealthDAO {
	Health selectTodayHealth(String user_id);
	Health selectWeekHealth(String user_id);
	Health selectMonthHealth(String user_id);
	boolean createTodayHealth(Health health);
	boolean deleteHealth(String user_id);
	Health updateTodayHealth(Health health, String user_id);
}
