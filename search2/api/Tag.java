package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.broadcast.message.main.ReasonStyle;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/Tag.class */
@StabilityInferred(parameters = 0)
@Keep
public class Tag {
    public static final int $stable = 8;

    @SerializedName("bg_color")
    @JSONField(name = "bg_color")
    @Nullable
    private String bgColor;

    @SerializedName("bg_color_night")
    @JSONField(name = "bg_color_night")
    @Nullable
    private String bgColorNight;

    @SerializedName("bg_style")
    @JSONField(name = "bg_style")
    private int bgStyle;

    @SerializedName("border_color")
    @JSONField(name = "border_color")
    @Nullable
    private String borderColor;

    @SerializedName("border_color_night")
    @JSONField(name = "border_color_night")
    @Nullable
    private String borderColorNight;

    @SerializedName("text")
    @JSONField(name = "text")
    @Nullable
    private String text;

    @SerializedName("text_color")
    @JSONField(name = "text_color")
    @Nullable
    private String textColor;

    @SerializedName("text_color_night")
    @JSONField(name = "text_color_night")
    @Nullable
    private String textColorNight;

    public Tag() {
    }

    public Tag(@NotNull ReasonStyle reasonStyle) {
        this.text = reasonStyle.getText();
        this.textColor = reasonStyle.getTextColor();
        this.textColorNight = reasonStyle.getTextColorNight();
        this.bgColor = reasonStyle.getBgColor();
        this.bgColorNight = reasonStyle.getBgColorNight();
        this.borderColor = reasonStyle.getBorderColor();
        this.borderColorNight = reasonStyle.getBorderColorNight();
        this.bgStyle = reasonStyle.getBgStyle();
    }

    public Tag(@NotNull com.bapis.bilibili.polymer.app.search.v1.ReasonStyle reasonStyle) {
        this.text = reasonStyle.getText();
        this.textColor = reasonStyle.getTextColor();
        this.textColorNight = reasonStyle.getTextColorNight();
        this.bgColor = reasonStyle.getBgColor();
        this.bgColorNight = reasonStyle.getBgColorNight();
        this.borderColor = reasonStyle.getBorderColor();
        this.borderColorNight = reasonStyle.getBorderColorNight();
        this.bgStyle = reasonStyle.getBgStyle();
    }

    @Nullable
    public final String getBgColor() {
        return this.bgColor;
    }

    @Nullable
    public final String getBgColorNight() {
        return this.bgColorNight;
    }

    public final int getBgStyle() {
        return this.bgStyle;
    }

    @Nullable
    public final String getBorderColor() {
        return this.borderColor;
    }

    @Nullable
    public final String getBorderColorNight() {
        return this.borderColorNight;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final String getTextColorNight() {
        return this.textColorNight;
    }

    public final void setBgColor(@Nullable String str) {
        this.bgColor = str;
    }

    public final void setBgColorNight(@Nullable String str) {
        this.bgColorNight = str;
    }

    public final void setBgStyle(int i7) {
        this.bgStyle = i7;
    }

    public final void setBorderColor(@Nullable String str) {
        this.borderColor = str;
    }

    public final void setBorderColorNight(@Nullable String str) {
        this.borderColorNight = str;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setTextColor(@Nullable String str) {
        this.textColor = str;
    }

    public final void setTextColorNight(@Nullable String str) {
        this.textColorNight = str;
    }
}
