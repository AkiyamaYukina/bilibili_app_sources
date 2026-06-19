package com.bilibili.lib.ui;

import I3.H0;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.text.style.DynamicDrawableSpan;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.DrawableHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;
import com.bilibili.lib.image2.bean.utils.DeferredReleaser;
import com.bilibili.lib.image2.bean.utils.DrawableWrapper;
import com.facebook.drawable.base.DrawableWithCaches;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/ImageSpan2.class */
public class ImageSpan2 extends DynamicDrawableSpan implements DeferredReleaser.Releasable {

    @NotNull
    public static final a Companion = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final Lazy<Drawable> f64772n = LazyKt.lazy(new H0(9));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f64773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Drawable f64774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DrawableWrapper f64775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final DeferredReleaser f64776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f64777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public View f64778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Point f64779g;

    @NotNull
    public final Rect h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f64780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Drawable f64781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public ImageDataSource<DrawableHolder> f64782k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public DrawableHolder f64783l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public ImageResultListener f64784m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/ImageSpan2$a.class */
    public static final class a {
    }

    public ImageSpan2(@Nullable String str, @Nullable Drawable drawable) {
        super(0);
        this.f64773a = str;
        this.f64774b = drawable;
        this.f64776d = DeferredReleaser.INSTANCE;
        this.f64779g = new Point(100, 100);
        this.h = new Rect();
        this.f64775c = drawable == null ? new DrawableWrapper((Drawable) f64772n.getValue()) : new DrawableWrapper(drawable);
    }

