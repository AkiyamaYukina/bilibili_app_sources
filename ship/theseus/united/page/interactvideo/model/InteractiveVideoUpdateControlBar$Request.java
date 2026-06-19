package com.bilibili.ship.theseus.united.page.interactvideo.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.common.chronoscommon.message.RequestDefine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/model/InteractiveVideoUpdateControlBar$Request.class */
@StabilityInferred(parameters = 0)
@RequestDefine(method = "InteractiveVideo_UpdateControlBar")
@Keep
public final class InteractiveVideoUpdateControlBar$Request {
    public static final int $stable = 8;

    @JSONField(name = "hidden")
    private boolean hidden;

    @JSONField(name = "type")
    @NotNull
    private String type = "";

    public final boolean getHidden() {
        return this.hidden;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final void setHidden(boolean z6) {
        this.hidden = z6;
    }

    public final void setType(@NotNull String str) {
        this.type = str;
    }
}
