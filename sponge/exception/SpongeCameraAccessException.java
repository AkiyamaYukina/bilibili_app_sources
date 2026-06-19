package com.bilibili.sponge.exception;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/exception/SpongeCameraAccessException.class */
public class SpongeCameraAccessException extends Exception {
    private int exceptionId;
    private String exceptionMsg;
    private long exceptionTime;
    private String exceptionType;
    private String methodName;

    public SpongeCameraAccessException() {
    }

    public SpongeCameraAccessException(String str, String str2) {
        super(str);
        this.methodName = str2;
    }

    public SpongeCameraAccessException(String str, String str2, String str3, String str4, long j7) {
        super(str);
        this.exceptionMsg = str2;
        this.methodName = str3;
        this.exceptionType = str4;
        this.exceptionTime = j7;
    }

    public int getExceptionId() {
        return this.exceptionId;
    }

    public String getExceptionMsg() {
        return this.exceptionMsg;
    }

    public long getExceptionTime() {
        return this.exceptionTime;
    }

    public String getName() {
        return this.methodName;
    }

    public String getType() {
        return this.exceptionType;
    }

    public void setExceptionId(int i7) {
        this.exceptionId = i7;
    }

    public void setExceptionMsg(String str) {
        this.exceptionMsg = str;
    }

    public void setExceptionTime(long j7) {
        this.exceptionTime = j7;
    }

    public void setName(String str) {
        this.methodName = str;
    }

    public void setType(String str) {
        this.exceptionType = str;
    }
}
