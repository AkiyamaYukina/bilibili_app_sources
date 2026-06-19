package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameReportReason.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameReportReason {
    public static final int $stable = 8;

    @JSONField(name = "group_id")
    private int groupId;

    @JSONField(name = "group_name")
    @Nullable
    private String groupName;

    @JSONField(name = "reasons")
    @Nullable
    private List<GameReason> reasons;
    private boolean showGroupName;

    public final int getGroupId() {
        return this.groupId;
    }

    @Nullable
    public final String getGroupName() {
        return this.groupName;
    }

    @Nullable
    public final List<GameReason> getReasons() {
        return this.reasons;
    }

    public final boolean getShowGroupName() {
        return this.showGroupName;
    }

    public final void setGroupId(int i7) {
        this.groupId = i7;
    }

    public final void setGroupName(@Nullable String str) {
        this.groupName = str;
    }

    public final void setReasons(@Nullable List<GameReason> list) {
        this.reasons = list;
    }

    public final void setShowGroupName(boolean z6) {
        this.showGroupName = z6;
    }
}
