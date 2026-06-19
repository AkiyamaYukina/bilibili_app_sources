package com.bilibili.playerbizcommonv2.widget.setting;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/a0.class */
@StabilityInferred(parameters = 1)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Jr0.f f83189a;

    public a0(@Nullable Jr0.f fVar) {
        this.f83189a = fVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.areEqual(this.f83189a, ((a0) obj).f83189a);
    }

    public final int hashCode() {
        Jr0.f fVar = this.f83189a;
        return fVar == null ? 0 : fVar.hashCode();
    }

    @NotNull
    public final String toString() {
        return "VideoSettingSwitch(badgeInfo=" + this.f83189a + ")";
    }
}
