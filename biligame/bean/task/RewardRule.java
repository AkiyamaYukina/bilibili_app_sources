package com.bilibili.biligame.bean.task;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/task/RewardRule.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RewardRule {
    public static final int $stable = 8;

    @JSONField(name = "day")
    private int day;

    @JSONField(name = "focus_date")
    private int focusDate;

    @JSONField(name = "icon")
    @Nullable
    private String icon;

    @JSONField(name = "rewarded")
    private int rewarded;

    @JSONField(name = "rewards")
    @Nullable
    private List<Reward> rewards;

    public final int getDay() {
        return this.day;
    }

    public final int getFocusDate() {
        return this.focusDate;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final int getRewarded() {
        return this.rewarded;
    }

    @Nullable
    public final List<Reward> getRewards() {
        return this.rewards;
    }

    public final boolean isFocusData() {
        boolean z6 = true;
        if (this.focusDate != 1) {
            z6 = false;
        }
        return z6;
    }

    public final boolean isRewarded() {
        boolean z6 = true;
        if (this.rewarded != 1) {
            z6 = false;
        }
        return z6;
    }

    public final void setDay(int i7) {
        this.day = i7;
    }

    public final void setFocusDate(int i7) {
        this.focusDate = i7;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setRewarded(int i7) {
        this.rewarded = i7;
    }

    public final void setRewards(@Nullable List<Reward> list) {
        this.rewards = list;
    }
}
