package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/e0.class */
@StabilityInferred(parameters = 1)
public final class C6311e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f101182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f101183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f101184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f101185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f101186g;

    public C6311e0(int i7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i8) {
        this.f101180a = i7;
        this.f101181b = str;
        this.f101182c = str2;
        this.f101183d = i8;
        this.f101184e = str3;
        this.f101185f = str4;
        this.f101186g = str5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6311e0)) {
            return false;
        }
        C6311e0 c6311e0 = (C6311e0) obj;
        return this.f101180a == c6311e0.f101180a && Intrinsics.areEqual(this.f101181b, c6311e0.f101181b) && Intrinsics.areEqual(this.f101182c, c6311e0.f101182c) && this.f101183d == c6311e0.f101183d && Intrinsics.areEqual(this.f101184e, c6311e0.f101184e) && Intrinsics.areEqual(this.f101185f, c6311e0.f101185f) && Intrinsics.areEqual(this.f101186g, c6311e0.f101186g);
    }

    public final int hashCode() {
        return this.f101186g.hashCode() + I.E.a(I.E.a(androidx.compose.animation.core.I.a(this.f101183d, I.E.a(I.E.a(Integer.hashCode(this.f101180a) * 31, 31, this.f101181b), 31, this.f101182c), 31), 31, this.f101184e), 31, this.f101185f);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("NewEp(id=");
        sb.append(this.f101180a);
        sb.append(", title=");
        sb.append(this.f101181b);
        sb.append(", desc=");
        sb.append(this.f101182c);
        sb.append(", isNew=");
        sb.append(this.f101183d);
        sb.append(", more=");
        sb.append(this.f101184e);
        sb.append(", cover=");
        sb.append(this.f101185f);
        sb.append(", indexShow=");
        return C8770a.a(sb, this.f101186g, ")");
    }
}
