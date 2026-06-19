package com.bilibili.studio.editor.repository.entity;

import androidx.annotation.Keep;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/repository/entity/BiliEditorMusicRhythmSticker.class */
@Keep
public final class BiliEditorMusicRhythmSticker implements Serializable {

    @Nullable
    private String downloadUrl;
    private long end;

    @Nullable
    private String licPath;

    @Nullable
    private String name;

    @Nullable
    private String path;
    private float relativeX;
    private float relativeY;
    private float rotation;
    private float scale = 1.0f;
    private long start;
    private long stickerId;

    @Nullable
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final long getEnd() {
        return this.end;
    }

    @Nullable
    public final String getLicPath() {
        return this.licPath;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPath() {
        return this.path;
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

    public final float getScale() {
        return this.scale;
    }

    public final long getStart() {
        return this.start;
    }

    public final long getStickerId() {
        return this.stickerId;
    }

    public final void setDownloadUrl(@Nullable String str) {
        this.downloadUrl = str;
    }

    public final void setEnd(long j7) {
        this.end = j7;
    }

    public final void setLicPath(@Nullable String str) {
        this.licPath = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPath(@Nullable String str) {
        this.path = str;
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

    public final void setScale(float f7) {
        this.scale = f7;
    }

    public final void setStart(long j7) {
        this.start = j7;
    }

    public final void setStickerId(long j7) {
        this.stickerId = j7;
    }
}
