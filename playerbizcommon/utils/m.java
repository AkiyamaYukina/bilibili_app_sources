package com.bilibili.playerbizcommon.utils;

import com.bilibili.lib.image2.bean.DrawableHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;
import com.bilibili.lib.image2.bean.ImageDataSubscriber;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/m.class */
public final class m implements ImageDataSubscriber<DrawableHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f80311a;

    public m(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f80311a = cancellableContinuationImpl;
    }

    public final void onCancellation(ImageDataSource<DrawableHolder> imageDataSource) {
        this.f80311a.resumeWith(Result.constructor-impl((Object) null));
    }

    public final void onFailure(ImageDataSource<DrawableHolder> imageDataSource) {
        this.f80311a.resumeWith(Result.constructor-impl((Object) null));
    }

    public final void onResult(ImageDataSource<DrawableHolder> imageDataSource) {
        DrawableHolder drawableHolder = (DrawableHolder) imageDataSource.getResult();
        this.f80311a.resumeWith(Result.constructor-impl(drawableHolder != null ? drawableHolder.get() : null));
    }
}
