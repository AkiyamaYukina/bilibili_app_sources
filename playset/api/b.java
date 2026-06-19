package com.bilibili.playset.api;

import androidx.compose.foundation.gestures.C3392f;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/b.class */
@StabilityInferred(parameters = 1)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("thumb_up")
    private final int f84039a = 0;

    public final int a() {
        return this.f84039a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f84039a == ((b) obj).f84039a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f84039a);
    }

    @NotNull
    public final String toString() {
        return C3392f.a(this.f84039a, "CntInfo(thumbNum=", ")");
    }
}
