package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailInfo;
import com.bilibili.biligame.report.ReportExtra;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/SearchGameDetailInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchGameDetailInfo extends GameDetailInfo {
    public static final int $stable = 8;

    @NotNull
    private ReportExtra reportExtra = ReportExtra.create(1);

    @NotNull
    public final ReportExtra getReportExtra() {
        return this.reportExtra;
    }

    public final void setReportExtra(@NotNull ReportExtra reportExtra) {
        this.reportExtra = reportExtra;
    }
}
