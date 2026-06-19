package com.bilibili.lib.tf.internal;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import com.bilibili.lib.tf.LogLevel;
import com.bilibili.lib.tf.TfDelegate;
import com.bilibili.lib.tf.TfThread;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/internal/InternalDelegate.class */
public class InternalDelegate {

    @NonNull
    private TfDelegate delegate;

    public InternalDelegate(@NonNull TfDelegate tfDelegate) {
        this.delegate = tfDelegate;
    }

    @NonNull
    @AnyThread
    private String getBuvid() {
        try {
            return this.delegate.getBuvid();
        } catch (Throwable th) {
            return "";
        }
    }

    @AnyThread
    private boolean isDirectBvcConvertEnabled() {
        try {
            return this.delegate.isDirectBvcConvertEnabled();
        } catch (Throwable th) {
            return false;
        }
    }

    @AnyThread
    private void log(@NonNull int i7, @NonNull String str, @NonNull String str2) {
        try {
            this.delegate.log(LogLevel.forNumber(i7), str, str2);
        } catch (Throwable th) {
        }
    }

    @TfThread
    private void maybeSyncModels() {
        try {
            this.delegate.maybeSyncModels();
        } catch (Throwable th) {
        }
    }

    @NonNull
    @AnyThread
    private String withCommonParams(String str) {
        try {
            str = this.delegate.withCommonParams(str);
        } catch (Throwable th) {
        }
        return str;
    }
}
