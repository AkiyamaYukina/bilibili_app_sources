package com.bilibili.playset.utils;

import J3.C2324a0;
import J3.C2327b0;
import J3.W;
import J3.X;
import J3.Y;
import J3.Z;
import android.content.Context;
import com.bilibili.app.comm.list.common.utils.ListCardType;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/utils/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f85651a = LazyKt.lazy(new W(9));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy f85652b = LazyKt.lazy(new X(8));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy f85653c = LazyKt.lazy(new Y(9));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Lazy f85654d = LazyKt.lazy(new Z(8));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Lazy f85655e = LazyKt.lazy(new C2324a0(7));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Lazy f85656f = LazyKt.lazy(new C2327b0(7));

    @NotNull
    public static final ListCardType a(@NotNull Context context) {
        if (!d()) {
            return ListCardType.SINGLE_SMALL_CARD;
        }
        ListCardType.Companion.getClass();
        return ListCardType.a.d(context);
    }

    public static int b(Context context) {
        boolean zD = d();
        Lazy lazy = f85655e;
        int iIntValue = (zD && e(context)) ? ((Number) f85656f.getValue()).intValue() : ((Number) lazy.getValue()).intValue();
        return iIntValue;
    }

    public static int c(Context context, int i7, boolean z6) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        boolean zD = d();
        Lazy lazy = f85653c;
        return !zD ? ((Number) lazy.getValue()).intValue() : (z6 || e(context)) ? ((Number) f85654d.getValue()).intValue() : ((Number) lazy.getValue()).intValue();
    }

    public static final boolean d() {
        return ((Boolean) f85651a.getValue()).booleanValue();
    }

    public static final boolean e(@NotNull Context context) {
        if (d()) {
            return !KScreenAdjustUtilsKt.isNormal(ScreenAdjustUtilsKt.windowSize(context));
        }
        return false;
    }

    public static final int f(int i7) {
        ListCardType listCardTypeH;
        if (d()) {
            ListCardType.Companion.getClass();
            listCardTypeH = ListCardType.a.h(i7);
        } else {
            listCardTypeH = ListCardType.SINGLE_SMALL_CARD;
        }
        return listCardTypeH.getCode();
    }
}
