package com.bilibili.lib.tf;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tf/TfActivateCallback.class */
public abstract class TfActivateCallback {
    @TfThread
    public abstract void onBizError(@Nullable BizStatus bizStatus);

    @TfThread
    public abstract void onError(int i7, @Nullable String str);

    @TfThread
    public abstract void onTfActivateResp(@Nullable TfActivateResp tfActivateResp);
}
