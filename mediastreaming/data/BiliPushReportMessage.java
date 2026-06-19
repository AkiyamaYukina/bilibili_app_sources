package com.bilibili.mediastreaming.data;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/data/BiliPushReportMessage.class */
@Keep
public final class BiliPushReportMessage {

    @NotNull
    private BiliPushReportDevice device = new BiliPushReportDevice();

    @NotNull
    private List<BiliReportEvent> pushReports = new ArrayList();

    @NotNull
    public final BiliPushReportDevice getDevice() {
        return this.device;
    }

    @NotNull
    public final List<BiliReportEvent> getPushReports() {
        return this.pushReports;
    }

    public final void setDevice(@NotNull BiliPushReportDevice biliPushReportDevice) {
        this.device = biliPushReportDevice;
    }

    public final void setPushReports(@NotNull List<BiliReportEvent> list) {
        this.pushReports = list;
    }
}
