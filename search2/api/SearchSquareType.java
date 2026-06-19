package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchSquareType.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchSquareType {
    public static final int $stable = 8;

    @JSONField(name = "board_close_time_milli")
    private long boardCloseTimeMs;

    @JSONField(name = "board_expand_time_milli")
    private long boardExpandTimeMs;

    @JSONField(name = "exp_str")
    @Nullable
    private String expStr;

    @JSONField(name = "list")
    @Nullable
    private List<?> list;

    @JSONField(name = "negative_feedback")
    @Nullable
    private NegativeFeedback negativeFeedback;

    @JSONField(name = "search_button_opt_with_sort")
    private boolean searchButtonOptWithSort;

    @JSONField(name = "search_ranking_meta")
    @Nullable
    private SearchRankingMeta searchRankingMeta;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @JSONField(name = "trackid")
    @Nullable
    private String trackId;

    @JSONField(name = "type")
    @Nullable
    private String type;

    public final long getBoardCloseTimeMs() {
        return this.boardCloseTimeMs;
    }

    public final long getBoardExpandTimeMs() {
        return this.boardExpandTimeMs;
    }

    @Nullable
    public final String getExpStr() {
        return this.expStr;
    }

    @Nullable
    public final List<?> getList() {
        return this.list;
    }

    @Nullable
    public final NegativeFeedback getNegativeFeedback() {
        return this.negativeFeedback;
    }

    public final boolean getSearchButtonOptWithSort() {
        return this.searchButtonOptWithSort;
    }

    @Nullable
    public final SearchRankingMeta getSearchRankingMeta() {
        return this.searchRankingMeta;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTrackId() {
        return this.trackId;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setBoardCloseTimeMs(long j7) {
        this.boardCloseTimeMs = j7;
    }

    public final void setBoardExpandTimeMs(long j7) {
        this.boardExpandTimeMs = j7;
    }

    public final void setExpStr(@Nullable String str) {
        this.expStr = str;
    }

    public final void setList(@Nullable List<?> list) {
        this.list = list;
    }

    public final void setNegativeFeedback(@Nullable NegativeFeedback negativeFeedback) {
        this.negativeFeedback = negativeFeedback;
    }

    public final void setSearchButtonOptWithSort(boolean z6) {
        this.searchButtonOptWithSort = z6;
    }

    public final void setSearchRankingMeta(@Nullable SearchRankingMeta searchRankingMeta) {
        this.searchRankingMeta = searchRankingMeta;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTrackId(@Nullable String str) {
        this.trackId = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
