package com.bilibili.ogv.story;

import android.graphics.drawable.Drawable;
import com.bilibili.lib.image2.bean.BaseImageDataSubscriber;
import com.bilibili.lib.image2.bean.DrawableHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/w.class */
public final class w extends BaseImageDataSubscriber<DrawableHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvStoryTitleWidget f73118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Zq0.f f73120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f73121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f73122e;

    public w(OgvStoryTitleWidget ogvStoryTitleWidget, int i7, Zq0.f fVar, int i8, int i9) {
        this.f73118a = ogvStoryTitleWidget;
        this.f73119b = i7;
        this.f73120c = fVar;
        this.f73121d = i8;
        this.f73122e = i9;
    }

    public final void onFailureImpl(ImageDataSource<DrawableHolder> imageDataSource) {
        Zq0.f fVar = this.f73120c;
        fVar.f29716g = false;
        int i7 = this.f73121d;
        fVar.c(i7, this.f73122e, i7);
        this.f73118a.invalidate();
    }

    public final void onNewResultImpl(ImageDataSource<DrawableHolder> imageDataSource) {
        DrawableHolder drawableHolder;
        if (imageDataSource == null || (drawableHolder = (DrawableHolder) imageDataSource.getResult()) == null) {
            return;
        }
        int i7 = OgvStoryTitleWidget.f73045d;
        OgvStoryTitleWidget ogvStoryTitleWidget = this.f73118a;
        ogvStoryTitleWidget.getClass();
        Drawable drawable = drawableHolder.get();
        if (drawable == null) {
            return;
        }
        int i8 = this.f73119b;
        drawable.setBounds(0, 0, i8, i8);
        Zq0.f fVar = this.f73120c;
        fVar.f29716g = true;
        fVar.f29718j = drawable;
        int i9 = this.f73121d;
        fVar.c(i9, this.f73122e, i9);
        ogvStoryTitleWidget.invalidate();
    }
}
