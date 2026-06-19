package com.bilibili.music.podcast.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import com.bilibili.lib.ui.util.StatusBarCompat;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.music.podcast.utils.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/a.class */
public final class C5421a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f66961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f66962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f66963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f66964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f66965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f66966g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f66967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f66968j;

    public C5421a(@NotNull Context context) {
        boolean z6 = false;
        this.f66960a = context == null ? 0 : StatusBarCompat.getStatusBarHeight(context);
        Resources resources = context.getResources();
        this.f66961b = context.getResources().getDimensionPixelSize(2131166707);
        this.h = resources.getDimensionPixelSize(2131166723);
        this.f66966g = resources.getDimensionPixelSize(2131166724);
        this.f66965f = resources.getDimensionPixelSize(2131166722);
        this.f66963d = resources.getDimensionPixelSize(2131166711);
        this.f66964e = resources.getDimensionPixelSize(2131166712);
        this.f66962c = resources.getDimensionPixelSize(2131166710);
        this.f66967i = resources.getDimensionPixelSize(2131166733);
        Point displayRealSize = StatusBarCompat.getDisplayRealSize(context);
        this.f66968j = ((float) displayRealSize.x) / ((float) displayRealSize.y) > 0.5f ? true : z6;
    }

    public final int a() {
        return this.f66960a + this.f66961b + (this.f66968j ? this.f66965f : this.f66962c);
    }

    public final int b() {
        int i7 = this.f66960a;
        int i8 = this.f66961b;
        return this.f66968j ? i7 + i8 + this.h : i7 + i8 + this.f66967i + this.f66964e + this.f66963d;
    }

    public final int c() {
        return this.f66960a + this.f66961b + (this.f66968j ? this.f66966g : this.f66964e);
    }
}
