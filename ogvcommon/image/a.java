package com.bilibili.ogvcommon.image;

import android.graphics.Bitmap;
import com.bilibili.lib.image2.bean.DecodedImageHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;
import com.bilibili.lib.image2.bean.ImageDataSubscriber;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/image/a.class */
public final class a implements ImageDataSubscriber<DecodedImageHolder<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f73195a;

    public a(c cVar) {
        this.f73195a = cVar;
    }

    public final void onCancellation(ImageDataSource<DecodedImageHolder<?>> imageDataSource) {
    }

    public final void onFailure(ImageDataSource<DecodedImageHolder<?>> imageDataSource) {
        if (imageDataSource != null) {
            imageDataSource.getFailureCause();
        }
        this.f73195a.onFailure();
    }

    public final void onResult(ImageDataSource<DecodedImageHolder<?>> imageDataSource) {
        Bitmap bitmap = null;
        if (imageDataSource != null) {
            DecodedImageHolder decodedImageHolder = (DecodedImageHolder) imageDataSource.getResult();
            Object obj = decodedImageHolder != null ? decodedImageHolder.get() : null;
            bitmap = null;
            if (obj instanceof Bitmap) {
                bitmap = (Bitmap) obj;
            }
        }
        c cVar = this.f73195a;
        if (bitmap != null) {
            cVar.onResult(bitmap);
        } else {
            cVar.onFailure();
        }
    }
}
