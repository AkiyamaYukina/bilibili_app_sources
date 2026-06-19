package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/CpsGameInfoBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class CpsGameInfoBean {
    public static final int $stable = 8;

    @JSONField(name = "cps_game_pkg_list")
    @Nullable
    private List<CpsBiliHotGame> cpsGamePkgList;

    @JSONField(name = "scan_interval_ms")
    private long scanIntervalMs;

    @Nullable
    public final List<CpsBiliHotGame> getCpsGamePkgList() {
        return this.cpsGamePkgList;
    }

    public final long getScanIntervalMs() {
        return this.scanIntervalMs;
    }

    public final void setCpsGamePkgList(@Nullable List<CpsBiliHotGame> list) {
        this.cpsGamePkgList = list;
    }

    public final void setScanIntervalMs(long j7) {
        this.scanIntervalMs = j7;
    }
}
