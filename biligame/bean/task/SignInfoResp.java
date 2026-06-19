package com.bilibili.biligame.bean.task;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/task/SignInfoResp.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SignInfoResp {
    public static final int $stable = 8;

    @JSONField(name = "can_makeup")
    private int canMakeup;

    @JSONField(name = "can_sign_in")
    private int canSignIn;

    @JSONField(name = "description")
    @Nullable
    private String description;

    @JSONField(name = "name")
    @Nullable
    private String name;

    @JSONField(name = "reward_rule_list")
    @Nullable
    private List<RewardRule> rewardRuleList;

    @JSONField(name = "show_dialog")
    private int showDialog;

    @JSONField(name = "sign_in_count")
    private int signInCount;

    @JSONField(name = "today_rewards")
    @Nullable
    private List<Reward> todayRewards;

    @JSONField(name = "type")
    private int type;

    public final int getCanMakeup() {
        return this.canMakeup;
    }

    public final int getCanSignIn() {
        return this.canSignIn;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<RewardRule> getRewardRuleList() {
        return this.rewardRuleList;
    }

    public final int getShowDialog() {
        return this.showDialog;
    }

    public final int getSignInCount() {
        return this.signInCount;
    }

    @Nullable
    public final List<Reward> getTodayRewards() {
        return this.todayRewards;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isCanMakeup() {
        boolean z6 = true;
        if (this.canMakeup != 1) {
            z6 = false;
        }
        return z6;
    }

    public final boolean isCanSignIn() {
        boolean z6 = true;
        if (this.canSignIn != 1) {
            z6 = false;
        }
        return z6;
    }

    public final boolean isShowDialog() {
        boolean z6 = true;
        if (this.showDialog != 1) {
            z6 = false;
        }
        return z6;
    }

    public final void setCanMakeup(int i7) {
        this.canMakeup = i7;
    }

    public final void setCanSignIn(int i7) {
        this.canSignIn = i7;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setRewardRuleList(@Nullable List<RewardRule> list) {
        this.rewardRuleList = list;
    }

    public final void setShowDialog(int i7) {
        this.showDialog = i7;
    }

    public final void setSignInCount(int i7) {
        this.signInCount = i7;
    }

    public final void setTodayRewards(@Nullable List<Reward> list) {
        this.todayRewards = list;
    }

    public final void setType(int i7) {
        this.type = i7;
    }
}
