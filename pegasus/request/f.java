package com.bilibili.pegasus.request;

import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/request/f.class */
@StabilityInferred(parameters = 1)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f78813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f78814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f78815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f78816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f78817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f78818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f78819g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f78820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f78821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final String f78822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final String f78823l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f78824m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final String f78825n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f78826o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final String f78827p;

    public f(long j7, boolean z6, int i7, @Nullable String str, @Nullable String str2, @Nullable String str3, int i8, int i9, int i10, long j8, @Nullable String str4, @Nullable String str5, long j9, @Nullable String str6, int i11, @Nullable String str7) {
        this.f78813a = j7;
        this.f78814b = z6;
        this.f78815c = i7;
        this.f78816d = str;
        this.f78817e = str2;
        this.f78818f = str3;
        this.f78819g = i8;
        this.h = i9;
        this.f78820i = i10;
        this.f78821j = j8;
        this.f78822k = str4;
        this.f78823l = str5;
        this.f78824m = j9;
        this.f78825n = str6;
        this.f78826o = i11;
        this.f78827p = str7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f78813a == fVar.f78813a && this.f78814b == fVar.f78814b && this.f78815c == fVar.f78815c && Intrinsics.areEqual(this.f78816d, fVar.f78816d) && Intrinsics.areEqual(this.f78817e, fVar.f78817e) && Intrinsics.areEqual(this.f78818f, fVar.f78818f) && this.f78819g == fVar.f78819g && this.h == fVar.h && this.f78820i == fVar.f78820i && this.f78821j == fVar.f78821j && Intrinsics.areEqual(this.f78822k, fVar.f78822k) && Intrinsics.areEqual(this.f78823l, fVar.f78823l) && this.f78824m == fVar.f78824m && Intrinsics.areEqual(this.f78825n, fVar.f78825n) && this.f78826o == fVar.f78826o && Intrinsics.areEqual(this.f78827p, fVar.f78827p);
    }

    public final int hashCode() {
        int iA = I.a(this.f78815c, z.a(Long.hashCode(this.f78813a) * 31, 31, this.f78814b), 31);
        String str = this.f78816d;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f78817e;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f78818f;
        int iA2 = C3554n0.a(I.a(this.f78820i, I.a(this.h, I.a(this.f78819g, (((((iA + iHashCode) * 31) + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31), 31, this.f78821j);
        String str4 = this.f78822k;
        int iHashCode3 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.f78823l;
        int iA3 = C3554n0.a((((iA2 + iHashCode3) * 31) + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f78824m);
        String str6 = this.f78825n;
        int iA4 = I.a(this.f78826o, (iA3 + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        String str7 = this.f78827p;
        return iA4 + (str7 == null ? 0 : str7.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("IndexListCacheKey(idx=");
        sb.append(this.f78813a);
        sb.append(", pull=");
        sb.append(this.f78814b);
        sb.append(", loginEvent=");
        sb.append(this.f78815c);
        sb.append(", bannerHash=");
        sb.append(this.f78816d);
        sb.append(", openEvent=");
        sb.append(this.f78817e);
        sb.append(", interestResult=");
        sb.append(this.f78818f);
        sb.append(", flush=");
        sb.append(this.f78819g);
        sb.append(", graduation26Action=");
        sb.append(this.h);
        sb.append(", graduation26Year=");
        sb.append(this.f78820i);
        sb.append(", interestId=");
        sb.append(this.f78821j);
        sb.append(", splashId=");
        sb.append(this.f78822k);
        sb.append(", splashIds=");
        sb.append(this.f78823l);
        sb.append(", splashCreativeId=");
        sb.append(this.f78824m);
        sb.append(", interestIdOrders=");
        sb.append(this.f78825n);
        sb.append(", windowSizeType=");
        sb.append(this.f78826o);
        sb.append(", cnyInfo=");
        return C8770a.a(sb, this.f78827p, ")");
    }
}
