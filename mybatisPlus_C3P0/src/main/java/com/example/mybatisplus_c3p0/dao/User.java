package com.example.mybatisplus_c3p0.dao;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("user1")
@Data
public class User {

    @TableId
    Integer id;

    @TableField(value = "name1")
    String name1;

    Integer age;

    String email;
}
