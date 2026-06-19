package com.bilibili.playerbizcommonv2.widget.setting;

import androidx.compose.animation.C3357h;
import androidx.compose.runtime.Stable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/L.class */
@Stable
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f83100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f83101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f83102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f83103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Function0<Unit> f83104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f83105g;

    public L() {
        throw null;
    }

    public L(int i7, int i8, boolean z6, boolean z7, Function0 function0) {
        this.f83099a = i7;
        this.f83100b = i8;
        this.f83101c = z6;
        this.f83102d = z7;
        this.f83103e = function0;
        this.f83104f = null;
        this.f83105g = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l7 = (L) obj;
        return this.f83099a == l7.f83099a && this.f83100b == l7.f83100b && this.f83101c == l7.f83101c && this.f83102d == l7.f83102d && Intrinsics.areEqual(this.f83103e, l7.f83103e) && Intrinsics.areEqual(this.f83104f, l7.f83104f) && Intrinsics.areEqual(this.f83105g, l7.f83105g);
    }

    public final int hashCode() {
        int iA = C3357h.a(androidx.compose.animation.z.a(androidx.compose.animation.z.a(androidx.compose.animation.core.I.a(this.f83100b, Integer.hashCode(this.f83099a) * 31, 31), 31, this.f83101c), 31, this.f83102d), 31, this.f83103e);
        int iHashCode = 0;
        Function0<Unit> function0 = this.f83104f;
        int iHashCode2 = function0 == null ? 0 : function0.hashCode();
        String str = this.f83105g;
        if (str != null) {
            iHashCode = str.hashCode();
        }
        return ((iA + iHashCode2) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerSettingTop(title=");
        sb.append(this.f83099a);
        sb.append(", icon=");
        sb.append(this.f83100b);
        sb.append(", show=");
        sb.append(this.f83101c);
        sb.append(", enable=");
        sb.append(this.f83102d);
        sb.append(", onClick=");
        sb.append(this.f83103e);
        sb.append(", onExpose=");
        sb.append(this.f83104f);
        sb.append(", contentDescription=");
        return C8770a.a(sb, this.f83105g, ")");
    }
}
