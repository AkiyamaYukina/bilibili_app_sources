package com.bilibili.studio.editor.repository.entity;

import androidx.annotation.Keep;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/repository/entity/BiliEditorMusicRhythmWords.class */
@Keep
public final class BiliEditorMusicRhythmWords implements Serializable {
    private long end;

    @Nullable
    private String fontColor;

    @Nullable
    private String fontDownloadUrl;
    private long fontId;

    @Nullable
    private String fontPath;

    @Nullable
    private String outlineColor;
    private float outlineWidth;
    private float relativeX;
    private float relativeY;
    private float rotation;
    private long start;

    @Nullable
    private String templateDownloadUrl;
    private long templateId;

    @Nullable
    private String templateLicPath;

    @Nullable
    private String templatePath;

    @Nullable
    private String text;
    private long verticalLayout;
    private float fontSize = 1.0f;
    private float captionScale = 1.0f;

    public final float getCaptionScale() {
        return this.captionScale;
    }

    public final long getEnd() {
        return this.end;
    }

    @Nullable
    public final String getFontColor() {
        return this.fontColor;
    }

    @Nullable
    public final String getFontDownloadUrl() {
        return this.fontDownloadUrl;
    }

    public final long getFontId() {
        return this.fontId;
    }

    @Nullable
    public final String getFontPath() {
        return this.fontPath;
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    @Nullable
    public final String getOutlineColor() {
        return this.outlineColor;
    }

    public final float getOutlineWidth() {
        return this.outlineWidth;
    }

    public final float getRelativeX() {
        return this.relativeX;
    }

    public final float getRelativeY() {
        return this.relativeY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final long getStart() {
        return this.start;
    }

    @Nullable
    public final String getTemplateDownloadUrl() {
        return this.templateDownloadUrl;
    }

    public final long getTemplateId() {
        return this.templateId;
    }

    @Nullable
    public final String getTemplateLicPath() {
        return this.templateLicPath;
    }

    @Nullable
    public final String getTemplatePath() {
        return this.templatePath;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final long getVerticalLayout() {
        return this.verticalLayout;
    }

    public final void setCaptionScale(float f7) {
        this.captionScale = f7;
    }

    public final void setEnd(long j7) {
        this.end = j7;
    }

    public final void setFontColor(@Nullable String str) {
        this.fontColor = str;
    }

    public final void setFontDownloadUrl(@Nullable String str) {
        this.fontDownloadUrl = str;
    }

    public final void setFontId(long j7) {
        this.fontId = j7;
    }

    public final void setFontPath(@Nullable String str) {
        this.fontPath = str;
    }

    public final void setFontSize(float f7) {
        this.fontSize = f7;
    }

    public final void setOutlineColor(@Nullable String str) {
        this.outlineColor = str;
    }

    public final void setOutlineWidth(float f7) {
        this.outlineWidth = f7;
    }

    public final void setRelativeX(float f7) {
        this.relativeX = f7;
    }

    public final void setRelativeY(float f7) {
        this.relativeY = f7;
    }

    public final void setRotation(float f7) {
        this.rotation = f7;
    }

    public final void setStart(long j7) {
        this.start = j7;
    }

    public final void setTemplateDownloadUrl(@Nullable String str) {
        this.templateDownloadUrl = str;
    }

    public final void setTemplateId(long j7) {
        this.templateId = j7;
    }

    public final void setTemplateLicPath(@Nullable String str) {
        this.templateLicPath = str;
    }

    public final void setTemplatePath(@Nullable String str) {
        this.templatePath = str;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setVerticalLayout(long j7) {
        this.verticalLayout = j7;
    }
}
