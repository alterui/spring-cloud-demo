package com.lr.eureka.producer.repository.impl;

import com.lr.eureka.producer.po.Student;
import com.lr.eureka.producer.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 学生Mapper实现类
 *
 * @author liurui
 * @date 2020/1/2 10:34
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long, Student> studentMap = new HashMap<>();

    @PostConstruct
    public void initStudentMap() {
        studentMap.put(1L, new Student(1L, "张三", 21));
        studentMap.put(2L, new Student(2L, "李四", 22));
        studentMap.put(3L, new Student(3L, "王五", 23));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
