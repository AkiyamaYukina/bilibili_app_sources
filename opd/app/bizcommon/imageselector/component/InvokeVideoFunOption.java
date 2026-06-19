package com.bilibili.opd.app.bizcommon.imageselector.component;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/component/InvokeVideoFunOption.class */
@StabilityInferred(parameters = 0)
@Keep
public final class InvokeVideoFunOption {
    public static final int $stable = 8;

    @Nullable
    private String funType;
    private int requestCode;

    @Nullable
    private String videoPath;

    public InvokeVideoFunOption(@Nullable String str, @Nullable String str2, int i7) {
        this.funType = str;
        this.videoPath = str2;
        this.requestCode = i7;
    }

    @Nullable
    public final String getFunType() {
        return this.funType;
    }

    public final int getRequestCode() {
        return this.requestCode;
    }

    @Nullable
    public final String getVideoPath() {
        return this.videoPath;
    }

    public final void setFunType(@Nullable String str) {
        this.funType = str;
    }

    public final void setRequestCode(int i7) {
        this.requestCode = i7;
    }

    public final void setVideoPath(@Nullable String str) {
        this.videoPath = str;
    }
}
