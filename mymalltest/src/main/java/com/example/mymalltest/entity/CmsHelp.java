package com.example.mymalltest.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;
import java.io.Serializable;


import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author pipidan
 * @ClassName: CmsHelp
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2021-07-04
 */
@Data
@Accessors(chain = true)
public class CmsHelp implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "id" , type = IdType.ID_WORKER)
    @NotBlank(message = "主键不能为空" )
    private Long id;


    @TableField("category_id")
    private Long categoryId;


    @TableField("icon")
    private String icon;


    @TableField("title")
    private String title;


    @TableField("show_status")
    private Integer showStatus;


    @TableField("create_time")
    private LocalDateTime createTime;


    @TableField("read_count")
    private Integer readCount;


    @TableField("content")
    private String content;


}