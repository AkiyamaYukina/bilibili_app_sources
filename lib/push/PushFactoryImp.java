package com.bilibili.lib.push;

import android.text.TextUtils;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/PushFactoryImp.class */
@Keep
public final class PushFactoryImp implements PushFactory {
    @Override // com.bilibili.lib.push.PushFactory
    public final IPushRegistry create(String str) {
        IPushRegistry iPushRegistry;
        IPushRegistry iPushRegistry2;
        IPushRegistry iPushRegistry3;
        IPushRegistry iPushRegistry4;
        IPushRegistry iPushRegistry5;
        IPushRegistry iPushRegistry6;
        if (TextUtils.equals(str, BPushRegistryProvider.PUSH_REGISTRY_HUAWEI) && (iPushRegistry6 = (IPushRegistry) Utils.constructNewInstance(BPushRegistryProvider.PUSH_REGISTRY_HUAWEI)) != null) {
            return iPushRegistry6;
        }
        if (TextUtils.equals(str, BPushRegistryProvider.PUSH_REGISTRY_OPPO) && (iPushRegistry5 = (IPushRegistry) Utils.constructNewInstance(BPushRegistryProvider.PUSH_REGISTRY_OPPO)) != null) {
            return iPushRegistry5;
        }
        if (TextUtils.equals(str, BPushRegistryProvider.PUSH_REGISTRY_VIVO) && (iPushRegistry4 = (IPushRegistry) Utils.constructNewInstance(BPushRegistryProvider.PUSH_REGISTRY_VIVO)) != null) {
            return iPushRegistry4;
        }
        if (TextUtils.equals(str, BPushRegistryProvider.PUSH_REGISTRY_XIAOMI) && (iPushRegistry3 = (IPushRegistry) Utils.constructNewInstance(BPushRegistryProvider.PUSH_REGISTRY_XIAOMI)) != null) {
            return iPushRegistry3;
        }
        if (TextUtils.equals(str, BPushRegistryProvider.PUSH_REGISTRY_HONOR) && (iPushRegistry2 = (IPushRegistry) Utils.constructNewInstance(BPushRegistryProvider.PUSH_REGISTRY_HONOR)) != null) {
            return iPushRegistry2;
        }
        if (!TextUtils.equals(str, BPushRegistryProvider.PUSH_REGISTRY_FCM) || (iPushRegistry = (IPushRegistry) Utils.constructNewInstance(BPushRegistryProvider.PUSH_REGISTRY_FCM)) == null) {
            return null;
        }
        return iPushRegistry;
    }
}
