package com.huadou.cn.plateform.pojo;

import java.sql.Date;

/**
 *   id INT NOT NULL  AUTO_INCREMENT,
 username VARCHAR(100) NOT NULL,
 password VARCHAR (20)not NULL ,
 age  INT  ,
 phonenumber VARCHAR (25) ,
 create_data DATE,
 update_data DATE,
 PRIMARY KEY (id)
 */
public class User {
    private Integer id;

    private String username;

    private String password;

    private Integer age;
    private String phonenumber;
    private Date create_data;
    private Date update_data ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Date getCreate_data() {
        return create_data;
    }

    public void setCreate_data(Date create_data) {
        this.create_data = create_data;
    }

    public Date getUpdate_data() {
        return update_data;
    }

    public void setUpdate_data(Date update_data) {
        this.update_data = update_data;
    }
}