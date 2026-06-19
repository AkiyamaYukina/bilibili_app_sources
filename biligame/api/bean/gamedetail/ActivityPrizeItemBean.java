package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/ActivityPrizeItemBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ActivityPrizeItemBean implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "icon")
    @Nullable
    private String icon;

    @JSONField(name = "name")
    @Nullable
    private String name;

    @JSONField(name = "num")
    private int num;

    @JSONField(name = "order")
    private int order;

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getNum() {
        return this.num;
    }

    public final int getOrder() {
        return this.order;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setNum(int i7) {
        this.num = i7;
    }

    public final void setOrder(int i7) {
        this.order = i7;
    }
}
