package com.bilibili.lib.projection.internal.widget;

import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.G;
import com.bilibili.ship.theseus.united.page.restrictionlayer.M;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/widget/j.class */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f64098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f64099c;

    public /* synthetic */ j(int i7, Object obj, Object obj2) {
        this.f64097a = i7;
        this.f64098b = obj;
        this.f64099c = obj2;
    }

    public final Object invoke(Object obj) {
        String str;
        Unit unit;
        switch (this.f64097a) {
            case 0:
                Map map = (Map) obj;
                ProjectionDeviceInternal.PlayerState playerState = ProjectionDeviceInternal.PlayerState.PLAYING;
                ProjectionDeviceInternal.PlayerState playerState2 = (ProjectionDeviceInternal.PlayerState) this.f64098b;
                if (playerState2 == playerState) {
                    str = "4";
                } else if (playerState2 == ProjectionDeviceInternal.PlayerState.UNKNOWN) {
                    str = "5";
                } else if (playerState2 == ProjectionDeviceInternal.PlayerState.COMPLETED) {
                    str = "6";
                } else {
                    ProjectionDeviceInternal.DeviceState deviceState = ProjectionDeviceInternal.DeviceState.CONNECTING;
                    ProjectionDeviceInternal.DeviceState deviceState2 = (ProjectionDeviceInternal.DeviceState) this.f64099c;
                    str = deviceState2 == deviceState ? "1" : deviceState2 == ProjectionDeviceInternal.DeviceState.DISCONNECTED ? "3" : deviceState2 == ProjectionDeviceInternal.DeviceState.DESTROYED ? "2" : "7";
                }
                map.put("state", str);
                return Unit.INSTANCE;
            default:
                TextVo textVo = (TextVo) obj;
                String str2 = textVo.f102719p;
                if (str2 == null) {
                    unit = Unit.INSTANCE;
                } else {
                    BLRouter.routeTo(RouteRequestKt.toRouteRequest(str2), ((G) this.f64098b).f102536f);
                    M m7 = (M) this.f64099c;
                    ReportVo reportVoL = textVo.l();
                    PageReportService.g(m7.f102576c, "united.player-video-detail.ogv-layer-pay.follow-rules.click", reportVoL != null ? reportVoL.c() : null, 4);
                    unit = Unit.INSTANCE;
                }
                return unit;
        }
    }
}
