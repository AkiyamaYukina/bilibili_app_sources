package com.bilibili.lib.v8;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/v8/V8Exception.class */
public class V8Exception extends RuntimeException {
    public V8Exception(String str, Throwable th) {
        super(str, th);
    }

    public Object getV8Exception() {
        Throwable cause = getCause();
        if (cause instanceof V8JSException) {
            return ((V8Exception) cause).getV8Exception();
        }
        return null;
    }

    public boolean wasCausedByJS() {
        Throwable cause = getCause();
        return cause != null && cause.getCause() == null;
    }
}
