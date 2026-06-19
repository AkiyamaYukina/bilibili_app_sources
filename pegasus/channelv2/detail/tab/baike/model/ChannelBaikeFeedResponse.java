package com.bilibili.pegasus.channelv2.detail.tab.baike.model;

import a5.C3188c;
import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.bilifeed.card.FeedItem;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/model/ChannelBaikeFeedResponse.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ChannelBaikeFeedResponse {
    public static final int $stable = 8;

    @JSONField(name = "down_more")
    private boolean downMore;

    @JSONField(name = "down_offset")
    @Nullable
    private String downOffset;

    @JSONField(name = "items")
    @Nullable
    private List<? extends FeedItem> items;

    @JSONField(name = "up_more")
    private boolean upMore;

    @JSONField(name = "up_offset")
    @Nullable
    private String upOffset;

    public ChannelBaikeFeedResponse() {
        this(null, null, null, false, false, 31, null);
    }

    public ChannelBaikeFeedResponse(@Nullable List<? extends FeedItem> list, @Nullable String str, @Nullable String str2, boolean z6, boolean z7) {
        this.items = list;
        this.upOffset = str;
        this.downOffset = str2;
        this.upMore = z6;
        this.downMore = z7;
    }

    public /* synthetic */ ChannelBaikeFeedResponse(List list, String str, String str2, boolean z6, boolean z7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : list, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? false : z6, (i7 & 16) != 0 ? false : z7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelBaikeFeedResponse copy$default(ChannelBaikeFeedResponse channelBaikeFeedResponse, List list, String str, String str2, boolean z6, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = channelBaikeFeedResponse.items;
        }
        if ((i7 & 2) != 0) {
            str = channelBaikeFeedResponse.upOffset;
        }
        if ((i7 & 4) != 0) {
            str2 = channelBaikeFeedResponse.downOffset;
        }
        if ((i7 & 8) != 0) {
            z6 = channelBaikeFeedResponse.upMore;
        }
        if ((i7 & 16) != 0) {
            z7 = channelBaikeFeedResponse.downMore;
        }
        return channelBaikeFeedResponse.copy(list, str, str2, z6, z7);
    }

    @Nullable
    public final List<FeedItem> component1() {
        return this.items;
    }

    @Nullable
    public final String component2() {
        return this.upOffset;
    }

    @Nullable
    public final String component3() {
        return this.downOffset;
    }

    public final boolean component4() {
        return this.upMore;
    }

    public final boolean component5() {
        return this.downMore;
    }

    @NotNull
    public final ChannelBaikeFeedResponse copy(@Nullable List<? extends FeedItem> list, @Nullable String str, @Nullable String str2, boolean z6, boolean z7) {
        return new ChannelBaikeFeedResponse(list, str, str2, z6, z7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelBaikeFeedResponse)) {
            return false;
        }
        ChannelBaikeFeedResponse channelBaikeFeedResponse = (ChannelBaikeFeedResponse) obj;
        return Intrinsics.areEqual(this.items, channelBaikeFeedResponse.items) && Intrinsics.areEqual(this.upOffset, channelBaikeFeedResponse.upOffset) && Intrinsics.areEqual(this.downOffset, channelBaikeFeedResponse.downOffset) && this.upMore == channelBaikeFeedResponse.upMore && this.downMore == channelBaikeFeedResponse.downMore;
    }

    public final boolean getDownMore() {
        return this.downMore;
    }

    @Nullable
    public final String getDownOffset() {
        return this.downOffset;
    }

    @Nullable
    public final List<FeedItem> getItems() {
        return this.items;
    }

    public final boolean getUpMore() {
        return this.upMore;
    }

    @Nullable
    public final String getUpOffset() {
        return this.upOffset;
    }

    public int hashCode() {
        List<? extends FeedItem> list = this.items;
        int iHashCode = 0;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str = this.upOffset;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.downOffset;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return Boolean.hashCode(this.downMore) + z.a(((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31, 31, this.upMore);
    }

    public final void setDownMore(boolean z6) {
        this.downMore = z6;
    }

    public final void setDownOffset(@Nullable String str) {
        this.downOffset = str;
    }

    public final void setItems(@Nullable List<? extends FeedItem> list) {
        this.items = list;
    }

    public final void setUpMore(boolean z6) {
        this.upMore = z6;
    }

    public final void setUpOffset(@Nullable String str) {
        this.upOffset = str;
    }

    @NotNull
    public String toString() {
        List<? extends FeedItem> list = this.items;
        String str = this.upOffset;
        String str2 = this.downOffset;
        boolean z6 = this.upMore;
        boolean z7 = this.downMore;
        StringBuilder sb = new StringBuilder("ChannelBaikeFeedResponse(items=");
        sb.append(list);
        sb.append(", upOffset=");
        sb.append(str);
        sb.append(", downOffset=");
        C3188c.a(str2, ", upMore=", ", downMore=", sb, z6);
        return i.a(sb, z7, ")");
    }
}
