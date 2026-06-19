package com.bilibili.opd.app.bizcommon.radar.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.z;
import com.bilibili.api.base.Config;
import com.bilibili.lib.spy.generated.android_app_Service;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.opd.app.bizcommon.radar.IRadarInterface;
import com.bilibili.opd.app.bizcommon.radar.Radar;
import com.bilibili.opd.app.bizcommon.radar.data.RadarReportEvent;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/service/RadarMainProcessService.class */
@StabilityInferred(parameters = 0)
public final class RadarMainProcessService extends android_app_Service {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f74215d = new IRadarInterface.a();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/service/RadarMainProcessService$a.class */
    public final class a extends IRadarInterface.a {
        @Override // com.bilibili.opd.app.bizcommon.radar.IRadarInterface
        public final void emit(@Nullable RadarReportEvent radarReportEvent) {
            String uuid = null;
            String eventName = radarReportEvent != null ? radarReportEvent.getEventName() : null;
            if (radarReportEvent != null) {
                uuid = radarReportEvent.getUuid();
            }
            String strA = z.a("RadarMainProcessService-emit event=", eventName, ", uuid=", uuid);
            if (Config.isDebuggable()) {
                String str = strA;
                if (strA == null) {
                    str = "null";
                }
                BLog.d("nov_test", str);
            }
            if (radarReportEvent != null) {
                radarReportEvent.setWeb(1);
            }
            Radar.Companion.instance().emit(radarReportEvent);
        }

        @Override // com.bilibili.opd.app.bizcommon.radar.IRadarInterface
        public final void trigger(@Nullable RadarTriggerEvent radarTriggerEvent) {
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(@Nullable Intent intent) {
        if (Config.isDebuggable()) {
            BLog.d("nov_test", "RadarMainProcessService-onBind");
        }
        return this.f74215d;
    }
}
