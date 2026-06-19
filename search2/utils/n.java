package com.bilibili.search2.utils;

import android.content.Context;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.search2.component.SearchWindowSize;
import com.bilibili.search2.component.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/n.class */
@StabilityInferred(parameters = 1)
public final class n {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/n$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f88834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f88835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f88836c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f88837d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f88838e;

        public a() {
            this(0, 0, false, 31, false, false);
        }

        public a(int i7, int i8, boolean z6, int i9, boolean z7, boolean z8) {
            i7 = (i9 & 1) != 0 ? ListExtentionsKt.toPx(8) : i7;
            z6 = (i9 & 2) != 0 ? false : z6;
            z7 = (i9 & 4) != 0 ? false : z7;
            i8 = (i9 & 8) != 0 ? 3 : i8;
            z8 = (i9 & 16) != 0 ? false : z8;
            this.f88834a = i7;
            this.f88835b = z6;
            this.f88836c = z7;
            this.f88837d = i8;
            this.f88838e = z8;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f88834a == aVar.f88834a && this.f88835b == aVar.f88835b && this.f88836c == aVar.f88836c && this.f88837d == aVar.f88837d && this.f88838e == aVar.f88838e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f88838e) + I.a(this.f88837d, androidx.compose.animation.z.a(androidx.compose.animation.z.a(Integer.hashCode(this.f88834a) * 31, 31, this.f88835b), 31, this.f88836c), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("CoverWidthConfig(paddingPx=");
            sb.append(this.f88834a);
            sb.append(", forceThreeColumns=");
            sb.append(this.f88835b);
            sb.append(", forceFourColumns=");
            sb.append(this.f88836c);
            sb.append(", defaultParts=");
            sb.append(this.f88837d);
            sb.append(", wideScreenOnly=");
            return androidx.appcompat.app.i.a(sb, this.f88838e, ")");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Nullable
    public static Integer a(@NotNull Context context, @NotNull a aVar) throws NoWhenBranchMatchedException {
        if (!b(context)) {
            return null;
        }
        e.a aVarB = com.bilibili.search2.component.e.b(context);
        int iA = aVarB.f86403d;
        int px = ListExtentionsKt.toPx(550);
        if (aVar.f88838e && iA < px) {
            return null;
        }
        int px2 = ListExtentionsKt.toPx(aVarB.f86404e);
        Pair pair = aVar.f88835b ? TuplesKt.to(3, Boolean.TRUE) : (!aVar.f88836c && iA < px) ? TuplesKt.to(Integer.valueOf(aVar.f88837d), Boolean.FALSE) : TuplesKt.to(4, Boolean.TRUE);
        int iIntValue = ((Number) pair.component1()).intValue();
        if (((Boolean) pair.component2()).booleanValue()) {
            iA = com.bilibili.search2.component.e.a(context);
        }
        return Integer.valueOf(((iA - (px2 * 2)) - ((iIntValue - 1) * aVar.f88834a)) / iIntValue);
    }

    public static boolean b(Context context) {
        boolean z6 = false;
        if (!com.bilibili.search2.component.a.b()) {
            return false;
        }
        if (com.bilibili.search2.component.e.b(context).f86401b != SearchWindowSize.COMPACT) {
            z6 = true;
        }
        return z6;
    }
}
