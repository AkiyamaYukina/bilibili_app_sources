package com.bilibili.topix.detail;

import PD0.C2765g;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import cE0.C5232e;
import com.bilibili.lib.image2.bean.ImageInfo;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.image2.view.IGenericProperties;
import com.bilibili.topix.utils.f;
import com.bilibili.topix.widget.TopixHeadView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/C.class */
public final class C implements ImageLoadingListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f112649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TopixDetailFragment f112650b;

    public C(W w7, TopixDetailFragment topixDetailFragment) {
        this.f112649a = w7;
        this.f112650b = topixDetailFragment;
    }

    public final void onImageLoadFailed(Throwable th) {
        C5232e backgroundController;
        BiliImageView biliImageView;
        IGenericProperties genericProperties;
        super.onImageLoadFailed(th);
        TopixHeadView topixHeadView = this.f112649a.c;
        if (topixHeadView == null || (backgroundController = topixHeadView.getBackgroundController()) == null) {
            return;
        }
        ColorDrawable colorDrawable = new ColorDrawable(f.b(0.2f, backgroundController.f58779e));
        C2765g c2765g = this.f112650b.f112613b;
        if (c2765g == null || (biliImageView = c2765g.f18734b) == null || (genericProperties = biliImageView.getGenericProperties()) == null) {
            return;
        }
        genericProperties.setImage(colorDrawable);
    }

    public final void onImageSet(ImageInfo imageInfo) {
        C5232e backgroundController;
        GradientDrawable gradientDrawable;
        C2765g c2765g;
        BiliImageView biliImageView;
        IGenericProperties genericProperties;
        super.onImageSet(imageInfo);
        TopixHeadView topixHeadView = this.f112649a.c;
        if (topixHeadView == null || (backgroundController = topixHeadView.getBackgroundController()) == null || (gradientDrawable = backgroundController.f58777c) == null || (c2765g = this.f112650b.f112613b) == null || (biliImageView = c2765g.f18734b) == null || (genericProperties = biliImageView.getGenericProperties()) == null) {
            return;
        }
        genericProperties.setOverlayImage(gradientDrawable);
    }
}
