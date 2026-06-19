package com.bilibili.topix.detail;

import PD0.C2761c;
import PD0.C2765g;
import android.graphics.drawable.ColorDrawable;
import cE0.C5232e;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.image2.bean.ImageInfo;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.view.IGenericProperties;
import com.bilibili.magicasakura.widgets.TintFrameLayout;
import com.bilibili.topix.utils.f;
import com.bilibili.topix.widget.TopixHeadView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/B.class */
public final class B implements ImageLoadingListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f112602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TopixDetailFragment f112603b;

    public B(W w7, TopixDetailFragment topixDetailFragment) {
        this.f112602a = w7;
        this.f112603b = topixDetailFragment;
    }

    public final void onImageLoadFailed(Throwable th) {
        TintFrameLayout tintFrameLayout;
        C5232e backgroundController;
        IGenericProperties genericProperties;
        super.onImageLoadFailed(th);
        W w7 = this.f112602a;
        TopixHeadView topixHeadView = w7.c;
        TopixDetailFragment topixDetailFragment = this.f112603b;
        if (topixHeadView != null && (backgroundController = topixHeadView.getBackgroundController()) != null) {
            ColorDrawable colorDrawable = new ColorDrawable(f.b(0.2f, backgroundController.f58779e));
            C2765g c2765g = topixDetailFragment.f112613b;
            if (c2765g != null && (genericProperties = c2765g.f18734b.getGenericProperties()) != null) {
                genericProperties.setImage(colorDrawable);
            }
        }
        w7.b = NormalHeadStatus.CONFIGURED_HEAD_LOAD_FAILED;
        C2761c c2761c = topixDetailFragment.J;
        w7.a.f18681c.setPadding(0, (c2761c == null || (tintFrameLayout = c2761c.f18707a) == null) ? 0 : tintFrameLayout.getHeight(), 0, 0);
        w7.k(topixDetailFragment.J, topixDetailFragment.f112609F, topixDetailFragment.f112610G);
    }

    public final void onImageSet(ImageInfo imageInfo) {
        super.onImageSet(imageInfo);
        NormalHeadStatus normalHeadStatus = NormalHeadStatus.CONFIGURED_HEAD_LOAD_SUCCESS;
        W w7 = this.f112602a;
        w7.b = normalHeadStatus;
        w7.a.f18681c.setPadding(0, ListExtentionsKt.toPx(188), 0, 0);
        TopixDetailFragment topixDetailFragment = this.f112603b;
        w7.k(topixDetailFragment.J, topixDetailFragment.f112609F, topixDetailFragment.f112610G);
    }
}
