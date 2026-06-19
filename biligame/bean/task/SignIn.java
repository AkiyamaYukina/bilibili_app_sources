package com.bilibili.biligame.bean.task;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/task/SignIn.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SignIn {
    public static final int $stable = 8;

    @JSONField(name = "reward")
    @Nullable
    private RewardRule reward;

    @JSONField(name = "sign_in_template_id")
    @Nullable
    private String signInTemplateId;

    @JSONField(name = "success")
    private int success;

    @Nullable
    public final RewardRule getReward() {
        return this.reward;
    }

    @Nullable
    public final String getSignInTemplateId() {
        return this.signInTemplateId;
    }

    public final int getSuccess() {
        return this.success;
    }

    public final void setReward(@Nullable RewardRule rewardRule) {
        this.reward = rewardRule;
    }

    public final void setSignInTemplateId(@Nullable String str) {
        this.signInTemplateId = str;
    }

    public final void setSuccess(int i7) {
        this.success = i7;
    }
}
