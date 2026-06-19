package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/GameEntrance.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameEntrance {
    public static final int $stable = 8;

    @JSONField(name = "entrance_id")
    private long id;

    @JSONField(name = "show")
    private boolean show;

    @JSONField(name = "entrance_type")
    private int type;

    public final long getId() {
        return this.id;
    }

    public final boolean getShow() {
        return this.show;
    }

    public final int getType() {
        return this.type;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setShow(boolean z6) {
        this.show = z6;
    }

    public final void setType(int i7) {
        this.type = i7;
    }
}
