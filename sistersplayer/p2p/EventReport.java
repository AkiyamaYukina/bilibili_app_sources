package com.bilibili.sistersplayer.p2p;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/EventReport.class */
public class EventReport {

    @Nullable
    private Object data;

    @Nullable
    private EventReportType type;

    @Nullable
    public final Object getData() {
        return this.data;
    }

    @Nullable
    public final EventReportType getType() {
        return this.type;
    }

    public final void setData(@Nullable Object obj) {
        this.data = obj;
    }

    public final void setType(@Nullable EventReportType eventReportType) {
        this.type = eventReportType;
    }
}
