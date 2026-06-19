package com.bilibili.playset.channel;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.M;
import c6.N;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/channel/RspCollectionChannel.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RspCollectionChannel {
    public static final int $stable = 8;

    @JSONField(name = "has_more")
    @Nullable
    private Boolean hasMore;

    @Nullable
    private List<CollectionChannelItem> list;

    @Nullable
    private String offset;
    private int total;

    @JSONField(name = "view_more_link")
    @Nullable
    private String viewMoreLink;

    public RspCollectionChannel() {
        this(null, null, 0, null, null, 31, null);
    }

    public RspCollectionChannel(@Nullable Boolean bool, @Nullable String str, int i7, @Nullable String str2, @Nullable List<CollectionChannelItem> list) {
        this.hasMore = bool;
        this.offset = str;
        this.total = i7;
        this.viewMoreLink = str2;
        this.list = list;
    }

    public /* synthetic */ RspCollectionChannel(Boolean bool, String str, int i7, String str2, List list, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : bool, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? 0 : i7, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RspCollectionChannel copy$default(RspCollectionChannel rspCollectionChannel, Boolean bool, String str, int i7, String str2, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            bool = rspCollectionChannel.hasMore;
        }
        if ((i8 & 2) != 0) {
            str = rspCollectionChannel.offset;
        }
        if ((i8 & 4) != 0) {
            i7 = rspCollectionChannel.total;
        }
        if ((i8 & 8) != 0) {
            str2 = rspCollectionChannel.viewMoreLink;
        }
        if ((i8 & 16) != 0) {
            list = rspCollectionChannel.list;
        }
        return rspCollectionChannel.copy(bool, str, i7, str2, list);
    }

    @Nullable
    public final Boolean component1() {
        return this.hasMore;
    }

    @Nullable
    public final String component2() {
        return this.offset;
    }

    public final int component3() {
        return this.total;
    }

    @Nullable
    public final String component4() {
        return this.viewMoreLink;
    }

    @Nullable
    public final List<CollectionChannelItem> component5() {
        return this.list;
    }

    @NotNull
    public final RspCollectionChannel copy(@Nullable Boolean bool, @Nullable String str, int i7, @Nullable String str2, @Nullable List<CollectionChannelItem> list) {
        return new RspCollectionChannel(bool, str, i7, str2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RspCollectionChannel)) {
            return false;
        }
        RspCollectionChannel rspCollectionChannel = (RspCollectionChannel) obj;
        return Intrinsics.areEqual(this.hasMore, rspCollectionChannel.hasMore) && Intrinsics.areEqual(this.offset, rspCollectionChannel.offset) && this.total == rspCollectionChannel.total && Intrinsics.areEqual(this.viewMoreLink, rspCollectionChannel.viewMoreLink) && Intrinsics.areEqual(this.list, rspCollectionChannel.list);
    }

    @Nullable
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    public final List<CollectionChannelItem> getList() {
        return this.list;
    }

    @Nullable
    public final String getOffset() {
        return this.offset;
    }

    public final int getTotal() {
        return this.total;
    }

    @Nullable
    public final String getViewMoreLink() {
        return this.viewMoreLink;
    }

    public int hashCode() {
        Boolean bool = this.hasMore;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.offset;
        int iA = I.a(this.total, ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.viewMoreLink;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List<CollectionChannelItem> list = this.list;
        return ((iA + iHashCode2) * 31) + (list == null ? 0 : list.hashCode());
    }

    public final void setHasMore(@Nullable Boolean bool) {
        this.hasMore = bool;
    }

    public final void setList(@Nullable List<CollectionChannelItem> list) {
        this.list = list;
    }

    public final void setOffset(@Nullable String str) {
        this.offset = str;
    }

    public final void setTotal(int i7) {
        this.total = i7;
    }

    public final void setViewMoreLink(@Nullable String str) {
        this.viewMoreLink = str;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.hasMore;
        String str = this.offset;
        int i7 = this.total;
        String str2 = this.viewMoreLink;
        List<CollectionChannelItem> list = this.list;
        StringBuilder sb = new StringBuilder("RspCollectionChannel(hasMore=");
        sb.append(bool);
        sb.append(", offset=");
        sb.append(str);
        sb.append(", total=");
        M.a(i7, ", viewMoreLink=", str2, ", list=", sb);
        return N.a(sb, ")", list);
    }
}
