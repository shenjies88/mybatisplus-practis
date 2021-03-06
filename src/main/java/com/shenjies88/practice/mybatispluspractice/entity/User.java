
package com.shenjies88.practice.mybatispluspractice.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("用户表")
@Data
@TableName("user")
public class User extends Model<User> {

    @ApiModelProperty(value = "主键", hidden = true)
    @TableId("id")
    private Long id;

    @ApiModelProperty("姓名")
    @TableField("name")
    private String name;

    @ApiModelProperty("年龄")
    @TableField("age")
    private Integer age;

    @ApiModelProperty("邮件")
    @TableField("email")
    private String email;

    @ApiModelProperty(value = "0正常，1删除", hidden = true)
    @TableField(value = "status")
    private Integer status;

    @ApiModelProperty(value = "创建时间", hidden = true)
    @TableField("create_time")
    private String createTime;
}