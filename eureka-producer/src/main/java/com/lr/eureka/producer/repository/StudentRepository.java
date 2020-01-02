package com.lr.eureka.producer.repository;

import com.lr.eureka.producer.po.Student;

import java.util.Collection;

/**
 * 学生mapper接口
 *
 * @author liurui
 * @date 2020/1/2 10:29
 */
public interface StudentRepository {
    /**
     * 查询所有学生信息
     *
     * @return
     */
    Collection<Student> findAll();

    /**
     * 根据id查询学生信息
     *
     * @param id
     * @return
     */
    Student findById(long id);

    /**
     * 保存或者更新学生信息
     *
     * @param student
     * @return
     */
    void saveOrUpdate(Student student);

    /**
     * 根据id删除学生信息
     *
     * @param id
     * @return
     */
    void deleteById(long id);



}
