package com.bilibili.biligame.business.pegasus.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.biligame.api.BiligameMainGame;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/pegasus/bean/GameSmallPegasusBean.class */
@StabilityInferred(parameters = 0)
public final class GameSmallPegasusBean extends BiligameMainGame {
    public static final int $stable = 8;
    private boolean showRecentCheck;

    public final boolean getShowRecentCheck() {
        return this.showRecentCheck;
    }

    public final void setShowRecentCheck(boolean z6) {
        this.showRecentCheck = z6;
    }
}
