package com.bilibili.lib.sharewrapper.basic;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/basic/UnSupportTypeException.class */
public class UnSupportTypeException extends RuntimeException {
    public UnSupportTypeException() {
    }

    public UnSupportTypeException(String str) {
        super(str);
    }

    public UnSupportTypeException(String str, Throwable th) {
        super(str, th);
    }

    public UnSupportTypeException(Throwable th) {
        super(th);
    }
}
