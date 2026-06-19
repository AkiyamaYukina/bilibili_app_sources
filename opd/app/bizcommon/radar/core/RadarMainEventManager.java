package com.bilibili.opd.app.bizcommon.radar.core;

import ES0.N;
import android.app.Application;
import android.content.Intent;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import androidx.room.m;
import com.bilibili.api.base.Config;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.opd.app.bizcommon.radar.data.RadarConfig;
import com.bilibili.opd.app.bizcommon.radar.data.RadarReportEvent;
import com.bilibili.opd.app.bizcommon.radar.data.RadarReportWrapper;
import com.bilibili.opd.app.bizcommon.radar.service.RadarWebProcessService;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/core/RadarMainEventManager.class */
@StabilityInferred(parameters = 0)
public final class RadarMainEventManager implements cn0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final cn0.d f74172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final fn0.a f74173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final RadarConfig f74174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final b f74175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final i f74176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final gn0.a f74177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Application f74178g;

    @NotNull
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Job f74179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f74180j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f74181k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/core/RadarMainEventManager$a.class */
    public static final class a extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RadarMainEventManager f74182a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RadarMainEventManager radarMainEventManager, Handler handler) {
            super(handler);
            this.f74182a = radarMainEventManager;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z6, Uri uri) {
            if (Intrinsics.areEqual(uri != null ? uri.getQueryParameter(MallProviderParamsHelper.ActiveProviderParams.MALL_MODULE_ACTIVE) : null, "true")) {
                return;
            }
            cn0.d dVar = this.f74182a.f74172a;
            Integer numValueOf = null;
            if (dVar != null) {
                numValueOf = Integer.valueOf(dVar.m());
            }
            BLog.e("query active visible -> " + numValueOf);
            cn0.d dVar2 = this.f74182a.f74172a;
            if (dVar2 == null || dVar2.m() != 0) {
                this.f74182a.f74181k = System.identityHashCode(BiliContext.topActivitiy());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /* JADX WARN: Type inference failed for: r1v7, types: [gn0.a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RadarMainEventManager() {
        /*
            r15 = this;
            r0 = r15
            r0.<init>()
            com.bilibili.lib.blrouter.BLRouter r0 = com.bilibili.lib.blrouter.BLRouter.INSTANCE
            r17 = r0
            r0 = 0
            r16 = r0
            r0 = r17
            java.lang.Class<cn0.d> r1 = cn0.d.class
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.Object r0 = com.bilibili.ad.adview.story.c.a(r0, r1, r2, r3, r4)
            cn0.d r0 = (cn0.d) r0
            r17 = r0
            r0 = r15
            r1 = r17
            r0.f74172a = r1
            r0 = r17
            if (r0 == 0) goto L27
            r0 = r17
            com.mall.logic.support.radar.e r0 = r0.a()
            r16 = r0
        L27:
            r0 = r15
            r1 = r16
            r0.f74173b = r1
            r0 = r17
            if (r0 == 0) goto L3d
            r0 = r17
            com.bilibili.opd.app.bizcommon.radar.data.RadarConfig r0 = r0.config()
            r17 = r0
            r0 = r17
            r16 = r0
            r0 = r17
            if (r0 != 0) goto L51
        L3d:
            com.bilibili.opd.app.bizcommon.radar.data.RadarConfig r0 = new com.bilibili.opd.app.bizcommon.radar.data.RadarConfig
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 255(0xff, float:3.57E-43)
            r11 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r16 = r0
        L51:
            r0 = r15
            r1 = r16
            r0.f74174c = r1
            r0 = r15
            com.bilibili.opd.app.bizcommon.radar.core.b r1 = new com.bilibili.opd.app.bizcommon.radar.core.b
            r2 = r1
            r3 = r16
            int r3 = r3.getPackageSize()
            r2.<init>(r3)
            r0.f74175d = r1
            r0 = r15
            com.bilibili.opd.app.bizcommon.radar.core.i r1 = new com.bilibili.opd.app.bizcommon.radar.core.i
            r2 = r1
            r2.<init>()
            r0.f74176e = r1
            r0 = r15
            java.lang.Object r1 = new java.lang.Object
            r2 = r1
            r2.<init>()
            r0.f74177f = r1
            android.app.Application r0 = com.bilibili.base.BiliContext.application()
            r16 = r0
            r0 = r15
            r1 = r16
            r0.f74178g = r1
            r0 = r15
            java.lang.String r1 = ""
            r0.h = r1
            r0 = r15
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = r1
            r3 = 1
            r2.<init>(r3)
            r0.f74180j = r1
            r0 = r16
            android.content.ContentResolver r0 = r0.getContentResolver()
            r16 = r0
            r0 = r16
            if (r0 == 0) goto Lbf
            r0 = r16
            com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper$ActiveProviderParams$Companion r1 = com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper.ActiveProviderParams.Companion
            android.net.Uri$Builder r1 = r1.getBaseUriBuilder()
            android.net.Uri r1 = r1.build()
            r2 = 1
            com.bilibili.opd.app.bizcommon.radar.core.RadarMainEventManager$a r3 = new com.bilibili.opd.app.bizcommon.radar.core.RadarMainEventManager$a
            r4 = r3
            r5 = r15
            android.os.Handler r6 = new android.os.Handler
            r7 = r6
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            r7.<init>(r8)
            r4.<init>(r5, r6)
            r0.registerContentObserver(r1, r2, r3)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.radar.core.RadarMainEventManager.<init>():void");
    }

    @Override // cn0.b
    public final boolean b() {
        return com.bilibili.opd.app.bizcommon.radar.b.e(this.f74178g, RadarWebProcessService.class.getName());
    }

    @Override // cn0.b
    public final void bindService() {
        this.f74178g.bindService(new Intent(this.f74178g, (Class<?>) RadarWebProcessService.class), this.f74177f, 1);
    }

    public final void c() {
        List listEmptyList;
        if (this.f74173b == null) {
            if (Config.isDebuggable()) {
                BLog.d("nov_test", "RadarMainEventManager-report skip null repo");
                return;
            }
            return;
        }
        b bVar = this.f74175d;
        if (bVar.f74189b.isEmpty()) {
            if (Config.isDebuggable()) {
                BLog.d("nov_test", "RadarMainEventManager-report skip empty queue");
                return;
            }
            return;
        }
        bVar.f74190c.addAll(bVar.f74189b);
        ((LinkedBlockingDeque) bVar.f74189b).clear();
        while (bVar.f74190c.size() > bVar.f74188a) {
            RadarReportEvent radarReportEventPoll = bVar.f74190c.poll();
            if (radarReportEventPoll != null) {
                radarReportEventPoll.dispatchTriggerResult(false);
            }
        }
        try {
            listEmptyList = CollectionsKt.toList(bVar.f74190c);
        } catch (Exception e7) {
            String strA = C4496a.a("RadarEventQueue-takeAll-error -> ", e7.getLocalizedMessage());
            if (Config.isDebuggable()) {
                String str = strA;
                if (strA == null) {
                    str = "null";
                }
                BLog.d("nov_test", str);
            }
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        if (list == null || list.isEmpty()) {
            if (Config.isDebuggable()) {
                BLog.d("nov_test", "RadarMainEventManager-report skip empty list");
                return;
            }
            return;
        }
        RadarReportEvent radarReportEvent = (RadarReportEvent) CollectionsKt.lastOrNull(listEmptyList);
        boolean z6 = radarReportEvent != null && radarReportEvent.isWeb() == 1;
        RadarReportEvent radarReportEvent2 = (RadarReportEvent) CollectionsKt.lastOrNull(listEmptyList);
        boolean z7 = false;
        if (radarReportEvent2 != null) {
            z7 = false;
            if (radarReportEvent2.getHomeEvent()) {
                z7 = true;
            }
        }
        RadarReportEvent radarReportEvent3 = (RadarReportEvent) CollectionsKt.lastOrNull(listEmptyList);
        String uuid = radarReportEvent3 != null ? radarReportEvent3.getUuid() : null;
        RadarReportWrapper radarReportWrapper = new RadarReportWrapper(this.h, listEmptyList);
        int size = listEmptyList.size();
        RadarReportEvent radarReportEvent4 = (RadarReportEvent) CollectionsKt.lastOrNull(listEmptyList);
        String eventName = radarReportEvent4 != null ? radarReportEvent4.getEventName() : null;
        StringBuilder sbA = z4.c.a(size, "RadarMainEventManager-report start size=", ", isWebFinal=", ", isHomeEvent=", z6);
        O4.a.d(", curUUID=", uuid, ", last=", sbA, z7);
        sbA.append(eventName);
        String string = sbA.toString();
        if (Config.isDebuggable()) {
            if (string == null) {
                string = "null";
            }
            BLog.d("nov_test", string);
        }
        this.f74179i = BuildersKt.launch$default(m.a(null, 1, null, Dispatchers.getIO()), (CoroutineContext) null, (CoroutineStart) null, new RadarMainEventManager$report$1(this, z7, uuid, z6, radarReportWrapper, listEmptyList, null), 3, (Object) null);
    }

    @Override // cn0.b
    public final void destroy() {
        Job job = this.f74179i;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        try {
            b bVar = this.f74175d;
            ((LinkedBlockingDeque) bVar.f74189b).clear();
            bVar.f74190c.clear();
            this.f74178g.unbindService(this.f74177f);
        } catch (Exception e7) {
        }
    }

    @Override // cn0.b
    public final void emit(@NotNull RadarReportEvent radarReportEvent) {
        String eventName = radarReportEvent.getEventName();
        String uuid = radarReportEvent.getUuid();
        boolean z6 = this.f74180j.get();
        StringBuilder sbA = G0.b.a("RadarMainEventManager-emit enqueue event=", eventName, ", uuid=", uuid, ", isFinished=");
        sbA.append(z6);
        String string = sbA.toString();
        if (Config.isDebuggable()) {
            String str = string;
            if (string == null) {
                str = "null";
            }
            BLog.d("nov_test", str);
        }
        try {
            HandlerThreads.post(1, new N(1, this, radarReportEvent));
        } catch (Exception e7) {
        }
    }
}
