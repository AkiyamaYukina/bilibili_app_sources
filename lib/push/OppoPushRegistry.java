package com.bilibili.lib.push;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.bilibili.lib.push.BPushKeys;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.heytap.msp.push.HeytapPushManager;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.INotificationPermissionCallback;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/OppoPushRegistry.class */
@Keep
public final class OppoPushRegistry implements IPushRegistry {
    private static final Class<?>[] OPPO_COMPONENTS = new Class[0];
    private static final int RETRY_MAX = 2;
    private IPushManagerService mBPushManager;
    private Context mContext;
    private BPushKeys.OppoPushKeys mOppoKeys;
    private int mRetryCount;
    private String mToken = "";
    private boolean mNeedReport = false;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/OppoPushRegistry$a.class */
    public final class a implements INotificationPermissionCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NotificationPermissionCallback f64225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OppoPushRegistry f64226b;

        public a(OppoPushRegistry oppoPushRegistry, NotificationPermissionCallback notificationPermissionCallback) {
            this.f64226b = oppoPushRegistry;
            this.f64225a = notificationPermissionCallback;
        }

        public final void onFail(int i7, String str) {
            OppoPushRegistry oppoPushRegistry = this.f64226b;
            NotificationPermissionCallback notificationPermissionCallback = this.f64225a;
            if (notificationPermissionCallback != null) {
                notificationPermissionCallback.onResult(false, oppoPushRegistry.getPushType(), oppoPushRegistry.hasShow(i7), i7, str);
            }
            oppoPushRegistry.clearCallback();
        }

        public final void onSuccess() {
            OppoPushRegistry oppoPushRegistry = this.f64226b;
            NotificationPermissionCallback notificationPermissionCallback = this.f64225a;
            if (notificationPermissionCallback != null) {
                notificationPermissionCallback.onResult(true, oppoPushRegistry.getPushType(), true, 0, "");
            }
            oppoPushRegistry.clearCallback();
        }
    }

    public OppoPushRegistry() {
        IPushManagerService iPushManagerService = BPushManagerServiceProvider.INSTANCE.get();
        this.mBPushManager = iPushManagerService;
        this.mOppoKeys = iPushManagerService.getPushConfig().getPushOppoKeys();
        Context app2 = BPushFoundation.getApp();
        this.mContext = app2;
        HeytapPushManager.init(app2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallback() {
        HeytapPushManager.clearNotificationAdvanceCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasShow(int i7) {
        return i7 == 0 || i7 == 1000 || i7 == 1001 || i7 == 2000 || i7 == 2002 || i7 == 2003;
    }

    public void disposeCommandRegisterResult(int i7, String str) {
        int i8;
        if (i7 != 0) {
            if (i7 != -1 || (i8 = this.mRetryCount) > 2) {
                this.mBPushManager.reportEventRegisterFailed(this.mContext, new EventInfo(getPushType(), i7, str));
                this.mBPushManager.degradeToDefaultPush();
                return;
            } else {
                this.mRetryCount = i8 + 1;
                HeytapPushManager.getRegister();
                return;
            }
        }
        String token = getToken(this.mContext);
        if (TextUtils.equals(token, this.mToken)) {
            BPushLog.e("OppoPushRegistry", "disposeCommandRegisterResult same token return ");
            return;
        }
        this.mToken = token;
        this.mNeedReport = true;
        this.mBPushManager.getDefaultChannelId();
        this.mBPushManager.onPushTokenRegisterSuccess();
        this.mBPushManager.reportEventStartup(this.mContext, new EventInfo(token, getPushType()));
        PushNotification pushNotification = this.mBPushManager.getPushConfig().getPushNotification(getPushType());
        BPushLog.d("OppoPushRegistry", "notification = " + pushNotification);
        if (pushNotification == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        this.mBPushManager.createNotificationChannel(pushNotification);
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public Class<?>[] getPushComponents() {
        return OPPO_COMPONENTS;
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public int getPushType() {
        return 5;
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    @Nullable
    public String getToken(Context context) {
        String registerID = HeytapPushManager.getRegisterID();
        if (!TextUtils.isEmpty(registerID) && !TextUtils.equals(registerID, CaptureSchema.OLD_INVALID_ID_STRING)) {
            try {
                context.getSharedPreferences("OPPO_LAST_TOKEN", 0).edit().putString("OPPO_LAST_TOKEN", registerID).apply();
            } catch (Exception e7) {
            }
            return registerID;
        }
        String string = context.getSharedPreferences("OPPO_LAST_TOKEN", 0).getString("OPPO_LAST_TOKEN", CaptureSchema.OLD_INVALID_ID_STRING);
        BPushLog.i("OppoPushRegistry", "getToken is empty, get local token");
        if (this.mNeedReport) {
            this.mNeedReport = false;
            this.mBPushManager.reportLocalToken(context, new EventInfo(string, getPushType()));
        }
        return string;
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void init() {
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public boolean isSupport() {
        return HeytapPushManager.isSupportPush(this.mContext);
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public boolean isSupportPermissionRequest() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.bilibili.lib.push.w, com.heytap.msp.push.callback.ICallBackResultService, java.lang.Object] */
    @Override // com.bilibili.lib.push.IPushRegistry
    public void registerPushService(Context context) {
        try {
            if (this.mBPushManager.getPushConfig().getPushParams().featureFlag("dd.push_token_clear_before_register")) {
                try {
                    context.getSharedPreferences("OPPO_LAST_TOKEN", 0).edit().remove("OPPO_LAST_TOKEN").apply();
                } catch (Exception e7) {
                }
            }
        } catch (Exception e8) {
            BPushLog.w("OppoPushRegistry", e8.getMessage());
        }
        Utils.toggleComponentAvailability(context, true, OPPO_COMPONENTS);
        Context context2 = this.mContext;
        String appKeyId = this.mOppoKeys.getAppKeyId();
        String secretId = this.mOppoKeys.getSecretId();
        ?? obj = new Object();
        IPushRegistry pushRegistry = BPushManagerServiceProvider.INSTANCE.get().getPushRegistry();
        if (pushRegistry instanceof OppoPushRegistry) {
            obj.f64263a = (OppoPushRegistry) pushRegistry;
        }
        HeytapPushManager.register(context2, appKeyId, secretId, (ICallBackResultService) obj);
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void registerUserToken(Context context, boolean z6) {
        this.mBPushManager.reportEventLoginIn(context, new EventInfo(getToken(context), getPushType()), Boolean.valueOf(z6));
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void requestNotificationPermission(ComponentActivity componentActivity, int i7, NotificationPermissionCallback notificationPermissionCallback) {
        HeytapPushManager.requestNotificationAdvance(componentActivity, new a(this, notificationPermissionCallback), i7);
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void unregisterPushService(Context context) {
        Utils.toggleComponentAvailability(context, false, OPPO_COMPONENTS);
        if (TextUtils.isEmpty(getToken(context))) {
            return;
        }
        HeytapPushManager.unRegister();
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void unregisterUserToken(Context context) {
        this.mBPushManager.reportEventLoginOut(context, new EventInfo(getToken(context), getPushType()));
    }
}
