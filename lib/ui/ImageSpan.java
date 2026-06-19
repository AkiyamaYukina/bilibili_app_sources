package com.bilibili.lib.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.text.style.DynamicDrawableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.common.executors.UiThreadImmediateExecutorService;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawable.base.DrawableWithCaches;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.components.DeferredReleaser;
import com.facebook.drawee.drawable.ForwardingDrawable;
import com.facebook.drawee.drawable.OrientedDrawable;
import com.facebook.imagepipeline.animated.base.AnimatedImageFrame;
import com.facebook.imagepipeline.animated.base.AnimatedImageResult;
import com.facebook.imagepipeline.image.CloseableAnimatedImage;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/ImageSpan.class */
public class ImageSpan extends DynamicDrawableSpan implements DeferredReleaser.Releasable {
    public static final String TAG = "ImageSpan";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Drawable f64759n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeferredReleaser f64760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ForwardingDrawable f64761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CloseableReference<CloseableImage> f64762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DataSource<CloseableReference<CloseableImage>> f64763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f64764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f64765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f64766g;
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f64767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f64768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Point f64769k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Drawable f64770l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bitmap f64771m;
    public a mImageLoadCallback;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/ImageSpan$a.class */
    public interface a {
        void a(String str, DynamicDrawableSpan dynamicDrawableSpan);
    }

    static {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(100, 100);
        gradientDrawable.setColor(-3355444);
        gradientDrawable.setStroke(1, -12303292);
        f64759n = gradientDrawable;
    }

    public ImageSpan(String str) {
        this(str, null);
    }

    public ImageSpan(String str, Drawable drawable) {
        super(0);
        this.f64768j = new Rect();
        this.f64769k = new Point(100, 100);
        this.f64770l = null;
        this.h = str;
        this.f64760a = DeferredReleaser.getInstance();
        this.f64770l = drawable;
        if (drawable == null) {
            this.f64761b = new ForwardingDrawable(f64759n);
        } else {
            this.f64761b = new ForwardingDrawable(drawable);
        }
    }

    public final Drawable b(CloseableReference<CloseableImage> closeableReference) {
        CloseableStaticBitmap closeableStaticBitmap = (CloseableImage) closeableReference.get();
        if (closeableStaticBitmap instanceof CloseableStaticBitmap) {
            CloseableStaticBitmap closeableStaticBitmap2 = closeableStaticBitmap;
            OrientedDrawable orientedDrawableCreateBitmapDrawable = createBitmapDrawable(closeableStaticBitmap2.getUnderlyingBitmap());
            OrientedDrawable orientedDrawable = orientedDrawableCreateBitmapDrawable;
            if (closeableStaticBitmap2.getRotationAngle() != 0) {
                orientedDrawable = orientedDrawableCreateBitmapDrawable;
                if (closeableStaticBitmap2.getRotationAngle() != -1) {
                    orientedDrawable = new OrientedDrawable(orientedDrawableCreateBitmapDrawable, closeableStaticBitmap2.getRotationAngle());
                }
            }
            return orientedDrawable;
        }
        if (closeableStaticBitmap instanceof CloseableAnimatedImage) {
            AnimatedImageResult imageResult = ((CloseableAnimatedImage) closeableStaticBitmap).getImageResult();
            int frameForPreview = imageResult.getFrameForPreview();
            CloseableReference decodedFrame = frameForPreview >= 0 ? imageResult.getDecodedFrame(frameForPreview) : imageResult.getPreviewBitmap();
            if (decodedFrame != null && decodedFrame.get() != null) {
                return createBitmapDrawable((Bitmap) decodedFrame.get());
            }
            if (decodedFrame == null) {
                AnimatedImageFrame frame = imageResult.getImage().getFrame(0);
                this.f64771m = Bitmap.createBitmap(frame.getWidth(), frame.getHeight(), Bitmap.Config.ARGB_8888);
                frame.renderFrame(frame.getWidth(), frame.getHeight(), this.f64771m);
                return createBitmapDrawable(this.f64771m);
            }
        }
        throw new UnsupportedOperationException("Unrecognized image class: " + closeableStaticBitmap);
    }

    public ImageRequest buildImageRequest() {
        return ImageRequest.fromUri(getImageUri());
    }

