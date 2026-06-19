package com.bilibili.biligame.bean.task;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/task/Reward.class */
@StabilityInferred(parameters = 0)
@Keep
public final class Reward {
    public static final int $stable = 8;

    @JSONField(name = "num")
    private int num;

    @JSONField(name = "type")
    private int type;

    public final int getNum() {
        return this.num;
    }

    public final int getType() {
        return this.type;
    }

    public final void setNum(int i7) {
        this.num = i7;
    }

    public final void setType(int i7) {
        this.type = i7;
    }
}
