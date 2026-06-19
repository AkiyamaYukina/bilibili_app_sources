package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/Actor.class */
@StabilityInferred(parameters = 1)
@Bson
public final class Actor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f92827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f92828b;

    public Actor(@NotNull String str, @NotNull String str2) {
        this.f92827a = str;
        this.f92828b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Actor)) {
            return false;
        }
        Actor actor = (Actor) obj;
        return Intrinsics.areEqual(this.f92827a, actor.f92827a) && Intrinsics.areEqual(this.f92828b, actor.f92828b);
    }

    public final int hashCode() {
        return this.f92828b.hashCode() + (this.f92827a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Actor(title=");
        sb.append(this.f92827a);
        sb.append(", info=");
        return C8770a.a(sb, this.f92828b, ")");
    }
}
