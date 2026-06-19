package com.bilibili.ship.theseus.united.page.view;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/p.class */
@StabilityInferred(parameters = 1)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f104106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f104107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f104108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f104109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f104110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f104111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f104112g;

    @Nullable
    public final k h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final k f104113i;

    public p(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @Nullable k kVar, @Nullable k kVar2) {
        this.f104106a = str;
        this.f104107b = str2;
        this.f104108c = str3;
        this.f104109d = str4;
        this.f104110e = str5;
        this.f104111f = str6;
        this.f104112g = str7;
        this.h = kVar;
        this.f104113i = kVar2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f104106a, pVar.f104106a) && Intrinsics.areEqual(this.f104107b, pVar.f104107b) && Intrinsics.areEqual(this.f104108c, pVar.f104108c) && Intrinsics.areEqual(this.f104109d, pVar.f104109d) && Intrinsics.areEqual(this.f104110e, pVar.f104110e) && Intrinsics.areEqual(this.f104111f, pVar.f104111f) && Intrinsics.areEqual(this.f104112g, pVar.f104112g) && Intrinsics.areEqual(this.h, pVar.h) && Intrinsics.areEqual(this.f104113i, pVar.f104113i);
    }

    public final int hashCode() {
        int iA = E.a(E.a(E.a(E.a(E.a(E.a(this.f104106a.hashCode() * 31, 31, this.f104107b), 31, this.f104108c), 31, this.f104109d), 31, this.f104110e), 31, this.f104111f), 31, this.f104112g);
        int iHashCode = 0;
        k kVar = this.h;
        int iHashCode2 = kVar == null ? 0 : kVar.hashCode();
        k kVar2 = this.f104113i;
        if (kVar2 != null) {
            iHashCode = kVar2.hashCode();
        }
        return ((iA + iHashCode2) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "PlayerIcon(url1=" + this.f104106a + ", hash1=" + this.f104107b + ", url2=" + this.f104108c + ", hash2=" + this.f104109d + ", dragLeftPng=" + this.f104110e + ", middlePng=" + this.f104111f + ", dragRightPng=" + this.f104112g + ", dragData=" + this.h + ", noDragData=" + this.f104113i + ")";
    }
}
