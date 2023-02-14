package com.example.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 视频收藏
 */
@Getter
@Setter
@Accessors(chain = true)
public class Favorite {

    private String id;
    /**
     * 视频id
     */
    private String videoId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;



}
