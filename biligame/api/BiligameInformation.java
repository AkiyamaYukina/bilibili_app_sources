package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameInformation.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameInformation implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "game_base_id")
    private int gameBaseId;

    @JSONField(name = "type")
    private int type;

    @JSONField(name = "image")
    @NotNull
    private String bgImageUrl = "";

    @JSONField(name = "id")
    @Nullable
    private String id = "";

    @JSONField(name = "title")
    @NotNull
    private String title = "";

    @JSONField(name = "summary")
    @NotNull
    private String subTitle = "";

    @JSONField(name = "link")
    @NotNull
    private String link = "";

    @JSONField(name = "corner_marker")
    @NotNull
    private String cornerMarker = "";

    @NotNull
    public final String getBgImageUrl() {
        return this.bgImageUrl;
    }

    @NotNull
    public final String getCornerMarker() {
        return this.cornerMarker;
    }

    public final int getGameBaseId() {
        return this.gameBaseId;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final void setBgImageUrl(@NotNull String str) {
        this.bgImageUrl = str;
    }

    public final void setCornerMarker(@NotNull String str) {
        this.cornerMarker = str;
    }

    public final void setGameBaseId(int i7) {
        this.gameBaseId = i7;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setLink(@NotNull String str) {
        this.link = str;
    }

    public final void setSubTitle(@NotNull String str) {
        this.subTitle = str;
    }

    public final void setTitle(@NotNull String str) {
        this.title = str;
    }

    public final void setType(int i7) {
        this.type = i7;
    }
}
