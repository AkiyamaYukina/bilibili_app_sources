package com.bilibili.lib.push;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/D.class */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static volatile IPushSwitchStrategy f64210a;

    @NonNull
    public static IPushRegistry a(@NonNull C5338f c5338f, @Nullable IPushRegistry iPushRegistry) {
        BPushConfig bPushConfigC = C5334b.c();
        Application application = c5338f.f64240a;
        IPushRegistry iPushRegistry2 = iPushRegistry;
        if (iPushRegistry == null) {
            IPushRegistry defaultType = c().getDefaultType();
            iPushRegistry2 = defaultType;
            if (defaultType == null) {
                return new EmptyPushRegistry();
            }
        }
        if (iPushRegistry2.getPushType() == 2 && bPushConfigC.getPushMiKeys().isValid(application)) {
            return iPushRegistry2;
        }
        if (iPushRegistry2.getPushType() == 3) {
            bPushConfigC.getPushHwKeys().isValid(application);
            return iPushRegistry2;
        }
        if (iPushRegistry2.getPushType() == 6) {
            bPushConfigC.getPushJKeys().isValid(application);
            return iPushRegistry2;
        }
        if (iPushRegistry2.getPushType() == 5 && bPushConfigC.getPushOppoKeys().isValid(application)) {
            return iPushRegistry2;
        }
        if (iPushRegistry2.getPushType() == 8) {
            bPushConfigC.getPushVivoKeys().isValid(application);
            return iPushRegistry2;
        }
        if (iPushRegistry2.getPushType() == 7) {
            return iPushRegistry2;
        }
        if (iPushRegistry2.getPushType() == 9 && bPushConfigC.getPushHonorKeys().isValid(application)) {
            return iPushRegistry2;
        }
        IPushRegistry defaultType2 = c().getDefaultType();
        return (defaultType2 == null || defaultType2.getPushType() == iPushRegistry2.getPushType()) ? new EmptyPushRegistry() : a(c5338f, defaultType2);
    }

    public static void b(@NonNull Context context, @Nullable IPushRegistry iPushRegistry, @Nullable IPushRegistry iPushRegistry2, boolean z6) {
        IPushRegistry iPushRegistry3;
        IPushRegistry iPushRegistry4;
        IPushRegistry iPushRegistry5;
        IPushRegistry iPushRegistry6;
        IPushRegistry iPushRegistry7;
        IPushRegistry iPushRegistry8;
        IPushRegistry iPushRegistry9;
        if (iPushRegistry == null) {
            return;
        }
        BPushRegistryProvider bPushRegistryProvider = BPushRegistryProvider.INSTANCE;
        if (iPushRegistry.getPushType() != 2 && ((iPushRegistry2 == null || iPushRegistry2.getPushType() != 2 || z6) && (iPushRegistry9 = bPushRegistryProvider.get(BPushRegistryProvider.PUSH_REGISTRY_XIAOMI)) != null)) {
            Utils.toggleComponentAvailability(context, false, iPushRegistry9.getPushComponents());
        }
        if (iPushRegistry.getPushType() != 3 && ((iPushRegistry2 == null || iPushRegistry2.getPushType() != 3 || z6) && (iPushRegistry8 = bPushRegistryProvider.get(BPushRegistryProvider.PUSH_REGISTRY_HUAWEI)) != null)) {
            Utils.toggleComponentAvailability(context, false, iPushRegistry8.getPushComponents());
        }
        if (iPushRegistry.getPushType() != 9 && ((iPushRegistry2 == null || iPushRegistry2.getPushType() != 9 || z6) && (iPushRegistry7 = bPushRegistryProvider.get(BPushRegistryProvider.PUSH_REGISTRY_HONOR)) != null)) {
            Utils.toggleComponentAvailability(context, false, iPushRegistry7.getPushComponents());
        }
        if (iPushRegistry.getPushType() != 6 && ((iPushRegistry2 == null || iPushRegistry2.getPushType() != 6 || z6) && (iPushRegistry6 = bPushRegistryProvider.get(BPushRegistryProvider.PUSH_REGISTRY_JIGUANG)) != null)) {
            Utils.toggleComponentAvailability(context, false, iPushRegistry6.getPushComponents());
        }
        if (iPushRegistry.getPushType() != 5 && ((iPushRegistry2 == null || iPushRegistry2.getPushType() != 5 || z6) && (iPushRegistry5 = bPushRegistryProvider.get(BPushRegistryProvider.PUSH_REGISTRY_OPPO)) != null)) {
            Utils.toggleComponentAvailability(context, false, iPushRegistry5.getPushComponents());
        }
        if (iPushRegistry.getPushType() != 8 && ((iPushRegistry2 == null || iPushRegistry2.getPushType() != 8 || z6) && (iPushRegistry4 = bPushRegistryProvider.get(BPushRegistryProvider.PUSH_REGISTRY_VIVO)) != null)) {
            Utils.toggleComponentAvailability(context, false, iPushRegistry4.getPushComponents());
        }
        if (iPushRegistry.getPushType() != 7) {
            if ((iPushRegistry2 == null || iPushRegistry2.getPushType() != 7 || z6) && (iPushRegistry3 = bPushRegistryProvider.get(BPushRegistryProvider.PUSH_REGISTRY_FCM)) != null) {
                Utils.toggleComponentAvailability(context, false, iPushRegistry3.getPushComponents());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.bilibili.lib.push.IPushSwitchStrategy] */
    public static IPushSwitchStrategy c() {
        if (f64210a == null) {
            synchronized (D.class) {
                try {
                    if (f64210a == null) {
                        Object pushSwitchStrategy = C5334b.c().getPushSwitchStrategy();
                        if (pushSwitchStrategy == null) {
                            pushSwitchStrategy = new Object();
                        }
                        f64210a = pushSwitchStrategy;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f64210a;
    }
}
