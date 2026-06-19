package com.bilibili.ship.theseus.ogv.activity;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityTextVo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class OgvActivityTextVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f91414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Integer f91415b;

    public OgvActivityTextVo(@NotNull String str, @Nullable Integer num) {
        this.f91414a = str;
        this.f91415b = num;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvActivityTextVo)) {
            return false;
        }
        OgvActivityTextVo ogvActivityTextVo = (OgvActivityTextVo) obj;
        return Intrinsics.areEqual(this.f91414a, ogvActivityTextVo.f91414a) && Intrinsics.areEqual(this.f91415b, ogvActivityTextVo.f91415b);
    }

    public final int hashCode() {
        int iHashCode = this.f91414a.hashCode();
        Integer num = this.f91415b;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public final String toString() {
        return "OgvActivityTextVo(text=" + this.f91414a + ", textColor=" + this.f91415b + ")";
    }
}
