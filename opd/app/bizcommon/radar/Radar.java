package com.bilibili.opd.app.bizcommon.radar;

import android.app.Activity;
import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import androidx.fragment.app.D;
import cn0.d;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.ad.adview.story.c;
import com.bilibili.api.base.Config;
import com.bilibili.base.BiliContext;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.droid.ProcessUtils;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blkv.RawKV;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.opd.app.bizcommon.context.AppLifecycleExtension;
import com.bilibili.opd.app.bizcommon.context.session.MallSessionHelper;
import com.bilibili.opd.app.bizcommon.radar.core.RadarMainEventManager;
import com.bilibili.opd.app.bizcommon.radar.core.j;
import com.bilibili.opd.app.bizcommon.radar.data.RadarReportEvent;
import dn0.AbstractC6826a;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import on0.AbstractC8241i;
import on0.C8244l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/Radar.class */
@StabilityInferred(parameters = 0)
public final class Radar {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f74163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static volatile Radar f74164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public static RadarReportEvent f74165e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final cn0.b f74166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public AtomicBoolean f74167b;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/Radar$Companion.class */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.bilibili.opd.app.bizcommon.radar.data.RadarConfig b() {
            /*
                com.bilibili.lib.blrouter.BLRouter r0 = com.bilibili.lib.blrouter.BLRouter.INSTANCE
                java.lang.Class<cn0.d> r1 = cn0.d.class
                r2 = 0
                r3 = 1
                r4 = 0
                java.lang.Object r0 = com.bilibili.ad.adview.story.c.a(r0, r1, r2, r3, r4)
                cn0.d r0 = (cn0.d) r0
                r15 = r0
                r0 = r15
                if (r0 == 0) goto L20
                r0 = r15
                com.bilibili.opd.app.bizcommon.radar.data.RadarConfig r0 = r0.config()
                r16 = r0
                r0 = r16
                r15 = r0
                r0 = r16
                if (r0 != 0) goto L34
            L20:
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
                r15 = r0
            L34:
                r0 = r15
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.radar.Radar.Companion.b():com.bilibili.opd.app.bizcommon.radar.data.RadarConfig");
        }

        public static /* synthetic */ void delegateEmit$default(Companion companion, String str, String str2, Activity activity, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                str2 = null;
            }
            companion.delegateEmit(str, str2, activity);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void delegateEmit$default(Companion companion, String str, Map map, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                map = null;
            }
            companion.delegateEmit(str, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void emitHomeEvent$default(Companion companion, String str, String str2, String str3, HashMap map, Function1 function1, Function1 function12, int i7, Object obj) {
            if ((i7 & 8) != 0) {
                map = null;
            }
            if ((i7 & 16) != 0) {
                function1 = null;
            }
            if ((i7 & 32) != 0) {
                function12 = null;
            }
            companion.emitHomeEvent(str, str2, str3, map, function1, function12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void emitHomeNoGuideEvent$default(Companion companion, String str, String str2, Function1 function1, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                function1 = null;
            }
            companion.emitHomeNoGuideEvent(str, str2, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void emitHomeNoGuideEventWithResult$default(Companion companion, String str, String str2, Function1 function1, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                function1 = null;
            }
            companion.emitHomeNoGuideEventWithResult(str, str2, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void emitPvEndEvent$default(Companion companion, String str, Map map, boolean z6, long j7, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                map = null;
            }
            if ((i7 & 4) != 0) {
                z6 = false;
            }
            companion.emitPvEndEvent(str, map, z6, j7);
        }

        @JvmStatic
        public static /* synthetic */ void getEnable$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void isVisitedHomePage$annotations() {
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(java.lang.String r18, com.alibaba.fastjson.JSONObject r19, android.app.Activity r20) {
            /*
                Method dump skipped, instruction units count: 654
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.radar.Radar.Companion.a(java.lang.String, com.alibaba.fastjson.JSONObject, android.app.Activity):void");
        }

        @JvmStatic
        public final void delegateEmit(@Nullable String str, @Nullable String str2, @Nullable Activity activity) {
            String strA = C4496a.a("delegateEmit-eventId:", str);
            if (Config.isDebuggable()) {
                String str3 = strA;
                if (strA == null) {
                    str3 = "null";
                }
                BLog.d("nov_test", str3);
            }
            try {
                JSONObject object = JSON.parseObject(str2);
                String str4 = str;
                if (str == null) {
                    str4 = "";
                }
                a(str4, object, activity);
            } catch (Exception e7) {
            }
        }

        @JvmStatic
        public final void delegateEmit(@Nullable String str, @Nullable Map<String, String> map) {
            String strA = C4496a.a("delegateEmit-eventId:", str);
            if (Config.isDebuggable()) {
                String str2 = strA;
                if (strA == null) {
                    str2 = "null";
                }
                BLog.d("nov_test", str2);
            }
            JSONObject jSONObject = map == null ? new JSONObject() : new JSONObject(map);
            String str3 = str;
            if (str == null) {
                str3 = "";
            }
            a(str3, jSONObject, null);
        }

        @JvmStatic
        public final void dismissHomeSnarkBar() {
            Object obj;
            AtomicBoolean atomicBooleanIsInTrigger;
            if (getEnable()) {
                AbstractC8241i abstractC8241i = C8244l.h.a().f124816d;
                if (abstractC8241i != null) {
                    abstractC8241i.a();
                }
                synchronized (com.bilibili.opd.app.bizcommon.radar.core.a.f74183a) {
                    if (com.bilibili.opd.app.bizcommon.radar.core.a.f74187e) {
                        WeakReference<AbstractC6826a> weakReference = com.bilibili.opd.app.bizcommon.radar.core.a.f74185c;
                        AbstractC6826a abstractC6826a = weakReference != null ? weakReference.get() : null;
                        String str = "RadarActiveTriggerRegistry-dismissHome uuid=" + com.bilibili.opd.app.bizcommon.radar.core.a.f74184b + ", messageType=" + com.bilibili.opd.app.bizcommon.radar.core.a.f74186d + ", trigger=" + (abstractC6826a != null ? abstractC6826a.getClass().getSimpleName() : null);
                        if (Config.isDebuggable()) {
                            String str2 = str;
                            if (str == null) {
                                str2 = "null";
                            }
                            BLog.d("nov_test", str2);
                        }
                        com.bilibili.opd.app.bizcommon.radar.core.a.f74184b = null;
                        com.bilibili.opd.app.bizcommon.radar.core.a.f74185c = null;
                        com.bilibili.opd.app.bizcommon.radar.core.a.f74186d = null;
                        com.bilibili.opd.app.bizcommon.radar.core.a.f74187e = false;
                        try {
                            Result.Companion companion = Result.Companion;
                            Unit unit = null;
                            if (abstractC6826a != null) {
                                abstractC6826a.b(null);
                                unit = Unit.INSTANCE;
                            }
                            obj = Result.constructor-impl(unit);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            obj = Result.constructor-impl(ResultKt.createFailure(th));
                        }
                        Throwable th2 = Result.exceptionOrNull-impl(obj);
                        if (th2 != null) {
                            String str3 = "RadarActiveTriggerRegistry-dismissHome trigger error=" + th2;
                            if (Config.isDebuggable()) {
                                String str4 = str3;
                                if (str3 == null) {
                                    str4 = "null";
                                }
                                BLog.d("nov_test", str4);
                            }
                        }
                        if (abstractC6826a != null) {
                            abstractC6826a.e(false);
                        }
                    } else {
                        String str5 = "RadarActiveTriggerRegistry-dismissHome skip messageType=" + com.bilibili.opd.app.bizcommon.radar.core.a.f74186d;
                        if (Config.isDebuggable()) {
                            String str6 = str5;
                            if (str5 == null) {
                                str6 = "null";
                            }
                            BLog.d("nov_test", str6);
                        }
                    }
                }
                Radar radar = Radar.f74164d;
                if (radar == null || (atomicBooleanIsInTrigger = radar.isInTrigger()) == null) {
                    return;
                }
                atomicBooleanIsInTrigger.compareAndSet(true, false);
            }
        }

        @JvmStatic
        @JvmOverloads
        public final void emitHomeEvent(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            emitHomeEvent$default(this, str, str2, str3, null, null, null, 56, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void emitHomeEvent(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable HashMap<String, Object> map) {
            emitHomeEvent$default(this, str, str2, str3, map, null, null, 48, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void emitHomeEvent(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable HashMap<String, Object> map, @Nullable Function1<? super Boolean, Unit> function1) {
            emitHomeEvent$default(this, str, str2, str3, map, function1, null, 32, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void emitHomeEvent(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable HashMap<String, Object> map, @Nullable Function1<? super Boolean, Unit> function1, @Nullable Function1<? super Integer, Unit> function12) {
            b.f("emitHomeEvent-eventId:" + str + "; ext=" + map);
            if (!getEnable()) {
                if (function1 != null) {
                    function1.invoke(Boolean.FALSE);
                }
                if (function12 != null) {
                    function12.invoke(0);
                    return;
                }
                return;
            }
            boolean z6 = map == null;
            if (z6) {
                setVisitedHomePage(true);
                a aVarA = a.f74168b.a();
                Application application = BiliContext.application();
                String strValueOf = "";
                if (application != null) {
                    long jMid = BiliAccounts.get(application).mid();
                    strValueOf = jMid == 0 ? "" : String.valueOf(jMid);
                    if (strValueOf == null) {
                        strValueOf = "";
                    }
                }
                aVarA.f74170a.putLong("visitedHomeToday".concat(strValueOf), System.currentTimeMillis());
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(GameCardButton.extraParamSource, str2);
            jSONObject.put("pageUrl", str3);
            d dVar = (d) c.a(BLRouter.INSTANCE, d.class, (String) null, 1, (Object) null);
            jSONObject.put("pageFromMall", dVar != null ? Boolean.valueOf(dVar.d()) : null);
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            }
            RadarReportEvent radarReportEvent = new RadarReportEvent(str, String.valueOf(System.currentTimeMillis()), UUID.randomUUID().toString(), jSONObject, true, 0, null, null, null, true, null, null, 3520, null);
            radarReportEvent.setTriggerResultCallback(function1);
            radarReportEvent.setTriggerResultCodeCallback(function12);
            if (z6) {
                Radar.f74165e = radarReportEvent;
            }
            instance().emit(radarReportEvent);
        }

        @JvmStatic
        @JvmOverloads
        public final void emitHomeNoGuideEvent(@Nullable String str, @Nullable String str2) {
            emitHomeNoGuideEvent$default(this, str, str2, null, 4, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void emitHomeNoGuideEvent(@Nullable String str, @Nullable String str2, @Nullable Function1<? super Boolean, Unit> function1) {
            emitHomeEvent$default(this, "mall.home.0.origin-dismiss.pv", str, str2, null, function1, null, 40, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void emitHomeNoGuideEventWithResult(@Nullable String str, @Nullable String str2) {
            emitHomeNoGuideEventWithResult$default(this, str, str2, null, 4, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void emitHomeNoGuideEventWithResult(@Nullable String str, @Nullable String str2, @Nullable Function1<? super Integer, Unit> function1) {
            emitHomeEvent$default(this, "mall.home.0.origin-dismiss.pv", str, str2, null, null, function1, 24, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[Catch: Exception -> 0x023e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x023e, blocks: (B:8:0x002b, B:13:0x0037, B:16:0x0041, B:19:0x0055, B:23:0x0067, B:48:0x0102, B:50:0x0112, B:56:0x017d, B:59:0x0188, B:62:0x019e, B:64:0x01a8, B:65:0x01ae, B:65:0x01ae, B:66:0x01b1, B:70:0x01dd, B:72:0x0234, B:60:0x0193, B:26:0x0079, B:28:0x0086, B:32:0x009e, B:37:0x00b4, B:38:0x00bd, B:38:0x00bd, B:39:0x00c0, B:44:0x00f6), top: B:76:0x002b }] */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void emitPvEndEvent(@org.jetbrains.annotations.Nullable java.lang.String r17, @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r18, boolean r19, long r20) {
            /*
                Method dump skipped, instruction units count: 578
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.radar.Radar.Companion.emitPvEndEvent(java.lang.String, java.util.Map, boolean, long):void");
        }

        public final boolean getEnable() {
            d dVar = (d) c.a(BLRouter.INSTANCE, d.class, (String) null, 1, (Object) null);
            return dVar != null ? dVar.enable() : false;
        }

        @JvmStatic
        @NotNull
        public final AppLifecycleExtension.AppLifecycleListener getLifecycleListener() {
            return C8244l.h.a().f124819g;
        }

        @JvmStatic
        @NotNull
        public final Radar instance() {
            Radar radar = Radar.f74164d;
            Radar radar2 = radar;
            if (radar == null) {
                synchronized (this) {
                    Radar radar3 = Radar.f74164d;
                    radar2 = radar3;
                    if (radar3 == null) {
                        radar2 = new Radar(null);
                        Radar.f74164d = radar2;
                    }
                }
            }
            return radar2;
        }

        public final boolean isVisitedHomePage() {
            return Radar.f74163c;
        }

        public final void setVisitedHomePage(boolean z6) {
            Radar.f74163c = z6;
        }
    }

    public Radar() {
        this.f74167b = new AtomicBoolean(false);
        cn0.b radarMainEventManager = ProcessUtils.isMainProcess() ? new RadarMainEventManager() : ProcessUtils.isWebProcess() ? new j() : null;
        this.f74166a = radarMainEventManager;
        if (!Companion.getEnable() || radarMainEventManager == null) {
            return;
        }
        radarMainEventManager.a();
    }

    public /* synthetic */ Radar(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final void delegateEmit(@Nullable String str, @Nullable String str2, @Nullable Activity activity) {
        Companion.delegateEmit(str, str2, activity);
    }

    @JvmStatic
    public static final void delegateEmit(@Nullable String str, @Nullable Map<String, String> map) {
        Companion.delegateEmit(str, map);
    }

    @JvmStatic
    public static final void dismissHomeSnarkBar() {
        Companion.dismissHomeSnarkBar();
    }

    @JvmStatic
    @JvmOverloads
    public static final void emitHomeEvent(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        Companion.emitHomeEvent(str, str2, str3);
    }

    @JvmStatic
    @JvmOverloads
    public static final void emitHomeEvent(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable HashMap<String, Object> map) {
        Companion.emitHomeEvent(str, str2, str3, map);
    }

    @JvmStatic
    @JvmOverloads
    public static final void emitHomeEvent(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable HashMap<String, Object> map, @Nullable Function1<? super Boolean, Unit> function1) {
        Companion.emitHomeEvent(str, str2, str3, map, function1);
    }

    @JvmStatic
    @JvmOverloads
    public static final void emitHomeEvent(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable HashMap<String, Object> map, @Nullable Function1<? super Boolean, Unit> function1, @Nullable Function1<? super Integer, Unit> function12) {
        Companion.emitHomeEvent(str, str2, str3, map, function1, function12);
    }

    @JvmStatic
    @JvmOverloads
    public static final void emitHomeNoGuideEvent(@Nullable String str, @Nullable String str2) {
        Companion.emitHomeNoGuideEvent(str, str2);
    }

    @JvmStatic
    @JvmOverloads
    public static final void emitHomeNoGuideEvent(@Nullable String str, @Nullable String str2, @Nullable Function1<? super Boolean, Unit> function1) {
        Companion.emitHomeNoGuideEvent(str, str2, function1);
    }

    @JvmStatic
    @JvmOverloads
    public static final void emitHomeNoGuideEventWithResult(@Nullable String str, @Nullable String str2) {
        Companion.emitHomeNoGuideEventWithResult(str, str2);
    }

    @JvmStatic
    @JvmOverloads
    public static final void emitHomeNoGuideEventWithResult(@Nullable String str, @Nullable String str2, @Nullable Function1<? super Integer, Unit> function1) {
        Companion.emitHomeNoGuideEventWithResult(str, str2, function1);
    }

    @JvmStatic
    public static final void emitPvEndEvent(@Nullable String str, @Nullable Map<String, ? extends Object> map, boolean z6, long j7) {
        Companion.emitPvEndEvent(str, map, z6, j7);
    }

    public static final boolean getEnable() {
        return Companion.getEnable();
    }

    @JvmStatic
    @NotNull
    public static final AppLifecycleExtension.AppLifecycleListener getLifecycleListener() {
        return Companion.getLifecycleListener();
    }

    @JvmStatic
    @NotNull
    public static final Radar instance() {
        return Companion.instance();
    }

    public static final boolean isVisitedHomePage() {
        return Companion.isVisitedHomePage();
    }

    public static final void setVisitedHomePage(boolean z6) {
        Companion.setVisitedHomePage(z6);
    }

    public final void bindService() {
        cn0.b bVar = this.f74166a;
        if ((bVar == null || !bVar.b()) && Companion.getEnable() && bVar != null) {
            bVar.a();
        }
    }

    public final void emit(@Nullable RadarReportEvent radarReportEvent) {
        String strA = C4496a.a("Radar-emit-", radarReportEvent != null ? radarReportEvent.getEventName() : null);
        if (Config.isDebuggable()) {
            String str = strA;
            if (strA == null) {
                str = "null";
            }
            BLog.d("nov_test", str);
        }
        if (radarReportEvent != null) {
            radarReportEvent.setVisitedHomePage(f74163c);
        }
        boolean enable = Companion.getEnable();
        cn0.b bVar = this.f74166a;
        if (!enable) {
            String eventName = null;
            if (radarReportEvent != null) {
                eventName = radarReportEvent.getEventName();
            }
            String strA2 = C4496a.a("Radar-emit skip disabled event=", eventName);
            if (Config.isDebuggable()) {
                if (strA2 == null) {
                    strA2 = "null";
                }
                BLog.d("nov_test", strA2);
            }
            if (radarReportEvent != null) {
                radarReportEvent.dispatchTriggerResult(false);
            }
            if (bVar != null) {
                bVar.destroy();
                return;
            }
            return;
        }
        if (radarReportEvent != null) {
            String eventName2 = radarReportEvent.getEventName();
            if (eventName2 == null || eventName2.length() == 0) {
                radarReportEvent.dispatchTriggerResult(false);
                return;
            }
            JSONObject jSONObject = radarReportEvent.getExtra() == null ? new JSONObject() : new JSONObject(radarReportEvent.getExtra());
            MallSessionHelper mallSessionHelper = MallSessionHelper.INSTANCE;
            String sessionId = mallSessionHelper.getMallSession().getSessionId();
            String sessionCreateTime = mallSessionHelper.getMallSession().getSessionCreateTime();
            String str2 = sessionId;
            if (sessionId == null) {
                str2 = "";
            }
            jSONObject.put("mallSessionId", str2);
            String str3 = sessionCreateTime;
            if (sessionCreateTime == null) {
                str3 = "";
            }
            jSONObject.put("mallSessionCreateTime", str3);
            radarReportEvent.setExtra(jSONObject);
            JSONObject extra = radarReportEvent.getExtra();
            if (extra != null && extra.get("pageFromMall") == null) {
                extra.put("pageFromMall", (Object) b.f74171a);
            }
            JSONObject extra2 = radarReportEvent.getExtra();
            if (extra2 != null) {
                a aVarA = a.f74168b.a();
                Application application = BiliContext.application();
                String strValueOf = "";
                if (application != null) {
                    long jMid = BiliAccounts.get(application).mid();
                    strValueOf = jMid == 0 ? "" : String.valueOf(jMid);
                    if (strValueOf == null) {
                        strValueOf = "";
                    }
                }
                long long$default = RawKV.getLong$default(aVarA.f74170a, "visitedHomeToday".concat(strValueOf), 0L, 2, (Object) null);
                long jCurrentTimeMillis = System.currentTimeMillis();
                Date date = new Date(long$default);
                Date date2 = new Date(jCurrentTimeMillis);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd", Locale.getDefault());
                extra2.put("visitedHomePageToday", (Object) Boolean.valueOf(Intrinsics.areEqual(simpleDateFormat.format(date), simpleDateFormat.format(date2))));
            }
            String eventName3 = radarReportEvent.getEventName();
            String strCurrentProcessName = BiliContext.currentProcessName();
            String simpleName = null;
            if (bVar != null) {
                simpleName = bVar.getClass().getSimpleName();
            }
            String strA3 = D.a(simpleName, ", uuid=", radarReportEvent.getUuid(), G0.b.a("Radar-emit dispatch event=", eventName3, ", process=", strCurrentProcessName, ", manager="));
            if (Config.isDebuggable()) {
                if (strA3 == null) {
                    strA3 = "null";
                }
                BLog.d("nov_test", strA3);
            }
            if (bVar != null) {
                bVar.emit(radarReportEvent);
            }
        }
    }

    @NotNull
    public final AtomicBoolean isInTrigger() {
        return this.f74167b;
    }

    public final void setInTrigger(@NotNull AtomicBoolean atomicBoolean) {
        this.f74167b = atomicBoolean;
    }
}
