package com.bilibili.playerbizcommon.features.danmaku.input;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/input/d.class */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f79682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f79683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f79684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f79685d;

    public d(String str, String str2, int i7) {
        str2 = (i7 & 4) != 0 ? null : str2;
        this.f79682a = str;
        this.f79683b = str2;
        this.f79684c = null;
        this.f79685d = 0;
    }
}
