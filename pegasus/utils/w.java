package com.bilibili.pegasus.utils;

import android.view.View;
import com.bilibili.lib.image2.bean.ImageInfo;
import com.bilibili.lib.image2.bean.ImageLoadingListener;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/w.class */
public final class w implements ImageLoadingListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f78892a;

    public w(View view) {
        this.f78892a = view;
    }

    public final void onImageSet(ImageInfo imageInfo) {
        View view = this.f78892a;
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
