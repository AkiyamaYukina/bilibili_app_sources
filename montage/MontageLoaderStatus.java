package com.bilibili.montage;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/MontageLoaderStatus.class */
public class MontageLoaderStatus {
    public static final int MON_LOADER_STATUS_DYNAMIC_LIBRARY_LOADING_FAILED = 1;
    public static final int MON_LOADER_STATUS_NO_ERROR = 0;
    public String errorDetails;
    public int errorType;

    public MontageLoaderStatus(int i7, String str) {
        this.errorType = i7;
        this.errorDetails = str;
    }

    public String toString() {
        return this.errorDetails;
    }
}
