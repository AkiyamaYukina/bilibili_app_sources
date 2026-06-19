package com.bilibili.ship.theseus.united.page.online;

import I.E;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/online/b.class */
@StabilityInferred(parameters = 1)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f102113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f102114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f102115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f102116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f102117e;

    public b() {
        this(null, null, 31);
    }

    public b(long j7, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z6) {
        this.f102113a = z6;
        this.f102114b = str;
        this.f102115c = str2;
        this.f102116d = j7;
        this.f102117e = str3;
    }

    public /* synthetic */ b(String str, String str2, int i7) {
        this(0L, (i7 & 2) != 0 ? "" : str, (i7 & 4) != 0 ? "" : str2, "", false);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f102113a == bVar.f102113a && Intrinsics.areEqual(this.f102114b, bVar.f102114b) && Intrinsics.areEqual(this.f102115c, bVar.f102115c) && this.f102116d == bVar.f102116d && Intrinsics.areEqual(this.f102117e, bVar.f102117e);
    }

    public final int hashCode() {
        return this.f102117e.hashCode() + C3554n0.a(E.a(E.a(Boolean.hashCode(this.f102113a) * 31, 31, this.f102114b), 31, this.f102115c), 31, this.f102116d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoOnlineState(bottomShow=");
        sb.append(this.f102113a);
        sb.append(", onlineText=");
        sb.append(this.f102114b);
        sb.append(", logo=");
        sb.append(this.f102115c);
        sb.append(", totalNumber=");
        sb.append(this.f102116d);
        sb.append(", totalNumberText=");
        return C8770a.a(sb, this.f102117e, ")");
    }
}
