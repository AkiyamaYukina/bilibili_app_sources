package com.bilibili.studio.comm.track.check;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/track/check/RuleConfigId.class */
@Keep
public final class RuleConfigId {

    @JSONField(name = "event_id")
    @NotNull
    private String id = "";

    @JSONField(name = "event_param")
    @NotNull
    private List<RuleConfig> params = new ArrayList();

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<RuleConfig> getParams() {
        return this.params;
    }

    public final void setId(@NotNull String str) {
        this.id = str;
    }

    public final void setParams(@NotNull List<RuleConfig> list) {
        this.params = list;
    }
}
