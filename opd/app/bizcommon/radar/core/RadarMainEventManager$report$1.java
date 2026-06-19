package com.bilibili.opd.app.bizcommon.radar.core;

import Di0.C1600d;
import com.bilibili.api.base.Config;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.opd.app.bizcommon.radar.data.RadarReportEvent;
import com.bilibili.opd.app.bizcommon.radar.data.RadarReportWrapper;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/core/RadarMainEventManager$report$1.class */
public final class RadarMainEventManager$report$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $curUUID;
    final boolean $isHomeEvent;
    final boolean $isWebFinal;
    final List<RadarReportEvent> $list;
    final RadarReportWrapper $reportData;
    Object L$0;
    Object L$1;
    int label;
    final RadarMainEventManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarMainEventManager$report$1(RadarMainEventManager radarMainEventManager, boolean z6, String str, boolean z7, RadarReportWrapper radarReportWrapper, List<RadarReportEvent> list, Continuation<? super RadarMainEventManager$report$1> continuation) {
        super(2, continuation);
        this.this$0 = radarMainEventManager;
        this.$isHomeEvent = z6;
        this.$curUUID = str;
        this.$isWebFinal = z7;
        this.$reportData = radarReportWrapper;
        this.$list = list;
    }

    private static final void invokeSuspend$dispatchResult(Ref.BooleanRef booleanRef, List<RadarReportEvent> list, Ref.BooleanRef booleanRef2, RadarMainEventManager radarMainEventManager, boolean z6) {
        invokeSuspend$dispatchResultCode(booleanRef, list, booleanRef2, radarMainEventManager, z6 ? 1 : 0);
    }

    private static final void invokeSuspend$dispatchResultCode(Ref.BooleanRef booleanRef, List<RadarReportEvent> list, Ref.BooleanRef booleanRef2, RadarMainEventManager radarMainEventManager, int i7) {
        if (booleanRef.element) {
            return;
        }
        booleanRef.element = true;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((RadarReportEvent) it.next()).dispatchTriggerResultCode(i7);
        }
        invokeSuspend$finishReport(booleanRef2, radarMainEventManager);
    }

    private static final void invokeSuspend$finishReport(Ref.BooleanRef booleanRef, final RadarMainEventManager radarMainEventManager) {
        if (booleanRef.element) {
            return;
        }
        booleanRef.element = true;
        radarMainEventManager.f74180j.set(true);
        HandlerThreads.post(1, new Runnable(radarMainEventManager) { // from class: com.bilibili.opd.app.bizcommon.radar.core.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RadarMainEventManager f74191a;

            {
                this.f74191a = radarMainEventManager;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f74191a.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(RadarTriggerEvent radarTriggerEvent, Ref.BooleanRef booleanRef, List list, Ref.BooleanRef booleanRef2, RadarMainEventManager radarMainEventManager, boolean z6) {
        String messageType = radarTriggerEvent.getMessageType();
        RadarTriggerContent messageContent = radarTriggerEvent.getMessageContent();
        String id = messageContent != null ? messageContent.getId() : null;
        StringBuilder sbB = C1600d.b("RadarMainEventManager-report trigger callback shown=", " type=", messageType, ", id=", z6);
        sbB.append(id);
        String string = sbB.toString();
        if (Config.isDebuggable()) {
            String str = string;
            if (string == null) {
                str = "null";
            }
            BLog.d("nov_test", str);
        }
        invokeSuspend$dispatchResult(booleanRef, list, booleanRef2, radarMainEventManager, z6);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RadarMainEventManager$report$1(this.this$0, this.$isHomeEvent, this.$curUUID, this.$isWebFinal, this.$reportData, this.$list, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc A[Catch: Exception -> 0x010e, TRY_ENTER, TryCatch #3 {Exception -> 0x010e, blocks: (B:24:0x00b0, B:26:0x00bc, B:32:0x00f4, B:34:0x00fc, B:38:0x0113, B:40:0x011a, B:42:0x0128, B:44:0x0135, B:46:0x0141, B:50:0x0153, B:52:0x015b, B:54:0x0167, B:56:0x017d, B:61:0x018f, B:65:0x01a6, B:68:0x01b7, B:70:0x01c1, B:72:0x01ce, B:74:0x01ff, B:76:0x0210, B:79:0x0223, B:82:0x0264, B:84:0x026a, B:86:0x0279, B:88:0x028a, B:91:0x029d, B:94:0x02df, B:96:0x02e9, B:98:0x0329, B:100:0x0333, B:102:0x0346, B:104:0x0353, B:105:0x039e, B:107:0x03b1, B:109:0x03be, B:111:0x042f, B:113:0x043c, B:115:0x047e), top: B:147:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113 A[Catch: Exception -> 0x010e, TRY_ENTER, TryCatch #3 {Exception -> 0x010e, blocks: (B:24:0x00b0, B:26:0x00bc, B:32:0x00f4, B:34:0x00fc, B:38:0x0113, B:40:0x011a, B:42:0x0128, B:44:0x0135, B:46:0x0141, B:50:0x0153, B:52:0x015b, B:54:0x0167, B:56:0x017d, B:61:0x018f, B:65:0x01a6, B:68:0x01b7, B:70:0x01c1, B:72:0x01ce, B:74:0x01ff, B:76:0x0210, B:79:0x0223, B:82:0x0264, B:84:0x026a, B:86:0x0279, B:88:0x028a, B:91:0x029d, B:94:0x02df, B:96:0x02e9, B:98:0x0329, B:100:0x0333, B:102:0x0346, B:104:0x0353, B:105:0x039e, B:107:0x03b1, B:109:0x03be, B:111:0x042f, B:113:0x043c, B:115:0x047e), top: B:147:0x00b0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 1319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.radar.core.RadarMainEventManager$report$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
