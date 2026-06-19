package com.bilibili.playset.channel;

import J1.z;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import cf.l;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/channel/CollectionChannelItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class CollectionChannelItem {
    public static final int $stable = 8;

    @JSONField(name = "cid")
    private long channelId;

    @JSONField(name = "cname")
    @Nullable
    private String channelName;

    @JSONField(name = "featured_cnt")
    private int featuredCount;

    @Nullable
    private String icon;

    @JSONField(name = "url")
    @Nullable
    private String jumpUrl;

    @JSONField(name = "subscribed_cnt")
    private long subscribedCount;

    public CollectionChannelItem() {
        this(0L, null, 0, null, 0L, null, 63, null);
    }

    public CollectionChannelItem(long j7, @Nullable String str, int i7, @Nullable String str2, long j8, @Nullable String str3) {
        this.channelId = j7;
        this.channelName = str;
        this.featuredCount = i7;
        this.icon = str2;
        this.subscribedCount = j8;
        this.jumpUrl = str3;
    }

    public /* synthetic */ CollectionChannelItem(long j7, String str, int i7, String str2, long j8, String str3, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0L : j7, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? 0 : i7, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? 0L : j8, (i8 & 32) != 0 ? null : str3);
    }

    public static /* synthetic */ CollectionChannelItem copy$default(CollectionChannelItem collectionChannelItem, long j7, String str, int i7, String str2, long j8, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j7 = collectionChannelItem.channelId;
        }
        if ((i8 & 2) != 0) {
            str = collectionChannelItem.channelName;
        }
        if ((i8 & 4) != 0) {
            i7 = collectionChannelItem.featuredCount;
        }
        if ((i8 & 8) != 0) {
            str2 = collectionChannelItem.icon;
        }
        if ((i8 & 16) != 0) {
            j8 = collectionChannelItem.subscribedCount;
        }
        if ((i8 & 32) != 0) {
            str3 = collectionChannelItem.jumpUrl;
        }
        return collectionChannelItem.copy(j7, str, i7, str2, j8, str3);
    }

    public final long component1() {
        return this.channelId;
    }

    @Nullable
    public final String component2() {
        return this.channelName;
    }

    public final int component3() {
        return this.featuredCount;
    }

    @Nullable
    public final String component4() {
        return this.icon;
    }

    public final long component5() {
        return this.subscribedCount;
    }

    @Nullable
    public final String component6() {
        return this.jumpUrl;
    }

    @NotNull
    public final CollectionChannelItem copy(long j7, @Nullable String str, int i7, @Nullable String str2, long j8, @Nullable String str3) {
        return new CollectionChannelItem(j7, str, i7, str2, j8, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionChannelItem)) {
            return false;
        }
        CollectionChannelItem collectionChannelItem = (CollectionChannelItem) obj;
        return this.channelId == collectionChannelItem.channelId && Intrinsics.areEqual(this.channelName, collectionChannelItem.channelName) && this.featuredCount == collectionChannelItem.featuredCount && Intrinsics.areEqual(this.icon, collectionChannelItem.icon) && this.subscribedCount == collectionChannelItem.subscribedCount && Intrinsics.areEqual(this.jumpUrl, collectionChannelItem.jumpUrl);
    }

    public final long getChannelId() {
        return this.channelId;
    }

    @Nullable
    public final String getChannelName() {
        return this.channelName;
    }

    public final int getFeaturedCount() {
        return this.featuredCount;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final long getSubscribedCount() {
        return this.subscribedCount;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.channelId);
        String str = this.channelName;
        int iA = I.a(this.featuredCount, ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.icon;
        int iA2 = C3554n0.a((iA + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.subscribedCount);
        String str3 = this.jumpUrl;
        return iA2 + (str3 == null ? 0 : str3.hashCode());
    }

    public final void setChannelId(long j7) {
        this.channelId = j7;
    }

    public final void setChannelName(@Nullable String str) {
        this.channelName = str;
    }

    public final void setFeaturedCount(int i7) {
        this.featuredCount = i7;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    public final void setSubscribedCount(long j7) {
        this.subscribedCount = j7;
    }

    @NotNull
    public String toString() {
        long j7 = this.channelId;
        String str = this.channelName;
        int i7 = this.featuredCount;
        String str2 = this.icon;
        long j8 = this.subscribedCount;
        String str3 = this.jumpUrl;
        StringBuilder sbA = n.a(j7, "CollectionChannelItem(channelId=", ", channelName=", str);
        l.a(i7, ", featuredCount=", ", icon=", str2, sbA);
        z.a(j8, ", subscribedCount=", ", jumpUrl=", sbA);
        return C8770a.a(sbA, str3, ")");
    }
}
