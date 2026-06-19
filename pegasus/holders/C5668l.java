package com.bilibili.pegasus.holders;

import com.bilibili.lib.image2.bean.ImageInfo;
import com.bilibili.lib.image2.bean.ImageLoadingListener;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/l.class */
public final class C5668l implements ImageLoadingListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5670m f77890a;

    public C5668l(C5670m c5670m) {
        this.f77890a = c5670m;
    }

    public final void onImageSet(ImageInfo imageInfo) {
        this.f77890a.f77894f.h.setVisibility(0);
    }
}
