package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import android.widget.ImageView;
import com.bilibili.lib.image2.bean.BaseImageDataSubscriber;
import com.bilibili.lib.image2.bean.DrawableHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/T.class */
public final class T extends BaseImageDataSubscriber<DrawableHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f102824a;

    public T(ImageView imageView) {
        this.f102824a = imageView;
    }

    public final void onFailureImpl(ImageDataSource<DrawableHolder> imageDataSource) {
        this.f102824a.setImageDrawable(null);
    }

    public final void onNewResultImpl(ImageDataSource<DrawableHolder> imageDataSource) {
        DrawableHolder drawableHolder;
        this.f102824a.setImageDrawable((imageDataSource == null || (drawableHolder = (DrawableHolder) imageDataSource.getResult()) == null) ? null : drawableHolder.get());
    }
}
