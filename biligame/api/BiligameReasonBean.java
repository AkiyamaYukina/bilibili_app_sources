package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.bean.BiligameRankInfo;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameReasonBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameReasonBean {
    public static final int $stable = 8;

    @JSONField(name = "rank_info")
    @Nullable
    private BiligameRankInfo gameRankInfo;

    @JSONField(name = "reason_text")
    @Nullable
    private String reasonText;

    @JSONField(name = "reason_type")
    @Nullable
    private String reasonType;

    @Nullable
    public final BiligameRankInfo getGameRankInfo() {
        return this.gameRankInfo;
    }

    @Nullable
    public final String getReasonText() {
        return this.reasonText;
    }

    @Nullable
    public final String getReasonType() {
        return this.reasonType;
    }

    public final void setGameRankInfo(@Nullable BiligameRankInfo biligameRankInfo) {
        this.gameRankInfo = biligameRankInfo;
    }

    public final void setReasonText(@Nullable String str) {
        this.reasonText = str;
    }

    public final void setReasonType(@Nullable String str) {
        this.reasonType = str;
    }
}
