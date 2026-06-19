package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/Area.class */
@StabilityInferred(parameters = 1)
@Bson
public final class Area {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f92830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f92831b;

    public Area(long j7, @NotNull String str) {
        this.f92830a = j7;
        this.f92831b = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Area)) {
            return false;
        }
        Area area = (Area) obj;
        return this.f92830a == area.f92830a && Intrinsics.areEqual(this.f92831b, area.f92831b);
    }

    public final int hashCode() {
        return this.f92831b.hashCode() + (Long.hashCode(this.f92830a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Area(id=");
        sb.append(this.f92830a);
        sb.append(", name=");
        return C8770a.a(sb, this.f92831b, ")");
    }
}
