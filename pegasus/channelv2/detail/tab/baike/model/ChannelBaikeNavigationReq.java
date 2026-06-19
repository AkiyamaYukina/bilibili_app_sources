package com.bilibili.pegasus.channelv2.detail.tab.baike.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/model/ChannelBaikeNavigationReq.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ChannelBaikeNavigationReq {
    public static final int $stable = 8;
    private long bid;

    public ChannelBaikeNavigationReq() {
        this(0L, 1, null);
    }

    public ChannelBaikeNavigationReq(long j7) {
        this.bid = j7;
    }

    public /* synthetic */ ChannelBaikeNavigationReq(long j7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j7);
    }

    public static /* synthetic */ ChannelBaikeNavigationReq copy$default(ChannelBaikeNavigationReq channelBaikeNavigationReq, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = channelBaikeNavigationReq.bid;
        }
        return channelBaikeNavigationReq.copy(j7);
    }

    public final long component1() {
        return this.bid;
    }

    @NotNull
    public final ChannelBaikeNavigationReq copy(long j7) {
        return new ChannelBaikeNavigationReq(j7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChannelBaikeNavigationReq) && this.bid == ((ChannelBaikeNavigationReq) obj).bid;
    }

    public final long getBid() {
        return this.bid;
    }

    public int hashCode() {
        return Long.hashCode(this.bid);
    }

    public final void setBid(long j7) {
        this.bid = j7;
    }

    @NotNull
    public String toString() {
        return k.a(this.bid, "ChannelBaikeNavigationReq(bid=", ")");
    }
}
