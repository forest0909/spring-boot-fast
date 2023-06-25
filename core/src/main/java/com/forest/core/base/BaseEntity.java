package com.forest.core.base;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity implements java.io.Serializable{

  /**
   * id 主键
   */
  @TableId(type = IdType.ASSIGN_ID)
  private String id;

  /**
   * 创建人
   */
  @TableField(value = "create_by", fill = FieldFill.INSERT)
  private String createBy;

  /**
   * 创建时间
   */
  @TableField(value = "create_time", fill = FieldFill.INSERT)
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date createTime;

  /**
   * 更新人
   */
  @TableField(value = "update_by", fill = FieldFill.UPDATE)
  private String updateBy;

  /**
   * 更新时间
   */
  @TableField(value = "update_time", fill = FieldFill.UPDATE)
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date updateTime;

}
