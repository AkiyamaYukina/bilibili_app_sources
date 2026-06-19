package com.bilibili.ship.theseus.united.page.view;

import I.E;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/m.class */
@StabilityInferred(parameters = 1)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f104099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f104100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f104101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f104102d;

    public m(long j7, long j8, @NotNull String str, @NotNull String str2) {
        this.f104099a = j7;
        this.f104100b = j8;
        this.f104101c = str;
        this.f104102d = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f104099a == mVar.f104099a && this.f104100b == mVar.f104100b && Intrinsics.areEqual(this.f104101c, mVar.f104101c) && Intrinsics.areEqual(this.f104102d, mVar.f104102d);
    }

    public final int hashCode() {
        return this.f104102d.hashCode() + E.a(C3554n0.a(Long.hashCode(this.f104099a) * 31, 31, this.f104100b), 31, this.f104101c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveExt(mid=");
        sb.append(this.f104099a);
        sb.append(", roomId=");
        sb.append(this.f104100b);
        sb.append(", uri=");
        sb.append(this.f104101c);
        sb.append(", endPageUri=");
        return C8770a.a(sb, this.f104102d, ")");
    }
}
