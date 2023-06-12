package com.forest.core.common.error;

/**
 * @author GC
 * @date 2021/9/17
 * @apiNote
 */
public interface IErrorCode {
    /**
     * 获取错误码
     * @return
     */
    String getErrcode();

    /**
     * 获取错误信息
     * @return
     */
    String getMsg();
}
