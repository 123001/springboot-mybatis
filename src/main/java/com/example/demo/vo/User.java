package com.example.demo.vo;


import lombok.Data;

@Data
public class User {
    private String userid;
    private String username;
    private String password;
    private String createTime; //创建时间
    private String updateTime; 	//用户修改时间
    private String lastLoginTime;	//用户最近登录时间
    private int enable;	//是否可用   1 是》 0 否
    private int isDisplay;
    private String sourceType;

    private String setid;

}
