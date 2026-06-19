package com.bilibili.lib.push;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/IPushManagerService.class */
public interface IPushManagerService {
    void createNotificationChannel(PushNotification pushNotification);

    void degradeToDefaultPush();

    Context getContext();

    String getDefaultChannelId();

    @NonNull
    BPushConfig getPushConfig();

    IPushRegistry getPushRegistry();

    void onPushTokenRegisterSuccess();

    void reportEventLoginIn(@NonNull Context context, EventInfo eventInfo, Boolean bool);

    void reportEventLoginOut(@NonNull Context context, EventInfo eventInfo);

    void reportEventRegisterFailed(@NonNull Context context, EventInfo eventInfo);

    void reportEventStartup(@NonNull Context context, EventInfo eventInfo);

    void reportLocalToken(@NonNull Context context, EventInfo eventInfo);

    void reportNotificationExpose(Context context, EventInfo eventInfo);

    void resolveNotificationClicked(Context context, ClickInfo clickInfo);
}
