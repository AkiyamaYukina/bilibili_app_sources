package com.bilibili.pegasus.channelv2.detail.tab.baike.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.playerbizcommon.features.background.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/model/ChannelBaikeNavigationItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ChannelBaikeNavigationItem {
    public static final int $stable = 8;

    @JSONField(name = "nid")
    private long nid;

    @JSONField(name = "title")
    @Nullable
    private String title;

    public ChannelBaikeNavigationItem() {
        this(null, 0L, 3, null);
    }

    public ChannelBaikeNavigationItem(@Nullable String str, long j7) {
        this.title = str;
        this.nid = j7;
    }

    public /* synthetic */ ChannelBaikeNavigationItem(String str, long j7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? 0L : j7);
    }

    public static /* synthetic */ ChannelBaikeNavigationItem copy$default(ChannelBaikeNavigationItem channelBaikeNavigationItem, String str, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = channelBaikeNavigationItem.title;
        }
        if ((i7 & 2) != 0) {
            j7 = channelBaikeNavigationItem.nid;
        }
        return channelBaikeNavigationItem.copy(str, j7);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    public final long component2() {
        return this.nid;
    }

    @NotNull
    public final ChannelBaikeNavigationItem copy(@Nullable String str, long j7) {
        return new ChannelBaikeNavigationItem(str, j7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelBaikeNavigationItem)) {
            return false;
        }
        ChannelBaikeNavigationItem channelBaikeNavigationItem = (ChannelBaikeNavigationItem) obj;
        return Intrinsics.areEqual(this.title, channelBaikeNavigationItem.title) && this.nid == channelBaikeNavigationItem.nid;
    }

    public final long getNid() {
        return this.nid;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        return Long.hashCode(this.nid) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final void setNid(long j7) {
        this.nid = j7;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sbA = b.a(this.nid, "ChannelBaikeNavigationItem(title=", this.title, ", nid=");
        sbA.append(")");
        return sbA.toString();
    }
}
