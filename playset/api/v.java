package com.bilibili.playset.api;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/v.class */
@StabilityInferred(parameters = 1)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("first_cid")
    private final long f84109a = 0;

    public final long a() {
        return this.f84109a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && this.f84109a == ((v) obj).f84109a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f84109a);
    }

    @NotNull
    public final String toString() {
        return androidx.compose.ui.input.pointer.k.a(this.f84109a, "Ugc(firstCid=", ")");
    }
}
