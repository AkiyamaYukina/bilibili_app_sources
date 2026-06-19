package com.bilibili.ship.theseus.cheese.biz.intro.desc;

import android.view.ViewGroup;
import com.bilibili.lib.image2.bean.ImageInfo;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.ship.theseus.cheese.biz.intro.desc.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/e.class */
public final class e implements ImageLoadingListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.b f89401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiliImageView f89402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f89403c;

    public e(c.b bVar, BiliImageView biliImageView, int i7) {
        this.f89401a = bVar;
        this.f89402b = biliImageView;
        this.f89403c = i7;
    }

    public final void onImageLoadFailed(Throwable th) {
        super.onImageLoadFailed(th);
        if (th != null) {
            th.printStackTrace();
        }
    }

    public final void onImageSet(ImageInfo imageInfo) {
        super.onImageSet(imageInfo);
        if (imageInfo != null && imageInfo.getWidth() > 0) {
            BiliImageView biliImageView = this.f89402b;
            this.f89401a.getClass();
            ViewGroup.LayoutParams layoutParams = biliImageView.getLayoutParams();
            int i7 = this.f89403c;
            layoutParams.width = i7;
            layoutParams.height = (int) (i7 * ((imageInfo.getHeight() * 1.0f) / imageInfo.getWidth()));
            biliImageView.setLayoutParams(layoutParams);
        }
    }
}
