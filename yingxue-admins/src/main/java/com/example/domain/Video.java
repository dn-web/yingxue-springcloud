package com.example.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 视频
 */
@Getter
@Setter
@Accessors(chain = true)
public class Video {

    private String id;
    /**
     * 标题
     */
    private String title;
    /**
     * 简介
     */
    private String intro;
    /**
     * up主id
     */
    private String uId;
    /**
     * 视频封面地址
     */
    private String cover;
    /**
     * 视频地址
     */
    private String link;
    /**
     * 所属分类id
     */
    private String categoryId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;


}
