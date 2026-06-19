package com.bilibili.playerbizcommon.features.network;

import android.graphics.Bitmap;
import android.view.View;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.bilibili.lib.image2.bean.BaseImageDataSubscriber;
import com.bilibili.lib.image2.bean.DecodedImageHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;
import com.bilibili.lib.image2.bean.StaticBitmapImageHolder;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/e.class */
public final class e extends BaseImageDataSubscriber<DecodedImageHolder<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayerNetworkFunctionWidget f79913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f79914b;

    public e(PlayerNetworkFunctionWidget playerNetworkFunctionWidget, View view) {
        this.f79913a = playerNetworkFunctionWidget;
        this.f79914b = view;
    }

    public final void onFailureImpl(ImageDataSource<DecodedImageHolder<?>> imageDataSource) {
    }

    public final void onNewResultImpl(ImageDataSource<DecodedImageHolder<?>> imageDataSource) {
        Bitmap bitmap;
        if (imageDataSource == null) {
            return;
        }
        Object result = imageDataSource.getResult();
        StaticBitmapImageHolder staticBitmapImageHolder = result instanceof StaticBitmapImageHolder ? (StaticBitmapImageHolder) result : null;
        if (staticBitmapImageHolder == null || (bitmap = staticBitmapImageHolder.get()) == null) {
            return;
        }
        PlayerNetworkFunctionWidget playerNetworkFunctionWidget = this.f79913a;
        RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(playerNetworkFunctionWidget.h().getContext().getResources(), bitmap);
        roundedBitmapDrawableCreate.setCircular(true);
        roundedBitmapDrawableCreate.setCornerRadius(DpUtils.dp2px(playerNetworkFunctionWidget.h().getContext(), 4.0f));
        this.f79914b.setBackground(roundedBitmapDrawableCreate);
        imageDataSource.close();
    }
}
