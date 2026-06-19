package com.bilibili.ship.theseus.united.page.intro.module.upreserve;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/upreserve/d.class */
@StabilityInferred(parameters = 1)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f101984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f101986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f101987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f101988e;

    public d() {
        this(0);
    }

    public /* synthetic */ d(int i7) {
        this("", "", "", "", "");
    }

    public d(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        this.f101984a = str;
        this.f101985b = str2;
        this.f101986c = str3;
        this.f101987d = str4;
        this.f101988e = str5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f101984a, dVar.f101984a) && Intrinsics.areEqual(this.f101985b, dVar.f101985b) && Intrinsics.areEqual(this.f101986c, dVar.f101986c) && Intrinsics.areEqual(this.f101987d, dVar.f101987d) && Intrinsics.areEqual(this.f101988e, dVar.f101988e);
    }

    public final int hashCode() {
        return this.f101988e.hashCode() + E.a(E.a(E.a(this.f101984a.hashCode() * 31, 31, this.f101985b), 31, this.f101986c), 31, this.f101987d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UpReserveManageBarData(icon=");
        sb.append(this.f101984a);
        sb.append(", text=");
        sb.append(this.f101985b);
        sb.append(", actionText=");
        sb.append(this.f101986c);
        sb.append(", actionUri=");
        sb.append(this.f101987d);
        sb.append(", actionIcon=");
        return C8770a.a(sb, this.f101988e, ")");
    }
}
