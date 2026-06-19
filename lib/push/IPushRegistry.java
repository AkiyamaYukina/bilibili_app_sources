package com.bilibili.lib.push;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/IPushRegistry.class */
public interface IPushRegistry {
    Class<?>[] getPushComponents();

    int getPushType();

    @Nullable
    String getToken(Context context);

    void init();

    boolean isSupport();

    default boolean isSupportPermissionRequest() {
        return false;
    }

    void registerPushService(Context context);

    void registerUserToken(Context context, boolean z6);

    default void requestNotificationPermission(ComponentActivity componentActivity, int i7, NotificationPermissionCallback notificationPermissionCallback) {
    }

    default void setAbTestGroup(String str) {
    }

    void unregisterPushService(Context context);

    void unregisterUserToken(Context context);
}
