package com.bilibili.lib.push;

import Ue0.C2901b;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.bilibili.bplus.im.communication.h1;
import com.bilibili.droid.ProcessUtils;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import org.json.JSONException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushManagerService.class */
@Keep
public class BPushManagerService implements IPushManagerService {
    @Override // com.bilibili.lib.push.IPushManagerService
    public void createNotificationChannel(PushNotification pushNotification) {
        HandlerThreads.runOn(2, new h1(pushNotification.m6696clone(), 1));
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public void degradeToDefaultPush() {
        C5334b.b().a();
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public Context getContext() {
        return C5334b.b().f64240a;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003d  */
    @Override // com.bilibili.lib.push.IPushManagerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getDefaultChannelId() {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.push.BPushManagerService.getDefaultChannelId():java.lang.String");
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    @NonNull
    public BPushConfig getPushConfig() {
        return C5334b.c();
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public IPushRegistry getPushRegistry() {
        return C5334b.b().c();
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public void onPushTokenRegisterSuccess() {
        C5338f c5338fB = C5334b.b();
        D.b(c5338fB.f64240a, c5338fB.f64242c, D.c().getDefaultType(), true);
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public void reportEventLoginIn(@NonNull Context context, EventInfo eventInfo, Boolean bool) throws JSONException {
        Lazy lazy = i.f64252a;
        String str = eventInfo.mPushToken;
        if (str == null || str.length() == 0) {
            return;
        }
        i.c(context, 2, eventInfo.mPushType, eventInfo.mExtra, "device_token", eventInfo.mPushToken);
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public void reportEventLoginOut(@NonNull Context context, EventInfo eventInfo) throws JSONException {
        Lazy lazy = i.f64252a;
        String str = eventInfo.mPushToken;
        if (str == null || str.length() == 0) {
            return;
        }
        i.c(context, 3, eventInfo.mPushType, eventInfo.mExtra, "device_token", eventInfo.mPushToken);
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public void reportEventRegisterFailed(@NonNull Context context, EventInfo eventInfo) throws JSONException {
        Lazy lazy = i.f64252a;
        i.c(context, 4, eventInfo.mPushType, eventInfo.mExtra, "err_code", eventInfo.mErrorCode, "err_msg", eventInfo.mErrorMsg);
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public void reportEventStartup(@NonNull Context context, EventInfo eventInfo) throws JSONException {
        Lazy lazy = i.f64252a;
        String str = eventInfo.mPushToken;
        if (str == null || str.length() == 0) {
            return;
        }
        i.c(context, 1, eventInfo.mPushType, eventInfo.mExtra, "device_token", eventInfo.mPushToken);
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public void reportLocalToken(@NonNull Context context, EventInfo eventInfo) {
        Lazy lazy = i.f64252a;
        String str = eventInfo.mPushToken;
        if (str == null || str.length() == 0) {
            return;
        }
        int i7 = eventInfo.mPushType;
        HashMap mapB = i.b(context, 0, i7, new String[0]);
        mapB.put("push_sdk", String.valueOf(i7));
        mapB.put("token", str);
        BPushLog.i("BPushReportHelper", "reportLocalToken, pushType: " + i7);
        if (!ProcessUtils.isMainProcess()) {
            BPushLog.e("BPushTrackT", "not main process");
            return;
        }
        BPushNeurons.INSTANCE.trackT(false, "infra.push.local.token", mapB);
        Iterator it = mapB.entrySet().iterator();
        String str2 = "";
        while (true) {
            String str3 = str2;
            if (!it.hasNext()) {
                BPushLog.d("BPushTrackT", "report event = infra.push.local.token, params = " + ((Object) str3));
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            str2 = ((Object) str3) + " \n" + entry.getKey() + " = " + entry.getValue();
        }
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public void reportNotificationExpose(Context context, EventInfo eventInfo) {
        Lazy lazy = i.f64252a;
        HashMap map = new HashMap();
        Map<String, String> map2 = eventInfo.mExtra;
        if (map2 != null) {
            map.putAll(map2);
        }
        String str = eventInfo.mPushToken;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        map.put("token", str2);
        C5339g.a(context, map, false);
        ((j) i.f64252a.getValue()).reportFcmExpose(map).enqueue(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.bilibili.lib.push.h, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bilibili.lib.push.IPushManagerService
    public void resolveNotificationClicked(Context context, @NonNull ClickInfo clickInfo) {
        C5338f c5338fB = C5334b.b();
        c5338fB.getClass();
        if (TextUtils.isEmpty(clickInfo.mTasId)) {
            clickInfo.mTasId = CaptureSchema.OLD_INVALID_ID_STRING;
        }
        if (c5338fB.f64242c instanceof EmptyPushRegistry) {
            Log.e("BiliApp", "resolveNotificationClicked, report delay");
            c5338fB.f64245f = clickInfo;
        } else {
            IPushRegistry iPushRegistryC = c5338fB.c();
            i.e(context, iPushRegistryC.getPushType(), clickInfo.mTasId, iPushRegistryC.getToken(context), clickInfo.mExtra);
            C5334b.a(context, ClearTrigger.CLICK);
        }
        String str = clickInfo.mContent;
        String str2 = clickInfo.mTasId;
        boolean z6 = C2901b.f24709a;
        ?? obj = new Object();
        obj.f64250b = str;
        obj.f64249a = str2;
        obj.f64251c = !z6;
        c5338fB.f64241b.a(context, obj);
    }
}
