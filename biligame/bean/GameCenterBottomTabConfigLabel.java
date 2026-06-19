package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/GameCenterBottomTabConfigLabel.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameCenterBottomTabConfigLabel implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "text")
    @Nullable
    private String text;

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }
}
