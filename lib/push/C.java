package com.bilibili.lib.push;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/C.class */
public final class C implements IPushSwitchStrategy {
    @Override // com.bilibili.lib.push.IPushSwitchStrategy
    public final IPushRegistry getDefaultType() {
        return BPushRegistryProvider.INSTANCE.get(BPushRegistryProvider.PUSH_REGISTRY_JIGUANG);
    }

    @Override // com.bilibili.lib.push.IPushSwitchStrategy
    @Nullable
    public final IPushRegistry switchPushType(@NonNull Context context) {
        BPushRegistryProvider bPushRegistryProvider = BPushRegistryProvider.INSTANCE;
        IPushRegistry iPushRegistry = bPushRegistryProvider.get(BPushRegistryProvider.PUSH_REGISTRY_HUAWEI);
        IPushRegistry iPushRegistry2 = bPushRegistryProvider.get(BPushRegistryProvider.PUSH_REGISTRY_XIAOMI);
        IPushRegistry iPushRegistry3 = bPushRegistryProvider.get(BPushRegistryProvider.PUSH_REGISTRY_OPPO);
        IPushRegistry iPushRegistry4 = bPushRegistryProvider.get(BPushRegistryProvider.PUSH_REGISTRY_VIVO);
        IPushRegistry iPushRegistry5 = bPushRegistryProvider.get(BPushRegistryProvider.PUSH_REGISTRY_JMEIZU);
        if (iPushRegistry != null && iPushRegistry.isSupport()) {
            return iPushRegistry;
        }
        if (iPushRegistry2 != null && iPushRegistry2.isSupport()) {
            return iPushRegistry2;
        }
        if (iPushRegistry5 != null && iPushRegistry5.isSupport()) {
            return iPushRegistry5;
        }
        if (iPushRegistry3 != null && iPushRegistry3.isSupport()) {
            return iPushRegistry3;
        }
        if (iPushRegistry4 == null || !iPushRegistry4.isSupport()) {
            return null;
        }
        return iPushRegistry4;
    }
}
