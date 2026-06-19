package com.bilibili.biligame.api.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/GameOfficialInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameOfficialInfo {
    public static final int $stable = 8;

    @JSONField(name = "is_show_wechat_official_entrance")
    private int showWxOfficialEntrance;

    @JSONField(name = "title")
    @Nullable
    private String title;

    public final int getShowWxOfficialEntrance() {
        return this.showWxOfficialEntrance;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setShowWxOfficialEntrance(int i7) {
        this.showWxOfficialEntrance = i7;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
