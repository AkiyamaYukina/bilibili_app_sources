package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/GameCenterBottomTabConfigBubble.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameCenterBottomTabConfigBubble implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "icon")
    @Nullable
    private String icon;

    @JSONField(name = "text")
    @Nullable
    private String text;

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }
}
