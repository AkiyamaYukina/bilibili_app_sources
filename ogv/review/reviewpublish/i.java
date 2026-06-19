package com.bilibili.ogv.review.reviewpublish;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.ColorUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/i.class */
@StabilityInferred(parameters = 0)
public final class i extends androidx.databinding.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f72532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f72533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f72534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f72535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f72536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f72537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Drawable f72538g;

    @Nullable
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public CharSequence f72539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public String f72540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f72541k = 4412268;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public Drawable f72542l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public Drawable f72543m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public Drawable f72544n;

    public i(@NotNull String str, @NotNull String str2, float f7) {
        this.f72532a = str;
        this.f72533b = f7;
        this.f72534c = str2;
        GradientDrawable gradientDrawableA = e8.h.a(0);
        gradientDrawableA.setColors(new int[]{ColorUtils.setAlphaComponent(this.f72541k, 0), ColorUtils.setAlphaComponent(this.f72541k, 230)});
        gradientDrawableA.setGradientType(0);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        gradientDrawableA.setOrientation(orientation);
        this.f72542l = gradientDrawableA;
        GradientDrawable gradientDrawableA2 = e8.h.a(0);
        gradientDrawableA2.setColors(new int[]{ColorUtils.setAlphaComponent(this.f72541k, 231), ColorUtils.setAlphaComponent(this.f72541k, 255)});
        gradientDrawableA2.setGradientType(0);
        gradientDrawableA2.setOrientation(orientation);
        this.f72543m = gradientDrawableA2;
        this.f72544n = new ColorDrawable(this.f72541k);
    }

    public final void m(@Nullable String str) {
        if (Intrinsics.areEqual(str, this.h)) {
            return;
        }
        this.h = str;
        notifyPropertyChanged(393);
    }
}
