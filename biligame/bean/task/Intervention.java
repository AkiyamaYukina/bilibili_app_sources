package com.bilibili.biligame.bean.task;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/task/Intervention.class */
@StabilityInferred(parameters = 0)
@Keep
public final class Intervention {
    public static final int $stable = 8;

    @JSONField(name = "description")
    @Nullable
    private String description;

    @JSONField(name = "image")
    @Nullable
    private String image;

    @JSONField(name = "jump_url")
    @Nullable
    private String jumpUrl;

    @JSONField(name = "show_text")
    @Nullable
    private String showText;

    @JSONField(name = "sub_title")
    @Nullable
    private String subTitle;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getShowText() {
        return this.showText;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setImage(@Nullable String str) {
        this.image = str;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    public final void setShowText(@Nullable String str) {
        this.showText = str;
    }

    public final void setSubTitle(@Nullable String str) {
        this.subTitle = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
