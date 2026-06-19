package com.bilibili.lib.tf;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfDelegate.class */
public abstract class TfDelegate {
    @NonNull
    @AnyThread
    public abstract String getBuvid();

    @AnyThread
    public abstract boolean isDirectBvcConvertEnabled();

    @AnyThread
    public abstract void log(@NonNull LogLevel logLevel, @NonNull String str, @NonNull String str2);

    @TfThread
    public abstract void maybeSyncModels();

    @NonNull
    @AnyThread
    public abstract String withCommonParams(@NonNull String str);
}
