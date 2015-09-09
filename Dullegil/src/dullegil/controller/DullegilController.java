package dullegil.controller;

import java.util.List;

import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dullegil.biz.ISurveyService;
import dullegil.domain.Survey;

@Controller
public class DullegilController {
	@Autowired
	ISurveyService surveyService;
	
	@RequestMapping("/surveyList.do")
	public String surveyList(Model m)
	{
		List<Survey> list= surveyService.getAllSurvey();
		m.addAttribute("surveyList", list);
		return "surveyList";
	}
	
	@RequestMapping("/nfcManage.do")
	public String nfcList(Model m){
		
		return "nfcManage";
	}
	
	@RequestMapping("/stampbook.do")
	public String stampBook(String userId, Model m){
		
		return "stampbook";
	}
}
