package com.bilibili.biligame.bean.task;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/task/SignInCalendar.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SignInCalendar {
    public static final int $stable = 8;

    @JSONField(name = "accum_sign_in_cnt")
    private int accruedSignInCnt;

    @JSONField(name = "continuous_sign_in_cnt")
    private int continuousSignInCnt;

    @JSONField(name = "sign_in_records")
    @Nullable
    private List<SignInRecords> signInRecords;

    public final int getAccruedSignInCnt() {
        return this.accruedSignInCnt;
    }

    public final int getContinuousSignInCnt() {
        return this.continuousSignInCnt;
    }

    @Nullable
    public final List<SignInRecords> getSignInRecords() {
        return this.signInRecords;
    }

    public final void setAccruedSignInCnt(int i7) {
        this.accruedSignInCnt = i7;
    }

    public final void setContinuousSignInCnt(int i7) {
        this.continuousSignInCnt = i7;
    }

    public final void setSignInRecords(@Nullable List<SignInRecords> list) {
        this.signInRecords = list;
    }
}
