package com.bilibili.upper.module.uppercenterlocal;

import com.bilibili.lib.image2.bean.ImageDataSource;
import com.bilibili.lib.image2.bean.ImageDataSubscriber;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/a.class */
public final class a implements ImageDataSubscriber<ta0.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114242a;

    public a(String str) {
        this.f114242a = str;
    }

    public final void onCancellation(ImageDataSource<ta0.e> imageDataSource) {
    }

    public final void onFailure(ImageDataSource<ta0.e> imageDataSource) {
        bilibili.live.app.service.resolver.b.a(new StringBuilder("prefetch fail: "), this.f114242a, "UpperCenterImageFetcher");
    }

    public final void onResult(ImageDataSource<ta0.e> imageDataSource) {
        bilibili.live.app.service.resolver.b.a(new StringBuilder("prefetch ok: "), this.f114242a, "UpperCenterImageFetcher");
    }
}
