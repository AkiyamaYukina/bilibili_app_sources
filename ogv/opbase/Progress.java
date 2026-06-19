package com.bilibili.ogv.opbase;

import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/Progress.class */
@StabilityInferred(parameters = 1)
@Bson
public final class Progress {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f69881a;

    public Progress(int i7) {
        this.f69881a = i7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Progress) && this.f69881a == ((Progress) obj).f69881a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69881a);
    }

    @NotNull
    public final String toString() {
        return C4277b.a(this.f69881a, ")", new StringBuilder("Progress(bar="));
    }
}
