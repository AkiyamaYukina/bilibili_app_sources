package com.bilibili.ship.theseus.cheese.biz.intro.recommend;

import I.E;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.a0;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6302a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/u.class */
@StabilityInferred(parameters = 0)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f90002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f90003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f90004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f90005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f90006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f90007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f90008g;

    @Nullable
    public final a0 h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final C6302a f90009i;

    public u(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j7, @NotNull String str6, @Nullable a0 a0Var, @Nullable C6302a c6302a) {
        this.f90002a = str;
        this.f90003b = str2;
        this.f90004c = str3;
        this.f90005d = str4;
        this.f90006e = str5;
        this.f90007f = j7;
        this.f90008g = str6;
        this.h = a0Var;
        this.f90009i = c6302a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.areEqual(this.f90002a, uVar.f90002a) && Intrinsics.areEqual(this.f90003b, uVar.f90003b) && Intrinsics.areEqual(this.f90004c, uVar.f90004c) && Intrinsics.areEqual(this.f90005d, uVar.f90005d) && Intrinsics.areEqual(this.f90006e, uVar.f90006e) && this.f90007f == uVar.f90007f && Intrinsics.areEqual(this.f90008g, uVar.f90008g) && Intrinsics.areEqual(this.h, uVar.h) && Intrinsics.areEqual(this.f90009i, uVar.f90009i);
    }

    public final int hashCode() {
        int iA = E.a(C3554n0.a(E.a(E.a(E.a(E.a(this.f90002a.hashCode() * 31, 31, this.f90003b), 31, this.f90004c), 31, this.f90005d), 31, this.f90006e), 31, this.f90007f), 31, this.f90008g);
        int iHashCode = 0;
        a0 a0Var = this.h;
        int iHashCode2 = a0Var == null ? 0 : a0Var.hashCode();
        C6302a c6302a = this.f90009i;
        if (c6302a != null) {
            iHashCode = c6302a.hashCode();
        }
        return ((iA + iHashCode2) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "PugvSeasonRecommendContent(coverUrl=" + this.f90002a + ", title=" + this.f90003b + ", subtitle=" + this.f90004c + ", link=" + this.f90005d + ", desc=" + this.f90006e + ", seasonId=" + this.f90007f + ", authorName=" + this.f90008g + ", view=" + this.h + ", reason=" + this.f90009i + ")";
    }
}
