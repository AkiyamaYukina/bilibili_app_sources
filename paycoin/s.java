package com.bilibili.paycoin;

import com.bilibili.lib.image2.bean.DrawableHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;
import com.bilibili.lib.image2.bean.ImageDataSubscriber;
import kotlin.Result;
import kotlin.coroutines.SafeContinuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/s.class */
public final class s implements ImageDataSubscriber<DrawableHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SafeContinuation f74819a;

    public s(SafeContinuation safeContinuation) {
        this.f74819a = safeContinuation;
    }

    public final void onCancellation(ImageDataSource<DrawableHolder> imageDataSource) {
        this.f74819a.resumeWith(Result.constructor-impl((Object) null));
    }

    public final void onFailure(ImageDataSource<DrawableHolder> imageDataSource) {
        this.f74819a.resumeWith(Result.constructor-impl((Object) null));
    }

    public final void onResult(ImageDataSource<DrawableHolder> imageDataSource) {
        DrawableHolder drawableHolder = (DrawableHolder) imageDataSource.getResult();
        this.f74819a.resumeWith(Result.constructor-impl(drawableHolder != null ? drawableHolder.get() : null));
    }
}
