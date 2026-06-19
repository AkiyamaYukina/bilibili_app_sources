package com.bilibili.upper.module.cover_v2.model.template;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/MultiCoverTemplateSticker.class */
@StabilityInferred(parameters = 0)
@Keep
public final class MultiCoverTemplateSticker {
    public static final int $stable = 8;

    @Nullable
    private String coverUrl;

    @Nullable
    private String downloadUrl;

    @Nullable
    private String filePath;
    private double height;
    private int id = -1;
    private double left;

    @Nullable
    private String name;
    private double rotation;
    private double top;
    private double width;

    @Nullable
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    @Nullable
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    public final double getHeight() {
        return this.height;
    }

    public final int getId() {
        return this.id;
    }

    public final double getLeft() {
        return this.left;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final double getRotation() {
        return this.rotation;
    }

    public final double getTop() {
        return this.top;
    }

    public final double getWidth() {
        return this.width;
    }

    public final void setCoverUrl(@Nullable String str) {
        this.coverUrl = str;
    }

    public final void setDownloadUrl(@Nullable String str) {
        this.downloadUrl = str;
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }

    public final void setHeight(double d7) {
        this.height = d7;
    }

    public final void setId(int i7) {
        this.id = i7;
    }

    public final void setLeft(double d7) {
        this.left = d7;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setRotation(double d7) {
        this.rotation = d7;
    }

    public final void setTop(double d7) {
        this.top = d7;
    }

    public final void setWidth(double d7) {
        this.width = d7;
    }
}
