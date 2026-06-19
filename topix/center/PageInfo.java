package com.bilibili.topix.center;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/PageInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class PageInfo {
    public static final int $stable = 8;

    @JSONField(name = "has_more")
    @Nullable
    private Boolean hasMore;

    @JSONField(name = "offset")
    @Nullable
    private String offset;

    public PageInfo() {
        this(null, null, 3, null);
    }

    public PageInfo(@Nullable Boolean bool, @Nullable String str) {
        this.hasMore = bool;
        this.offset = str;
    }

    public /* synthetic */ PageInfo(Boolean bool, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : bool, (i7 & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ PageInfo copy$default(PageInfo pageInfo, Boolean bool, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            bool = pageInfo.hasMore;
        }
        if ((i7 & 2) != 0) {
            str = pageInfo.offset;
        }
        return pageInfo.copy(bool, str);
    }

    @Nullable
    public final Boolean component1() {
        return this.hasMore;
    }

    @Nullable
    public final String component2() {
        return this.offset;
    }

    @NotNull
    public final PageInfo copy(@Nullable Boolean bool, @Nullable String str) {
        return new PageInfo(bool, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageInfo)) {
            return false;
        }
        PageInfo pageInfo = (PageInfo) obj;
        return Intrinsics.areEqual(this.hasMore, pageInfo.hasMore) && Intrinsics.areEqual(this.offset, pageInfo.offset);
    }

    @Nullable
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    public final String getOffset() {
        return this.offset;
    }

    public int hashCode() {
        Boolean bool = this.hasMore;
        int iHashCode = 0;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        String str = this.offset;
        if (str != null) {
            iHashCode = str.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setHasMore(@Nullable Boolean bool) {
        this.hasMore = bool;
    }

    public final void setOffset(@Nullable String str) {
        this.offset = str;
    }

    @NotNull
    public String toString() {
        return "PageInfo(hasMore=" + this.hasMore + ", offset=" + this.offset + ")";
    }
}
