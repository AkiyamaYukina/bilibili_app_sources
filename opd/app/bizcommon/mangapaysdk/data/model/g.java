package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import I.E;
import androidx.appcompat.app.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/g.class */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f74065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f74066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Integer f74067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f74068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f74069e;

    public g() {
        this(null, null, null, null, false, 31);
    }

    public g(String str, String str2, Integer num, String str3, boolean z6, int i7) {
        str = (i7 & 1) != 0 ? "" : str;
        str2 = (i7 & 2) != 0 ? "" : str2;
        num = (i7 & 4) != 0 ? null : num;
        str3 = (i7 & 8) != 0 ? "" : str3;
        z6 = (i7 & 16) != 0 ? false : z6;
        this.f74065a = str;
        this.f74066b = str2;
        this.f74067c = num;
        this.f74068d = str3;
        this.f74069e = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f74065a, gVar.f74065a) && Intrinsics.areEqual(this.f74066b, gVar.f74066b) && Intrinsics.areEqual(this.f74067c, gVar.f74067c) && Intrinsics.areEqual(this.f74068d, gVar.f74068d) && this.f74069e == gVar.f74069e;
    }

    public final int hashCode() {
        int iA = E.a(this.f74065a.hashCode() * 31, 31, this.f74066b);
        Integer num = this.f74067c;
        return Boolean.hashCode(this.f74069e) + E.a((iA + (num == null ? 0 : num.hashCode())) * 31, 31, this.f74068d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreValueWithOrderId(orderId=");
        sb.append(this.f74065a);
        sb.append(", orderCTime=");
        sb.append(this.f74066b);
        sb.append(", status=");
        sb.append(this.f74067c);
        sb.append(", message=");
        sb.append(this.f74068d);
        sb.append(", storeSuccess=");
        return i.a(sb, this.f74069e, ")");
    }
}
