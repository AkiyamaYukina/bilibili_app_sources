package com.bilibili.lib.sharewrapper.Bshare;

import com.bilibili.lib.sharewrapper.Bshare.GShare;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/Bshare/ThirdAppKey.class */
public final class ThirdAppKey {

    @NotNull
    public static final ThirdAppKey INSTANCE = new ThirdAppKey();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static String f64407a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static String f64408b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static String f64409c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static String f64410d = "";

    @NotNull
    public final String getQQAppId() {
        return f64407a;
    }

    @NotNull
    public final String getRedirectUrl() {
        return f64410d;
    }

    @NotNull
    public final String getSinaAppKey() {
        return f64409c;
    }

    @NotNull
    public final String getWXAppId() {
        return f64408b;
    }

    public final void setDelegate(@NotNull GShare.ThirdAppKey thirdAppKey) {
        f64407a = thirdAppKey.getQQAppId();
        f64408b = thirdAppKey.getWXAppId();
        f64409c = thirdAppKey.getSinaAppKey();
        f64410d = thirdAppKey.getRedirectUrl();
    }

    public final void setQQAppId(@NotNull String str) {
        f64407a = str;
    }

    public final void setRedirectUrl(@NotNull String str) {
        f64410d = str;
    }

    public final void setSinaAppKey(@NotNull String str) {
        f64409c = str;
    }

    public final void setWXAppId(@NotNull String str) {
        f64408b = str;
    }
}
