package com.offcn.springbootdemo2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name",nullable = false,length = 100)
    private String name;

    @Column(name = "age",nullable = true,length = 4)
    private Integer age;
}
