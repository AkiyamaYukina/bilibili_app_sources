package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.search.BiligameSearchPage;
import com.bilibili.biligame.report.ReportExtra;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameSearchWikiList.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameSearchWikiList extends BiligameSearchPage<BiligameSearchWiki> {
    public static final int $stable = 8;

    @JSONField(name = "page_offset")
    @Nullable
    private String pageOffset;

    @Nullable
    public final String getPageOffset() {
        return this.pageOffset;
    }

    @Override // com.bilibili.biligame.api.search.BiligameSearchPage, com.bilibili.biligame.api.BiligamePage
    @NotNull
    public ReportExtra getReportExtra() {
        ReportExtra reportExtra = super.getReportExtra();
        reportExtra.put("page_offset", this.pageOffset);
        return reportExtra;
    }

    public final void setPageOffset(@Nullable String str) {
        this.pageOffset = str;
    }
}
