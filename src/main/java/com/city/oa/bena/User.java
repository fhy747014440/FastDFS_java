package com.city.oa.bena;


public class User {
    private String username;
    private Integer age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public boolean isExists(String key){
        return false;
    }
    //dev 分支下开发的
    public boolean expire(String key) {
        System.out.println("hello");
        return false;
    }
}
