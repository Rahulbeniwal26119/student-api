package org.rahul.api.service;

import org.rahul.api.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();
    public Course getCourse(long id);

    Course addCourse(Course course);
}
