package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/Style.class */
@StabilityInferred(parameters = 1)
@Bson
public final class Style {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f92903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f92904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f92905c;

    public Style(long j7, @NotNull String str, @NotNull String str2) {
        this.f92903a = j7;
        this.f92904b = str;
        this.f92905c = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Style)) {
            return false;
        }
        Style style = (Style) obj;
        return this.f92903a == style.f92903a && Intrinsics.areEqual(this.f92904b, style.f92904b) && Intrinsics.areEqual(this.f92905c, style.f92905c);
    }

    public final int hashCode() {
        return this.f92905c.hashCode() + E.a(Long.hashCode(this.f92903a) * 31, 31, this.f92904b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Style(id=");
        sb.append(this.f92903a);
        sb.append(", url=");
        sb.append(this.f92904b);
        sb.append(", name=");
        return C8770a.a(sb, this.f92905c, ")");
    }
}
