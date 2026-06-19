package com.bilibili.ogvvega.tunnel;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/ConnTracker.class */
public final class ConnTracker {
    public final void onAuthSuccess(@NotNull VegaFrameVO vegaFrameVO) {
        ReportersKt.tunnelEventReport$default(ReportersKt.REPORT_EVENT_ON_AUTH_SUCCESS, MapsKt.mapOf(new Pair[]{TuplesKt.to("vega-id", String.valueOf(vegaFrameVO.getOption().getVegaId())), TuplesKt.to("req-id", vegaFrameVO.getOption().getReqId())}), 0, 4, null);
    }

    public final void onBizError(@NotNull VegaFrameVO vegaFrameVO) {
        ReportersKt.tunnelEventReport$default(ReportersKt.REPORT_EVENT_BIZ_ERROR, MapsKt.mapOf(new Pair[]{TuplesKt.to("vega-id", String.valueOf(vegaFrameVO.getOption().getVegaId())), TuplesKt.to("route-path", vegaFrameVO.getRoutePath()), TuplesKt.to("err-code", String.valueOf(vegaFrameVO.getOption().getStatus().getCode())), TuplesKt.to("err-msg", vegaFrameVO.getOption().getStatus().getMessage())}), 0, 4, null);
    }

    public final void onDisconnect(@Nullable String str) {
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        ReportersKt.tunnelEventReport$default(ReportersKt.REPORT_EVENT_CLIENT_DISCONNECT, MapsKt.mapOf(TuplesKt.to("cause", str2)), 0, 4, null);
    }

    public final void onException(@Nullable Throwable th, @NotNull Map<String, VegaFrameVO> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sending-count", String.valueOf(map.size()));
        for (Map.Entry<String, VegaFrameVO> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().getRoutePath());
        }
        linkedHashMap.put("cause", "msg = " + (th != null ? th.getMessage() : null) + ", throwable = " + th);
        ReportersKt.tunnelEventReport$default(ReportersKt.REPORT_EVENT_ON_EXCEPTION, linkedHashMap, 0, 4, null);
    }

    public final void onHeartbeatLost() {
        ReportersKt.tunnelEventReport$default(ReportersKt.REPORT_EVENT_HEARTBEAT_LOST, null, 0, 6, null);
    }

    public final void onReceiveMsg(@NotNull VegaFrameVO vegaFrameVO) {
        ReportersKt.tunnelEventReport$default(ReportersKt.REPORT_EVENT_RECEIVE_MSG, MapsKt.mapOf(new Pair[]{TuplesKt.to("vega-id", String.valueOf(vegaFrameVO.getOption().getVegaId())), TuplesKt.to("route-path", vegaFrameVO.getRoutePath()), TuplesKt.to("seq_id", String.valueOf(vegaFrameVO.getOption().getSequence()))}), 0, 4, null);
    }

    public final void onServerCompleted() {
        ReportersKt.tunnelEventReport$default(ReportersKt.REPORT_EVENT_SERVER_COMPLETED, null, 0, 6, null);
    }

    public final void onStartAuth(@NotNull VegaFrameVO vegaFrameVO) {
        ReportersKt.tunnelEventReport$default(ReportersKt.REPORT_EVENT_AUTH, MapsKt.mapOf(TuplesKt.to("req-id", vegaFrameVO.getOption().getReqId())), 0, 4, null);
    }

    public final void onStartConn() {
        ReportersKt.tunnelEventReport$default(ReportersKt.REPORT_EVENT_CONNECT, null, 0, 6, null);
    }

    public final void onStartSubscribe(@NotNull VegaFrameVO vegaFrameVO) {
        ReportersKt.tunnelEventReport$default(ReportersKt.REPORT_EVENT_SUBSCRIBE, MapsKt.mapOf(TuplesKt.to("req-id", vegaFrameVO.getOption().getReqId())), 0, 4, null);
    }

    public final void onSubscribeSuccess(@NotNull VegaFrameVO vegaFrameVO) {
        ReportersKt.tunnelEventReport$default(ReportersKt.REPORT_EVENT_ON_SUBSCRIBE_SUCCESS, MapsKt.mapOf(new Pair[]{TuplesKt.to("vega-id", String.valueOf(vegaFrameVO.getOption().getVegaId())), TuplesKt.to("req-id", vegaFrameVO.getOption().getReqId())}), 0, 4, null);
    }
}
