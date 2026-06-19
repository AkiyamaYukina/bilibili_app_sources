package com.bilibili.playset.widget.favorite;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/PlaySetPageData.class */
@StabilityInferred(parameters = 0)
@Bson
@Keep
public final class PlaySetPageData {
    public static final int $stable = 8;

    @SerializedName("has_more")
    private final boolean hasMore;

    @SerializedName("list")
    @Nullable
    private final List<PlaySet> list;

    @SerializedName("season")
    @Nullable
    private final PlaySeason season;

    @SerializedName("count")
    private final int totalCount;

    public PlaySetPageData(int i7, @Nullable List<PlaySet> list, @Nullable PlaySeason playSeason, boolean z6) {
        this.totalCount = i7;
        this.list = list;
        this.season = playSeason;
        this.hasMore = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlaySetPageData copy$default(PlaySetPageData playSetPageData, int i7, List list, PlaySeason playSeason, boolean z6, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = playSetPageData.totalCount;
        }
        if ((i8 & 2) != 0) {
            list = playSetPageData.list;
        }
        if ((i8 & 4) != 0) {
            playSeason = playSetPageData.season;
        }
        if ((i8 & 8) != 0) {
            z6 = playSetPageData.hasMore;
        }
        return playSetPageData.copy(i7, list, playSeason, z6);
    }

    public final int component1() {
        return this.totalCount;
    }

    @Nullable
    public final List<PlaySet> component2() {
        return this.list;
    }

    @Nullable
    public final PlaySeason component3() {
        return this.season;
    }

    public final boolean component4() {
        return this.hasMore;
    }

    @NotNull
    public final PlaySetPageData copy(int i7, @Nullable List<PlaySet> list, @Nullable PlaySeason playSeason, boolean z6) {
        return new PlaySetPageData(i7, list, playSeason, z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaySetPageData)) {
            return false;
        }
        PlaySetPageData playSetPageData = (PlaySetPageData) obj;
        return this.totalCount == playSetPageData.totalCount && Intrinsics.areEqual(this.list, playSetPageData.list) && Intrinsics.areEqual(this.season, playSetPageData.season) && this.hasMore == playSetPageData.hasMore;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    public final List<PlaySet> getList() {
        return this.list;
    }

    @Nullable
    public final PlaySeason getSeason() {
        return this.season;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.totalCount);
        List<PlaySet> list = this.list;
        int iHashCode2 = 0;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        PlaySeason playSeason = this.season;
        if (playSeason != null) {
            iHashCode2 = playSeason.hashCode();
        }
        return Boolean.hashCode(this.hasMore) + (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode2) * 31);
    }

    @NotNull
    public String toString() {
        return "PlaySetPageData(totalCount=" + this.totalCount + ", list=" + this.list + ", season=" + this.season + ", hasMore=" + this.hasMore + ")";
    }
}
