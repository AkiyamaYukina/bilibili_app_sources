package com.bilibili.upper.module.partitionTag.partitionTopic.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitionTopic/bean/PartitionLimitState.class */
@StabilityInferred(parameters = 1)
@Keep
public final class PartitionLimitState {
    public static final int $stable = 0;

    @Nullable
    private final String content;
    private final boolean visible;

    public PartitionLimitState(boolean z6, @Nullable String str) {
        this.visible = z6;
        this.content = str;
    }

    public static /* synthetic */ PartitionLimitState copy$default(PartitionLimitState partitionLimitState, boolean z6, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = partitionLimitState.visible;
        }
        if ((i7 & 2) != 0) {
            str = partitionLimitState.content;
        }
        return partitionLimitState.copy(z6, str);
    }

    public final boolean component1() {
        return this.visible;
    }

    @Nullable
    public final String component2() {
        return this.content;
    }

    @NotNull
    public final PartitionLimitState copy(boolean z6, @Nullable String str) {
        return new PartitionLimitState(z6, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartitionLimitState)) {
            return false;
        }
        PartitionLimitState partitionLimitState = (PartitionLimitState) obj;
        return this.visible == partitionLimitState.visible && Intrinsics.areEqual(this.content, partitionLimitState.content);
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.visible);
        String str = this.content;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return n.b("PartitionLimitState(visible=", ", content=", this.content, ")", this.visible);
    }
}
