package com.bilibili.opd.app.bizcommon.ui.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/ui/flexbox/b.class */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f74629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f74630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f74631g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f74632i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f74633j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f74634k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f74635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f74636m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f74638o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f74639p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f74640q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f74641r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f74625a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f74626b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f74627c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f74628d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<Integer> f74637n = new ArrayList();

    public final int a() {
        return this.h - this.f74632i;
    }

    public final void b(int i7, int i8, int i9, int i10, View view) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f74625a = Math.min(this.f74625a, (view.getLeft() - flexItem.getMarginLeft()) - i7);
        this.f74626b = Math.min(this.f74626b, (view.getTop() - flexItem.getMarginTop()) - i8);
        this.f74627c = Math.max(this.f74627c, view.getRight() + flexItem.getMarginRight() + i9);
        this.f74628d = Math.max(this.f74628d, view.getBottom() + flexItem.getMarginBottom() + i10);
    }
}
