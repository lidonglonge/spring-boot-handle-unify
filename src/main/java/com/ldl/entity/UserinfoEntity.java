package com.ldl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author lidonglonge@163.com
 * @since 2021-02-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("userinfo")
@ApiModel(value="UserinfoEntity对象", description="")
public class UserinfoEntity extends Model<UserinfoEntity> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id", hidden = true)
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户名称")
    @TableField("userName")
    private String username;

    @ApiModelProperty(value = "用户年纪")
    @TableField("userAge")
    private String userage;

    @ApiModelProperty(value = "用户性别(男0, 女1)")
    @TableField("userSex")
    private Integer usersex;

    @ApiModelProperty(value = "出生日期", hidden = true)
    @TableField("userDateBirth")
    private LocalDateTime userdatebirth;

    @ApiModelProperty(value = "用户联系方式")
    @TableField("userPhone")
    private String userphone;

    @ApiModelProperty(value = "身份证号码")
    @TableField("idNumber")
    private String idnumber;

    @ApiModelProperty(value = "社区名称")
    @TableField("community")
    private String community;

    @ApiModelProperty(value = "社区ID")
    @TableField("communityId")
    private Integer communityid;

    @ApiModelProperty(value = "微信号码")
    @TableField("wxNum")
    private String wxnum;

    @ApiModelProperty(value = "微信名称")
    @TableField("wxName")
    private String wxname;

    @ApiModelProperty(value = "微信头像地址")
    @TableField("wxHeadPortrait")
    private String wxheadportrait;

    @ApiModelProperty(value = " 最近14天是否到过中高风险地区(1到, 0未到)")
    @TableField("atHighRiskOf")
    private Integer athighriskOf;

    @ApiModelProperty(value = "s是否删除(1删除, 0不删除)", hidden = true)
    @TableField("isDelete")
    private Integer isdelete;

    @ApiModelProperty(value = "创建时间", hidden = true)
    @TableField("createTime")
    private LocalDateTime createtime;

    @ApiModelProperty(value = "修改时间", hidden = true)
    @TableField("updataTime")
    private LocalDateTime updatatime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
