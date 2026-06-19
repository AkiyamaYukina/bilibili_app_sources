package com.bilibili.ship.theseus.cheese.biz.intro.faq;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/faq/d.class */
@StabilityInferred(parameters = 1)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f89430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f89431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f89432c;

    public d(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.f89430a = str;
        this.f89431b = str2;
        this.f89432c = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f89430a, dVar.f89430a) && Intrinsics.areEqual(this.f89431b, dVar.f89431b) && Intrinsics.areEqual(this.f89432c, dVar.f89432c);
    }

    public final int hashCode() {
        return this.f89432c.hashCode() + E.a(this.f89430a.hashCode() * 31, 31, this.f89431b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CheeseFaqContent(question=");
        sb.append(this.f89430a);
        sb.append(", answer=");
        sb.append(this.f89431b);
        sb.append(", link=");
        return C8770a.a(sb, this.f89432c, ")");
    }
}
