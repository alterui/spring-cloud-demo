package com.lr.eureka.producer.controller;

import com.lr.eureka.producer.po.Student;
import com.lr.eureka.producer.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * 学生信息controller
 * @author liurui
 * @date 2020/1/2 10:46
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentRepository studentRepository;

    /**
     * 获取所有学生信息
     * @return
     */
    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return studentRepository.findAll();
    }

    /**
     * 根据id获取学生信息
     * @param id
     * @return
     */
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id) {
        return studentRepository.findById(id);
    }

    /**
     * 保存学生信息
     * @param student
     */
    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        studentRepository.saveOrUpdate(student);
    }

    /**
     * 更新学生信息
     * @param student
     */
    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        studentRepository.saveOrUpdate(student);
    }

    /**
     * 删除id删除学生信息
     * @param id
     */
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") long id) {
        studentRepository.deleteById(id);
    }

}
