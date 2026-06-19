package com.bilibili.ogv.opbase;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/UpInfo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class UpInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f69954a;

    public UpInfo(@Nullable String str) {
        this.f69954a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UpInfo) && Intrinsics.areEqual(this.f69954a, ((UpInfo) obj).f69954a);
    }

    public final int hashCode() {
        String str = this.f69954a;
        return str == null ? 0 : str.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("UpInfo(upName="), this.f69954a, ")");
    }
}
