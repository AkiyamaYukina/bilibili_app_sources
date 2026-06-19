package com.bilibili.ship.theseus.ogv.intro.limitedtimefree;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/limitedtimefree/LimitedTimeFreeImageInfo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class LimitedTimeFreeImageInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f93223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f93224b;

    public LimitedTimeFreeImageInfo(@NotNull String str, @NotNull String str2) {
        this.f93223a = str;
        this.f93224b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitedTimeFreeImageInfo)) {
            return false;
        }
        LimitedTimeFreeImageInfo limitedTimeFreeImageInfo = (LimitedTimeFreeImageInfo) obj;
        return Intrinsics.areEqual(this.f93223a, limitedTimeFreeImageInfo.f93223a) && Intrinsics.areEqual(this.f93224b, limitedTimeFreeImageInfo.f93224b);
    }

    public final int hashCode() {
        return this.f93224b.hashCode() + (this.f93223a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitedTimeFreeImageInfo(code=");
        sb.append(this.f93223a);
        sb.append(", url=");
        return C8770a.a(sb, this.f93224b, ")");
    }
}
