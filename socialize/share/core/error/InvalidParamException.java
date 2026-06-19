package com.bilibili.socialize.share.core.error;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/error/InvalidParamException.class */
public class InvalidParamException extends ShareException {
    public InvalidParamException(String str) {
        super(str);
        setCode(-235);
    }
}
