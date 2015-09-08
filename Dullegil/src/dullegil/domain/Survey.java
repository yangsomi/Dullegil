package dullegil.domain;

import java.sql.Date;

public class Survey {
	private int survey_id;
	private Date survey_date;
	private int result;
	private String comment;
	public Survey(int survey_id, Date survey_date, int result, String comment) {
		super();
		this.survey_id = survey_id;
		this.survey_date = survey_date;
		this.result = result;
		this.comment = comment;
	}
	public int getSurvey_id() {
		return survey_id;
	}
	public void setSurvey_id(int survey_id) {
		this.survey_id = survey_id;
	}
	public Date getSurvey_date() {
		return survey_date;
	}
	public void setSurvey_date(Date survey_date) {
		this.survey_date = survey_date;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Survey [survey_id=");
		builder.append(survey_id);
		builder.append(", survey_date=");
		builder.append(survey_date);
		builder.append(", result=");
		builder.append(result);
		builder.append(", comment=");
		builder.append(comment);
		builder.append("]");
		return builder.toString();
	}
	

	
}
