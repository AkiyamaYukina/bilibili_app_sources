package com.bilibili.playerbizcommon.widget.control;

import android.graphics.drawable.Drawable;
import com.bilibili.lib.image2.bean.BaseImageDataSubscriber;
import com.bilibili.lib.image2.bean.DrawableHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/g.class */
public final class g extends BaseImageDataSubscriber<DrawableHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayerSeekWidget f80584a;

    public g(PlayerSeekWidget playerSeekWidget) {
        this.f80584a = playerSeekWidget;
    }

    public final void onFailureImpl(ImageDataSource<DrawableHolder> imageDataSource) {
        com.bilibili.adcommon.utils.e.a("setThumb fail ", "PlayerSeekWidget", imageDataSource != null ? imageDataSource.getFailureCause() : null);
        if (imageDataSource != null) {
            imageDataSource.close();
        }
    }

    public final void onNewResultImpl(ImageDataSource<DrawableHolder> imageDataSource) {
        DrawableHolder drawableHolder;
        Drawable drawable;
        if (imageDataSource == null || (drawableHolder = (DrawableHolder) imageDataSource.getResult()) == null || (drawable = drawableHolder.get()) == null) {
            return;
        }
        this.f80584a.setThumbInternal(drawable);
        imageDataSource.close();
    }
}
