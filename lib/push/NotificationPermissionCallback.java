package com.bilibili.lib.push;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/NotificationPermissionCallback.class */
public interface NotificationPermissionCallback {
    static /* synthetic */ void onResult$default(NotificationPermissionCallback notificationPermissionCallback, boolean z6, int i7, boolean z7, int i8, String str, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onResult");
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        if ((i9 & 8) != 0) {
            i8 = 0;
        }
        if ((i9 & 16) != 0) {
            str = null;
        }
        notificationPermissionCallback.onResult(z6, i7, z7, i8, str);
    }

    void onResult(boolean z6, int i7, boolean z7, int i8, @Nullable String str);
}
