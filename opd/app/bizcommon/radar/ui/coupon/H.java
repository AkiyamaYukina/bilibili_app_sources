package com.bilibili.opd.app.bizcommon.radar.ui.coupon;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/H.class */
@StabilityInferred(parameters = 1)
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final H f74244a = new Object();

    /* JADX WARN: Removed duplicated region for block: B:57:0x0206  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.widget.FrameLayout a(@org.jetbrains.annotations.NotNull android.app.Activity r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull final android.view.View r7, @org.jetbrains.annotations.NotNull android.widget.FrameLayout.LayoutParams r8, @org.jetbrains.annotations.NotNull final java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.radar.ui.coupon.H.a(android.app.Activity, java.lang.String, android.view.View, android.widget.FrameLayout$LayoutParams, java.lang.String):android.widget.FrameLayout");
    }

    public static void b(@Nullable FrameLayout frameLayout) {
        try {
            Result.Companion companion = Result.Companion;
            Unit unit = null;
            ViewParent parent = frameLayout != null ? frameLayout.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
                unit = Unit.INSTANCE;
            }
            Result.constructor-impl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
    }
}
