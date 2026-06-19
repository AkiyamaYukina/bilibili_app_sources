package com.bilibili.ship.theseus.ogv.intro.section.bean;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/InteractionHistoryNode.class */
@StabilityInferred(parameters = 1)
@Bson
public final class InteractionHistoryNode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f93539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f93540b;

    public InteractionHistoryNode() {
        this(0L, 0L, 3);
    }

    public InteractionHistoryNode(long j7, long j8, int i7) {
        j7 = (i7 & 1) != 0 ? 0L : j7;
        j8 = (i7 & 2) != 0 ? 0L : j8;
        this.f93539a = j7;
        this.f93540b = j8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionHistoryNode)) {
            return false;
        }
        InteractionHistoryNode interactionHistoryNode = (InteractionHistoryNode) obj;
        return this.f93539a == interactionHistoryNode.f93539a && this.f93540b == interactionHistoryNode.f93540b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f93540b) + (Long.hashCode(this.f93539a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("InteractionHistoryNode(nodeId=");
        sb.append(this.f93539a);
        sb.append(", cid=");
        return a.a(sb, this.f93540b, ")");
    }
}
