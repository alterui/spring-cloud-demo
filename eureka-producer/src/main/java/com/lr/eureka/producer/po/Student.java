package com.lr.eureka.producer.po;

import lombok.Data;

import java.io.Serializable;

/**
 * 学生实体类
 *
 * @author liurui
 * @date 2020/1/1 22:47
 */
@Data
public class Student implements Serializable {
    private long id;
    private String name;
    private int age;

}
