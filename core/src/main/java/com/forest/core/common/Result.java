package com.forest.core.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

/**
 * 返回前端通用类·带参数的返回结果
 *
 * @apiNote
 */
@ApiModel
public class Result<T> {

  /**
   * 状态码 0成功 1失败 -1异常(默认成功)
   */
  @ApiModelProperty("code码")
  private String code;

  @ApiModelProperty("错误码")
  private String errCode;

  /**
   * 执行情况描述
   */
  @ApiModelProperty("返回信息")
  private String msg = "成功";

  /**
   * 返回结果
   */
  @ApiModelProperty("返回数据")
  private T result;

  private Boolean success;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private LocalDateTime timestamp;

  @JsonIgnore
  private String onlTable;

  @JsonIgnore
  private boolean dictBoolean = false;



  private Result() {
  }

  protected static <T> Result<T> getInstance(String code, String msg,
      boolean success, T data) {
    Result<T> result = new Result<>();
    result.setCode(code);
    result.setMsg(msg);
    result.setSuccess(success);
    result.setTimestamp(LocalDateTime.now());
    result.setResult(data);
    return result;
  }

  protected static <T> Result<T> getInstance(String code, String msg,
      boolean success, T data,boolean dictBoolean) {
    Result<T> result = new Result<>();
    result.setCode(code);
    result.setMsg(msg);
    result.setSuccess(success);
    result.setTimestamp(LocalDateTime.now());
    result.setResult(data);
    result.setDictBoolean(dictBoolean);
    return result;
  }

  protected static <T> Result<T> getInstance(String code,String errorCode, String msg,
      boolean success) {
    Result<T> result = new Result<>();
    result.setCode(code);
    result.setMsg(msg);
    result.setSuccess(success);
    result.setTimestamp(LocalDateTime.now());
    result.setResult(null);
    return result;
  }

  public String getCode() {
    return code;
  }

  protected void setCode(String code) {
    this.code = code;
  }

  public String getErrCode() {
    return errCode;
  }

  protected void setErrCode(String errCode) {
    this.errCode = errCode;
  }

  public String getMsg() {
    return msg;
  }

  protected void setMsg(String msg) {
    this.msg = msg;
  }

  public T getResult() {
    return result;
  }

  public void setResult(T result) {
    this.result = result;
  }

  public Boolean getSuccess() {
    return success;
  }

  protected void setSuccess(Boolean success) {
    this.success = success;
  }

  public LocalDateTime getTimestamp() {
    return timestamp;
  }

  protected void setTimestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public String getOnlTable() {
    return onlTable;
  }

  protected void setOnlTable(String onlTable) {
    this.onlTable = onlTable;
  }

  public boolean isDictBoolean() {
    return dictBoolean;
  }

  public void setDictBoolean(boolean dictBoolean) {
    this.dictBoolean = dictBoolean;
  }
}
