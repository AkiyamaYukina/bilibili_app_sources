package com.bilibili.search2.main.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/n.class */
@StabilityInferred(parameters = 0)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("act_seq")
    @NotNull
    private final List<b> f86829a;

    public n(@NotNull List<b> list) {
        this.f86829a = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.areEqual(this.f86829a, ((n) obj).f86829a);
    }

    public final int hashCode() {
        return this.f86829a.hashCode();
    }

    @NotNull
    public final String toString() {
        return com.bapis.bilibili.account.interfaces.v1.k.a("UserAct(actSeq=", ")", this.f86829a);
    }
}
