package com.bilibili.relation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bus.IData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/FollowStateEvent.class */
@StabilityInferred(parameters = 1)
public final class FollowStateEvent implements IData {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f85910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f85911b;

    public FollowStateEvent(long j7, boolean z6) {
        this.f85910a = j7;
        this.f85911b = z6;
    }

    public static /* synthetic */ FollowStateEvent copy$default(FollowStateEvent followStateEvent, long j7, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = followStateEvent.f85910a;
        }
        if ((i7 & 2) != 0) {
            z6 = followStateEvent.f85911b;
        }
        return followStateEvent.copy(j7, z6);
    }

    public final long component1() {
        return this.f85910a;
    }

    public final boolean component2() {
        return this.f85911b;
    }

    @NotNull
    public final FollowStateEvent copy(long j7, boolean z6) {
        return new FollowStateEvent(j7, z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowStateEvent)) {
            return false;
        }
        FollowStateEvent followStateEvent = (FollowStateEvent) obj;
        return this.f85910a == followStateEvent.f85910a && this.f85911b == followStateEvent.f85911b;
    }

    public final long getUid() {
        return this.f85910a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f85911b) + (Long.hashCode(this.f85910a) * 31);
    }

    public final boolean isFollow() {
        return this.f85911b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FollowStateEvent(uid=");
        sb.append(this.f85910a);
        sb.append(", isFollow=");
        return androidx.appcompat.app.i.a(sb, this.f85911b, ")");
    }
}
