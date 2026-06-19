package com.bilibili.upper.module.cover_v2.model.template;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/MultiCoverTemplateCaption.class */
@StabilityInferred(parameters = 0)
@Keep
public final class MultiCoverTemplateCaption {
    public static final int $stable = 8;

    @Nullable
    private String borderColor;

    @Nullable
    private MultiCaptionFlower captionFlower;

    @Nullable
    private MultiCaptionFont captionFont;

    @Nullable
    private MultiCoverCaptionTemplate captionTemplate;

    @Nullable
    private String fontColor;
    private double fontSize;
    private double left;
    private double rotation;

    @Nullable
    private String text;
    private double top;
    private int templateId = -1;
    private int fontId = -1;
    private int flowerId = -1;

    @Nullable
    public final String getBorderColor() {
        return this.borderColor;
    }

    @Nullable
    public final MultiCaptionFlower getCaptionFlower() {
        return this.captionFlower;
    }

    @Nullable
    public final MultiCaptionFont getCaptionFont() {
        return this.captionFont;
    }

    @Nullable
    public final MultiCoverCaptionTemplate getCaptionTemplate() {
        return this.captionTemplate;
    }

    public final int getFlowerId() {
        return this.flowerId;
    }

    @Nullable
    public final String getFontColor() {
        return this.fontColor;
    }

    public final int getFontId() {
        return this.fontId;
    }

    public final double getFontSize() {
        return this.fontSize;
    }

    public final double getLeft() {
        return this.left;
    }

    public final double getRotation() {
        return this.rotation;
    }

    public final int getTemplateId() {
        return this.templateId;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final double getTop() {
        return this.top;
    }

    public final void setBorderColor(@Nullable String str) {
        this.borderColor = str;
    }

    public final void setCaptionFlower(@Nullable MultiCaptionFlower multiCaptionFlower) {
        this.captionFlower = multiCaptionFlower;
    }

    public final void setCaptionFont(@Nullable MultiCaptionFont multiCaptionFont) {
        this.captionFont = multiCaptionFont;
    }

    public final void setCaptionTemplate(@Nullable MultiCoverCaptionTemplate multiCoverCaptionTemplate) {
        this.captionTemplate = multiCoverCaptionTemplate;
    }

    public final void setFlowerId(int i7) {
        this.flowerId = i7;
    }

    public final void setFontColor(@Nullable String str) {
        this.fontColor = str;
    }

    public final void setFontId(int i7) {
        this.fontId = i7;
    }

    public final void setFontSize(double d7) {
        this.fontSize = d7;
    }

    public final void setLeft(double d7) {
        this.left = d7;
    }

    public final void setRotation(double d7) {
        this.rotation = d7;
    }

    public final void setTemplateId(int i7) {
        this.templateId = i7;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setTop(double d7) {
        this.top = d7;
    }
}
