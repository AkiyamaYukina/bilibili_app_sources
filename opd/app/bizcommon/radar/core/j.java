package com.bilibili.opd.app.bizcommon.radar.core;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.z;
import com.bilibili.api.base.Config;
import com.bilibili.base.BiliContext;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.opd.app.bizcommon.radar.IRadarInterface;
import com.bilibili.opd.app.bizcommon.radar.data.RadarReportEvent;
import com.bilibili.opd.app.bizcommon.radar.service.RadarMainProcessService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/core/j.class */
@StabilityInferred(parameters = 0)
public final class j implements cn0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f74211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final gn0.a f74212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f74213c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/core/j$a.class */
    public static final class a extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f74214a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, Handler handler) {
            super(handler);
            this.f74214a = jVar;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z6, Uri uri) {
            if (Intrinsics.areEqual(uri != null ? uri.getQueryParameter(MallProviderParamsHelper.ActiveProviderParams.MALL_MODULE_ACTIVE) : null, "true")) {
                return;
            }
            this.f74214a.f74213c = System.identityHashCode(BiliContext.topActivitiy());
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [gn0.a, java.lang.Object] */
    public j() {
        Application application = BiliContext.application();
        this.f74211a = application;
        this.f74212b = new Object();
        ContentResolver contentResolver = application.getContentResolver();
        if (contentResolver != null) {
            contentResolver.registerContentObserver(MallProviderParamsHelper.ActiveProviderParams.Companion.getBaseUriBuilder().build(), true, new a(this, new Handler(Looper.getMainLooper())));
        }
    }

    @Override // cn0.b
    public final boolean b() {
        return com.bilibili.opd.app.bizcommon.radar.b.e(this.f74211a, RadarMainProcessService.class.getName());
    }

    @Override // cn0.b
    public final void bindService() {
        this.f74211a.bindService(new Intent(this.f74211a, (Class<?>) RadarMainProcessService.class), this.f74212b, 1);
    }

    @Override // cn0.b
    public final void destroy() {
        try {
            this.f74211a.unbindService(this.f74212b);
        } catch (Exception e7) {
        }
    }

    @Override // cn0.b
    public final void emit(@NotNull RadarReportEvent radarReportEvent) throws RemoteException {
        int i7 = this.f74213c;
        if (i7 != 0) {
            radarReportEvent.setSamePage(String.valueOf(i7 == System.identityHashCode(BiliContext.topActivitiy())));
        } else {
            radarReportEvent.setSamePage(null);
        }
        de.a.b("[web-radar-emmit-extra] isSamePage -> ", radarReportEvent.isSamePage());
        gn0.a aVar = this.f74212b;
        aVar.f120487b = null;
        String eventName = radarReportEvent.getEventName();
        String uuid = radarReportEvent.getUuid();
        boolean z6 = aVar.f120486a != null;
        StringBuilder sbA = G0.b.a("RadarServiceConnection-emmit event=", eventName, ", uuid=", uuid, ", aidlReady=");
        sbA.append(z6);
        String string = sbA.toString();
        if (Config.isDebuggable()) {
            String str = string;
            if (string == null) {
                str = "null";
            }
            BLog.d("nov_test", str);
        }
        IRadarInterface iRadarInterface = aVar.f120486a;
        if (iRadarInterface != null) {
            iRadarInterface.emit(radarReportEvent);
        } else {
            String strA = z.a("RadarServiceConnection-emmit cache event=", radarReportEvent.getEventName(), ", uuid=", radarReportEvent.getUuid());
            if (Config.isDebuggable()) {
                if (strA == null) {
                    strA = "null";
                }
                BLog.d("nov_test", strA);
            }
            aVar.f120487b = radarReportEvent;
        }
        this.f74213c = 0;
    }
}
