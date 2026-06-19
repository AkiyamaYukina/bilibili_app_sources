package com.bilibili.lib.push;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.lib.push.BPushConfig;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/m.class */
public final class m implements IPushManagerService {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/m$a.class */
    public final class a implements IPushParams {
        @Override // com.bilibili.lib.push.IPushParams
        @NonNull
        public final String getAppKey() {
            return "";
        }

        @Override // com.bilibili.lib.push.IPushParams
        @NonNull
        public final String getBuvid() {
            return "";
        }

        @Override // com.bilibili.lib.push.IPushParams
        @NonNull
        public final String getMobiApp() {
            return "";
        }

        @Override // com.bilibili.lib.push.IPushParams
        @NonNull
        public final String getPushAppId() {
            return "";
        }

        @Override // com.bilibili.lib.push.IPushParams
        @NonNull
        public final String getSecretKey() {
            return "";
        }

        @Override // com.bilibili.lib.push.IPushParams
        @Nullable
        public final String getUserAccessKey(Context context) {
            return null;
        }

        @Override // com.bilibili.lib.push.IPushParams
        @Nullable
        public final String getUserId(Context context) {
            return null;
        }

        @Override // com.bilibili.lib.push.IPushParams
        public final int getVersionCode() {
            return 0;
        }
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public final void createNotificationChannel(PushNotification pushNotification) {
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public final void degradeToDefaultPush() {
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public final Context getContext() {
        return null;
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public final String getDefaultChannelId() {
        return "";
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.bilibili.lib.push.IPushParams, java.lang.Object] */
    @Override // com.bilibili.lib.push.IPushManagerService
    @NonNull
    public final BPushConfig getPushConfig() {
        return new BPushConfig.Builder(new Object()).build();
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public final IPushRegistry getPushRegistry() {
        return null;
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public final void onPushTokenRegisterSuccess() {
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public final void reportEventLoginIn(@NonNull Context context, EventInfo eventInfo, Boolean bool) {
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public final void reportEventLoginOut(@NonNull Context context, EventInfo eventInfo) {
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public final void reportEventRegisterFailed(@NonNull Context context, EventInfo eventInfo) {
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public final void reportEventStartup(@NonNull Context context, EventInfo eventInfo) {
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public final void reportLocalToken(@NonNull Context context, EventInfo eventInfo) {
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public final void reportNotificationExpose(Context context, EventInfo eventInfo) {
    }

    @Override // com.bilibili.lib.push.IPushManagerService
    public final void resolveNotificationClicked(Context context, ClickInfo clickInfo) {
    }
}
