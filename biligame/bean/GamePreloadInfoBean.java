package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/GamePreloadInfoBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GamePreloadInfoBean {
    public static final int $stable = 8;

    @JSONField(name = "cps_game_scan_info")
    @Nullable
    private CpsGameInfoBean cpsInfoBean;

    @Nullable
    public final CpsGameInfoBean getCpsInfoBean() {
        return this.cpsInfoBean;
    }

    public final void setCpsInfoBean(@Nullable CpsGameInfoBean cpsGameInfoBean) {
        this.cpsInfoBean = cpsGameInfoBean;
    }
}
