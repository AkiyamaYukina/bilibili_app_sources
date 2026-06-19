package com.bilibili.ogvvega.tunnel;

import com.bilibili.lib.neuron.api.Neurons;
import java.util.Map;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/ReportersKt.class */
public final class ReportersKt {

    @NotNull
    public static final String REPORT_EVENT_AUTH = "ogv.pgc-grpc.auth";

    @NotNull
    public static final String REPORT_EVENT_BIZ_ERROR = "ogv.pgc-grpc.biz-err";

    @NotNull
    public static final String REPORT_EVENT_CLIENT_DISCONNECT = "ogv.pgc-grpc.client-disconnect";

    @NotNull
    public static final String REPORT_EVENT_COMPENSATION_FETCH_FAILED = "ogv.pgc-grpc.compensation-fetch-failed";

    @NotNull
    public static final String REPORT_EVENT_CONNECT = "ogv.pgc-grpc.connect";

    @NotNull
    public static final String REPORT_EVENT_HEARTBEAT_LOST = "ogv.pgc-grpc.heartbeat-lost";

    @NotNull
    public static final String REPORT_EVENT_ON_AUTH_SUCCESS = "ogv.pgc-grpc.on-auth-success";

    @NotNull
    public static final String REPORT_EVENT_ON_EXCEPTION = "ogv.pgc-grpc.on-exception";

    @NotNull
    public static final String REPORT_EVENT_ON_SUBSCRIBE_SUCCESS = "ogv.pgc-grpc.on-subscribe-success";

    @NotNull
    public static final String REPORT_EVENT_RECEIVE_MSG = "ogv.pgc-grpc.receive-msg";

    @NotNull
    public static final String REPORT_EVENT_SERVER_COMPLETED = "ogv.pgc-grpc.server-completed";

    @NotNull
    public static final String REPORT_EVENT_SUBSCRIBE = "ogv.pgc-grpc.subscribe";

    public static final void tunnelEventReport(@NotNull String str, @NotNull Map<String, String> map, int i7) {
        Neurons.trackT$default(false, str, map, 0, new com.bilibili.gripper.container.bpush.i(true), 8, (Object) null);
    }

    public static /* synthetic */ void tunnelEventReport$default(String str, Map map, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i8 & 4) != 0) {
            i7 = 1;
        }
        tunnelEventReport(str, map, i7);
    }
}
