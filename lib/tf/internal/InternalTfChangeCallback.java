package com.bilibili.lib.tf.internal;

import androidx.annotation.NonNull;
import com.bilibili.lib.tf.TfChangeCallback;
import com.bilibili.lib.tf.TfThread;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/internal/InternalTfChangeCallback.class */
public class InternalTfChangeCallback {

    @NonNull
    private TfChangeCallback callback;

    public InternalTfChangeCallback(@NonNull TfChangeCallback tfChangeCallback) {
        this.callback = tfChangeCallback;
    }

    @TfThread
    private void OnTfChange() {
        try {
            this.callback.OnTfChange();
        } catch (Throwable th) {
        }
    }
}
