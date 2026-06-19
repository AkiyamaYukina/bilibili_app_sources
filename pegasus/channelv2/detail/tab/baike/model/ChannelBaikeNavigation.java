package com.bilibili.pegasus.channelv2.detail.tab.baike.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.account.interfaces.v1.k;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/model/ChannelBaikeNavigation.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ChannelBaikeNavigation {
    public static final int $stable = 8;

    @JSONField(name = "list")
    @Nullable
    private List<ChannelBaikeNavigationItem> list;

    public ChannelBaikeNavigation() {
        this(null, 1, null);
    }

    public ChannelBaikeNavigation(@Nullable List<ChannelBaikeNavigationItem> list) {
        this.list = list;
    }

    public /* synthetic */ ChannelBaikeNavigation(List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelBaikeNavigation copy$default(ChannelBaikeNavigation channelBaikeNavigation, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = channelBaikeNavigation.list;
        }
        return channelBaikeNavigation.copy(list);
    }

    @Nullable
    public final List<ChannelBaikeNavigationItem> component1() {
        return this.list;
    }

    @NotNull
    public final ChannelBaikeNavigation copy(@Nullable List<ChannelBaikeNavigationItem> list) {
        return new ChannelBaikeNavigation(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChannelBaikeNavigation) && Intrinsics.areEqual(this.list, ((ChannelBaikeNavigation) obj).list);
    }

    @Nullable
    public final List<ChannelBaikeNavigationItem> getList() {
        return this.list;
    }

    public int hashCode() {
        List<ChannelBaikeNavigationItem> list = this.list;
        return list == null ? 0 : list.hashCode();
    }

    public final void setList(@Nullable List<ChannelBaikeNavigationItem> list) {
        this.list = list;
    }

    @NotNull
    public String toString() {
        return k.a("ChannelBaikeNavigation(list=", ")", this.list);
    }
}
