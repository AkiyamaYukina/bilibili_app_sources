package com.bilibili.ogv.pub.payment.pay;

import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/PendantInfo.class */
@Bson
public final class PendantInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f71554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f71555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f71556c;

    public PendantInfo(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f71554a = str;
        this.f71555b = str2;
        this.f71556c = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendantInfo)) {
            return false;
        }
        PendantInfo pendantInfo = (PendantInfo) obj;
        return Intrinsics.areEqual(this.f71554a, pendantInfo.f71554a) && Intrinsics.areEqual(this.f71555b, pendantInfo.f71555b) && Intrinsics.areEqual(this.f71556c, pendantInfo.f71556c);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f71554a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f71555b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f71556c;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PendantInfo(pid=");
        sb.append(this.f71554a);
        sb.append(", name=");
        sb.append(this.f71555b);
        sb.append(", image=");
        return C8770a.a(sb, this.f71556c, ")");
    }
}
