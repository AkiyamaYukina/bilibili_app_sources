package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/DarkLightIcon.class */
@Keep
public final class DarkLightIcon {

    @JSONField(name = "dark")
    @Nullable
    private String darkUrl;

    @JSONField(name = "light")
    @Nullable
    private String lightUrl;

    @Nullable
    public final String getDarkUrl() {
        return this.darkUrl;
    }

    @Nullable
    public final String getLightUrl() {
        return this.lightUrl;
    }

    public final void setDarkUrl(@Nullable String str) {
        this.darkUrl = str;
    }

    public final void setLightUrl(@Nullable String str) {
        this.lightUrl = str;
    }
}
