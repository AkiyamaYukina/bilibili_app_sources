package com.bilibili.pegasus.channelv3.feed.item;

import G0.b;
import G0.d;
import J1.z;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.channelv3.movie.ChannelMovieSpmid;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/item/ChannelDetailSmallCoverItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ChannelDetailSmallCoverItem extends BasicIndexItem {
    public static final int $stable = 8;
    private final long avId;
    private final long coverLeftIcon1;
    private final long coverLeftIcon2;

    @Nullable
    private final String coverLeftText1;

    @Nullable
    private final String coverLeftText2;

    @Nullable
    private final String coverRightText;
    private final long mid;

    @Nullable
    private ChannelMovieSpmid spmid;

    public ChannelDetailSmallCoverItem() {
        this(null, null, 0L, null, 0L, 0L, 0L, null, 255, null);
    }

    public ChannelDetailSmallCoverItem(@Nullable String str, @Nullable String str2, long j7, @Nullable String str3, long j8, long j9, long j10, @Nullable ChannelMovieSpmid channelMovieSpmid) {
        this.coverRightText = str;
        this.coverLeftText1 = str2;
        this.coverLeftIcon1 = j7;
        this.coverLeftText2 = str3;
        this.coverLeftIcon2 = j8;
        this.avId = j9;
        this.mid = j10;
        this.spmid = channelMovieSpmid;
        ((BasicIndexItem) this).cardType = "channel_detail_small_cover";
    }

    public /* synthetic */ ChannelDetailSmallCoverItem(String str, String str2, long j7, String str3, long j8, long j9, long j10, ChannelMovieSpmid channelMovieSpmid, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? 0L : j7, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? 0L : j8, (i7 & 32) != 0 ? 0L : j9, (i7 & 64) != 0 ? 0L : j10, (i7 & 128) != 0 ? null : channelMovieSpmid);
    }

    public static /* synthetic */ ChannelDetailSmallCoverItem copy$default(ChannelDetailSmallCoverItem channelDetailSmallCoverItem, String str, String str2, long j7, String str3, long j8, long j9, long j10, ChannelMovieSpmid channelMovieSpmid, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = channelDetailSmallCoverItem.coverRightText;
        }
        if ((i7 & 2) != 0) {
            str2 = channelDetailSmallCoverItem.coverLeftText1;
        }
        if ((i7 & 4) != 0) {
            j7 = channelDetailSmallCoverItem.coverLeftIcon1;
        }
        if ((i7 & 8) != 0) {
            str3 = channelDetailSmallCoverItem.coverLeftText2;
        }
        if ((i7 & 16) != 0) {
            j8 = channelDetailSmallCoverItem.coverLeftIcon2;
        }
        if ((i7 & 32) != 0) {
            j9 = channelDetailSmallCoverItem.avId;
        }
        if ((i7 & 64) != 0) {
            j10 = channelDetailSmallCoverItem.mid;
        }
        if ((i7 & 128) != 0) {
            channelMovieSpmid = channelDetailSmallCoverItem.spmid;
        }
        return channelDetailSmallCoverItem.copy(str, str2, j7, str3, j8, j9, j10, channelMovieSpmid);
    }

    @Nullable
    public final String component1() {
        return this.coverRightText;
    }

    @Nullable
    public final String component2() {
        return this.coverLeftText1;
    }

    public final long component3() {
        return this.coverLeftIcon1;
    }

    @Nullable
    public final String component4() {
        return this.coverLeftText2;
    }

    public final long component5() {
        return this.coverLeftIcon2;
    }

    public final long component6() {
        return this.avId;
    }

    public final long component7() {
        return this.mid;
    }

    @Nullable
    public final ChannelMovieSpmid component8() {
        return this.spmid;
    }

    @NotNull
    public final ChannelDetailSmallCoverItem copy(@Nullable String str, @Nullable String str2, long j7, @Nullable String str3, long j8, long j9, long j10, @Nullable ChannelMovieSpmid channelMovieSpmid) {
        return new ChannelDetailSmallCoverItem(str, str2, j7, str3, j8, j9, j10, channelMovieSpmid);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelDetailSmallCoverItem)) {
            return false;
        }
        ChannelDetailSmallCoverItem channelDetailSmallCoverItem = (ChannelDetailSmallCoverItem) obj;
        return Intrinsics.areEqual(this.coverRightText, channelDetailSmallCoverItem.coverRightText) && Intrinsics.areEqual(this.coverLeftText1, channelDetailSmallCoverItem.coverLeftText1) && this.coverLeftIcon1 == channelDetailSmallCoverItem.coverLeftIcon1 && Intrinsics.areEqual(this.coverLeftText2, channelDetailSmallCoverItem.coverLeftText2) && this.coverLeftIcon2 == channelDetailSmallCoverItem.coverLeftIcon2 && this.avId == channelDetailSmallCoverItem.avId && this.mid == channelDetailSmallCoverItem.mid && this.spmid == channelDetailSmallCoverItem.spmid;
    }

    public final long getAvId() {
        return this.avId;
    }

    public final long getCoverLeftIcon1() {
        return this.coverLeftIcon1;
    }

    public final long getCoverLeftIcon2() {
        return this.coverLeftIcon2;
    }

    @Nullable
    public final String getCoverLeftText1() {
        return this.coverLeftText1;
    }

    @Nullable
    public final String getCoverLeftText2() {
        return this.coverLeftText2;
    }

    @Nullable
    public final String getCoverRightText() {
        return this.coverRightText;
    }

    public final long getMid() {
        return this.mid;
    }

    @Nullable
    public final ChannelMovieSpmid getSpmid() {
        return this.spmid;
    }

    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ String getUriQueryParameter(@NonNull String str) {
        return super.getUriQueryParameter(str);
    }

    public int hashCode() {
        String str = this.coverRightText;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.coverLeftText1;
        int iA = C3554n0.a(((iHashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.coverLeftIcon1);
        String str3 = this.coverLeftText2;
        int iA2 = C3554n0.a(C3554n0.a(C3554n0.a((iA + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.coverLeftIcon2), 31, this.avId), 31, this.mid);
        ChannelMovieSpmid channelMovieSpmid = this.spmid;
        return iA2 + (channelMovieSpmid == null ? 0 : channelMovieSpmid.hashCode());
    }

    public /* bridge */ /* synthetic */ void initCache() {
        super.initCache();
    }

    public /* bridge */ /* synthetic */ boolean initCacheEnable() {
        return super.initCacheEnable();
    }

    public /* bridge */ /* synthetic */ void safeInitCache() {
        super.safeInitCache();
    }

    public final void setSpmid(@Nullable ChannelMovieSpmid channelMovieSpmid) {
        this.spmid = channelMovieSpmid;
    }

    @NotNull
    public String toString() {
        String str = this.coverRightText;
        String str2 = this.coverLeftText1;
        long j7 = this.coverLeftIcon1;
        String str3 = this.coverLeftText2;
        long j8 = this.coverLeftIcon2;
        long j9 = this.avId;
        long j10 = this.mid;
        ChannelMovieSpmid channelMovieSpmid = this.spmid;
        StringBuilder sbA = b.a("ChannelDetailSmallCoverItem(coverRightText=", str, ", coverLeftText1=", str2, ", coverLeftIcon1=");
        d.a(j7, ", coverLeftText2=", str3, sbA);
        z.a(j8, ", coverLeftIcon2=", ", avId=", sbA);
        sbA.append(j9);
        z.a(j10, ", mid=", ", spmid=", sbA);
        sbA.append(channelMovieSpmid);
        sbA.append(")");
        return sbA.toString();
    }
}
