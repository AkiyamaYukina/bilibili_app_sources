package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/Celebrity.class */
@StabilityInferred(parameters = 1)
@Bson
public final class Celebrity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f92833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f92834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f92835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f92836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f92837e;

    public Celebrity(long j7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.f92833a = j7;
        this.f92834b = str;
        this.f92835c = str2;
        this.f92836d = str3;
        this.f92837e = str4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Celebrity)) {
            return false;
        }
        Celebrity celebrity = (Celebrity) obj;
        return this.f92833a == celebrity.f92833a && Intrinsics.areEqual(this.f92834b, celebrity.f92834b) && Intrinsics.areEqual(this.f92835c, celebrity.f92835c) && Intrinsics.areEqual(this.f92836d, celebrity.f92836d) && Intrinsics.areEqual(this.f92837e, celebrity.f92837e);
    }

    public final int hashCode() {
        return this.f92837e.hashCode() + E.a(E.a(E.a(Long.hashCode(this.f92833a) * 31, 31, this.f92834b), 31, this.f92835c), 31, this.f92836d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Celebrity(id=");
        sb.append(this.f92833a);
        sb.append(", name=");
        sb.append(this.f92834b);
        sb.append(", role=");
        sb.append(this.f92835c);
        sb.append(", avatar=");
        sb.append(this.f92836d);
        sb.append(", shortDesc=");
        return C8770a.a(sb, this.f92837e, ")");
    }
}
