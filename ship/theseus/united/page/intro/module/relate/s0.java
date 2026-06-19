package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.view.StatData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/s0.class */
@StabilityInferred(parameters = 1)
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Long f101376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StatData f101377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final C6302a f101378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final C6302a f101379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f101380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Boolean f101381f;

    public s0(@Nullable Long l7, @NotNull StatData statData, @Nullable C6302a c6302a, @Nullable C6302a c6302a2, int i7, @Nullable Boolean bool) {
        this.f101376a = l7;
        this.f101377b = statData;
        this.f101378c = c6302a;
        this.f101379d = c6302a2;
        this.f101380e = i7;
        this.f101381f = bool;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.areEqual(this.f101376a, s0Var.f101376a) && Intrinsics.areEqual(this.f101377b, s0Var.f101377b) && Intrinsics.areEqual(this.f101378c, s0Var.f101378c) && Intrinsics.areEqual(this.f101379d, s0Var.f101379d) && this.f101380e == s0Var.f101380e && Intrinsics.areEqual(this.f101381f, s0Var.f101381f);
    }

    public final int hashCode() {
        Long l7 = this.f101376a;
        int iHashCode = l7 == null ? 0 : l7.hashCode();
        int iHashCode2 = this.f101377b.hashCode();
        C6302a c6302a = this.f101378c;
        int iHashCode3 = c6302a == null ? 0 : c6302a.hashCode();
        C6302a c6302a2 = this.f101379d;
        int iA = androidx.compose.animation.core.I.a(this.f101380e, (((((iHashCode2 + (iHashCode * 31)) * 31) + iHashCode3) * 31) + (c6302a2 == null ? 0 : c6302a2.hashCode())) * 31, 31);
        Boolean bool = this.f101381f;
        return iA + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public final String toString() {
        return "RelateCourseCard(duration=" + this.f101376a + ", stat=" + this.f101377b + ", recommendReason=" + this.f101378c + ", badgeInfo=" + this.f101379d + ", style=" + this.f101380e + ", showRcmdStyle=" + this.f101381f + ")";
    }
}
