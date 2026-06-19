package com.bilibili.biligame.api.bean.discover;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/discover/ScreenShot.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ScreenShot {
    public static final int $stable = 8;

    @Nullable
    private String height;

    @Nullable
    private String url;

    @Nullable
    private String width;

    @Nullable
    public final String getHeight() {
        return this.height;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final String getWidth() {
        return this.width;
    }

    public final void setHeight(@Nullable String str) {
        this.height = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public final void setWidth(@Nullable String str) {
        this.width = str;
    }
}
