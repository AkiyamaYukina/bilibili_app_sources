package com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcpartyinfo/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f97423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public String f97424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f97425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public ReserveBizType f97426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public b f97427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public a f97428f;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f97423a == cVar.f97423a && Intrinsics.areEqual(this.f97424b, cVar.f97424b) && Intrinsics.areEqual(this.f97425c, cVar.f97425c) && this.f97426d == cVar.f97426d && Intrinsics.areEqual(this.f97427e, cVar.f97427e) && Intrinsics.areEqual(this.f97428f, cVar.f97428f);
    }

    public final int hashCode() {
        int iA = E.a(E.a(Boolean.hashCode(this.f97423a) * 31, 31, this.f97424b), 31, this.f97425c);
        int iHashCode = this.f97426d.hashCode();
        int iHashCode2 = 0;
        b bVar = this.f97427e;
        int iHashCode3 = bVar == null ? 0 : bVar.hashCode();
        a aVar = this.f97428f;
        if (aVar != null) {
            iHashCode2 = Long.hashCode(aVar.f97417a);
        }
        return ((((iHashCode + iA) * 31) + iHashCode3) * 31) + iHashCode2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbB = androidx.core.content.d.b("ReserveButton(status=", ", text=", this.f97423a);
        sbB.append(this.f97424b);
        sbB.append(", selectedText=");
        sbB.append(this.f97425c);
        sbB.append(", type=");
        sbB.append(this.f97426d);
        sbB.append(", reserve=");
        sbB.append(this.f97427e);
        sbB.append(", bizFavParam=");
        sbB.append(this.f97428f);
        sbB.append(")");
        return sbB.toString();
    }
}
