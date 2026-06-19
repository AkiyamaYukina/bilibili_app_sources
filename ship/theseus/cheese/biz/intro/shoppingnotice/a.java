package com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import eu0.C7004w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/shoppingnotice/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C7004w f90113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<e> f90114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f90115c;

    public a(@NotNull C7004w c7004w, @NotNull List<e> list, @NotNull String str) {
        this.f90113a = c7004w;
        this.f90114b = list;
        this.f90115c = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f90113a, aVar.f90113a) && Intrinsics.areEqual(this.f90114b, aVar.f90114b) && Intrinsics.areEqual(this.f90115c, aVar.f90115c);
    }

    public final int hashCode() {
        return this.f90115c.hashCode() + e0.a(this.f90113a.hashCode() * 31, 31, this.f90114b);
    }

    @NotNull
    public final String toString() {
        List<e> list = this.f90114b;
        StringBuilder sb = new StringBuilder("CheeseShoppingNotice(nav=");
        sb.append(this.f90113a);
        sb.append(", contents=");
        sb.append(list);
        sb.append(", link=");
        return C8770a.a(sb, this.f90115c, ")");
    }
}
