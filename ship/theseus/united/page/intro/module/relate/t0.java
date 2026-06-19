package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/t0.class */
@StabilityInferred(parameters = 0)
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f101385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f101387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f101388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f101389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<E0> f101390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f101391g;

    @NotNull
    public final String h;

    public t0(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<E0> list, @NotNull String str6, @NotNull String str7) {
        this.f101385a = str;
        this.f101386b = str2;
        this.f101387c = str3;
        this.f101388d = str4;
        this.f101389e = str5;
        this.f101390f = list;
        this.f101391g = str6;
        this.h = str7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.areEqual(this.f101385a, t0Var.f101385a) && Intrinsics.areEqual(this.f101386b, t0Var.f101386b) && Intrinsics.areEqual(this.f101387c, t0Var.f101387c) && Intrinsics.areEqual(this.f101388d, t0Var.f101388d) && Intrinsics.areEqual(this.f101389e, t0Var.f101389e) && Intrinsics.areEqual(this.f101390f, t0Var.f101390f) && Intrinsics.areEqual(this.f101391g, t0Var.f101391g) && Intrinsics.areEqual(this.h, t0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + I.E.a(androidx.compose.ui.graphics.e0.a(I.E.a(I.E.a(I.E.a(I.E.a(this.f101385a.hashCode() * 31, 31, this.f101386b), 31, this.f101387c), 31, this.f101388d), 31, this.f101389e), 31, this.f101390f), 31, this.f101391g);
    }

    @NotNull
    public final String toString() {
        List<E0> list = this.f101390f;
        StringBuilder sb = new StringBuilder("RelateDislike(title=");
        sb.append(this.f101385a);
        sb.append(", subtitle=");
        sb.append(this.f101386b);
        sb.append(", closedSubtitle=");
        sb.append(this.f101387c);
        sb.append(", pasteText=");
        sb.append(this.f101388d);
        sb.append(", closedPasteText=");
        M6.f.a(this.f101389e, ", dislikeReason=", ", toast=", sb, list);
        sb.append(this.f101391g);
        sb.append(", closedToast=");
        return C8770a.a(sb, this.h, ")");
    }
}
