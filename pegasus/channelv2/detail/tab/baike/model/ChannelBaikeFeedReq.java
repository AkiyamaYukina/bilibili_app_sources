package com.bilibili.pegasus.channelv2.detail.tab.baike.model;

import androidx.annotation.Keep;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import androidx.room.B;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.v;
import com.bilibili.search2.api.SearchBangumiItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/model/ChannelBaikeFeedReq.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ChannelBaikeFeedReq {
    public static final int $stable = 8;
    private long bid;

    @Nullable
    private String downOffset;
    private long nid;
    private long ps;

    @Nullable
    private String upOffset;

    @Nullable
    private String version;
    private long vertical;

    public ChannelBaikeFeedReq() {
        this(0L, 0L, 0L, null, null, null, 0L, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null);
    }

    public ChannelBaikeFeedReq(long j7, long j8, long j9, @Nullable String str, @Nullable String str2, @Nullable String str3, long j10) {
        this.bid = j7;
        this.nid = j8;
        this.vertical = j9;
        this.upOffset = str;
        this.downOffset = str2;
        this.version = str3;
        this.ps = j10;
    }

    public /* synthetic */ ChannelBaikeFeedReq(long j7, long j8, long j9, String str, String str2, String str3, long j10, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j7, (i7 & 2) != 0 ? 0L : j8, (i7 & 4) != 0 ? 0L : j9, (i7 & 8) != 0 ? null : str, (i7 & 16) != 0 ? null : str2, (i7 & 32) != 0 ? null : str3, (i7 & 64) != 0 ? 0L : j10);
    }

    public static /* synthetic */ ChannelBaikeFeedReq copy$default(ChannelBaikeFeedReq channelBaikeFeedReq, long j7, long j8, long j9, String str, String str2, String str3, long j10, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = channelBaikeFeedReq.bid;
        }
        if ((i7 & 2) != 0) {
            j8 = channelBaikeFeedReq.nid;
        }
        if ((i7 & 4) != 0) {
            j9 = channelBaikeFeedReq.vertical;
        }
        if ((i7 & 8) != 0) {
            str = channelBaikeFeedReq.upOffset;
        }
        if ((i7 & 16) != 0) {
            str2 = channelBaikeFeedReq.downOffset;
        }
        if ((i7 & 32) != 0) {
            str3 = channelBaikeFeedReq.version;
        }
        if ((i7 & 64) != 0) {
            j10 = channelBaikeFeedReq.ps;
        }
        return channelBaikeFeedReq.copy(j7, j8, j9, str, str2, str3, j10);
    }

    public final long component1() {
        return this.bid;
    }

    public final long component2() {
        return this.nid;
    }

    public final long component3() {
        return this.vertical;
    }

    @Nullable
    public final String component4() {
        return this.upOffset;
    }

    @Nullable
    public final String component5() {
        return this.downOffset;
    }

    @Nullable
    public final String component6() {
        return this.version;
    }

    public final long component7() {
        return this.ps;
    }

    @NotNull
    public final ChannelBaikeFeedReq copy(long j7, long j8, long j9, @Nullable String str, @Nullable String str2, @Nullable String str3, long j10) {
        return new ChannelBaikeFeedReq(j7, j8, j9, str, str2, str3, j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelBaikeFeedReq)) {
            return false;
        }
        ChannelBaikeFeedReq channelBaikeFeedReq = (ChannelBaikeFeedReq) obj;
        return this.bid == channelBaikeFeedReq.bid && this.nid == channelBaikeFeedReq.nid && this.vertical == channelBaikeFeedReq.vertical && Intrinsics.areEqual(this.upOffset, channelBaikeFeedReq.upOffset) && Intrinsics.areEqual(this.downOffset, channelBaikeFeedReq.downOffset) && Intrinsics.areEqual(this.version, channelBaikeFeedReq.version) && this.ps == channelBaikeFeedReq.ps;
    }

    public final long getBid() {
        return this.bid;
    }

    @Nullable
    public final String getDownOffset() {
        return this.downOffset;
    }

    public final long getNid() {
        return this.nid;
    }

    @Nullable
    public final String getOffset() {
        long j7 = this.vertical;
        return j7 == 1 ? this.upOffset : j7 == 0 ? this.downOffset : null;
    }

    public final long getPs() {
        return this.ps;
    }

    @Nullable
    public final String getUpOffset() {
        return this.upOffset;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public final long getVertical() {
        return this.vertical;
    }

    public int hashCode() {
        int iA = C3554n0.a(C3554n0.a(Long.hashCode(this.bid) * 31, 31, this.nid), 31, this.vertical);
        String str = this.upOffset;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.downOffset;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.version;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return Long.hashCode(this.ps) + ((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode) * 31);
    }

    public final void setBid(long j7) {
        this.bid = j7;
    }

    public final void setDownOffset(@Nullable String str) {
        this.downOffset = str;
    }

    public final void setNid(long j7) {
        this.nid = j7;
    }

    public final void setPs(long j7) {
        this.ps = j7;
    }

    public final void setUpOffset(@Nullable String str) {
        this.upOffset = str;
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }

    public final void setVertical(long j7) {
        this.vertical = j7;
    }

    @NotNull
    public String toString() {
        long j7 = this.bid;
        long j8 = this.nid;
        long j9 = this.vertical;
        String str = this.upOffset;
        String str2 = this.downOffset;
        String str3 = this.version;
        long j10 = this.ps;
        StringBuilder sbA = z.a(j7, "ChannelBaikeFeedReq(bid=", ", nid=");
        sbA.append(j8);
        J1.z.a(j9, ", vertical=", ", upOffset=", sbA);
        B.a(str, ", downOffset=", str2, ", version=", sbA);
        v.a(j10, str3, ", ps=", sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
