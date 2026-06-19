package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/TextUrlBean.class */
@Keep
public final class TextUrlBean {

    @JSONField(name = "button_text")
    @Nullable
    private String buttonText;

    @JSONField(name = "dark_url")
    @Nullable
    private String darkUrl;

    @JSONField(name = "jump_text")
    @Nullable
    private String jumpText;

    @JSONField(name = "light_url")
    @Nullable
    private String lightUrl;

    @JSONField(name = "plain_text")
    @Nullable
    private String plainText;

    @Nullable
    public final String getButtonText() {
        return this.buttonText;
    }

    @Nullable
    public final String getDarkUrl() {
        return this.darkUrl;
    }

    @Nullable
    public final String getJumpText() {
        return this.jumpText;
    }

    @Nullable
    public final String getLightUrl() {
        return this.lightUrl;
    }

    @Nullable
    public final String getPlainText() {
        return this.plainText;
    }

    public final void setButtonText(@Nullable String str) {
        this.buttonText = str;
    }

    public final void setDarkUrl(@Nullable String str) {
        this.darkUrl = str;
    }

    public final void setJumpText(@Nullable String str) {
        this.jumpText = str;
    }

    public final void setLightUrl(@Nullable String str) {
        this.lightUrl = str;
    }

    public final void setPlainText(@Nullable String str) {
        this.plainText = str;
    }
}
