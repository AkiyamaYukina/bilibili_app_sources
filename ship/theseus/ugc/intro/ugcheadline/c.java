package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import I.E;
import K7.M;
import X1.C3081k;
import X1.F;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<g> f97305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f97306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<B> f97307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<B> f97308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<String> f97309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f97310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<C6265a> f97311g;

    @NotNull
    public final f h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final e f97312i;

    public c(@NotNull List<g> list, @NotNull String str, @NotNull List<B> list2, @NotNull List<B> list3, @NotNull List<String> list4, long j7, @NotNull List<C6265a> list5, @NotNull f fVar, @NotNull e eVar) {
        this.f97305a = list;
        this.f97306b = str;
        this.f97307c = list2;
        this.f97308d = list3;
        this.f97309e = list4;
        this.f97310f = j7;
        this.f97311g = list5;
        this.h = fVar;
        this.f97312i = eVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f97305a, cVar.f97305a) && Intrinsics.areEqual(this.f97306b, cVar.f97306b) && Intrinsics.areEqual(this.f97307c, cVar.f97307c) && Intrinsics.areEqual(this.f97308d, cVar.f97308d) && Intrinsics.areEqual(this.f97309e, cVar.f97309e) && this.f97310f == cVar.f97310f && Intrinsics.areEqual(this.f97311g, cVar.f97311g) && Intrinsics.areEqual(this.h, cVar.h) && Intrinsics.areEqual(this.f97312i, cVar.f97312i);
    }

    public final int hashCode() {
        int iA = e0.a(C3554n0.a(e0.a(e0.a(e0.a(E.a(this.f97305a.hashCode() * 31, 31, this.f97306b), 31, this.f97307c), 31, this.f97308d), 31, this.f97309e), 31, this.f97310f), 31, this.f97311g);
        return this.f97312i.hashCode() + ((this.h.hashCode() + iA) * 31);
    }

    @NotNull
    public final String toString() {
        List<g> list = this.f97305a;
        List<B> list2 = this.f97307c;
        List<B> list3 = this.f97308d;
        List<String> list4 = this.f97309e;
        List<C6265a> list5 = this.f97311g;
        StringBuilder sbA = M.a("IntroductionData(tag=", ", score=", list);
        M6.f.a(this.f97306b, ", bgm=", ", sticker=", sbA, list2);
        F.c(", videoSource=", ", publishDate=", sbA, list3, list4);
        C3081k.c(sbA, this.f97310f, ", desc=", list5);
        sbA.append(", rank=");
        sbA.append(this.h);
        sbA.append(", neutral=");
        sbA.append(this.f97312i);
        sbA.append(")");
        return sbA.toString();
    }
}
