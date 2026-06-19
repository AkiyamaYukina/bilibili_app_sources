package com.bilibili.pegasus.holders.bannerv8;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.magicasakura.widgets.TintConstraintLayout;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.pegasus.PegasusDDConfigKt;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/BannerV8Container.class */
@StabilityInferred(parameters = 0)
public final class BannerV8Container extends TintConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f77680d;

    @JvmOverloads
    public BannerV8Container(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public BannerV8Container(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public BannerV8Container(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    @Nullable
    public final Function1<Integer, Unit> getOnWidthChanged() {
        return this.f77680d;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int size = View.MeasureSpec.getSize(i7);
        if (size <= 0) {
            super.onMeasure(i7, i8);
            return;
        }
        WindowSizeClass windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(getContext());
        boolean zIsWidthLarge = PegasusDDConfigKt.isWidthLarge(windowSizeClassWindowSize);
        boolean zIsWidthMedium = PegasusDDConfigKt.isWidthMedium(windowSizeClassWindowSize);
        int px = ListExtentionsKt.toPx(444);
        int px2 = ListExtentionsKt.toPx(365);
        int px3 = ListExtentionsKt.toPx(8);
        int px4 = ListExtentionsKt.toPx(12);
        int px5 = ListExtentionsKt.toPx(8);
        int iCoerceAtLeast = RangesKt.coerceAtLeast(size, 0);
        if (zIsWidthLarge) {
            px2 = px;
        } else if (!zIsWidthMedium) {
            px2 = iCoerceAtLeast;
        }
        int iCoerceAtMost = RangesKt.coerceAtMost(px2, iCoerceAtLeast);
        int i9 = (int) ((iCoerceAtMost / 16.0f) * 9.0f);
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast((int) ((iCoerceAtLeast - iCoerceAtMost) / 2.0f), 0);
        boolean z6 = zIsWidthLarge || zIsWidthMedium;
        int i10 = zIsWidthLarge ? px4 : px3;
        int i11 = 1;
        if (z6) {
            i11 = 3;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(new w(iCoerceAtLeast, iCoerceAtMost, i9, iCoerceAtLeast2, i10, iCoerceAtLeast2 + px5, z6, i11).f77830c, BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        Function1<? super Integer, Unit> function1;
        super.onSizeChanged(i7, i8, i9, i10);
        if (i7 <= 0 || i9 <= 0 || i7 == i9 || (function1 = this.f77680d) == null) {
            return;
        }
        function1.invoke(Integer.valueOf(i7));
    }

    public final void setOnWidthChanged(@Nullable Function1<? super Integer, Unit> function1) {
        this.f77680d = function1;
    }
}
