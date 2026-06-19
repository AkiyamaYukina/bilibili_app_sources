package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/OnlineActivityInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class OnlineActivityInfo implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "activities")
    @Nullable
    private List<ActivityInfoBean> activities;

    @JSONField(name = "nums")
    private int num;

    @Nullable
    public final List<ActivityInfoBean> getActivities() {
        return this.activities;
    }

    public final int getNum() {
        return this.num;
    }

    public final void setActivities(@Nullable List<ActivityInfoBean> list) {
        this.activities = list;
    }

    public final void setNum(int i7) {
        this.num = i7;
    }
}
