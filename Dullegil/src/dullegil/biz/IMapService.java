package dullegil.biz;

import java.util.List;

import dullegil.domain.Coordinate;
import dullegil.domain.Course;
import dullegil.domain.Stamp;

public interface IMapService {
	List<Course> showAllCourse();
	Course showCourseInfo(int course_id);
	List<Coordinate> showFacility(String keyword);
	List<Stamp> showStampLocation();
	Coordinate showUserLocation();
	
	
}
