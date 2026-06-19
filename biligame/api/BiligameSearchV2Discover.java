package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameSearchV2Discover.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameSearchV2Discover {
    public static final int $stable = 8;

    @JSONField(name = "event_title")
    @Nullable
    private String eventTitle;

    @JSONField(name = "tag_type")
    private int tagType;

    @JSONField(name = "name")
    @NotNull
    private String name = "";

    @JSONField(name = "event_type")
    private int eventType = -1;

    @JSONField(name = "game_base_id")
    @NotNull
    private String gameBaseId = "";

    @JSONField(name = "android_pkg_name")
    @NotNull
    private String androidPkgName = "";

    @JSONField(name = "android_pkg_ver")
    @NotNull
    private String androidPkgVer = "";

    @NotNull
    public final String getAndroidPkgName() {
        return this.androidPkgName;
    }

    @NotNull
    public final String getAndroidPkgVer() {
        return this.androidPkgVer;
    }

    @Nullable
    public final String getEventTitle() {
        return this.eventTitle;
    }

    public final int getEventType() {
        return this.eventType;
    }

    @NotNull
    public final String getGameBaseId() {
        return this.gameBaseId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getTagType() {
        return this.tagType;
    }

    public final void setAndroidPkgName(@NotNull String str) {
        this.androidPkgName = str;
    }

    public final void setAndroidPkgVer(@NotNull String str) {
        this.androidPkgVer = str;
    }

    public final void setEventTitle(@Nullable String str) {
        this.eventTitle = str;
    }

    public final void setEventType(int i7) {
        this.eventType = i7;
    }

    public final void setGameBaseId(@NotNull String str) {
        this.gameBaseId = str;
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }

    public final void setTagType(int i7) {
        this.tagType = i7;
    }
}