    public final void c(String str, DataSource dataSource, boolean z6) {
        if (!getId().equals(str) || dataSource != this.f64763d || !this.f64764e) {
            dataSource.close();
            return;
        }
        this.f64764e = false;
        if (z6) {
            this.f64763d = null;
            Drawable drawable = this.f64765f;
            if (drawable != null) {
                this.f64761b.setDrawable(drawable);
            }
        }
    }

    public BitmapDrawable createBitmapDrawable(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable;
        View view = this.f64766g;
        if (view != null) {
            Context context = view.getContext();
            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(context.getResources(), bitmap);
            bitmapDrawable = bitmapDrawable2;
            if (bitmapDrawable2.canApplyTheme()) {
                bitmapDrawable2.applyTheme(context.getTheme());
                bitmapDrawable = bitmapDrawable2;
            }
        } else {
            bitmapDrawable = new BitmapDrawable((Resources) null, bitmap);
        }
        return bitmapDrawable;
    }

    @Override // android.text.style.DynamicDrawableSpan
    public Drawable getDrawable() {
        return this.f64761b;
    }

    public String getId() {
        return String.valueOf(getImageUri().hashCode());
    }

    @NonNull
    public String getImageUri() {
        return this.h;
    }

    public boolean isAttached() {
        return this.f64767i && this.f64766g != null;
    }

    public void onAttach(View view) {
        this.f64767i = true;
        if (this.f64766g != view) {
            this.f64761b.setCallback(null);
            this.f64766g = view;
            this.f64761b.setCallback(view);
        }
        this.f64760a.cancelDeferredRelease(this);
        if (this.f64764e) {
            return;
        }
        this.f64764e = true;
        String id = getId();
        this.f64763d = Fresco.getImagePipeline().fetchDecodedImage(buildImageRequest(), (Object) null);
        this.f64763d.subscribe(new v(this, id), UiThreadImmediateExecutorService.getInstance());
    }

    public void onDetach() {
        if (this.f64767i) {
            this.f64761b.setCallback(null);
            this.f64766g = null;
            reset();
            this.f64765f = null;
            this.f64764e = false;
            this.f64760a.scheduleDeferredRelease(this);
        }
    }

    public void release() {
        this.f64764e = false;
        this.f64767i = false;
        this.f64766g = null;
        DataSource<CloseableReference<CloseableImage>> dataSource = this.f64763d;
        if (dataSource != null) {
            dataSource.close();
            this.f64763d = null;
        }
        DrawableWithCaches drawableWithCaches = this.f64765f;
        if (drawableWithCaches != null && (drawableWithCaches instanceof DrawableWithCaches)) {
            drawableWithCaches.dropCaches();
        }
        this.f64765f = null;
        CloseableReference<CloseableImage> closeableReference = this.f64762c;
        if (closeableReference != null) {
            CloseableReference.closeSafely(closeableReference);
            this.f64762c = null;
        }
        Bitmap bitmap = this.f64771m;
        if (bitmap != null) {
            bitmap.recycle();
            this.f64771m = null;
        }
    }

    public void reset() {
        Drawable drawable = this.f64770l;
        if (drawable == null) {
            this.f64761b.setDrawable(f64759n);
        } else {
            this.f64761b.setDrawable(drawable);
        }
    }

    public void setImage(Drawable drawable) {
        DrawableWithCaches drawableWithCaches = this.f64765f;
        if (drawableWithCaches != drawable) {
            if (drawableWithCaches instanceof DrawableWithCaches) {
                drawableWithCaches.dropCaches();
            }
            ForwardingDrawable forwardingDrawable = this.f64761b;
            Rect rect = this.f64768j;
            forwardingDrawable.setDrawable(new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom));
            this.f64765f = drawable;
        }
    }

    public void setPadding(int i7, int i8, int i9, int i10) {
        this.f64768j.set(i7, i8, i9, i10);
        Point point = this.f64769k;
        setSize(point.x, point.y);
    }

    public void setPaddingWithoutChangeSize(int i7, int i8, int i9, int i10) {
        this.f64768j.set(i7, i8, i9, i10);
    }

    public void setSize(int i7, int i8) {
        this.f64769k.set(i7, i8);
        ForwardingDrawable forwardingDrawable = this.f64761b;
        Rect rect = this.f64768j;
        forwardingDrawable.setBounds(0, 0, i7 + rect.left + rect.right, i8 + rect.top + rect.bottom);
    }
}
