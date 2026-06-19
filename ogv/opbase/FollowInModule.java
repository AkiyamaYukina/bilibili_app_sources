package com.bilibili.ogv.opbase;

import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/FollowInModule.class */
@StabilityInferred(parameters = 1)
@Bson
public final class FollowInModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f69831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69832b;

    public FollowInModule(int i7, int i8) {
        this.f69831a = i7;
        this.f69832b = i8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowInModule)) {
            return false;
        }
        FollowInModule followInModule = (FollowInModule) obj;
        return this.f69831a == followInModule.f69831a && this.f69832b == followInModule.f69832b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69832b) + (Integer.hashCode(this.f69831a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowInModule(update=");
        sb.append(this.f69831a);
        sb.append(", count=");
        return C4277b.a(this.f69832b, ")", sb);
    }
}
