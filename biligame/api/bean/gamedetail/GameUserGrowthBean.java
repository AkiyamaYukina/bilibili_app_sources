package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameUserGrowthBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameUserGrowthBean implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "level_maintenance_time")
    private long levelMaintenanceTime;

    @JSONField(name = "level_read_status")
    private boolean levelReadStatus;

    @JSONField(name = "score")
    private int score;

    @JSONField(name = "unlock_benefit_count")
    private int unlockBenefitCount;

    @JSONField(name = "unlock_status")
    private boolean unlockStatus;

    @JSONField(name = "user_level_index")
    private int userLevel = 1;

    public final long getLevelMaintenanceTime() {
        return this.levelMaintenanceTime;
    }

    public final boolean getLevelReadStatus() {
        return this.levelReadStatus;
    }

    public final int getScore() {
        return this.score;
    }

    public final int getUnlockBenefitCount() {
        return this.unlockBenefitCount;
    }

    public final boolean getUnlockStatus() {
        return this.unlockStatus;
    }

    public final int getUserLevel() {
        return this.userLevel;
    }

    public final void setLevelMaintenanceTime(long j7) {
        this.levelMaintenanceTime = j7;
    }

    public final void setLevelReadStatus(boolean z6) {
        this.levelReadStatus = z6;
    }

    public final void setScore(int i7) {
        this.score = i7;
    }

    public final void setUnlockBenefitCount(int i7) {
        this.unlockBenefitCount = i7;
    }

    public final void setUnlockStatus(boolean z6) {
        this.unlockStatus = z6;
    }

    public final void setUserLevel(int i7) {
        this.userLevel = i7;
    }
}
