package com.bilibili.search2.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.image2.bean.BitmapTransformation;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/r.class */
@StabilityInferred(parameters = 0)
public final class r implements BitmapTransformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f88847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88848b = 40;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f88849c = LazyKt.lazy(new S3.x(2));

    public r(String str) {
        this.f88847a = str;
    }

    @Nullable
    public final String getCacheKey() {
        String strTakeIfNotEmpty = ListExtentionsKt.takeIfNotEmpty(this.f88847a);
        return strTakeIfNotEmpty != null ? "search_result_cover_blur_url_".concat(strTakeIfNotEmpty) : null;
    }

    public final void transform(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        try {
            int iA = C6077a.a(((Number) this.f88849c.getValue()).intValue(), bitmap);
            NativeBlurFilter.iterativeBoxBlur(bitmap, 2, this.f88848b);
            new Canvas(bitmap).drawColor(iA);
        } catch (Exception e7) {
        }
    }
}
