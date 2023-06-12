package com.forest.core.common.error;

import lombok.Getter;

/**
 * @author GC
 * @date 2021/9/17
 * @apiNote
 */
@Getter
public enum ErrorCode implements IErrorCode {
  SYSTEM_ERROR("E000001", "系统错误"),
  BUSINESS_ERROR("E000002", "业务错误"),
  DATA_FORMAT_ERROR("E000003", "数据格式错误"),
  DATA_NULL("E000004", "数据为空"),
  FILE_NOT_EXIST("E000005", "文件不存在"),
  TOKEN_FAILURE("E000006", "TOKEN失效,请重新登录！"),
  FILE_SIZE_MAX("E000007", "文件不允许超过1G！"),

  SUCCESS("0", "操作成功"),
  FAIL("-1", "操作失败"),

  /**
   * {@code 500 Server Error} (HTTP/1.0 - RFC 1945)
   */
  SC_INTERNAL_SERVER_ERROR_500("500", "异常"),

  //用户
  INCORRECT_PASSWORD("10001", "密码或用户名不正确"),
  USER_DOES_NOT_EXIST("10002", "密码或用户名不正确"),
  INSUFFICIENT_PERMISSIONS("10003", "权限不足，请联系管理员"),
  PHONE_EXISTING("10004", "手机号已存在"),
  USERNAME_EXISTING("10005", "登录名已存在"),
  USER_DISABLE_EXISTING("10006", "账号已冻结，请联系管理员"),
  ACCOUNT_LOCKING("10007","账户已锁定，请等待30分钟"),

  VERIFICATION_CODE_ERROR("20001", "获取验证码出错!"),
  VERIFICATION_CODE_ERRORS("20002", "验证码错误!"),

  UPLOAD_FILE_NUL("30001", "请上传文件！"),
  UPLOAD_FILE_DATA_DUPLICATION("30002", "数据已存在，是否覆盖？"),

  STSTRBPB_NOT_EXISTS("40000", "测站数据不存在"),
  WELLAREA_NOT_EXISTS("40001", "排水分区不存在"),
  WELLAREA_Illegal_VALUE("40002", "参数不合法"),
  WELLAREA_PARENT_WELLID_EMPTY("40003", "上游井编号不能为空"),
  WELLAREARELATION_EXISTS("40005", "井与排水分区绑定关系已存在"),
  STWELLRELATION_EXISTS("40006", "井与设备绑定关系已存在"),
  DRAINAGEWELL_ADD_NAME_EMPTY("40007", "窨井名称不能为空"),;


  private String errcode;

  private String msg;

  ErrorCode(String errcode, String msg) {
    this.errcode = errcode;
    this.msg = msg;
  }

  public static String getMsg(String errcode) {
    ErrorCode[] errorCodes = values();
    for (ErrorCode errorCode : errorCodes) {
      if (errcode.equals(errorCode.getErrcode())) {
        return errorCode.getMsg();
      }
    }
    return null;
  }

}
