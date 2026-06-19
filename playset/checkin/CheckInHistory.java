package com.bilibili.playset.checkin;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/checkin/CheckInHistory.class */
@StabilityInferred(parameters = 0)
@Keep
public final class CheckInHistory {
    public static final int $stable = 8;

    @JSONField(name = "complete_count")
    @Nullable
    private Long completeCount;

    @JSONField(name = "list")
    @Nullable
    private ArrayList<CheckInHistoryItem> list;

    @JSONField(name = MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE)
    @Nullable
    private HistoryPage page;

    @JSONField(name = "total_duration")
    @Nullable
    private Long totalDuration;

    public CheckInHistory() {
        this(null, null, null, null, 15, null);
    }

    public CheckInHistory(@Nullable Long l7, @Nullable ArrayList<CheckInHistoryItem> arrayList, @Nullable HistoryPage historyPage, @Nullable Long l8) {
        this.completeCount = l7;
        this.list = arrayList;
        this.page = historyPage;
        this.totalDuration = l8;
    }

    public /* synthetic */ CheckInHistory(Long l7, ArrayList arrayList, HistoryPage historyPage, Long l8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : l7, (i7 & 2) != 0 ? null : arrayList, (i7 & 4) != 0 ? null : historyPage, (i7 & 8) != 0 ? 0L : l8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckInHistory copy$default(CheckInHistory checkInHistory, Long l7, ArrayList arrayList, HistoryPage historyPage, Long l8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            l7 = checkInHistory.completeCount;
        }
        if ((i7 & 2) != 0) {
            arrayList = checkInHistory.list;
        }
        if ((i7 & 4) != 0) {
            historyPage = checkInHistory.page;
        }
        if ((i7 & 8) != 0) {
            l8 = checkInHistory.totalDuration;
        }
        return checkInHistory.copy(l7, arrayList, historyPage, l8);
    }

    @Nullable
    public final Long component1() {
        return this.completeCount;
    }

    @Nullable
    public final ArrayList<CheckInHistoryItem> component2() {
        return this.list;
    }

    @Nullable
    public final HistoryPage component3() {
        return this.page;
    }

    @Nullable
    public final Long component4() {
        return this.totalDuration;
    }

    @NotNull
    public final CheckInHistory copy(@Nullable Long l7, @Nullable ArrayList<CheckInHistoryItem> arrayList, @Nullable HistoryPage historyPage, @Nullable Long l8) {
        return new CheckInHistory(l7, arrayList, historyPage, l8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckInHistory)) {
            return false;
        }
        CheckInHistory checkInHistory = (CheckInHistory) obj;
        return Intrinsics.areEqual(this.completeCount, checkInHistory.completeCount) && Intrinsics.areEqual(this.list, checkInHistory.list) && Intrinsics.areEqual(this.page, checkInHistory.page) && Intrinsics.areEqual(this.totalDuration, checkInHistory.totalDuration);
    }

    @Nullable
    public final Long getCompleteCount() {
        return this.completeCount;
    }

    @Nullable
    public final ArrayList<CheckInHistoryItem> getList() {
        return this.list;
    }

    @Nullable
    public final HistoryPage getPage() {
        return this.page;
    }

    @Nullable
    public final Long getTotalDuration() {
        return this.totalDuration;
    }

    public int hashCode() {
        Long l7 = this.completeCount;
        int iHashCode = 0;
        int iHashCode2 = l7 == null ? 0 : l7.hashCode();
        ArrayList<CheckInHistoryItem> arrayList = this.list;
        int iHashCode3 = arrayList == null ? 0 : arrayList.hashCode();
        HistoryPage historyPage = this.page;
        int iHashCode4 = historyPage == null ? 0 : historyPage.hashCode();
        Long l8 = this.totalDuration;
        if (l8 != null) {
            iHashCode = l8.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public final void setCompleteCount(@Nullable Long l7) {
        this.completeCount = l7;
    }

    public final void setList(@Nullable ArrayList<CheckInHistoryItem> arrayList) {
        this.list = arrayList;
    }

    public final void setPage(@Nullable HistoryPage historyPage) {
        this.page = historyPage;
    }

    public final void setTotalDuration(@Nullable Long l7) {
        this.totalDuration = l7;
    }

    @NotNull
    public String toString() {
        return "CheckInHistory(completeCount=" + this.completeCount + ", list=" + this.list + ", page=" + this.page + ", totalDuration=" + this.totalDuration + ")";
    }
}
