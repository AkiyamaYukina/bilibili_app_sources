package com.bilibili.ship.theseus.ugc.intro.upcenter;

import I.E;
import K7.M;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<e> f97546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f97547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f97548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f97549d;

    public a(@NotNull List<e> list, @NotNull String str, int i7, int i8) {
        this.f97546a = list;
        this.f97547b = str;
        this.f97548c = i7;
        this.f97549d = i8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f97546a, aVar.f97546a) && Intrinsics.areEqual(this.f97547b, aVar.f97547b) && this.f97548c == aVar.f97548c && this.f97549d == aVar.f97549d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f97549d) + I.a(this.f97548c, E.a(this.f97546a.hashCode() * 31, 31, this.f97547b), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbA = M.a("UgcUpCenterData(extTabs=", ", protocolUrl=", this.f97546a);
        sbA.append(this.f97547b);
        sbA.append(", idx=");
        sbA.append(this.f97548c);
        sbA.append(", height=");
        return C4277b.a(this.f97549d, ")", sbA);
    }
}
