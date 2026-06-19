package com.bilibili.music.podcast.utils;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/K.class */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C5421a f66957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f66958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f66959d;

    public K(@NotNull Context context, int i7) {
        this.f66956a = i7;
        this.f66957b = new C5421a(context);
        this.f66958c = context.getResources().getDimensionPixelSize(2131166720);
        this.f66959d = context.getResources().getDimensionPixelSize(2131166721);
    }

    public final int a() {
        C5421a c5421a = this.f66957b;
        return (c5421a.f66968j ? c5421a.f66966g : c5421a.f66964e) + c5421a.f66961b + (this.f66956a > 0 ? c5421a.f66960a : 0);
    }
}
