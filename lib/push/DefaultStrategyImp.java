package com.bilibili.lib.push;

import android.content.Context;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/DefaultStrategyImp.class */
@Keep
public final class DefaultStrategyImp implements IPushSwitchStrategy {
    @Override // com.bilibili.lib.push.IPushSwitchStrategy
    public String getAbTestGroup() {
        return "";
    }

    @Override // com.bilibili.lib.push.IPushSwitchStrategy
    public final IPushRegistry getDefaultType() {
        IPushRegistry iPushRegistry = BPushRegistryProvider.INSTANCE.get(BPushRegistryProvider.PUSH_REGISTRY_XIAOMI);
        if (iPushRegistry != null) {
            return iPushRegistry;
        }
        return null;
    }

    @Override // com.bilibili.lib.push.IPushSwitchStrategy
    public final IPushRegistry switchPushType(Context context) {
        BPushRegistryProvider bPushRegistryProvider = BPushRegistryProvider.INSTANCE;
        IPushRegistry iPushRegistry = bPushRegistryProvider.get(BPushRegistryProvider.PUSH_REGISTRY_HONOR);
        if (iPushRegistry != null && iPushRegistry.isSupport()) {
            return iPushRegistry;
        }
        IPushRegistry iPushRegistry2 = bPushRegistryProvider.get(BPushRegistryProvider.PUSH_REGISTRY_HUAWEI);
        if (iPushRegistry2 != null && iPushRegistry2.isSupport()) {
            return iPushRegistry2;
        }
        IPushRegistry iPushRegistry3 = bPushRegistryProvider.get(BPushRegistryProvider.PUSH_REGISTRY_OPPO);
        if (iPushRegistry3 != null && iPushRegistry3.isSupport()) {
            return iPushRegistry3;
        }
        IPushRegistry iPushRegistry4 = bPushRegistryProvider.get(BPushRegistryProvider.PUSH_REGISTRY_VIVO);
        if (iPushRegistry4 != null && iPushRegistry4.isSupport()) {
            return iPushRegistry4;
        }
        IPushRegistry iPushRegistry5 = bPushRegistryProvider.get(BPushRegistryProvider.PUSH_REGISTRY_XIAOMI);
        if (iPushRegistry5 == null || !iPushRegistry5.isSupport()) {
            return null;
        }
        return iPushRegistry5;
    }
}
