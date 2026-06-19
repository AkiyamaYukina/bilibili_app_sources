package com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.view.StatInfoData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcpartyinfo/g.class */
@StabilityInferred(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f97435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public StatInfoData f97436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public StatInfoData f97437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public c f97438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f97439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f97440f;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f97435a, gVar.f97435a) && Intrinsics.areEqual(this.f97436b, gVar.f97436b) && Intrinsics.areEqual(this.f97437c, gVar.f97437c) && Intrinsics.areEqual(this.f97438d, gVar.f97438d) && Intrinsics.areEqual(this.f97439e, gVar.f97439e) && Intrinsics.areEqual(this.f97440f, gVar.f97440f);
    }

    public final int hashCode() {
        int iHashCode = this.f97435a.hashCode();
        int iHashCode2 = this.f97436b.hashCode();
        return this.f97440f.hashCode() + E.a((this.f97438d.hashCode() + ((this.f97437c.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31, 31, this.f97439e);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UgcPartyInfoData(title=");
        sb.append(this.f97435a);
        sb.append(", vt=");
        sb.append(this.f97436b);
        sb.append(", danmaku=");
        sb.append(this.f97437c);
        sb.append(", button=");
        sb.append(this.f97438d);
        sb.append(", preTitle=");
        sb.append(this.f97439e);
        sb.append(", countDesc=");
        return C8770a.a(sb, this.f97440f, ")");
    }
}
