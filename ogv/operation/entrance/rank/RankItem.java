package com.bilibili.ogv.operation.entrance.rank;

import O4.c;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import cf.l;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.bangumi.data.page.detail.entity.BangumiEpisodePlayedInfo;
import com.bilibili.ogv.opbase.CountInfo;
import com.bilibili.ogv.opbase.NewestEp;
import com.bilibili.ogvcommon.bangumibadge.BangumiBadgeInfo;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/rank/RankItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RankItem {
    public static final int $stable = 8;

    @Nullable
    private String badge;

    @JSONField(name = "badge_info")
    @Nullable
    private BangumiBadgeInfo badgeInfo;

    @JSONField(name = "badge_type")
    private int badgeType;

    @JSONField(name = "stat")
    @Nullable
    private CountInfo countInfo;

    @Nullable
    private String cover;

    @JSONField(name = "new_ep")
    @Nullable
    private NewestEp newestEp;

    @JSONField(name = "icon_font")
    @Nullable
    private BangumiEpisodePlayedInfo playedInfo;
    private int pts;

    @JSONField(name = EditCustomizeSticker.TAG_RANK)
    private int rankIndex;

    @JSONField(name = "season_id")
    private long seasonId;

    @JSONField(name = "season_type")
    private int seasonType;

    @Nullable
    private String title;

    @Nullable
    private String url;

    public RankItem() {
        this(0L, 0, null, null, 0, null, 0, null, null, null, 0, null, null, 8191, null);
    }

    public RankItem(long j7, int i7, @Nullable String str, @Nullable String str2, int i8, @Nullable BangumiBadgeInfo bangumiBadgeInfo, int i9, @Nullable String str3, @Nullable String str4, @Nullable NewestEp newestEp, int i10, @Nullable CountInfo countInfo, @Nullable BangumiEpisodePlayedInfo bangumiEpisodePlayedInfo) {
        this.seasonId = j7;
        this.seasonType = i7;
        this.title = str;
        this.badge = str2;
        this.badgeType = i8;
        this.badgeInfo = bangumiBadgeInfo;
        this.pts = i9;
        this.url = str3;
        this.cover = str4;
        this.newestEp = newestEp;
        this.rankIndex = i10;
        this.countInfo = countInfo;
        this.playedInfo = bangumiEpisodePlayedInfo;
    }

    public /* synthetic */ RankItem(long j7, int i7, String str, String str2, int i8, BangumiBadgeInfo bangumiBadgeInfo, int i9, String str3, String str4, NewestEp newestEp, int i10, CountInfo countInfo, BangumiEpisodePlayedInfo bangumiEpisodePlayedInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j7, (i11 & 2) != 0 ? 0 : i7, (i11 & 4) != 0 ? "" : str, (i11 & 8) != 0 ? "" : str2, (i11 & 16) != 0 ? 0 : i8, (i11 & 32) != 0 ? null : bangumiBadgeInfo, (i11 & 64) != 0 ? 0 : i9, (i11 & 128) != 0 ? "" : str3, (i11 & 256) != 0 ? "" : str4, (i11 & 512) != 0 ? null : newestEp, (i11 & 1024) != 0 ? 0 : i10, (i11 & 2048) != 0 ? null : countInfo, (i11 & 4096) != 0 ? null : bangumiEpisodePlayedInfo);
    }

    public static /* synthetic */ RankItem copy$default(RankItem rankItem, long j7, int i7, String str, String str2, int i8, BangumiBadgeInfo bangumiBadgeInfo, int i9, String str3, String str4, NewestEp newestEp, int i10, CountInfo countInfo, BangumiEpisodePlayedInfo bangumiEpisodePlayedInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j7 = rankItem.seasonId;
        }
        if ((i11 & 2) != 0) {
            i7 = rankItem.seasonType;
        }
        if ((i11 & 4) != 0) {
            str = rankItem.title;
        }
        if ((i11 & 8) != 0) {
            str2 = rankItem.badge;
        }
        if ((i11 & 16) != 0) {
            i8 = rankItem.badgeType;
        }
        if ((i11 & 32) != 0) {
            bangumiBadgeInfo = rankItem.badgeInfo;
        }
        if ((i11 & 64) != 0) {
            i9 = rankItem.pts;
        }
        if ((i11 & 128) != 0) {
            str3 = rankItem.url;
        }
        if ((i11 & 256) != 0) {
            str4 = rankItem.cover;
        }
        if ((i11 & 512) != 0) {
            newestEp = rankItem.newestEp;
        }
        if ((i11 & 1024) != 0) {
            i10 = rankItem.rankIndex;
        }
        if ((i11 & 2048) != 0) {
            countInfo = rankItem.countInfo;
        }
        if ((i11 & 4096) != 0) {
            bangumiEpisodePlayedInfo = rankItem.playedInfo;
        }
        return rankItem.copy(j7, i7, str, str2, i8, bangumiBadgeInfo, i9, str3, str4, newestEp, i10, countInfo, bangumiEpisodePlayedInfo);
    }

    public final long component1() {
        return this.seasonId;
    }

    @Nullable
    public final NewestEp component10() {
        return this.newestEp;
    }

    public final int component11() {
        return this.rankIndex;
    }

    @Nullable
    public final CountInfo component12() {
        return this.countInfo;
    }

    @Nullable
    public final BangumiEpisodePlayedInfo component13() {
        return this.playedInfo;
    }

    public final int component2() {
        return this.seasonType;
    }

    @Nullable
    public final String component3() {
        return this.title;
    }

    @Nullable
    public final String component4() {
        return this.badge;
    }

    public final int component5() {
        return this.badgeType;
    }

    @Nullable
    public final BangumiBadgeInfo component6() {
        return this.badgeInfo;
    }

    public final int component7() {
        return this.pts;
    }

    @Nullable
    public final String component8() {
        return this.url;
    }

    @Nullable
    public final String component9() {
        return this.cover;
    }

    @NotNull
    public final RankItem copy(long j7, int i7, @Nullable String str, @Nullable String str2, int i8, @Nullable BangumiBadgeInfo bangumiBadgeInfo, int i9, @Nullable String str3, @Nullable String str4, @Nullable NewestEp newestEp, int i10, @Nullable CountInfo countInfo, @Nullable BangumiEpisodePlayedInfo bangumiEpisodePlayedInfo) {
        return new RankItem(j7, i7, str, str2, i8, bangumiBadgeInfo, i9, str3, str4, newestEp, i10, countInfo, bangumiEpisodePlayedInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RankItem)) {
            return false;
        }
        RankItem rankItem = (RankItem) obj;
        return this.seasonId == rankItem.seasonId && this.seasonType == rankItem.seasonType && Intrinsics.areEqual(this.title, rankItem.title) && Intrinsics.areEqual(this.badge, rankItem.badge) && this.badgeType == rankItem.badgeType && Intrinsics.areEqual(this.badgeInfo, rankItem.badgeInfo) && this.pts == rankItem.pts && Intrinsics.areEqual(this.url, rankItem.url) && Intrinsics.areEqual(this.cover, rankItem.cover) && Intrinsics.areEqual(this.newestEp, rankItem.newestEp) && this.rankIndex == rankItem.rankIndex && Intrinsics.areEqual(this.countInfo, rankItem.countInfo) && Intrinsics.areEqual(this.playedInfo, rankItem.playedInfo);
    }

    @Nullable
    public final String getBadge() {
        return this.badge;
    }

    @Nullable
    public final BangumiBadgeInfo getBadgeInfo() {
        return this.badgeInfo;
    }

    public final int getBadgeType() {
        return this.badgeType;
    }

    @Nullable
    public final CountInfo getCountInfo() {
        return this.countInfo;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    @Nullable
    public final NewestEp getNewestEp() {
        return this.newestEp;
    }

    @Nullable
    public final BangumiEpisodePlayedInfo getPlayedInfo() {
        return this.playedInfo;
    }

    public final int getPts() {
        return this.pts;
    }

    public final int getRankIndex() {
        return this.rankIndex;
    }

    public final long getSeasonId() {
        return this.seasonId;
    }

    public final int getSeasonType() {
        return this.seasonType;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iA = I.a(this.seasonType, Long.hashCode(this.seasonId) * 31, 31);
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.badge;
        int iA2 = I.a(this.badgeType, (((iA + iHashCode) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        BangumiBadgeInfo bangumiBadgeInfo = this.badgeInfo;
        int iA3 = I.a(this.pts, (iA2 + (bangumiBadgeInfo == null ? 0 : bangumiBadgeInfo.hashCode())) * 31, 31);
        String str3 = this.url;
        int iHashCode2 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.cover;
        int iHashCode3 = str4 == null ? 0 : str4.hashCode();
        NewestEp newestEp = this.newestEp;
        int iA4 = I.a(this.rankIndex, (((((iA3 + iHashCode2) * 31) + iHashCode3) * 31) + (newestEp == null ? 0 : newestEp.hashCode())) * 31, 31);
        CountInfo countInfo = this.countInfo;
        int iHashCode4 = countInfo == null ? 0 : countInfo.hashCode();
        BangumiEpisodePlayedInfo bangumiEpisodePlayedInfo = this.playedInfo;
        return ((iA4 + iHashCode4) * 31) + (bangumiEpisodePlayedInfo == null ? 0 : bangumiEpisodePlayedInfo.hashCode());
    }

    public final void setBadge(@Nullable String str) {
        this.badge = str;
    }

    public final void setBadgeInfo(@Nullable BangumiBadgeInfo bangumiBadgeInfo) {
        this.badgeInfo = bangumiBadgeInfo;
    }

    public final void setBadgeType(int i7) {
        this.badgeType = i7;
    }

    public final void setCountInfo(@Nullable CountInfo countInfo) {
        this.countInfo = countInfo;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setNewestEp(@Nullable NewestEp newestEp) {
        this.newestEp = newestEp;
    }

    public final void setPlayedInfo(@Nullable BangumiEpisodePlayedInfo bangumiEpisodePlayedInfo) {
        this.playedInfo = bangumiEpisodePlayedInfo;
    }

    public final void setPts(int i7) {
        this.pts = i7;
    }

    public final void setRankIndex(int i7) {
        this.rankIndex = i7;
    }

    public final void setSeasonId(long j7) {
        this.seasonId = j7;
    }

    public final void setSeasonType(int i7) {
        this.seasonType = i7;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        long j7 = this.seasonId;
        int i7 = this.seasonType;
        String str = this.title;
        String str2 = this.badge;
        int i8 = this.badgeType;
        BangumiBadgeInfo bangumiBadgeInfo = this.badgeInfo;
        int i9 = this.pts;
        String str3 = this.url;
        String str4 = this.cover;
        NewestEp newestEp = this.newestEp;
        int i10 = this.rankIndex;
        CountInfo countInfo = this.countInfo;
        BangumiEpisodePlayedInfo bangumiEpisodePlayedInfo = this.playedInfo;
        StringBuilder sbB = c.b(i7, j7, "RankItem(seasonId=", ", seasonType=");
        B.a(", title=", str, ", badge=", str2, sbB);
        sbB.append(", badgeType=");
        sbB.append(i8);
        sbB.append(", badgeInfo=");
        sbB.append(bangumiBadgeInfo);
        l.a(i9, ", pts=", ", url=", str3, sbB);
        sbB.append(", cover=");
        sbB.append(str4);
        sbB.append(", newestEp=");
        sbB.append(newestEp);
        sbB.append(", rankIndex=");
        sbB.append(i10);
        sbB.append(", countInfo=");
        sbB.append(countInfo);
        sbB.append(", playedInfo=");
        sbB.append(bangumiEpisodePlayedInfo);
        sbB.append(")");
        return sbB.toString();
    }
}
