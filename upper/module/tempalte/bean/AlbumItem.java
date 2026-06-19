package com.bilibili.upper.module.tempalte.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/bean/AlbumItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class AlbumItem {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();
    public static final int FLAG_IMAGE = 0;
    public static final int FLAG_VIDEO = 1;
    private long clusterId;

    @Nullable
    private String cover;

    @Nullable
    private String date;

    @Nullable
    private int[] durations;

    @Nullable
    private int[] flags;

    @Nullable
    private String[] paths;

    @Nullable
    private String place;

    @Nullable
    private String template;

    @Nullable
    private String title;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/bean/AlbumItem$a.class */
    public static final class a {
    }

    public final long getClusterId() {
        return this.clusterId;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    @Nullable
    public final String getDate() {
        return this.date;
    }

    @Nullable
    public final int[] getDurations() {
        return this.durations;
    }

    @Nullable
    public final int[] getFlags() {
        return this.flags;
    }

    @Nullable
    public final String[] getPaths() {
        return this.paths;
    }

    @Nullable
    public final String getPlace() {
        return this.place;
    }

    @Nullable
    public final String getTemplate() {
        return this.template;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setClusterId(long j7) {
        this.clusterId = j7;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setDate(@Nullable String str) {
        this.date = str;
    }

    public final void setDurations(@Nullable int[] iArr) {
        this.durations = iArr;
    }

    public final void setFlags(@Nullable int[] iArr) {
        this.flags = iArr;
    }

    public final void setPaths(@Nullable String[] strArr) {
        this.paths = strArr;
    }

    public final void setPlace(@Nullable String str) {
        this.place = str;
    }

    public final void setTemplate(@Nullable String str) {
        this.template = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
