package dullegil.domain;

public class CoordinateParser {
	private String course_name;
	private double latitude, longitude;
	
	
	
	public CoordinateParser(String course_name, double latitude, double longitude) {
		super();
		this.course_name = course_name;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CoordinateParser [course_name=");
		builder.append(course_name);
		builder.append(", latitude=");
		builder.append(latitude);
		builder.append(", longitude=");
		builder.append(longitude);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
