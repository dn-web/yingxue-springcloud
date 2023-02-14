package com.example.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 视频评论
 */
@Getter
@Setter
@Accessors(chain = true)
public class Comment {

    private String id;
    /**
     * 用户id
     */
    private String uId;
    /**
     * 视频id
     */
    private String videoId;
    /**
     * 内容
     */
    private String content;
    /**
     * 父级id
     */
    private String parentId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

}
