package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameCommonBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameCommonBean {
    public static final int $stable = 8;

    @JSONField(name = "update_time")
    @NotNull
    private String updateTime = "";

    @NotNull
    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final void setUpdateTime(@NotNull String str) {
        this.updateTime = str;
    }
}
