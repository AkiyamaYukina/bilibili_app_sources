package com.bilibili.studio.comm.track.check;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/track/check/RuleConfigFawkes.class */
@Keep
public final class RuleConfigFawkes {

    @NotNull
    private String version = "0";

    @NotNull
    private List<RuleConfig> common = new ArrayList();

    @NotNull
    private List<RuleConfigId> ids = new ArrayList();

    @NotNull
    public final List<RuleConfig> getCommon() {
        return this.common;
    }

    @NotNull
    public final List<RuleConfigId> getIds() {
        return this.ids;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public final void setCommon(@NotNull List<RuleConfig> list) {
        this.common = list;
    }

    public final void setIds(@NotNull List<RuleConfigId> list) {
        this.ids = list;
    }

    public final void setVersion(@NotNull String str) {
        this.version = str;
    }
}
