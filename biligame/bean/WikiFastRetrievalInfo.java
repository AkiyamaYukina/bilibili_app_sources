package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/WikiFastRetrievalInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class WikiFastRetrievalInfo {
    public static final int $stable = 8;

    @JSONField(name = "img")
    @Nullable
    private String img;

    @JSONField(name = "link")
    @Nullable
    private String link;

    @JSONField(name = "title")
    @NotNull
    private String title = "";

    @Nullable
    public final String getImg() {
        return this.img;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setImg(@Nullable String str) {
        this.img = str;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setTitle(@NotNull String str) {
        this.title = str;
    }
}
