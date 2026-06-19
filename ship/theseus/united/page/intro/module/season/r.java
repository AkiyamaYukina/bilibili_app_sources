package com.bilibili.ship.theseus.united.page.intro.module.season;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.view.StatInfoData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/r.class */
@StabilityInferred(parameters = 1)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f101696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StatInfoData f101698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StatInfoData f101699d;

    public r(@NotNull String str, @NotNull String str2, @NotNull StatInfoData statInfoData, @NotNull StatInfoData statInfoData2) {
        this.f101696a = str;
        this.f101697b = str2;
        this.f101698c = statInfoData;
        this.f101699d = statInfoData2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.areEqual(this.f101696a, rVar.f101696a) && Intrinsics.areEqual(this.f101697b, rVar.f101697b) && Intrinsics.areEqual(this.f101698c, rVar.f101698c) && Intrinsics.areEqual(this.f101699d, rVar.f101699d);
    }

    public final int hashCode() {
        int iA = I.E.a(this.f101696a.hashCode() * 31, 31, this.f101697b);
        return this.f101699d.hashCode() + ((this.f101698c.hashCode() + iA) * 31);
    }

    @NotNull
    public final String toString() {
        return "UnitedSeasonHead(title=" + this.f101696a + ", intro=" + this.f101697b + ", vt=" + this.f101698c + ", danmaku=" + this.f101699d + ")";
    }
}
