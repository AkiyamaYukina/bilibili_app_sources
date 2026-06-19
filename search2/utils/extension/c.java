package com.bilibili.search2.utils.extension;

import com.bilibili.lib.image2.ImageRequestBuilder;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.bilibili.lib.image2.bean.IThumbnailSizeController;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.lib.image2.bean.ScaleType;
import com.bilibili.lib.image2.bean.ThumbUrlTransformStrategyUtils;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.search2.result.holder.author.t;
import com.bilibili.search2.utils.r;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/extension/c.class */
public final class c {
    public static void a(BiliImageView biliImageView, String str, String str2, boolean z6, ImageLoadingListener imageLoadingListener, t tVar, int i7, int i8, int i9) {
        if ((i9 & 2) != 0) {
            str2 = null;
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        if ((i9 & 8) != 0) {
            imageLoadingListener = null;
        }
        if ((i9 & 16) != 0) {
            tVar = null;
        }
        if ((i9 & 32) != 0) {
            i7 = 0;
        }
        if ((i9 & 64) != 0) {
            i8 = 0;
        }
        String str3 = str2;
        if (str2 == null) {
            str3 = "search-normal-fill-android";
        }
        ImageExtentionKt.displayImage$default(biliImageView, str, ThumbUrlTransformStrategyUtils.stylingStrategy(str3, tVar), imageLoadingListener, i7, i8, z6, false, (ScaleType) null, (BitmapTransformation) null, false, 704, (Object) null);
    }

    public static void b(BiliImageView biliImageView, String str, ImageLoadingListener imageLoadingListener, r rVar, int i7) {
        if ((i7 & 8) != 0) {
            imageLoadingListener = null;
        }
        if ((i7 & 128) != 0) {
            rVar = null;
        }
        ImageRequestBuilder imageRequestBuilderBuilder$default = ImageExtentionKt.builder$default(biliImageView, str, 0, 0, ThumbUrlTransformStrategyUtils.stylingStrategy("search-normal-fill-android", (IThumbnailSizeController) null), false, (ScaleType) null, 16, (Object) null);
        imageRequestBuilderBuilder$default.fadeDuration(0);
        if (imageLoadingListener != null) {
            imageRequestBuilderBuilder$default.imageLoadingListener(imageLoadingListener);
        }
        biliImageView.resetImageTint();
        if (rVar != null) {
            imageRequestBuilderBuilder$default.bitmapTransformation(rVar);
        }
        imageRequestBuilderBuilder$default.into(biliImageView);
    }
}
