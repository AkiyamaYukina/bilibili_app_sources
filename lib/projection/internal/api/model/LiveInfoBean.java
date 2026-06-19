package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/LiveInfoBean.class */
@Keep
public final class LiveInfoBean {

    @JSONField(name = "is_pay_live")
    private boolean isPayLive;

    public final boolean isPayLive() {
        return this.isPayLive;
    }

    public final void setPayLive(boolean z6) {
        this.isPayLive = z6;
    }
}
