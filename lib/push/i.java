package com.bilibili.lib.push;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import androidx.core.app.NotificationManagerCompat;
import com.bilibili.droid.ProcessUtils;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/i.class */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f64252a = LazyKt.lazy(new I3.D(7));

    public static void a(Map map, Map map2, IPushParams iPushParams, Context context) {
        HashMap map3 = new HashMap();
        if (iPushParams != null) {
            iPushParams.collocateExtraReportParams(map3);
        }
        if (map2 != null) {
            map3.putAll(map2);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            BPushConfig bPushConfigC = C5334b.c();
            if (bPushConfigC != null) {
                jSONObject.put("app_channel", bPushConfigC.getApkChannel());
            }
            if (context != null) {
                jSONObject.put("switch_type", Ue0.g.a(context));
            }
            for (Map.Entry entry : map3.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (JSONException e7) {
        }
        ((HashMap) map).put(CaptureSchema.JUMP_PARAMS_EXTRA, jSONObject.toString());
    }

    public static HashMap b(Context context, int i7, int i8, String... strArr) {
        HashMap map = new HashMap(16);
        map.put("push_sdk", String.valueOf(i8));
        map.put("time_zone", String.valueOf((TimeZone.getDefault().getRawOffset() / 3600) / 1000));
        try {
            map.put("notify_switch", NotificationManagerCompat.from(context).areNotificationsEnabled() ? "1" : "0");
        } catch (Exception e7) {
            map.put("notify_switch", "1");
            e7.printStackTrace();
        }
        map.put("type", String.valueOf(i7));
        map.put("mobile_brand", Build.BRAND);
        map.put("mobile_model", Build.MODEL);
        map.put("mobile_version", Build.VERSION.RELEASE);
        if (strArr.length != 0 && strArr.length % 2 == 0) {
            for (int i9 = 0; i9 < strArr.length; i9 += 2) {
                String str = strArr[i9];
                String str2 = strArr[i9 + 1];
                if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                    map.put(str, str2);
                }
            }
        }
        return map;
    }

    public static void c(Context context, int i7, int i8, Map map, String... strArr) throws JSONException {
        String str;
        String strA;
        HashMap mapB = b(context, i7, i8, (String[]) Arrays.copyOf(strArr, strArr.length));
        a(mapB, map, C5334b.c().getPushParams(), context);
        StringBuilder sbB = N1.p.b(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 6 ? "default" : "refresh status change" : "register failed" : "login out" : "login in" : "register success", ", type: ");
        switch (i8) {
            case 2:
                str = "xiaomi";
                break;
            case 3:
                str = "huawei";
                break;
            case 4:
            default:
                str = "empty";
                break;
            case 5:
                str = "oppo";
                break;
            case 6:
                str = "jiguang";
                break;
            case 7:
                str = "fcm";
                break;
            case 8:
                str = "vivo";
                break;
            case 9:
                str = "honor";
                break;
        }
        sbB.append(str);
        for (Map.Entry entry : mapB.entrySet()) {
            androidx.room.B.a(", ", (String) entry.getKey(), ": ", (String) entry.getValue(), sbB);
        }
        BPushLog.e("BPushReportHelper", sbB.toString());
        try {
            Result.Companion companion = Result.Companion;
            if (SystemClock.elapsedRealtime() - Ue0.c.f24710a > 500) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str2 = i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 7 ? null : "hot_start" : "logout" : "login" : "cold_start";
                if (str2 != null) {
                    linkedHashMap.put("trigger_type", str2);
                }
                try {
                    linkedHashMap.put("notify_switch_status", NotificationManagerCompat.from(context).areNotificationsEnabled() ? "1" : "0");
                } catch (Exception e7) {
                    linkedHashMap.put("notify_switch_status", CaptureSchema.OLD_INVALID_ID_STRING);
                    e7.printStackTrace();
                }
                String str3 = (String) mapB.get("err_code");
                if (str3 != null) {
                    linkedHashMap.put("err_code", str3);
                }
                String str4 = (String) mapB.get("err_msg");
                if (str4 != null) {
                    linkedHashMap.put("err_message", str4);
                }
                String str5 = (String) mapB.get("device_token");
                if (str5 != null) {
                    linkedHashMap.put("token", str5);
                }
                JSONObject jSONObjectB = Ue0.k.b(Ue0.k.c(context));
                if (jSONObjectB != null) {
                    linkedHashMap.put("channel", jSONObjectB.toString());
                }
                String str6 = (String) mapB.get("push_sdk");
                if (str6 != null && (strA = Ue0.c.a(str6)) != null) {
                    linkedHashMap.put("push_platform", strA);
                }
                linkedHashMap.put("switch_type", Ue0.g.a(context));
                Ue0.c.f24710a = SystemClock.elapsedRealtime();
                BPushNeurons.INSTANCE.report(false, 4, "push.sdk.device-info.sys", linkedHashMap);
            }
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.createFailure(th));
        }
        HashMap map2 = new HashMap(16);
        map2.putAll(mapB);
        if (map != null) {
            map2.putAll(map);
        }
        map2.remove("mobile_brand");
        map2.remove("mobile_model");
        map2.remove("mobile_version");
        map2.remove(CaptureSchema.JUMP_PARAMS_EXTRA);
        if (ProcessUtils.isMainProcess()) {
            try {
                map2.put("notify_switch_status", NotificationManagerCompat.from(context).areNotificationsEnabled() ? "1" : "0");
            } catch (Exception e8) {
                map2.put("notify_switch_status", CaptureSchema.OLD_INVALID_ID_STRING);
                e8.printStackTrace();
            }
            BPushNeurons.INSTANCE.trackT(false, "infra.push.event.track", map2);
            Iterator it = map2.entrySet().iterator();
            String str7 = "";
            while (true) {
                String str8 = str7;
                if (it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    str7 = ((Object) str8) + " \n" + entry2.getKey() + " = " + entry2.getValue();
                } else {
                    BPushLog.d("BPushTrackT", "report event = " + i7 + ", params = " + ((Object) str8));
                }
            }
        } else {
            BPushLog.e("BPushTrackT", "not main process");
        }
        JSONObject jSONObjectA = Ue0.k.a(context);
        if (jSONObjectA != null) {
            mapB.put("channel", jSONObjectA.toString());
        }
        C5339g.a(context, mapB, true);
        ((j) f64252a.getValue()).reportPushToken(mapB).enqueue(null);
    }

    @JvmStatic
    public static final void d(@NotNull Context context, @NotNull EventInfo eventInfo) throws JSONException {
        String str = eventInfo.mPushToken;
        String[] strArr = (str == null || str.length() == 0) ? null : new String[]{"device_token", eventInfo.mPushToken};
        int i7 = eventInfo.mPushType;
        Map<String, String> map = eventInfo.mExtra;
        String[] strArr2 = strArr;
        if (strArr == null) {
            strArr2 = new String[0];
        }
        c(context, 6, i7, map, (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    @JvmStatic
    public static final void e(@NotNull Context context, int i7, @Nullable String str, @Nullable String str2, @Nullable Map<String, String> map) {
        if (str == null || str.length() == 0) {
            return;
        }
        HashMap mapA = pf.g.a(8, "task", str);
        mapA.put("push_sdk", String.valueOf(i7));
        String str3 = str2;
        if (str2 == null) {
            str3 = CaptureSchema.OLD_INVALID_ID_STRING;
        }
        mapA.put("token", str3);
        a(mapA, map, null, context);
        C5339g.a(context, mapA, false);
        ((j) f64252a.getValue()).reportPushClick(mapA).enqueue(null);
    }
}
