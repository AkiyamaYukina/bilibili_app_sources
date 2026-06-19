package com.bilibili.ship.theseus.ogv.activity;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityReceiveResultVo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class OgvActivityReceiveResultVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f91381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f91382b;

    public OgvActivityReceiveResultVo(@NotNull String str, @NotNull String str2) {
        this.f91381a = str;
        this.f91382b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvActivityReceiveResultVo)) {
            return false;
        }
        OgvActivityReceiveResultVo ogvActivityReceiveResultVo = (OgvActivityReceiveResultVo) obj;
        return Intrinsics.areEqual(this.f91381a, ogvActivityReceiveResultVo.f91381a) && Intrinsics.areEqual(this.f91382b, ogvActivityReceiveResultVo.f91382b);
    }

    public final int hashCode() {
        return this.f91382b.hashCode() + (this.f91381a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("OgvActivityReceiveResultVo(link=");
        sb.append(this.f91381a);
        sb.append(", text=");
        return C8770a.a(sb, this.f91382b, ")");
    }
}
