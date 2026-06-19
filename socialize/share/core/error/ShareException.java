package com.bilibili.socialize.share.core.error;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/error/ShareException.class */
public class ShareException extends Exception {
    private int mCode;

    public ShareException(String str) {
        super(str);
        this.mCode = -1;
    }

    public ShareException(String str, int i7) {
        super(str);
        this.mCode = i7;
    }

    public ShareException(String str, Throwable th) {
        super(str, th);
        this.mCode = -1;
    }

    public ShareException(Throwable th) {
        super(th);
        this.mCode = -1;
    }

    public int getCode() {
        return this.mCode;
    }

    public void setCode(int i7) {
        this.mCode = i7;
    }
}
