package com.bilibili.playerbizcommonv2.utils;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/l.class */
@StabilityInferred(parameters = 1)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f81938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f81939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f81940c;

    public l(long j7, long j8, long j9) {
        this.f81938a = j7;
        this.f81939b = j8;
        this.f81940c = j9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f81938a == lVar.f81938a && this.f81939b == lVar.f81939b && this.f81940c == lVar.f81940c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f81940c) + C3554n0.a(Long.hashCode(this.f81938a) * 31, 31, this.f81939b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ListenResult(aid=");
        sb.append(this.f81938a);
        sb.append(", cid=");
        sb.append(this.f81939b);
        sb.append(", progress=");
        return android.support.v4.media.session.a.a(sb, this.f81940c, ")");
    }
}
