package com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice;

import I.E;
import androidx.appcompat.app.i;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/shoppingnotice/e.class */
@StabilityInferred(parameters = 1)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f90124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f90125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f90126c;

    public e(@NotNull String str, @NotNull String str2, boolean z6) {
        this.f90124a = str;
        this.f90125b = str2;
        this.f90126c = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f90124a, eVar.f90124a) && Intrinsics.areEqual(this.f90125b, eVar.f90125b) && this.f90126c == eVar.f90126c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90126c) + E.a(this.f90124a.hashCode() * 31, 31, this.f90125b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CheeseShoppingNoticeContent(number=");
        sb.append(this.f90124a);
        sb.append(", content=");
        sb.append(this.f90125b);
        sb.append(", isBold=");
        return i.a(sb, this.f90126c, ")");
    }
}
