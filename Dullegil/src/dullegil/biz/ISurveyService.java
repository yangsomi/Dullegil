package dullegil.biz;

import java.util.List;

import dullegil.domain.Survey;

public interface ISurveyService {
	int count();
	int countCommnet();
	List<Survey> getAllSurvey();
	boolean newSurvey(Survey Survey);
	List<Survey> surveyByMonth();
	List<Survey> surveyByWeek();
	
}
