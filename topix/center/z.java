package com.bilibili.topix.center;

import com.bilibili.lib.image2.bean.ImageLoadingListener;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/z.class */
public final class z implements ImageLoadingListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f112446a;

    public z(A a7) {
        this.f112446a = a7;
    }

    public final void onImageLoadFailed(Throwable th) {
        this.f112446a.f112349b.setVisibility(8);
    }
}
