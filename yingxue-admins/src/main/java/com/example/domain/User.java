package com.example.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * app端用户
 */
@Getter
@Setter
@Accessors(chain = true)
public class User {

    private String id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 头像地址
     */
    private String avatar;
    /**
     * 简介
     */
    private String intro;
    /**
     * 联系方式
     */
    private String phone;
    /**
     * 是否绑定手机号
     */
    private Integer phoneLinked;
    /**
     * 微信openId
     */
    private String openId;
    /**
     * 是否绑定微信
     */
    private Integer wechatLinked;
    /**
     * 关注数
     */
    private int followingCount;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
}
