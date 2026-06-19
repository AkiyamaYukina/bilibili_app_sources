package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/FollowButtonTexts.class */
@StabilityInferred(parameters = 0)
@Keep
public final class FollowButtonTexts {
    public static final int $stable = 8;

    @JSONField(name = "1")
    @Nullable
    private String selected;

    @JSONField(name = "0")
    @Nullable
    private String unselect;

    public FollowButtonTexts() {
    }

    public FollowButtonTexts(@NotNull Map<Integer, String> map) {
        this.unselect = map.get(0);
        this.selected = map.get(1);
    }

    @Nullable
    public final String getSelected() {
        return this.selected;
    }

    @Nullable
    public final String getUnselect() {
        return this.unselect;
    }

    public final void setSelected(@Nullable String str) {
        this.selected = str;
    }

    public final void setUnselect(@Nullable String str) {
        this.unselect = str;
    }
}
