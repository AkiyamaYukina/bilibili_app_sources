package com.bilibili.playerbizcommonv2.widget.seek.v3;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bilibili.lib.image2.bean.BaseImageDataSubscriber;
import com.bilibili.lib.image2.bean.DecodedImageHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;
import com.bilibili.lib.image2.bean.StaticBitmapImageHolder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/n.class */
public final class n extends BaseImageDataSubscriber<DecodedImageHolder<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f83057a;

    public n(m mVar) {
        this.f83057a = mVar;
    }

    public final void onFailureImpl(ImageDataSource<DecodedImageHolder<?>> imageDataSource) {
        ImageView imageView = this.f83057a.f83026a;
        ImageView imageView2 = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivThumb");
            imageView2 = null;
        }
        imageView2.setBackgroundResource(2131244490);
    }

    public final void onNewResultImpl(ImageDataSource<DecodedImageHolder<?>> imageDataSource) {
        DecodedImageHolder decodedImageHolder = imageDataSource != null ? (DecodedImageHolder) imageDataSource.getResult() : null;
        StaticBitmapImageHolder staticBitmapImageHolder = decodedImageHolder instanceof StaticBitmapImageHolder ? (StaticBitmapImageHolder) decodedImageHolder : null;
        Bitmap bitmap = staticBitmapImageHolder != null ? staticBitmapImageHolder.get() : null;
        m mVar = this.f83057a;
        if (bitmap != null) {
            ImageView imageView = mVar.f83026a;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivThumb");
                imageView = null;
            }
            imageView.setImageBitmap(bitmap);
            return;
        }
        ImageView imageView2 = mVar.f83026a;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivThumb");
            imageView2 = null;
        }
        imageView2.setBackgroundResource(2131244490);
    }
}
