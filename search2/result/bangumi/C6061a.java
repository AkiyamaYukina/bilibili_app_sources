package com.bilibili.search2.result.bangumi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import com.bilibili.lib.image2.bean.DrawableHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;
import com.bilibili.lib.image2.bean.ImageDataSubscriber;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.magicasakura.utils.ThemeUtils;

/* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/a.class */
public final class C6061a implements ImageDataSubscriber<DrawableHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f87385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiliImageView f87386b;

    public C6061a(Context context, BiliImageView biliImageView) {
        this.f87385a = context;
        this.f87386b = biliImageView;
    }

    public final void onCancellation(ImageDataSource<DrawableHolder> imageDataSource) {
    }

    public final void onFailure(ImageDataSource<DrawableHolder> imageDataSource) {
        int i7 = C6062b.f87387a;
        C6062b.a(this.f87386b);
    }

    public final void onResult(ImageDataSource<DrawableHolder> imageDataSource) {
        DrawableHolder drawableHolder;
        Drawable drawable = (imageDataSource == null || (drawableHolder = (DrawableHolder) imageDataSource.getResult()) == null) ? null : drawableHolder.get();
        if (drawable == null) {
            onFailure(imageDataSource);
        } else {
            DrawableCompat.setTint(drawable, ThemeUtils.getColorById(this.f87385a, 2131103284));
            this.f87386b.setImageDrawable(drawable);
        }
    }
}
