package com.bilibili.lib.ui;

import com.bilibili.lib.image2.bean.BaseImageDataSubscriber;
import com.bilibili.lib.image2.bean.DrawableHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/w.class */
public final class w extends BaseImageDataSubscriber<DrawableHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageSpan2 f64952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64953b;

    public w(ImageSpan2 imageSpan2, String str) {
        this.f64952a = imageSpan2;
        this.f64953b = str;
    }

    public final void onFailureImpl(ImageDataSource<DrawableHolder> imageDataSource) {
        ImageSpan2.access$onFailureInternal(this.f64952a, this.f64953b, imageDataSource, imageDataSource != null ? imageDataSource.getFailureCause() : null, true);
    }

    public final void onNewResultImpl(ImageDataSource<DrawableHolder> imageDataSource) {
        DrawableHolder drawableHolder;
        boolean z6 = false;
        if (imageDataSource != null) {
            z6 = false;
            if (imageDataSource.isFinished()) {
                z6 = true;
            }
        }
        String str = this.f64953b;
        ImageSpan2 imageSpan2 = this.f64952a;
        if (imageDataSource == null || (drawableHolder = (DrawableHolder) imageDataSource.getResult()) == null) {
            ImageSpan2.access$onFailureInternal(imageSpan2, str, imageDataSource, new NullPointerException(), true);
        } else {
            ImageSpan2.access$onNewResultInternal(imageSpan2, str, imageDataSource, drawableHolder, z6);
        }
    }
}
