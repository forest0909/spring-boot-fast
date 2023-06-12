package com.forest.core.common;


import com.forest.core.common.error.ErrorCode;

public class ResultFactory {

  private static final String CODE_SUCCESS = "200";

  private static final String CODE_UNAUTHORIZATION = "401";

  private static final String CODE_ERROR = "500";


  private static final String MSG_SUCCESS = "操作成功";

  private static final String MSG_ERROR = "系统错误";


  private static final String MSG_ERROR_UNAUTHORIZATION = "未认证";

  public static <T> Result<T> success() {
    return Result.getInstance(CODE_SUCCESS, MSG_SUCCESS, Boolean.TRUE, null);
  }

  public static <T> Result<T> success(T data) {
    return Result.getInstance(CODE_SUCCESS, MSG_SUCCESS, Boolean.TRUE, data);
  }

  public static<T> Result<T> dictSuccess(T dictResult) {
    return Result.getInstance(CODE_SUCCESS, MSG_SUCCESS, Boolean.TRUE, dictResult,true);
  }


  public static <T> Result<T> unAuthorization() {
    return Result.getInstance(CODE_UNAUTHORIZATION, MSG_ERROR_UNAUTHORIZATION, false, null);
  }

  public static <T> Result<T> failure(String errorCode, String errorMsg) {
    return Result.getInstance(CODE_ERROR, errorCode, errorMsg, false);
  }

  public static <T> Result<T> error(String errorCode, String errorMsg) {
    return Result.getInstance(CODE_ERROR, errorCode, errorMsg, false);
  }
  public static <T> Result<T> error() {
    return Result.getInstance(CODE_ERROR, ErrorCode.BUSINESS_ERROR.getErrcode(), ErrorCode.BUSINESS_ERROR.getMsg(), false);
  }

  public static <T> Result<T> unKnowError() {
    return Result.getInstance(CODE_ERROR, "unknow", MSG_ERROR, false);
  }
}
