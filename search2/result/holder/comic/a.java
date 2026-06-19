package com.bilibili.search2.result.holder.comic;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.bilibili.lib.image2.bean.DrawableHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;
import com.bilibili.lib.image2.bean.ImageDataSubscriber;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.magicasakura.utils.ThemeUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/comic/a.class */
public final class a implements ImageDataSubscriber<DrawableHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f88088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiliImageView f88090c;

    public a(Context context, int i7, BiliImageView biliImageView) {
        this.f88088a = context;
        this.f88089b = i7;
        this.f88090c = biliImageView;
    }

    public final void onCancellation(ImageDataSource<DrawableHolder> imageDataSource) {
    }

    public final void onFailure(ImageDataSource<DrawableHolder> imageDataSource) {
        BiliImageView biliImageView = this.f88090c;
        VectorDrawableCompat vectorDrawableCompatCreate = VectorDrawableCompat.create(biliImageView.getResources(), 2131236687, null);
        if (vectorDrawableCompatCreate == null) {
            return;
        }
        Drawable drawableWrap = DrawableCompat.wrap(vectorDrawableCompatCreate);
        DrawableCompat.setTint(drawableWrap.mutate(), ThemeUtils.getColorById(biliImageView.getContext(), this.f88089b));
        biliImageView.setImageDrawable(drawableWrap);
    }

    public final void onResult(ImageDataSource<DrawableHolder> imageDataSource) {
        DrawableHolder drawableHolder;
        Drawable drawable = (imageDataSource == null || (drawableHolder = (DrawableHolder) imageDataSource.getResult()) == null) ? null : drawableHolder.get();
        if (drawable == null) {
            onFailure(imageDataSource);
        } else {
            DrawableCompat.setTint(drawable, ThemeUtils.getColorById(this.f88088a, this.f88089b));
            this.f88090c.setImageDrawable(drawable);
        }
    }
}
