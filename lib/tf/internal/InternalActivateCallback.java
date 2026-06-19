package com.bilibili.lib.tf.internal;

import androidx.annotation.Nullable;
import com.bilibili.lib.tf.BizStatus;
import com.bilibili.lib.tf.TfActivateCallback;
import com.bilibili.lib.tf.TfActivateResp;
import com.bilibili.lib.tf.TfThread;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/internal/InternalActivateCallback.class */
public class InternalActivateCallback {

    @Nullable
    private TfActivateCallback callback;

    public InternalActivateCallback(@Nullable TfActivateCallback tfActivateCallback) {
        this.callback = tfActivateCallback;
    }

    @TfThread
    private void onBizError(@Nullable BizStatus bizStatus) {
        try {
            TfActivateCallback tfActivateCallback = this.callback;
            if (tfActivateCallback != null) {
                tfActivateCallback.onBizError(bizStatus);
            }
        } catch (Throwable th) {
        }
    }

    @TfThread
    private void onError(int i7, @Nullable String str) {
        try {
            TfActivateCallback tfActivateCallback = this.callback;
            if (tfActivateCallback != null) {
                tfActivateCallback.onError(i7, str);
            }
        } catch (Throwable th) {
        }
    }

    @TfThread
    private void onTfActivateResp(@Nullable TfActivateResp tfActivateResp) {
        try {
            TfActivateCallback tfActivateCallback = this.callback;
            if (tfActivateCallback != null) {
                tfActivateCallback.onTfActivateResp(tfActivateResp);
            }
        } catch (Throwable th) {
        }
    }
}
