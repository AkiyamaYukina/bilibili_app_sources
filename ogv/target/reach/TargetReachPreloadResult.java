package com.bilibili.ogv.target.reach;

import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/target/reach/TargetReachPreloadResult.class */
@Bson
public final class TargetReachPreloadResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f73135a;

    public TargetReachPreloadResult(@NotNull String str) {
        this.f73135a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TargetReachPreloadResult) && Intrinsics.areEqual(this.f73135a, ((TargetReachPreloadResult) obj).f73135a);
    }

    public final int hashCode() {
        return this.f73135a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("TargetReachPreloadResult(pushId="), this.f73135a, ")");
    }
}
