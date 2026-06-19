package com.bilibili.lib.v8;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/V8JSException.class */
public class V8JSException extends RuntimeException {
    private Object v8Exception;

    public V8JSException(String str, Object obj, Throwable th) {
        super(str, th);
        this.v8Exception = obj;
    }

    public Object getV8Exception() {
        return this.v8Exception;
    }

    public boolean wasCausedByJS() {
        return getCause() == null;
    }
}
