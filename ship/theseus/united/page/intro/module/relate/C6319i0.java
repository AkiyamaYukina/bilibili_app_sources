package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.Staff;
import com.bilibili.ship.theseus.united.page.view.StatData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/i0.class */
@StabilityInferred(parameters = 0)
public final class C6319i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Long f101259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Staff f101260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StatData f101261c;

    public C6319i0(@Nullable Long l7, @NotNull Staff staff, @NotNull StatData statData) {
        this.f101259a = l7;
        this.f101260b = staff;
        this.f101261c = statData;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6319i0)) {
            return false;
        }
        C6319i0 c6319i0 = (C6319i0) obj;
        return Intrinsics.areEqual(this.f101259a, c6319i0.f101259a) && Intrinsics.areEqual(this.f101260b, c6319i0.f101260b) && Intrinsics.areEqual(this.f101261c, c6319i0.f101261c);
    }

    public final int hashCode() {
        Long l7 = this.f101259a;
        return this.f101261c.hashCode() + ((this.f101260b.hashCode() + ((l7 == null ? 0 : l7.hashCode()) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "RelateAICard(duration=" + this.f101259a + ", staff=" + this.f101260b + ", stat=" + this.f101261c + ")";
    }
}
