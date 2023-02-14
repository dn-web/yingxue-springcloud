package com.example.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 粉丝关注
 */
@Getter
@Setter
@Accessors(chain = true)
public class Following {

    private String id;
    /**
     * 用户id
     */
    private String uId;
    /**
     * 被关注用户id
     */
    private String followingId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;


}
