package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/p.class */
@StabilityInferred(parameters = 0)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Painter f89336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Painter f89337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Painter f89338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Painter f89339d;

    public p(@NotNull Painter painter, @NotNull Painter painter2, @NotNull Painter painter3, @NotNull Painter painter4) {
        this.f89336a = painter;
        this.f89337b = painter2;
        this.f89338c = painter3;
        this.f89339d = painter4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f89336a, pVar.f89336a) && Intrinsics.areEqual(this.f89337b, pVar.f89337b) && Intrinsics.areEqual(this.f89338c, pVar.f89338c) && Intrinsics.areEqual(this.f89339d, pVar.f89339d);
    }

    public final int hashCode() {
        int iHashCode = this.f89336a.hashCode();
        int iHashCode2 = this.f89337b.hashCode();
        return this.f89339d.hashCode() + ((this.f89338c.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "CheeseAttendanceShareImage(main=" + this.f89336a + ", logo=" + this.f89337b + ", avatar=" + this.f89338c + ", qrCode=" + this.f89339d + ")";
    }
}
