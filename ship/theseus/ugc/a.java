package com.bilibili.ship.theseus.ugc;

import I.E;
import X1.C3081k;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f96242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<b> f96243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f96244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f96245d;

    public a(long j7, @NotNull String str, @NotNull List list, boolean z6) {
        this.f96242a = j7;
        this.f96243b = list;
        this.f96244c = str;
        this.f96245d = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f96242a == aVar.f96242a && Intrinsics.areEqual(this.f96243b, aVar.f96243b) && Intrinsics.areEqual(this.f96244c, aVar.f96244c) && this.f96245d == aVar.f96245d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f96245d) + E.a(e0.a(Long.hashCode(this.f96242a) * 31, 31, this.f96243b), 31, this.f96244c);
    }

    @NotNull
    public final String toString() {
        List<b> list = this.f96243b;
        StringBuilder sb = new StringBuilder("ElecRank(count=");
        C3081k.c(sb, this.f96242a, ", list=", list);
        sb.append(", text=");
        sb.append(this.f96244c);
        sb.append(", hideCount=");
        return androidx.appcompat.app.i.a(sb, this.f96245d, ")");
    }
}
