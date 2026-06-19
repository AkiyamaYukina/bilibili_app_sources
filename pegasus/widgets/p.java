package com.bilibili.pegasus.widgets;

import androidx.compose.animation.z;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/p.class */
@Immutable
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f79258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f79259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f79260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final q f79261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final q f79262e;

    public p() {
        this((String) null, false, (q) null, (q) null, 31);
    }

    public /* synthetic */ p(String str, boolean z6, q qVar, q qVar2, int i7) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? false : z6, false, (i7 & 8) != 0 ? null : qVar, (i7 & 16) != 0 ? null : qVar2);
    }

    public p(@NotNull String str, boolean z6, boolean z7, @Nullable q qVar, @Nullable q qVar2) {
        this.f79258a = str;
        this.f79259b = z6;
        this.f79260c = z7;
        this.f79261d = qVar;
        this.f79262e = qVar2;
    }

    public static p a(p pVar, boolean z6, boolean z7, int i7) {
        String str = pVar.f79258a;
        if ((i7 & 2) != 0) {
            z6 = pVar.f79259b;
        }
        q qVar = pVar.f79261d;
        q qVar2 = pVar.f79262e;
        pVar.getClass();
        return new p(str, z6, z7, qVar, qVar2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f79258a, pVar.f79258a) && this.f79259b == pVar.f79259b && this.f79260c == pVar.f79260c && Intrinsics.areEqual(this.f79261d, pVar.f79261d) && Intrinsics.areEqual(this.f79262e, pVar.f79262e);
    }

    public final int hashCode() {
        int iA = z.a(z.a(this.f79258a.hashCode() * 31, 31, this.f79259b), 31, this.f79260c);
        int iHashCode = 0;
        q qVar = this.f79261d;
        int iHashCode2 = qVar == null ? 0 : qVar.hashCode();
        q qVar2 = this.f79262e;
        if (qVar2 != null) {
            iHashCode = qVar2.hashCode();
        }
        return ((iA + iHashCode2) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "RecommendSettingData(title=" + this.f79258a + ", isFollowMode=" + this.f79259b + ", doChangeAfterLogin=" + this.f79260c + ", normalOption=" + this.f79261d + ", followOption=" + this.f79262e + ")";
    }
}
