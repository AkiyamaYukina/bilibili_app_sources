package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/V.class */
@StabilityInferred(parameters = 0)
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f89690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f89691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a0 f89692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final W f89693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Y f89694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final T f89695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f89696g;

    @NotNull
    public final List<S> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final RelatedCourses f89697i;

    public V(@NotNull String str, @NotNull String str2, @NotNull a0 a0Var, @NotNull W w7, @NotNull Y y6, @NotNull T t7, boolean z6, @NotNull List<S> list, @Nullable RelatedCourses relatedCourses) {
        this.f89690a = str;
        this.f89691b = str2;
        this.f89692c = a0Var;
        this.f89693d = w7;
        this.f89694e = y6;
        this.f89695f = t7;
        this.f89696g = z6;
        this.h = list;
        this.f89697i = relatedCourses;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v7 = (V) obj;
        return Intrinsics.areEqual(this.f89690a, v7.f89690a) && Intrinsics.areEqual(this.f89691b, v7.f89691b) && Intrinsics.areEqual(this.f89692c, v7.f89692c) && Intrinsics.areEqual(this.f89693d, v7.f89693d) && Intrinsics.areEqual(this.f89694e, v7.f89694e) && Intrinsics.areEqual(this.f89695f, v7.f89695f) && this.f89696g == v7.f89696g && Intrinsics.areEqual(this.h, v7.h) && Intrinsics.areEqual(this.f89697i, v7.f89697i);
    }

    public final int hashCode() {
        int iA = I.E.a(this.f89690a.hashCode() * 31, 31, this.f89691b);
        int iA2 = e0.a(androidx.compose.animation.z.a(I.E.a((this.f89694e.hashCode() + ((this.f89693d.f89698a.hashCode() + ((this.f89692c.hashCode() + iA) * 31)) * 31)) * 31, 31, this.f89695f.f89687a), 31, this.f89696g), 31, this.h);
        RelatedCourses relatedCourses = this.f89697i;
        return iA2 + (relatedCourses == null ? 0 : relatedCourses.hashCode());
    }

    @NotNull
    public final String toString() {
        List<S> list = this.h;
        StringBuilder sb = new StringBuilder("PugvSeasonPrimaryInfo(title=");
        sb.append(this.f89690a);
        sb.append(", subtitle=");
        sb.append(this.f89691b);
        sb.append(", statInfo=");
        sb.append(this.f89692c);
        sb.append(", rankInfo=");
        sb.append(this.f89693d);
        sb.append(", sellPointInfo=");
        sb.append(this.f89694e);
        sb.append(", customInfo=");
        sb.append(this.f89695f);
        sb.append(", showPayment=");
        K7.L.b(sb, this.f89696g, ", badges=", list, ", relatedCourses=");
        sb.append(this.f89697i);
        sb.append(")");
        return sb.toString();
    }
}
