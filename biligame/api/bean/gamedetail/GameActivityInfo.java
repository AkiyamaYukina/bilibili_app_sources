package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameActivityInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameActivityInfo {
    public static final int $stable = 8;

    @JSONField(name = "activity_image")
    @Nullable
    private String activityImage;

    @JSONField(name = "activity_url")
    @Nullable
    private String activityUrl;

    @Nullable
    public final String getActivityImage() {
        return this.activityImage;
    }

    @Nullable
    public final String getActivityUrl() {
        return this.activityUrl;
    }

    public final void setActivityImage(@Nullable String str) {
        this.activityImage = str;
    }

    public final void setActivityUrl(@Nullable String str) {
        this.activityUrl = str;
    }
}
