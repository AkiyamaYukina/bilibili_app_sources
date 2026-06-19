package com.bilibili.ship.theseus.ugc.intro.upguardian;

import I.E;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/e.class */
@StabilityInferred(parameters = 1)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f97615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f97616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f97617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f97618d;

    public e(@NotNull String str, @NotNull String str2, boolean z6, boolean z7) {
        this.f97615a = z6;
        this.f97616b = z7;
        this.f97617c = str;
        this.f97618d = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f97615a == eVar.f97615a && this.f97616b == eVar.f97616b && Intrinsics.areEqual(this.f97617c, eVar.f97617c) && Intrinsics.areEqual(this.f97618d, eVar.f97618d);
    }

    public final int hashCode() {
        return this.f97618d.hashCode() + E.a(z.a(Boolean.hashCode(this.f97615a) * 31, 31, this.f97616b), 31, this.f97617c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UpGuardianData(triggerByFollow=");
        sb.append(this.f97615a);
        sb.append(", triggerByInteract=");
        sb.append(this.f97616b);
        sb.append(", title=");
        sb.append(this.f97617c);
        sb.append(", subtitle=");
        return C8770a.a(sb, this.f97618d, ")");
    }
}
