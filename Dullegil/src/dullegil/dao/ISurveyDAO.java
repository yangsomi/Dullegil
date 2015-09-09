package dullegil.dao;

import java.util.List;

import dullegil.domain.Survey;

public interface ISurveyDAO {
	int count();
	int countCommnet();
	boolean createSurvey(Survey survey);
	List<Survey> selectAllSurvey();
	//Ãß°¡
	List<Survey> selectByMonthSurvey();
	List<Survey> selectByWeekSurvey();
}
