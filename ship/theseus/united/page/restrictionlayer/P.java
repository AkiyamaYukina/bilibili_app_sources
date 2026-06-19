package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import h6.C7416u;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/P.class */
@StabilityInferred(parameters = 0)
public final class P implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f102611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f102612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Map<String, String> f102613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f102614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f102615e;

    public /* synthetic */ P(String str, int i7, String str2, Map map, boolean z6, String str3) {
        this(str, str2, (i7 & 8) != 0 ? null : str3, (i7 & 4) != 0 ? null : map, (i7 & 16) != 0 ? false : z6);
    }

    public P(@Nullable String str, @NotNull String str2, @Nullable String str3, @Nullable Map map, boolean z6) {
        this.f102611a = str;
        this.f102612b = str2;
        this.f102613c = map;
        this.f102614d = str3;
        this.f102615e = z6;
    }

    public static P a(P p7, String str, String str2, boolean z6, int i7) {
        String str3 = p7.f102611a;
        if ((i7 & 2) != 0) {
            str = p7.f102612b;
        }
        Map<String, String> map = p7.f102613c;
        if ((i7 & 8) != 0) {
            str2 = p7.f102614d;
        }
        if ((i7 & 16) != 0) {
            z6 = p7.f102615e;
        }
        p7.getClass();
        return new P(str3, str, str2, map, z6);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p7 = (P) obj;
        return Intrinsics.areEqual(this.f102611a, p7.f102611a) && Intrinsics.areEqual(this.f102612b, p7.f102612b) && Intrinsics.areEqual(this.f102613c, p7.f102613c) && Intrinsics.areEqual(this.f102614d, p7.f102614d) && this.f102615e == p7.f102615e;
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f102611a;
        int iA = I.E.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f102612b);
        Map<String, String> map = this.f102613c;
        int iHashCode2 = map == null ? 0 : map.hashCode();
        String str2 = this.f102614d;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return Boolean.hashCode(this.f102615e) + ((((iA + iHashCode2) * 31) + iHashCode) * 31);
    }

    @NotNull
    public final String toString() {
        Map<String, String> map = this.f102613c;
        StringBuilder sb = new StringBuilder("VipCashierAction(link=");
        sb.append(this.f102611a);
        sb.append(", sourceEventId=");
        C7416u.a(sb, this.f102612b, ", orderReportParams=", map, ", vipTypeName=");
        sb.append(this.f102614d);
        sb.append(", preferHalfScreen=");
        return androidx.appcompat.app.i.a(sb, this.f102615e, ")");
    }
}
