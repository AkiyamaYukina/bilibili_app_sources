package com.bilibili.pegasus.fakepegasus;

import com.bilibili.lib.image2.bean.ImageInfo;
import com.bilibili.lib.image2.bean.ImageLoadingListener;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/fakepegasus/j.class */
public final class j implements ImageLoadingListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f77466a;

    public j(i iVar) {
        this.f77466a = iVar;
    }

    public final void onImageSet(ImageInfo imageInfo) {
        this.f77466a.f77460b.setVisibility(0);
    }
}
