package com.lr.eureka.producer.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 学生实体类
 *
 * @author liurui
 * @date 2020/1/1 22:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    private long id;
    private String name;
    private int age;

}
