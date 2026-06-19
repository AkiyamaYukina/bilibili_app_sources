package com.bilibili.lib.sharewrapper.online.api;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/online/api/FinishResult.class */
@Keep
public final class FinishResult {

    @Nullable
    private String toast;

    @Nullable
    public final String getToast() {
        return this.toast;
    }

    public final void setToast(@Nullable String str) {
        this.toast = str;
    }
}
