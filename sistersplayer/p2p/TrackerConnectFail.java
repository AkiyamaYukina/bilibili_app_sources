package com.bilibili.sistersplayer.p2p;

import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/TrackerConnectFail.class */
public final class TrackerConnectFail extends EventReport {
    public TrackerConnectFail(int i7, @NotNull String str) {
        HashMap map = new HashMap();
        map.put("statusCode", Integer.valueOf(i7));
        map.put("hostname", str);
        setType(EventReportType.TRACKER_CONNECT_FAIL);
        setData(map);
    }
}
