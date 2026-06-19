package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameCommentReport.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameCommentReport {
    public static final int $stable = 8;

    @JSONField(name = "report_groups")
    @Nullable
    private List<GameReportReason> reportGroups;

    @JSONField(name = "report_name_else")
    @NotNull
    private String reportOtherName = "";

    @JSONField(name = "report_type_else")
    private int reportOtherType;

    @JSONField(name = "show_group_name")
    private boolean showGroupName;

    @JSONField(name = "show_title")
    private boolean showTitle;

    @Nullable
    private String title;

    @Nullable
    public final List<GameReportReason> getReportGroups() {
        return this.reportGroups;
    }

    @NotNull
    public final String getReportOtherName() {
        return this.reportOtherName;
    }

    public final int getReportOtherType() {
        return this.reportOtherType;
    }

    public final boolean getShowGroupName() {
        return this.showGroupName;
    }

    public final boolean getShowTitle() {
        return this.showTitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setReportGroups(@Nullable List<GameReportReason> list) {
        this.reportGroups = list;
    }

    public final void setReportOtherName(@NotNull String str) {
        this.reportOtherName = str;
    }

    public final void setReportOtherType(int i7) {
        this.reportOtherType = i7;
    }

    public final void setShowGroupName(boolean z6) {
        this.showGroupName = z6;
    }

    public final void setShowTitle(boolean z6) {
        this.showTitle = z6;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
