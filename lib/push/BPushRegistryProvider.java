package com.bilibili.lib.push;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/BPushRegistryProvider.class */
public final class BPushRegistryProvider {
    public static final BPushRegistryProvider INSTANCE = new BPushRegistryProvider();
    public static final String PUSH_REGISTRY_FCM = "com.bilibili.lib.push.FCMRegistry";
    public static final String PUSH_REGISTRY_HONOR = "com.bilibili.lib.push.HonorPushRegistry";
    public static final String PUSH_REGISTRY_HUAWEI = "com.bilibili.lib.push.HuaweiNewPushRegistry";
    public static final String PUSH_REGISTRY_JIGUANG = "com.bilibili.lib.push.JPushRegistry";
    public static final String PUSH_REGISTRY_JMEIZU = "com.bilibili.lib.push.JMeizuPushRegistry";
    public static final String PUSH_REGISTRY_OPPO = "com.bilibili.lib.push.OppoPushRegistry";
    public static final String PUSH_REGISTRY_VIVO = "com.bilibili.lib.push.VivoPushRegistry";
    public static final String PUSH_REGISTRY_XIAOMI = "com.bilibili.lib.push.MiPushRegistry";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PushFactory f64209b = (PushFactory) Utils.constructNewInstance("com.bilibili.lib.push.PushFactoryImp");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, IPushRegistry> f64208a = new HashMap();

    @Nullable
    public IPushRegistry get(String str) {
        IPushRegistry iPushRegistry = (IPushRegistry) ((HashMap) this.f64208a).get(str);
        IPushRegistry iPushRegistry2 = iPushRegistry;
        if (iPushRegistry == null) {
            synchronized (BPushRegistryProvider.class) {
                try {
                    IPushRegistry iPushRegistry3 = (IPushRegistry) ((HashMap) this.f64208a).get(str);
                    iPushRegistry2 = iPushRegistry3;
                    if (iPushRegistry3 == null) {
                        PushFactory pushFactory = this.f64209b;
                        IPushRegistry iPushRegistryCreate = pushFactory != null ? pushFactory.create(str) : (IPushRegistry) Utils.constructNewInstance(str);
                        IPushRegistry emptyPushRegistry = iPushRegistryCreate;
                        if (iPushRegistryCreate == null) {
                            emptyPushRegistry = new EmptyPushRegistry();
                        }
                        ((HashMap) this.f64208a).put(str, emptyPushRegistry);
                        iPushRegistry2 = emptyPushRegistry;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        IPushRegistry iPushRegistry4 = iPushRegistry2;
        if (iPushRegistry2 instanceof EmptyPushRegistry) {
            iPushRegistry4 = null;
        }
        return iPushRegistry4;
    }
}
