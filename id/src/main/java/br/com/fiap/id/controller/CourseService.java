package br.com.fiap.id.controller;

import br.com.fiap.id.model.Course;
import br.com.fiap.id.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void saveCourse(Course course) {
        courseRepository.save(course);
    }

    public Object findCourseById(Long id) {
        Optional<Course> courseOptional = courseRepository.findById(id);
        return (Course) courseOptional.orElse(null);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public void deleteCourseById(Long id) {
        courseRepository.deleteById(id);
    }
}
