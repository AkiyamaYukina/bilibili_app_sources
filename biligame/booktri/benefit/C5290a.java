package com.bilibili.biligame.booktri.benefit;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.biligame.booktri.benefit.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/a.class */
@StabilityInferred(parameters = 1)
public final class C5290a {
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5290a)) {
            return false;
        }
        ((C5290a) obj).getClass();
        return Intrinsics.areEqual("恭喜您，您已经预约过了", "恭喜您，您已经预约过了");
    }

    public final int hashCode() {
        return 665846579;
    }

    @NotNull
    public final String toString() {
        return "BookAlreadyBookedData(title=恭喜您，您已经预约过了)";
    }
}
