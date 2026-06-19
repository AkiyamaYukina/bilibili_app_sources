package com.bilibili.socialize.share.core.error;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/error/UnSupportedException.class */
public class UnSupportedException extends ShareException {
    public UnSupportedException(String str) {
        super(str);
        setCode(-241);
    }
}
