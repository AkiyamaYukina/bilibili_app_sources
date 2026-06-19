package com.bilibili.pegasus.channelv2.detail.tab;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.account.interfaces.v1.k;
import com.bilibili.pegasus.api.modelv2.channel.ChannelSortItem;
import com.bilibili.pegasus.api.modelv2.channel.base.BaseChannelDetailItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/ChannelSortHolderItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ChannelSortHolderItem extends BaseChannelDetailItem {
    public static final int $stable = 8;

    @NotNull
    private final List<ChannelSortItem> sortItems;

    public ChannelSortHolderItem(@NotNull List<? extends ChannelSortItem> list) {
        this.sortItems = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelSortHolderItem copy$default(ChannelSortHolderItem channelSortHolderItem, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = channelSortHolderItem.sortItems;
        }
        return channelSortHolderItem.copy(list);
    }

    @NotNull
    public final List<ChannelSortItem> component1() {
        return this.sortItems;
    }

    @NotNull
    public final ChannelSortHolderItem copy(@NotNull List<? extends ChannelSortItem> list) {
        return new ChannelSortHolderItem(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChannelSortHolderItem) && Intrinsics.areEqual(this.sortItems, ((ChannelSortHolderItem) obj).sortItems);
    }

    @NotNull
    public final List<ChannelSortItem> getSortItems() {
        return this.sortItems;
    }

    public int hashCode() {
        return this.sortItems.hashCode();
    }

    @NotNull
    public String toString() {
        return k.a("ChannelSortHolderItem(sortItems=", ")", this.sortItems);
    }
}
