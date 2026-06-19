package com.bilibili.opd.app.bizcommon.radar.core;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import androidx.fragment.app.z;
import com.bilibili.api.base.Config;
import com.bilibili.opd.app.bizcommon.context.utils.LifeCycleChecker;
import com.bilibili.opd.app.bizcommon.radar.data.RadarReportEvent;
import dn0.AbstractC6826a;
import java.lang.ref.WeakReference;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/core/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Set<String> f74197a = SetsKt.setOf(new String[]{"itemsDetailCouponFloating", "ma_coupon_bubble"});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f74198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static WeakReference<cn0.c> f74199c;

    @JvmStatic
    @JvmOverloads
    @Nullable
    public static final cn0.c a(@Nullable Activity activity, @Nullable String str) {
        String str2;
        str2 = "null";
        if (str != null && !f74197a.contains(str)) {
            String strConcat = "RadarPageContext-currentPage skip unsupported messageType=".concat(str);
            if (!Config.isDebuggable()) {
                return null;
            }
            if (strConcat == null) {
                strConcat = str2;
            }
            BLog.d("nov_test", strConcat);
            return null;
        }
        if (activity == null || LifeCycleChecker.isHostActivityDie(activity)) {
            String strA = C4496a.a("RadarPageContext-currentPage skip invalid activity=", activity != null ? activity.getClass().getSimpleName() : null);
            if (!Config.isDebuggable()) {
                return null;
            }
            BLog.d("nov_test", strA != null ? strA : "null");
            return null;
        }
        if (f74198b != System.identityHashCode(activity)) {
            String strA2 = com.bilibili.bilibililive.streaming.pandora.core.screen.a.a(System.identityHashCode(activity), ", messageType=", str, androidx.constraintlayout.widget.e.a(f74198b, "RadarPageContext-currentPage skip activity mismatch, top=", activity.getClass().getSimpleName(), ", ownerHash=", ", currentHash="));
            if (!Config.isDebuggable()) {
                return null;
            }
            if (strA2 == null) {
                strA2 = str2;
            }
            BLog.d("nov_test", strA2);
            return null;
        }
        WeakReference<cn0.c> weakReference = f74199c;
        cn0.c cVar = weakReference != null ? weakReference.get() : null;
        String simpleName = cVar != null ? cVar.getClass().getSimpleName() : null;
        String uuid = null;
        if (cVar != null) {
            RadarReportEvent event = cVar.getEvent();
            uuid = null;
            if (event != null) {
                uuid = event.getUuid();
            }
        }
        StringBuilder sbA = G0.b.a("RadarPageContext-currentPage hit page=", simpleName, ", uuid=", uuid, ", messageType=");
        sbA.append(str);
        String string = sbA.toString();
        if (Config.isDebuggable()) {
            if (string == null) {
                string = str2;
            }
            BLog.d("nov_test", string);
        }
        return cVar;
    }

    @JvmStatic
    public static final void b(@Nullable cn0.c cVar) {
        Object obj;
        Unit unit;
        RadarReportEvent event;
        WeakReference<cn0.c> weakReference = f74199c;
        if ((weakReference != null ? weakReference.get() : null) != cVar) {
            return;
        }
        a aVar = a.f74183a;
        String uuid = (cVar == null || (event = cVar.getEvent()) == null) ? null : event.getUuid();
        synchronized (aVar) {
            if (uuid != null) {
                if (uuid.length() != 0) {
                    if (Intrinsics.areEqual(a.f74184b, uuid)) {
                        WeakReference<AbstractC6826a> weakReference2 = a.f74185c;
                        AbstractC6826a abstractC6826a = weakReference2 != null ? weakReference2.get() : null;
                        String str = "RadarActiveTriggerRegistry-dismiss uuid=" + uuid + ", trigger=" + (abstractC6826a != null ? abstractC6826a.getClass().getSimpleName() : null);
                        if (Config.isDebuggable()) {
                            String str2 = str;
                            if (str == null) {
                                str2 = "null";
                            }
                            BLog.d("nov_test", str2);
                        }
                        a.f74184b = null;
                        a.f74185c = null;
                        a.f74186d = null;
                        a.f74187e = false;
                        try {
                            Result.Companion companion = Result.Companion;
                            if (abstractC6826a != null) {
                                abstractC6826a.b(null);
                                unit = Unit.INSTANCE;
                            } else {
                                unit = null;
                            }
                            obj = Result.constructor-impl(unit);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            obj = Result.constructor-impl(ResultKt.createFailure(th));
                        }
                        Throwable th2 = Result.exceptionOrNull-impl(obj);
                        if (th2 != null) {
                            String str3 = "RadarActiveTriggerRegistry-dismiss trigger error=" + th2;
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
                        String str5 = "RadarActiveTriggerRegistry-dismiss skip uuid=" + uuid + ", current=" + a.f74184b;
                        if (Config.isDebuggable()) {
                            String str6 = str5;
                            if (str5 == null) {
                                str6 = "null";
                            }
                            BLog.d("nov_test", str6);
                        }
                    }
                }
            }
        }
        f74198b = 0;
        f74199c = null;
        String simpleName = cVar != null ? cVar.getClass().getSimpleName() : null;
        String uuid2 = null;
        if (cVar != null) {
            RadarReportEvent event2 = cVar.getEvent();
            uuid2 = null;
            if (event2 != null) {
                uuid2 = event2.getUuid();
            }
        }
        String strA = z.a("RadarPageContext-unregister page=", simpleName, ", uuid=", uuid2);
        if (Config.isDebuggable()) {
            String str7 = strA;
            if (strA == null) {
                str7 = "null";
            }
            BLog.d("nov_test", str7);
        }
    }
}
