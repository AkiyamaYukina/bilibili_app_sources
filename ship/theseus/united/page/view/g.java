package com.bilibili.ship.theseus.united.page.view;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C4665g;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/g.class */
@StabilityInferred(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f104079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f104080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f104081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f104082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f104083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f104084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f104085g;

    public g(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull Map<String, String> map) {
        this.f104079a = str;
        this.f104080b = str2;
        this.f104081c = str3;
        this.f104082d = str4;
        this.f104083e = str5;
        this.f104084f = str6;
        this.f104085g = map;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f104079a, gVar.f104079a) && Intrinsics.areEqual(this.f104080b, gVar.f104080b) && Intrinsics.areEqual(this.f104081c, gVar.f104081c) && Intrinsics.areEqual(this.f104082d, gVar.f104082d) && Intrinsics.areEqual(this.f104083e, gVar.f104083e) && Intrinsics.areEqual(this.f104084f, gVar.f104084f) && Intrinsics.areEqual(this.f104085g, gVar.f104085g);
    }

    public final int hashCode() {
        return this.f104085g.hashCode() + E.a(E.a(E.a(E.a(E.a(this.f104079a.hashCode() * 31, 31, this.f104080b), 31, this.f104081c), 31, this.f104082d), 31, this.f104083e), 31, this.f104084f);
    }

    @NotNull
    public final String toString() {
        Map<String, String> map = this.f104085g;
        StringBuilder sb = new StringBuilder("Button(title=");
        sb.append(this.f104079a);
        sb.append(", url=");
        sb.append(this.f104080b);
        sb.append(", icon=");
        sb.append(this.f104081c);
        sb.append(", textColor=");
        sb.append(this.f104082d);
        sb.append(", bgColor=");
        sb.append(this.f104083e);
        sb.append(", borderColor=");
        return C4665g.a(sb, this.f104084f, ", reportParams=", map, ")");
    }
}
