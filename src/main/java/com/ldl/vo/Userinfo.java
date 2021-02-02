package com.ldl.vo;

/**
 * @className: Userinfo
 * @author: LiDL
 * @email: lidonglonge@163.com
 * @create: 2021-02-02 10:45
 * @version: V1.0
 * @features: 功能描述:
 */

public class Userinfo {
    private String name;
    private String idNum;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "name='" + name + '\'' +
                ", idNum='" + idNum + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
