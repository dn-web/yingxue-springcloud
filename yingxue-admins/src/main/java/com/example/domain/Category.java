package com.example.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 视频类别
 */
@Getter
@Setter
@Accessors(chain = true)
public class Category {

    private String id;
    /**
     * 名称
     */
    private String name;
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
