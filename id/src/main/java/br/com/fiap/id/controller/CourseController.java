package br.com.fiap.id.controller;

import br.com.fiap.id.model.Course;
import br.com.fiap.id.repository.CourseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @PostMapping
    public void createCourse(@RequestBody Course course) {
        courseRepository.saveCourse(course);
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return courseRepository.findCourseById(id);
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return courseRepository.getAllCourses();
    }

    @PutMapping("/{id}")
    public void updateCourse(@PathVariable Long id, @RequestBody Course course) {
        course.setId(id);
        courseRepository.saveCourse(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseRepository.deleteCourseById(id);
    }
}
