package com.bilibili.ship.theseus.united.page.intro.module.season;

import X1.C3081k;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/Z.class */
@StabilityInferred(parameters = 0)
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f101645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f101647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<C6355q> f101648d;

    public Z(long j7, long j8, @NotNull String str, @NotNull List list) {
        this.f101645a = j7;
        this.f101646b = str;
        this.f101647c = j8;
        this.f101648d = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z6 = (Z) obj;
        return this.f101645a == z6.f101645a && Intrinsics.areEqual(this.f101646b, z6.f101646b) && this.f101647c == z6.f101647c && Intrinsics.areEqual(this.f101648d, z6.f101648d);
    }

    public final int hashCode() {
        return this.f101648d.hashCode() + C3554n0.a(I.E.a(Long.hashCode(this.f101645a) * 31, 31, this.f101646b), 31, this.f101647c);
    }

    @NotNull
    public final String toString() {
        List<C6355q> list = this.f101648d;
        StringBuilder sb = new StringBuilder("UnitedSection(id=");
        sb.append(this.f101645a);
        sb.append(", title=");
        sb.append(this.f101646b);
        sb.append(", type=");
        C3081k.c(sb, this.f101647c, ", episodes=", list);
        sb.append(")");
        return sb.toString();
    }
}
