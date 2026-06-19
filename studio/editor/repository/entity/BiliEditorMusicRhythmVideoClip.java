package com.bilibili.studio.editor.repository.entity;

import I1.C2157f0;
import N1.c;
import androidx.annotation.Keep;
import androidx.room.B;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/repository/entity/BiliEditorMusicRhythmVideoClip.class */
@Keep
public final class BiliEditorMusicRhythmVideoClip implements Serializable {

    @NotNull
    public static final a Companion = new Object();
    public static final float SPEED_025 = 0.25f;
    public static final float SPEED_8 = 8.0f;

    @Nullable
    private String description;
    private long duration;

    @Nullable
    private String id;

    @Nullable
    private String materialCover;
    private long materialDuration;
    private int part;

    @Nullable
    private String trans;

    @Nullable
    private String transitionName;

    @Nullable
    private String transitionPackageId;
    private int materialMimeType = -1;
    private boolean isShow = true;
    private float speed = 1.0f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/repository/entity/BiliEditorMusicRhythmVideoClip$a.class */
    public static final class a {
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getMaterialCover() {
        return this.materialCover;
    }

    public final long getMaterialDuration() {
        return this.materialDuration;
    }

    public final int getMaterialMimeType() {
        return this.materialMimeType;
    }

    public final long getMinDuration() {
        return (long) (this.duration * 0.25f);
    }

    public final int getPart() {
        return this.part;
    }

    public final float getSpeed() {
        float f7 = this.speed;
        if (0.25f > f7 || f7 > 8.0f) {
            f7 = (f7 <= 0.0f || f7 >= 0.25f) ? f7 > 8.0f ? 8.0f : 1.0f : 0.25f;
        }
        return f7;
    }

    @Nullable
    public final String getTrans() {
        return this.trans;
    }

    @Nullable
    public final String getTransitionName() {
        return this.transitionName;
    }

    @Nullable
    public final String getTransitionPackageId() {
        return this.transitionPackageId;
    }

    public final boolean isShow() {
        return this.isShow;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setDuration(long j7) {
        this.duration = j7;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setMaterialCover(@Nullable String str) {
        this.materialCover = str;
    }

    public final void setMaterialDuration(long j7) {
        this.materialDuration = j7;
    }

    public final void setMaterialMimeType(int i7) {
        this.materialMimeType = i7;
    }

    public final void setPart(int i7) {
        this.part = i7;
    }

    public final void setShow(boolean z6) {
        this.isShow = z6;
    }

    public final void setSpeed(float f7) {
        this.speed = f7;
    }

    public final void setTrans(@Nullable String str) {
        this.trans = str;
    }

    public final void setTransitionName(@Nullable String str) {
        this.transitionName = str;
    }

    public final void setTransitionPackageId(@Nullable String str) {
        this.transitionPackageId = str;
    }

    @NotNull
    public String toString() {
        int i7 = this.part;
        long j7 = this.duration;
        String str = this.materialCover;
        String str2 = this.trans;
        String str3 = this.transitionName;
        String str4 = this.transitionPackageId;
        int i8 = this.materialMimeType;
        long j8 = this.materialDuration;
        boolean z6 = this.isShow;
        StringBuilder sbA = C2157f0.a(i7, j7, "BiliEditorMusicRhythmVideoClip(part=", ", duration=");
        B.a(", materialCover=", str, ", trans=", str2, sbA);
        B.a(", transitionName=", str3, ", transitionPackageId=", str4, sbA);
        c.a(i8, ", materialMimeType=", ", materialDuration=", sbA);
        com.bilibili.bplus.followingpublish.fragments.publish.c.a(j8, ", isShow=", sbA, z6);
        sbA.append(")");
        return sbA.toString();
    }
}
