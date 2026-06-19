package com.bilibili.biligame.api.site;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/site/NickFree.class */
@StabilityInferred(parameters = 0)
@Keep
public final class NickFree {
    public static final int $stable = 8;

    @JSONField(name = "nick_free")
    private boolean nickFree;

    public final boolean getNickFree() {
        return this.nickFree;
    }

    public final void setNickFree(boolean z6) {
        this.nickFree = z6;
    }
}
