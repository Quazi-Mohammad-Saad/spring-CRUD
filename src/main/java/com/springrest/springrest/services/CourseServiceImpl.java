package com.springrest.springrest.services;
import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDao courseDao;
//    List<Course> list;
    public CourseServiceImpl() {
//        list = new ArrayList<>();
//        list.add(new Course(145,"java","java course"));
//        list.add(new Course(185,"python","python course"));

    }

    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
//        list.add(course);
//        return course;
    }

    @Override
    public List<Course> getCourses() {

        return courseDao.findAll();
//        return list;
    }

    @Override
    public Course getCourse(long courseId) {

        return courseDao.getOne(courseId);


//        Course c =null;
//        for(Course course:list)
//        {
//            if (course.getId()==courseId)
//            {
//                c=course;
//                break;
//            }
//        }
//        return c;
    }
    @Override
    public Course updateCourse(Course course){
        courseDao.save(course);
        return course;

//        list.forEach(e ->{
//            if (e.getId()==course.getId()){
//                e.setTitle(course.getTitle());
//                e.setDescription(course.getDescription());
//            }
//        });
//        return course;
    }
    @Override
    public void deleteCourse(long parseLong){
        Course entity = courseDao.getOne(parseLong);
        courseDao.delete(entity);
//        list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
    }
}

