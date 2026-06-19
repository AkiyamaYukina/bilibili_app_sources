package com.bilibili.playset.checkin;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/checkin/HistoryPage.class */
@StabilityInferred(parameters = 0)
@Keep
public final class HistoryPage {
    public static final int $stable = 8;

    @JSONField(name = "has_more")
    @Nullable
    private Integer hasMore;

    @JSONField(name = "offset")
    @Nullable
    private Integer offset;

    public HistoryPage() {
        this(null, null, 3, null);
    }

    public HistoryPage(@Nullable Integer num, @Nullable Integer num2) {
        this.hasMore = num;
        this.offset = num2;
    }

    public /* synthetic */ HistoryPage(Integer num, Integer num2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : num, (i7 & 2) != 0 ? 0 : num2);
    }

    public static /* synthetic */ HistoryPage copy$default(HistoryPage historyPage, Integer num, Integer num2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = historyPage.hasMore;
        }
        if ((i7 & 2) != 0) {
            num2 = historyPage.offset;
        }
        return historyPage.copy(num, num2);
    }

    @Nullable
    public final Integer component1() {
        return this.hasMore;
    }

    @Nullable
    public final Integer component2() {
        return this.offset;
    }

    @NotNull
    public final HistoryPage copy(@Nullable Integer num, @Nullable Integer num2) {
        return new HistoryPage(num, num2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryPage)) {
            return false;
        }
        HistoryPage historyPage = (HistoryPage) obj;
        return Intrinsics.areEqual(this.hasMore, historyPage.hasMore) && Intrinsics.areEqual(this.offset, historyPage.offset);
    }

    @Nullable
    public final Integer getHasMore() {
        return this.hasMore;
    }

    @Nullable
    public final Integer getOffset() {
        return this.offset;
    }

    public int hashCode() {
        Integer num = this.hasMore;
        int iHashCode = 0;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.offset;
        if (num2 != null) {
            iHashCode = num2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setHasMore(@Nullable Integer num) {
        this.hasMore = num;
    }

    public final void setOffset(@Nullable Integer num) {
        this.offset = num;
    }

    @NotNull
    public String toString() {
        return "HistoryPage(hasMore=" + this.hasMore + ", offset=" + this.offset + ")";
    }
}
