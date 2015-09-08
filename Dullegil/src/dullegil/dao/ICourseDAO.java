package dullegil.dao;

import java.util.List;

import dullegil.domain.Course;

public interface ICourseDAO {
	int count();
	boolean create_course(Course course);
	boolean delete_course(int course_id);
	List<Course> select_all_course();
	Course select_course(int course_id);
	boolean update_course(Course course);
	
}
