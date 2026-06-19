package com.bilibili.opd.app.bizcommon.radar.service;

import G0.b;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.api.base.Config;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.spy.generated.android_app_Service;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.opd.app.bizcommon.radar.IRadarInterface;
import com.bilibili.opd.app.bizcommon.radar.core.i;
import com.bilibili.opd.app.bizcommon.radar.data.RadarReportEvent;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/service/RadarWebProcessService.class */
@StabilityInferred(parameters = 0)
public final class RadarWebProcessService extends android_app_Service {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f74216d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/service/RadarWebProcessService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends IRadarInterface.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public i f74217b;

        @Override // com.bilibili.opd.app.bizcommon.radar.IRadarInterface
        public final void emit(@Nullable RadarReportEvent radarReportEvent) {
        }

        @Override // com.bilibili.opd.app.bizcommon.radar.IRadarInterface
        public final void trigger(@Nullable RadarTriggerEvent radarTriggerEvent) {
            RadarTriggerContent messageContent;
            String messageType = radarTriggerEvent != null ? radarTriggerEvent.getMessageType() : null;
            String id = (radarTriggerEvent == null || (messageContent = radarTriggerEvent.getMessageContent()) == null) ? null : messageContent.getId();
            boolean z6 = this.f74217b != null;
            StringBuilder sbA = b.a("RadarWebProcessService-trigger type=", messageType, ", id=", id, ", dispatcher=");
            sbA.append(z6);
            String string = sbA.toString();
            if (Config.isDebuggable()) {
                String str = string;
                if (string == null) {
                    str = "null";
                }
                BLog.d("nov_test", str);
            }
            if (radarTriggerEvent != null) {
                i iVar = this.f74217b;
                Boolean boolValueOf = iVar != null ? Boolean.valueOf(iVar.a(radarTriggerEvent, null)) : null;
                String messageType2 = radarTriggerEvent.getMessageType();
                RadarTriggerContent messageContent2 = radarTriggerEvent.getMessageContent();
                String id2 = null;
                if (messageContent2 != null) {
                    id2 = messageContent2.getId();
                }
                String str2 = "RadarWebProcessService-trigger result=" + boolValueOf + " type=" + messageType2 + ", id=" + id2;
                if (Config.isDebuggable()) {
                    if (str2 == null) {
                        str2 = "null";
                    }
                    BLog.d("nov_test", str2);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bilibili.opd.app.bizcommon.radar.IRadarInterface$a, com.bilibili.opd.app.bizcommon.radar.service.RadarWebProcessService$a] */
    public RadarWebProcessService() {
        i iVar = new i();
        ?? aVar = new IRadarInterface.a();
        aVar.f74217b = iVar;
        this.f74216d = aVar;
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
            BLog.d("nov_test", "RadarWebProcessService-onBind");
        }
        return this.f74216d;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        if (EntryPointKt.getMemleakOptEnable()) {
            a aVar = this.f74216d;
            aVar.getClass();
            if (Config.isDebuggable()) {
                BLog.d("nov_test", "RadarWebProcessService-release");
            }
            aVar.f74217b = null;
        }
    }
}
