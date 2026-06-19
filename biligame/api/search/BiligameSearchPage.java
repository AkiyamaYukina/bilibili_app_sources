package com.bilibili.biligame.api.search;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.BiligamePage;
import com.bilibili.biligame.report.ReportExtra;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/search/BiligameSearchPage.class */
@StabilityInferred(parameters = 0)
@Keep
public class BiligameSearchPage<T> extends BiligamePage<T> {
    public static final int $stable = 8;

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

    @Override // com.bilibili.biligame.api.BiligamePage
    @NotNull
    public ReportExtra getReportExtra() {
        ReportExtra reportExtra = super.getReportExtra();
        reportExtra.put("search_trace_info", this.searchTraceInfo);
        reportExtra.put("search_request_id", this.searchRequestId);
        reportExtra.put("search_ab_flag", this.searchABFlag);
        reportExtra.put("game_ab_info", this.gameAbInfo);
        return reportExtra;
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

    public final void setGameAbInfo(@Nullable String str) {
        this.gameAbInfo = str;
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
}
