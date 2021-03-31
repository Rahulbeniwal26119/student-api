package org.rahul.api.service;

import org.rahul.api.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;

    public CourseServiceImpl()
    {
        list = new ArrayList<Course>();
        list.add(new Course(105 , "Java Core Course" , "This course contains description"));
        list.add(new Course(4343 , "Spring Boot Course" , "This course belongs to desription"));
    }
    @Override
    public List<Course> getCourses()
    {
        return list;
    }

    @Override
    public Course getCourse(long courseId)
    {
        Course c = null;
        System.out.println(courseId);
        for(Course course : list)
        {
            if(course.getId() == courseId)
            {
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course)
    {
        list.add(course);
        return course;
    }

}
