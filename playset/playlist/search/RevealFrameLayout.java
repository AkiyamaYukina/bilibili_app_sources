package com.bilibili.playset.playlist.search;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import ff.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search/RevealFrameLayout.class */
public class RevealFrameLayout extends FrameLayout implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f85374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f85375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a.a f85376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f85377d;

    public RevealFrameLayout(Context context) {
        this(context, null);
    }

    public RevealFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f85375b = new Rect();
        this.f85374a = new Path();
    }

    public final void a(a.a aVar) {
        this.f85376c = aVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j7) {
        return super.drawChild(canvas, view, j7);
    }

    public float getRevealRadius() {
        return this.f85377d;
    }

    public void setRevealRadius(float f7) {
        this.f85377d = f7;
        this.f85376c.a().getHitRect(this.f85375b);
        invalidate(this.f85375b);
    }
}
