package com.bilibili.playset.checkin;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.A;
import com.alibaba.fastjson.annotation.JSONField;
import e4.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/checkin/Page.class */
@StabilityInferred(parameters = 0)
@Keep
public final class Page {
    public static final int $stable = 8;

    @JSONField(name = "has_more")
    @Nullable
    private Integer hasMore;

    @JSONField(name = "offset")
    @Nullable
    private Integer offset;

    @JSONField(name = "total")
    @Nullable
    private Integer total;

    public Page() {
        this(null, null, null, 7, null);
    }

    public Page(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.hasMore = num;
        this.offset = num2;
        this.total = num3;
    }

    public /* synthetic */ Page(Integer num, Integer num2, Integer num3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : num, (i7 & 2) != 0 ? 0 : num2, (i7 & 4) != 0 ? 0 : num3);
    }

    public static /* synthetic */ Page copy$default(Page page, Integer num, Integer num2, Integer num3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = page.hasMore;
        }
        if ((i7 & 2) != 0) {
            num2 = page.offset;
        }
        if ((i7 & 4) != 0) {
            num3 = page.total;
        }
        return page.copy(num, num2, num3);
    }

    @Nullable
    public final Integer component1() {
        return this.hasMore;
    }

    @Nullable
    public final Integer component2() {
        return this.offset;
    }

    @Nullable
    public final Integer component3() {
        return this.total;
    }

    @NotNull
    public final Page copy(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        return new Page(num, num2, num3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Page)) {
            return false;
        }
        Page page = (Page) obj;
        return Intrinsics.areEqual(this.hasMore, page.hasMore) && Intrinsics.areEqual(this.offset, page.offset) && Intrinsics.areEqual(this.total, page.total);
    }

    @Nullable
    public final Integer getHasMore() {
        return this.hasMore;
    }

    @Nullable
    public final Integer getOffset() {
        return this.offset;
    }

    @Nullable
    public final Integer getTotal() {
        return this.total;
    }

    public int hashCode() {
        Integer num = this.hasMore;
        int iHashCode = 0;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.offset;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.total;
        if (num3 != null) {
            iHashCode = num3.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public final void setHasMore(@Nullable Integer num) {
        this.hasMore = num;
    }

    public final void setOffset(@Nullable Integer num) {
        this.offset = num;
    }

    public final void setTotal(@Nullable Integer num) {
        this.total = num;
    }

    @NotNull
    public String toString() {
        Integer num = this.hasMore;
        Integer num2 = this.offset;
        return c.a(A.b("Page(hasMore=", num, ", offset=", num2, ", total="), this.total, ")");
    }
}
