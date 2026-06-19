package com.bilibili.biligame.card.newcard.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/newcard/bean/BiliGameVersionInfo.class */
@Keep
public final class BiliGameVersionInfo {

    @JSONField(name = "activity_id")
    @NotNull
    private String gameVersionId = "";

    @JSONField(name = "version_title")
    @NotNull
    private String gameVersionName = "";

    @JSONField(name = "is_reserve_pc")
    private boolean reserveStatusForPc;

    @NotNull
    public final String getGameVersionId() {
        return this.gameVersionId;
    }

    @NotNull
    public final String getGameVersionName() {
        return this.gameVersionName;
    }

    public final boolean getReserveStatusForPc() {
        return this.reserveStatusForPc;
    }

    public final boolean reservedForPc() {
        return this.reserveStatusForPc;
    }

    public final void setGameVersionId(@NotNull String str) {
        this.gameVersionId = str;
    }

    public final void setGameVersionName(@NotNull String str) {
        this.gameVersionName = str;
    }

    public final void setReserveStatusForPc(boolean z6) {
        this.reserveStatusForPc = z6;
    }
}
