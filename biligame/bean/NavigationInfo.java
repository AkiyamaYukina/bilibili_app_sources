package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/NavigationInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class NavigationInfo {
    public static final int $stable = 8;

    @JSONField(name = "link")
    @Nullable
    private String link;

    @JSONField(name = "name")
    @Nullable
    private String name;

    @JSONField(name = "list")
    @Nullable
    private List<NavigationInfo> subNavigation;

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<NavigationInfo> getSubNavigation() {
        return this.subNavigation;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSubNavigation(@Nullable List<NavigationInfo> list) {
        this.subNavigation = list;
    }
}
