package dullegil.biz;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dullegil.dao.ISurveyDAO;
import dullegil.domain.Survey;

@Component
public class SurveyService implements ISurveyService {

	@Autowired
	ISurveyDAO dao;
	
	@Override
	public int count() {
		// TODO Auto-generated method stub		
		return dao.count();
	}

	@Override
	public int countCommnet() {
		// TODO Auto-generated method stub
		return dao.countCommnet();
	}

	@Override
	public List<Survey> getAllSurvey() {
		// TODO Auto-generated method stub
		return dao.selectAllSurvey();
	}

	@Override
	public boolean newSurvey(Survey survey) {
		// TODO Auto-generated method stub
		if (dao.createSurvey(survey))
			return true;
		else
			return false;
	}

	@Override
	public List<Survey> surveyByMonth() {
		// TODO Auto-generated method stub			
		return dao.selectByMonthSurvey();
	}

	@Override
	public List<Survey> surveyByWeek() {
		// TODO Auto-generated method stub
		return dao.selectByWeekSurvey();
	}

}
