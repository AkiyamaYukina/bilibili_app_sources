package com.bilibili.storagechecker;

import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/storagechecker/NoPermissionException.class */
public class NoPermissionException extends Exception {
    private static String PREFIX_TAG = "Storage_No System Permission: ";

    public NoPermissionException() {
    }

    public NoPermissionException(String str) {
        super(C8770a.a(new StringBuilder(), PREFIX_TAG, str));
    }

    public NoPermissionException(String str, Throwable th) {
        super(C8770a.a(new StringBuilder(), PREFIX_TAG, str), th);
    }
}
