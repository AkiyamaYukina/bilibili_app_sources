package com.bilibili.ship.theseus.united.page.tab;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bilibili.lib.image2.bean.BaseImageDataSubscriber;
import com.bilibili.lib.image2.bean.DrawableHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/s.class */
public final class s extends BaseImageDataSubscriber<DrawableHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f103206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pair<Boolean, String> f103207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f103208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TheseusTabPagerService f103209d;

    public s(ImageView imageView, Pair<Boolean, String> pair, boolean z6, TheseusTabPagerService theseusTabPagerService) {
        this.f103206a = imageView;
        this.f103207b = pair;
        this.f103208c = z6;
        this.f103209d = theseusTabPagerService;
    }

    public final void onFailureImpl(ImageDataSource<DrawableHolder> imageDataSource) {
        if (Intrinsics.areEqual(this.f103206a.getTag(2131321868), this.f103207b)) {
            this.f103209d.a(this.f103206a);
        }
    }

    public final void onNewResultImpl(ImageDataSource<DrawableHolder> imageDataSource) {
        DrawableHolder drawableHolder;
        if (Intrinsics.areEqual(this.f103206a.getTag(2131321868), this.f103207b)) {
            Drawable drawable = (imageDataSource == null || (drawableHolder = (DrawableHolder) imageDataSource.getResult()) == null) ? null : drawableHolder.get();
            if (drawable == null) {
                this.f103209d.a(this.f103206a);
                return;
            }
            if (!this.f103208c) {
                this.f103206a.setImageDrawable(null);
                this.f103206a.setBackground(drawable);
            } else {
                this.f103206a.setScaleType(ImageView.ScaleType.CENTER_CROP);
                this.f103206a.setImageDrawable(drawable);
                this.f103206a.setBackground(null);
            }
        }
    }
}
