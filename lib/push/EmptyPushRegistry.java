package com.bilibili.lib.push;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/EmptyPushRegistry.class */
public class EmptyPushRegistry implements IPushRegistry {
    @Override // com.bilibili.lib.push.IPushRegistry
    public Class<?>[] getPushComponents() {
        return new Class[0];
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public int getPushType() {
        return -1;
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    @Nullable
    public String getToken(Context context) {
        return null;
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void init() {
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public boolean isSupport() {
        return false;
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void registerPushService(Context context) {
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void registerUserToken(Context context, boolean z6) {
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void unregisterPushService(Context context) {
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void unregisterUserToken(Context context) {
    }
}
