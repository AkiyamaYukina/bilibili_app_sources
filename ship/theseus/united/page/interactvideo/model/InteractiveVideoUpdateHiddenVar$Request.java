package com.bilibili.ship.theseus.united.page.interactvideo.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.common.chronoscommon.message.RequestDefine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/model/InteractiveVideoUpdateHiddenVar$Request.class */
@StabilityInferred(parameters = 0)
@RequestDefine(method = "InteractiveVideo_UpdateHiddenVar")
@Keep
public final class InteractiveVideoUpdateHiddenVar$Request {
    public static final int $stable = 8;

    @JSONField(name = "name")
    @NotNull
    private String name = "";

    @JSONField(name = "value")
    private float value;

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final float getValue() {
        return this.value;
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }

    public final void setValue(float f7) {
        this.value = f7;
    }
}
