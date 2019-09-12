package com.city.oa.bean;


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
  /*  //dev 分支下开发的
    public boolean expire(String key) {
        System.out.println("hello");
        return false;
    }*/
    public boolean expire(String key,long time) {
        System.out.println("product");
        return false;
    }
    //dev分支新增代码
    public static void main(String[] args) {
        System.out.println("hello dev");
    }
}
