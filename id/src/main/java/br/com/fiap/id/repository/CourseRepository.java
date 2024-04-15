package br.com.fiap.id.repository;

import br.com.fiap.id.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    default List<Course> findByName(String nome) {
        return null;
    }

    void saveCourse(Course course);

    void deleteCourseById(Long id);

    Course findCourseById(Long id);

    List<Course> getAllCourses();
}
