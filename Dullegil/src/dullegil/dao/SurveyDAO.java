package dullegil.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dullegil.domain.Survey;

@Repository
public class SurveyDAO implements ISurveyDAO {
	
	@Autowired
	SqlSession session;

	@Override
	public int count() {
		//return session.selectOne("dullegil.SurveyMapper.surveyCount");
		return 0;
	}

	@Override
	public int countCommnet() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean createSurvey(Survey survey) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Survey> selectAllSurvey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Survey> selectByMonthSurvey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Survey> selectByWeekSurvey() {
		// TODO Auto-generated method stub
		return null;
	}

}
