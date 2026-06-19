package com.bilibili.pegasus.components.graduation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Z.class */
@StabilityInferred(parameters = 1)
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final GraduationSeasonYearButtonBackground f76100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f76101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f76102c;

    public Z(@NotNull GraduationSeasonYearButtonBackground graduationSeasonYearButtonBackground, @NotNull String str, boolean z6) {
        this.f76100a = graduationSeasonYearButtonBackground;
        this.f76101b = str;
        this.f76102c = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z6 = (Z) obj;
        return this.f76100a == z6.f76100a && Intrinsics.areEqual(this.f76101b, z6.f76101b) && this.f76102c == z6.f76102c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76102c) + I.E.a(this.f76100a.hashCode() * 31, 31, this.f76101b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GraduationSeasonYearButtonStyle(background=");
        sb.append(this.f76100a);
        sb.append(", text=");
        sb.append(this.f76101b);
        sb.append(", showShare=");
        return androidx.appcompat.app.i.a(sb, this.f76102c, ")");
    }
}
