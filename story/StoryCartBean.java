package com.bilibili.story;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/story/StoryCartBean.class */
public final class StoryCartBean {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f105085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f105086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f105087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f105088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f105089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f105090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f105091g;

    @NotNull
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Integer f105092i;

    public StoryCartBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @Nullable Integer num) {
        this.f105085a = str;
        this.f105086b = str2;
        this.f105087c = str3;
        this.f105088d = str4;
        this.f105089e = str5;
        this.f105090f = str6;
        this.f105091g = str7;
        this.h = str8;
        this.f105092i = num;
    }

    @NotNull
    public final String getAid() {
        return this.f105088d;
    }

    @NotNull
    public final String getCardGoto() {
        return this.h;
    }

    @NotNull
    public final String getCid() {
        return this.f105089e;
    }

    @NotNull
    public final String getGoto() {
        return this.f105091g;
    }

    @NotNull
    public final String getIconUrl() {
        return this.f105085a;
    }

    @Nullable
    public final Integer getNatureAd() {
        return this.f105092i;
    }

    @NotNull
    public final String getTitle() {
        return this.f105087c;
    }

    @NotNull
    public final String getTrackId() {
        return this.f105090f;
    }

    @NotNull
    public final String getType() {
        return this.f105086b;
    }

    public final void setAid(@NotNull String str) {
        this.f105088d = str;
    }

    public final void setCardGoto(@NotNull String str) {
        this.h = str;
    }

    public final void setCid(@NotNull String str) {
        this.f105089e = str;
    }

    public final void setGoto(@NotNull String str) {
        this.f105091g = str;
    }

    public final void setIconUrl(@NotNull String str) {
        this.f105085a = str;
    }

    public final void setNatureAd(@Nullable Integer num) {
        this.f105092i = num;
    }

    public final void setTitle(@NotNull String str) {
        this.f105087c = str;
    }

    public final void setTrackId(@NotNull String str) {
        this.f105090f = str;
    }

    public final void setType(@NotNull String str) {
        this.f105086b = str;
    }
}