    public /* synthetic */ ImageSpan2(String str, Drawable drawable, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? null : drawable);
    }

    public static final void access$onFailureInternal(ImageSpan2 imageSpan2, String str, ImageDataSource imageDataSource, Throwable th, boolean z6) {
        String str2 = imageSpan2.f64773a;
        if (!Intrinsics.areEqual(String.valueOf(str2 != null ? str2.hashCode() : 0), str) || !Intrinsics.areEqual(imageDataSource, imageSpan2.f64782k) || !imageSpan2.f64780i) {
            if (imageDataSource != null) {
                imageDataSource.close();
                return;
            }
            return;
        }
        imageSpan2.f64780i = false;
        if (z6) {
            imageSpan2.f64782k = null;
            Drawable drawable = imageSpan2.f64781j;
            if (drawable != null) {
                imageSpan2.f64775c.setCurrent(drawable);
            }
        }
        ImageResultListener imageResultListener = imageSpan2.f64784m;
        if (imageResultListener != null) {
            imageResultListener.onImageFailed(th);
        }
    }

    public static final void access$onNewResultInternal(ImageSpan2 imageSpan2, String str, ImageDataSource imageDataSource, DrawableHolder drawableHolder, boolean z6) {
        String str2 = imageSpan2.f64773a;
        if (!Intrinsics.areEqual(String.valueOf(str2 != null ? str2.hashCode() : 0), str) || !Intrinsics.areEqual(imageDataSource, imageSpan2.f64782k) || !imageSpan2.f64780i) {
            drawableHolder.close();
            imageDataSource.close();
            return;
        }
        imageSpan2.f64780i = false;
        Drawable drawable = drawableHolder.get();
        DrawableHolder drawableHolder2 = imageSpan2.f64783l;
        DrawableWithCaches drawableWithCaches = imageSpan2.f64781j;
        imageSpan2.f64783l = drawableHolder;
        if (z6) {
            try {
                imageSpan2.f64782k = null;
                imageSpan2.setImage(drawable);
            } finally {
                if (drawableWithCaches != null && !Intrinsics.areEqual(drawableWithCaches, drawable) && (drawableWithCaches instanceof DrawableWithCaches)) {
                    drawableWithCaches.dropCaches();
                }
                if (drawableHolder2 != null && !Intrinsics.areEqual(drawableHolder2, drawableHolder)) {
                    drawableHolder2.close();
                }
            }
        }
    }

    @Nullable
    public final Animatable getAnimatable() {
        Object obj = this.f64781j;
        return obj instanceof Animatable ? (Animatable) obj : null;
    }

    @Nullable
    public final View getAttachedView() {
        return this.f64778f;
    }

    @Override // android.text.style.DynamicDrawableSpan
    @Nullable
    public Drawable getDrawable() {
        return this.f64775c;
    }

    public final int getHeight() {
        return this.f64779g.y;
    }

    @Nullable
    public final ImageResultListener getImageResultListener() {
        return this.f64784m;
    }

    @Nullable
    public final String getImageUri() {
        return this.f64773a;
    }

    public final int getWidth() {
        return this.f64779g.x;
    }

    public final boolean isAttached() {
        return this.f64777e && this.f64778f != null;
    }

    public final void notifyOnImageLoaded() {
        ImageResultListener imageResultListener = this.f64784m;
        if (imageResultListener != null) {
            imageResultListener.onImageLoaded();
        }
    }

    @NotNull
    public ImageDataSource<DrawableHolder> obtainImageDataSource(@NotNull Context context, @NotNull Lifecycle lifecycle, @NotNull String str) {
        return BiliImageLoader.INSTANCE.acquire(context, lifecycle).with(this.f64778f).asDrawable().url(str).smallCacheStrategy().submit();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttach(@org.jetbrains.annotations.NotNull android.view.View r7) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.ui.ImageSpan2.onAttach(android.view.View):void");
    }

    public void onDetach() {
        if (this.f64777e) {
            this.f64775c.setCallback(null);
            this.f64778f = null;
            reset();
            this.f64781j = null;
            this.f64780i = false;
            this.f64776d.scheduleDeferredRelease(this);
            ImageResultListener imageResultListener = this.f64784m;
            if (imageResultListener != null) {
                imageResultListener.onRequestCancelled();
            }
        }
    }

    public void release() {
        this.f64780i = false;
        this.f64777e = false;
        this.f64778f = null;
        ImageDataSource<DrawableHolder> imageDataSource = this.f64782k;
        if (imageDataSource != null) {
            imageDataSource.close();
        }
        this.f64782k = null;
        DrawableWithCaches drawableWithCaches = this.f64781j;
        if (drawableWithCaches != null && (drawableWithCaches instanceof DrawableWithCaches)) {
            drawableWithCaches.dropCaches();
        }
        this.f64781j = null;
        DrawableHolder drawableHolder = this.f64783l;
        if (drawableHolder != null) {
            drawableHolder.close();
        }
        this.f64783l = null;
    }

    public final void reset() {
        DrawableWrapper drawableWrapper = this.f64775c;
        Drawable drawable = this.f64774b;
        if (drawable == null) {
            drawable = (Drawable) f64772n.getValue();
        }
        drawableWrapper.setCurrent(drawable);
    }

    public final void setAttachedView(@Nullable View view) {
        this.f64778f = view;
    }

    public void setImage(@Nullable Drawable drawable) {
        DrawableWithCaches drawableWithCaches = this.f64781j;
        if (drawableWithCaches != drawable) {
            if (drawableWithCaches instanceof DrawableWithCaches) {
                drawableWithCaches.dropCaches();
            }
            DrawableWrapper drawableWrapper = this.f64775c;
            Rect rect = this.h;
            drawableWrapper.setCurrent(new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom));
            this.f64781j = drawable;
        }
        notifyOnImageLoaded();
    }

    public final void setImageResultListener(@Nullable ImageResultListener imageResultListener) {
        this.f64784m = imageResultListener;
    }

    public final void setImageUri(@Nullable String str) {
        this.f64773a = str;
    }

    public final void setPadding(int i7, int i8, int i9, int i10) {
        this.h.set(i7, i8, i9, i10);
        Point point = this.f64779g;
        setSize(point.x, point.y);
    }

    public void setSize(int i7, int i8) {
        this.f64779g.set(i7, i8);
        DrawableWrapper drawableWrapper = this.f64775c;
        Rect rect = this.h;
        drawableWrapper.setBounds(0, 0, i7 + rect.left + rect.right, i8 + rect.top + rect.bottom);
    }
}
