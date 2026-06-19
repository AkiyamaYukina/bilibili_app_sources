package com.bilibili.biligame.api.search;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.report.ReportExtra;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/search/BiligameSearchRelationResponse.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameSearchRelationResponse<T> extends BiligameApiResponse<T> {
    public static final int $stable = 8;

    @JSONField(name = "page_count")
    private int pageCount;

    @JSONField(name = "page_number")
    private int pageNumber;

    @JSONField(name = "page_size")
    private int pageSize;

    @JSONField(name = "total_count")
    private int totalCount;

    @JSONField(name = "search_trace_info")
    @NotNull
    private String searchTraceInfo = "";

    @JSONField(name = "search_request_id")
    @Nullable
    private String searchRequestId = "";

    @JSONField(name = "search_ab_flag")
    @Nullable
    private String searchABFlag = "";

    @JSONField(name = "game_ab_info")
    @Nullable
    private String gameAbInfo = "";

    @Nullable
    public final String getGameAbInfo() {
        return this.gameAbInfo;
    }

    public final int getPageCount() {
        return this.pageCount;
    }

    public final int getPageNumber() {
        return this.pageNumber;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    @NotNull
    public final ReportExtra getReportExtra() {
        return ReportExtra.create(8).put("page_number", Integer.valueOf(this.pageNumber)).put("page_size", Integer.valueOf(this.pageSize)).put("page_count", Integer.valueOf(this.pageCount)).put("total_count", Integer.valueOf(this.totalCount)).put("search_trace_info", this.searchTraceInfo).put("search_request_id", this.searchRequestId).put("search_ab_flag", this.searchABFlag).put("game_ab_info", this.gameAbInfo);
    }

    @Nullable
    public final String getSearchABFlag() {
        return this.searchABFlag;
    }

    @Nullable
    public final String getSearchRequestId() {
        return this.searchRequestId;
    }

    @NotNull
    public final String getSearchTraceInfo() {
        return this.searchTraceInfo;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final void setGameAbInfo(@Nullable String str) {
        this.gameAbInfo = str;
    }

    public final void setPageCount(int i7) {
        this.pageCount = i7;
    }

    public final void setPageNumber(int i7) {
        this.pageNumber = i7;
    }

    public final void setPageSize(int i7) {
        this.pageSize = i7;
    }

    public final void setSearchABFlag(@Nullable String str) {
        this.searchABFlag = str;
    }

    public final void setSearchRequestId(@Nullable String str) {
        this.searchRequestId = str;
    }

    public final void setSearchTraceInfo(@NotNull String str) {
        this.searchTraceInfo = str;
    }

    public final void setTotalCount(int i7) {
        this.totalCount = i7;
    }
}
