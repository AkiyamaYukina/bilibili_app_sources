package com.bilibili.ogv.pub.community;

import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/community/Actor.class */
@Bson
public final class Actor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f71483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f71484b;

    public Actor(@NotNull String str, @NotNull String str2) {
        this.f71483a = str;
        this.f71484b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Actor)) {
            return false;
        }
        Actor actor = (Actor) obj;
        return Intrinsics.areEqual(this.f71483a, actor.f71483a) && Intrinsics.areEqual(this.f71484b, actor.f71484b);
    }

    public final int hashCode() {
        return this.f71484b.hashCode() + (this.f71483a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Actor(title=");
        sb.append(this.f71483a);
        sb.append(", info=");
        return C8770a.a(sb, this.f71484b, ")");
    }
}
