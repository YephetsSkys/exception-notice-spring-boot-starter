package com.kc.exception.notice.process;

import com.kc.exception.notice.content.ExceptionInfo;

/**
 * 异常信息通知处理接口
 *
 * @author kongchong
 */
public interface INoticeProcessor {

    /**
     * 异常信息通知
     *
     * @param exceptionInfo 异常信息
     */
    void sendNotice(ExceptionInfo exceptionInfo);

}
