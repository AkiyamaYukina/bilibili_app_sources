package com.bilibili.lib.ui;

import com.bilibili.lib.ui.ImageSpan;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.BaseDataSubscriber;
import com.facebook.datasource.DataSource;
import com.facebook.drawable.base.DrawableWithCaches;
import com.facebook.imagepipeline.image.CloseableImage;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/v.class */
public final class v extends BaseDataSubscriber<CloseableReference<CloseableImage>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageSpan f64951b;

    public v(ImageSpan imageSpan, String str) {
        this.f64951b = imageSpan;
        this.f64950a = str;
    }

    public final void onFailureImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
        dataSource.getFailureCause();
        String str = ImageSpan.TAG;
        this.f64951b.c(this.f64950a, dataSource, true);
    }

    public final void onNewResultImpl(DataSource<CloseableReference<CloseableImage>> dataSource) {
        boolean zIsFinished = dataSource.isFinished();
        CloseableReference<CloseableImage> closeableReference = (CloseableReference) dataSource.getResult();
        String str = this.f64950a;
        ImageSpan imageSpan = this.f64951b;
        if (closeableReference == null) {
            if (zIsFinished) {
                String str2 = ImageSpan.TAG;
                imageSpan.c(str, dataSource, true);
                return;
            }
            return;
        }
        String str3 = ImageSpan.TAG;
        if (!imageSpan.getId().equals(str) || dataSource != imageSpan.f64763d || !imageSpan.f64764e) {
            CloseableReference.closeSafely(closeableReference);
            dataSource.close();
            return;
        }
        imageSpan.f64764e = false;
        try {
            DrawableWithCaches drawableWithCachesB = imageSpan.b(closeableReference);
            CloseableReference<CloseableImage> closeableReference2 = imageSpan.f64762c;
            DrawableWithCaches drawableWithCaches = imageSpan.f64765f;
            imageSpan.f64762c = closeableReference;
            if (zIsFinished) {
                try {
                    imageSpan.f64763d = null;
                    ImageSpan.a aVar = imageSpan.mImageLoadCallback;
                    if (aVar != null) {
                        aVar.a(imageSpan.getImageUri(), imageSpan);
                    }
                    imageSpan.setImage(drawableWithCachesB);
                } finally {
                    if (drawableWithCaches != null && drawableWithCaches != drawableWithCachesB && (drawableWithCaches instanceof DrawableWithCaches)) {
                        drawableWithCaches.dropCaches();
                    }
                    if (closeableReference2 != null && closeableReference2 != closeableReference) {
                        CloseableReference.closeSafely(closeableReference2);
                    }
                }
            }
        } catch (Exception e7) {
            CloseableReference.closeSafely(closeableReference);
            imageSpan.c(str, dataSource, zIsFinished);
        }
    }
}
