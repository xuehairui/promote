package com.example.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

/**
 *
 * message处理类
 * @author xue.hairui
 *
 */
@Component
public class ErrorMessageSourceHandler {

    @Autowired
    private MessageSource messageSource;

    /**
     * 根据
     * @param messageKey
     * @return
     */
    public String getMessage(String messageKey) {
        String message = messageSource.getMessage(messageKey, null, LocaleContextHolder.getLocale());
        return message;
    }

}
