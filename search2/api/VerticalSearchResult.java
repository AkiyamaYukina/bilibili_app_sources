package com.bilibili.search2.api;

import Ps0.C;
import Ps0.C2792m;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.BaseSearchItem;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/VerticalSearchResult.class */
@StabilityInferred(parameters = 0)
@Keep
public class VerticalSearchResult<T extends BaseSearchItem> {
    public static final int $stable = 8;

    @Nullable
    private String expStr;

    @Nullable
    private List<? extends T> items;
    private long pageNum;

    @Nullable
    private C2792m pageReplyInfo;

    @Nullable
    private String query;

    @Nullable
    private String qvId;
    private double realExposureRatio = 0.8d;
    private long responseTime;

    @Nullable
    private C searchFilter;
    private int totalPages;

    @Nullable
    private String trackId;

    @Nullable
    private com.bilibili.search2.main.data.c userActQuery;

    @Nullable
    public final String getExpStr() {
        return this.expStr;
    }

    @Nullable
    public final List<T> getItems() {
        return this.items;
    }

    public final long getPageNum() {
        return this.pageNum;
    }

    @Nullable
    public final C2792m getPageReplyInfo() {
        return this.pageReplyInfo;
    }

    @Nullable
    public final String getQuery() {
        return this.query;
    }

    @Nullable
    public final String getQvId() {
        return this.qvId;
    }

    public final double getRealExposureRatio() {
        return this.realExposureRatio;
    }

    public final long getResponseTime() {
        return this.responseTime;
    }

    @Nullable
    public final C getSearchFilter() {
        return this.searchFilter;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    @Nullable
    public final String getTrackId() {
        return this.trackId;
    }

    @Nullable
    public final com.bilibili.search2.main.data.c getUserActQuery() {
        return this.userActQuery;
    }

    public final void setExpStr(@Nullable String str) {
        this.expStr = str;
    }

    public final void setItems(@Nullable List<? extends T> list) {
        this.items = list;
    }

    public final void setPageNum(long j7) {
        this.pageNum = j7;
    }

    public final void setPageReplyInfo(@Nullable C2792m c2792m) {
        this.pageReplyInfo = c2792m;
    }

    public final void setQuery(@Nullable String str) {
        this.query = str;
    }

    public final void setQvId(@Nullable String str) {
        this.qvId = str;
    }

    public final void setRealExposureRatio(double d7) {
        this.realExposureRatio = d7;
    }

    public final void setResponseTime(long j7) {
        this.responseTime = j7;
    }

    public final void setSearchFilter(@Nullable C c7) {
        this.searchFilter = c7;
    }

    public final void setTotalPages(int i7) {
        this.totalPages = i7;
    }

    public final void setTrackId(@Nullable String str) {
        this.trackId = str;
    }

    public final void setUserActQuery(@Nullable com.bilibili.search2.main.data.c cVar) {
        this.userActQuery = cVar;
    }
}
