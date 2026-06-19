package com.bilibili.search2.component;

import android.content.Context;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.teenagersmode.TeenagersMode;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/component/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static Pair<Integer, a> f86399a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/component/e$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f86400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final SearchWindowSize f86401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f86402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f86403d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f86404e;

        public a(int i7, @NotNull SearchWindowSize searchWindowSize, int i8, int i9, int i10) {
            this.f86400a = i7;
            this.f86401b = searchWindowSize;
            this.f86402c = i8;
            this.f86403d = i9;
            this.f86404e = i10;
        }

        public final boolean a() {
            return this.f86401b != SearchWindowSize.COMPACT;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f86400a == aVar.f86400a && this.f86401b == aVar.f86401b && this.f86402c == aVar.f86402c && this.f86403d == aVar.f86403d && this.f86404e == aVar.f86404e;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f86400a);
            return Integer.hashCode(this.f86404e) + I.a(this.f86403d, I.a(this.f86402c, (this.f86401b.hashCode() + (iHashCode * 31)) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ScreenLayoutInfo(screenWidthPx=");
            sb.append(this.f86400a);
            sb.append(", windowSize=");
            sb.append(this.f86401b);
            sb.append(", hotSearchWidthPx=");
            sb.append(this.f86402c);
            sb.append(", contentWidthPx=");
            sb.append(this.f86403d);
            sb.append(", contentMarginDp=");
            return C4277b.a(this.f86404e, ")", sb);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/component/e$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f86405a;

        static {
            int[] iArr = new int[SearchWindowSize.values().length];
            try {
                iArr[SearchWindowSize.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[SearchWindowSize.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[SearchWindowSize.COMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f86405a = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static int a(@NotNull Context context) throws NoWhenBranchMatchedException {
        a aVarB = b(context);
        boolean zA = aVarB.a();
        int i7 = aVarB.f86403d;
        if (!zA) {
            return i7;
        }
        int px = i7;
        if (i7 > ListExtentionsKt.toPx(600)) {
            px = ListExtentionsKt.toPx(584);
        }
        return px;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public static a b(@NotNull Context context) throws NoWhenBranchMatchedException {
        if (!com.bilibili.search2.component.a.b()) {
            int iPxToDp = DimenUtilsKt.pxToDp(context.getResources().getDisplayMetrics().widthPixels);
            return new a(iPxToDp, SearchWindowSize.COMPACT, 0, ListExtentionsKt.toPx(iPxToDp), 12);
        }
        WindowSizeClass windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(context);
        SearchWindowSize searchWindowSize = KScreenAdjustUtilsKt.widthBreakPointLarge(windowSizeClassWindowSize) ? SearchWindowSize.EXPANDED : KScreenAdjustUtilsKt.widthBreakPointMedium(windowSizeClassWindowSize) ? SearchWindowSize.MEDIUM : SearchWindowSize.COMPACT;
        SearchWindowSize searchWindowSize2 = SearchWindowSize.COMPACT;
        if (searchWindowSize == searchWindowSize2) {
            int iPxToDp2 = DimenUtilsKt.pxToDp(context.getResources().getDisplayMetrics().widthPixels);
            return new a(iPxToDp2, searchWindowSize2, 0, ListExtentionsKt.toPx(iPxToDp2), 12);
        }
        int i7 = context.getResources().getDisplayMetrics().widthPixels;
        Pair<Integer, a> pair = f86399a;
        if (pair != null) {
            int iIntValue = ((Number) pair.component1()).intValue();
            a aVar = (a) pair.component2();
            if (iIntValue == i7) {
                return aVar;
            }
        }
        int px = 0;
        if (!TeenagersMode.getInstance().isEnable()) {
            int i8 = b.f86405a[searchWindowSize.ordinal()];
            if (i8 == 1) {
                px = ListExtentionsKt.toPx(300);
            } else if (i8 == 2) {
                px = ListExtentionsKt.toPx(250);
            } else if (i8 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        int i9 = i7 - px;
        int i10 = 12;
        if (searchWindowSize != searchWindowSize2 && i9 <= ListExtentionsKt.toPx(600)) {
            i10 = 20;
        }
        a aVar2 = new a(i7, searchWindowSize, px, i9, i10);
        BLog.i(e.class.getSimpleName(), "cache layoutInfo, [screenWidthPx = " + i7 + " ; layoutInfo = " + aVar2 + "]");
        f86399a = TuplesKt.to(Integer.valueOf(i7), aVar2);
        return aVar2;
    }

    public static int c(Context context) {
        int i7 = 12;
        if (context != null && g(context)) {
            i7 = 20;
        }
        return i7;
    }

    public static int d(Context context) {
        int i7;
        int px = 0;
        if (g(context) && (i7 = b(context).f86403d) > ListExtentionsKt.toPx(600)) {
            px = (i7 - ListExtentionsKt.toPx(584)) / 2;
        }
        return px;
    }

    public static int e(int i7, @NotNull Context context) {
        return !g(context) ? i7 : a(context);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static boolean f(@NotNull Context context) throws NoWhenBranchMatchedException {
        if (!g(context)) {
            return false;
        }
        a aVarB = b(context);
        boolean z6 = false;
        if (aVarB.a()) {
            z6 = false;
            if (aVarB.f86403d >= ListExtentionsKt.toPx(550)) {
                z6 = true;
            }
        }
        return z6;
    }

    public static boolean g(@NotNull Context context) {
        return b(context).a();
    }

    public static boolean h(@NotNull Context context) {
        boolean z6 = false;
        if (!g(context)) {
            return false;
        }
        if (b(context).f86403d > ListExtentionsKt.toPx(600)) {
            z6 = true;
        }
        return z6;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static boolean i(Context context) throws NoWhenBranchMatchedException {
        boolean z6;
        if (context != null && g(context)) {
            a aVarB = b(context);
            z6 = false;
            if (aVarB.a()) {
                z6 = false;
                if (aVarB.f86403d <= ListExtentionsKt.toPx(600)) {
                    z6 = true;
                }
            }
        } else {
            z6 = false;
        }
        return z6;
    }

    public static boolean j(Context context) {
        return !g(context) ? false : b(context).a();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List k(android.content.Context r4, java.util.List r5, boolean r6, boolean r7, int r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.component.e.k(android.content.Context, java.util.List, boolean, boolean, int):java.util.List");
    }
}
