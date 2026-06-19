package com.bilibili.ship.theseus.ugc.intro.questionaire;

import I.E;
import N1.o;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/questionaire/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f97156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f97157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f97158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f97159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f97160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<String> f97161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f97162g;
    public final boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f97163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f97164j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f97165k;

    public d(long j7, long j8, long j9, @NotNull String str, @NotNull String str2, @NotNull List<String> list) {
        this.f97156a = j7;
        this.f97157b = j8;
        this.f97158c = j9;
        this.f97159d = str;
        this.f97160e = str2;
        this.f97161f = list;
        this.f97162g = j8 == 0;
        this.h = j8 == 1;
        this.f97163i = j8 == 2;
        this.f97164j = j9;
        this.f97165k = j9 / 100.0f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f97156a == dVar.f97156a && this.f97157b == dVar.f97157b && this.f97158c == dVar.f97158c && Intrinsics.areEqual(this.f97159d, dVar.f97159d) && Intrinsics.areEqual(this.f97160e, dVar.f97160e) && Intrinsics.areEqual(this.f97161f, dVar.f97161f);
    }

    public final int hashCode() {
        return this.f97161f.hashCode() + E.a(E.a(C3554n0.a(C3554n0.a(Long.hashCode(this.f97156a) * 31, 31, this.f97157b), 31, this.f97158c), 31, this.f97159d), 31, this.f97160e);
    }

    @NotNull
    public final String toString() {
        List<String> list = this.f97161f;
        StringBuilder sb = new StringBuilder("QuestionnaireData(id=");
        sb.append(this.f97156a);
        sb.append(", showType=");
        sb.append(this.f97157b);
        sb.append(", showTime=");
        sb.append(this.f97158c);
        sb.append(", type=");
        sb.append(this.f97159d);
        sb.append(", title=");
        return o.a(this.f97160e, ", options=", ")", sb, list);
    }
}
