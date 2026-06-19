package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.common.RelateCard;
import h6.C7417v;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/q0.class */
@StabilityInferred(parameters = 0)
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<o0> f101364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<RelateTab> f101365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<RelateCard> f101366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final r0 f101367d;

    public q0(@NotNull List<o0> list, @NotNull List<RelateTab> list2, @NotNull List<RelateCard> list3, @Nullable r0 r0Var) {
        this.f101364a = list;
        this.f101365b = list2;
        this.f101366c = list3;
        this.f101367d = r0Var;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.areEqual(this.f101364a, q0Var.f101364a) && Intrinsics.areEqual(this.f101365b, q0Var.f101365b) && Intrinsics.areEqual(this.f101366c, q0Var.f101366c) && Intrinsics.areEqual(this.f101367d, q0Var.f101367d);
    }

    public final int hashCode() {
        int iA = androidx.compose.ui.graphics.e0.a(androidx.compose.ui.graphics.e0.a(this.f101364a.hashCode() * 31, 31, this.f101365b), 31, this.f101366c);
        r0 r0Var = this.f101367d;
        return iA + (r0Var == null ? 0 : r0Var.hashCode());
    }

    @NotNull
    public final String toString() {
        List<o0> list = this.f101364a;
        List<RelateTab> list2 = this.f101365b;
        List<RelateCard> list3 = this.f101366c;
        StringBuilder sbA = C7417v.a("RelateCardsModule(cards=", ", tabs=", ", originalCards=", list, list2);
        sbA.append(list3);
        sbA.append(", config=");
        sbA.append(this.f101367d);
        sbA.append(")");
        return sbA.toString();
    }
}
