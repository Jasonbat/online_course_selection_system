package com.ht.chd.domain;

/**
 * 院系实体类
 */
public class Department {
    //院系号
    private int id;
    //院系名称
    private String name;
    //院系描述
    private String desc;
    //联系电话
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
