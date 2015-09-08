package dullegil.domain;

import java.util.List;

public class Course {
	private List<Coordinate> coordinate_list;
	private int course_id;
	private double course_distance;
	private int course_level;
	private int course_name;
	private int course_time;
	
	public Course(List<Coordinate> coordinate_list, int course_id, double course_distance, int course_level,
			int course_name, int course_time) {
		super();
		this.coordinate_list = coordinate_list;
		this.course_id = course_id;
		this.course_distance = course_distance;
		this.course_level = course_level;
		this.course_name = course_name;
		this.course_time = course_time;
	}
	public List<Coordinate> getCoordinate_list() {
		return coordinate_list;
	}
	public void setCoordinate_list(List<Coordinate> coordinate_list) {
		this.coordinate_list = coordinate_list;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public double getCourse_distance() {
		return course_distance;
	}
	public void setCourse_distance(double course_distance) {
		this.course_distance = course_distance;
	}
	public int getCourse_level() {
		return course_level;
	}
	public void setCourse_level(int course_level) {
		this.course_level = course_level;
	}
	public int getCourse_name() {
		return course_name;
	}
	public void setCourse_name(int course_name) {
		this.course_name = course_name;
	}
	public int getCourse_time() {
		return course_time;
	}
	public void setCourse_time(int course_time) {
		this.course_time = course_time;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Course [coordinate_list=");
		builder.append(coordinate_list);
		builder.append(", course_id=");
		builder.append(course_id);
		builder.append(", course_distance=");
		builder.append(course_distance);
		builder.append(", course_level=");
		builder.append(course_level);
		builder.append(", course_name=");
		builder.append(course_name);
		builder.append(", course_time=");
		builder.append(course_time);
		builder.append("]");
		return builder.toString();
	}

	
}
