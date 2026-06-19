package com.bilibili.lib.push;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.vivo.push.IPushActionListener;
import com.vivo.push.PushClient;
import com.vivo.push.sdk.LinkProxyClientActivity;
import com.vivo.push.sdk.service.CommandClientService;
import com.vivo.push.util.VivoPushException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/VivoPushRegistry.class */
@Keep
public final class VivoPushRegistry implements IPushRegistry {
    private static final String TAG = "VivoPushRegistry";
    private static final Class<?>[] VIVO_COMPONENTS = {CommandClientService.class, LinkProxyClientActivity.class};
    private boolean isRegisterSuccess = false;
    private IPushManagerService mBPushManager = BPushManagerServiceProvider.INSTANCE.get();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerPushService$0(Context context, int i7) {
        if (i7 != 0 && i7 != 1) {
            this.mBPushManager.reportEventRegisterFailed(context, new EventInfo(getPushType(), i7, null));
            this.mBPushManager.degradeToDefaultPush();
        } else if (i7 == 0) {
            this.isRegisterSuccess = true;
            this.mBPushManager.onPushTokenRegisterSuccess();
            this.mBPushManager.reportEventStartup(context, new EventInfo(getToken(context), getPushType()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$unregisterPushService$1(int i7) {
        BPushLog.e(TAG, "unregisterPushService: " + i7);
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public Class<?>[] getPushComponents() {
        return VIVO_COMPONENTS;
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public int getPushType() {
        return 8;
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    @Nullable
    public String getToken(Context context) {
        return PushClient.getInstance(context).getRegId();
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void init() {
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public boolean isSupport() {
        return PushClient.getInstance(BPushFoundation.getApp()).isSupport();
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void registerPushService(final Context context) {
        Utils.toggleComponentAvailability(context, true, VIVO_COMPONENTS);
        PushClient pushClient = PushClient.getInstance(context);
        try {
            pushClient.initialize();
        } catch (VivoPushException e7) {
            e7.printStackTrace();
            BPushLog.e(TAG, "registerPushService initialize client error:" + e7);
        }
        pushClient.turnOnPush(new IPushActionListener(this, context) { // from class: com.bilibili.lib.push.E

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VivoPushRegistry f64211a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Context f64212b;

            {
                this.f64211a = this;
                this.f64212b = context;
            }

            public final void onStateChanged(int i7) {
                this.f64211a.lambda$registerPushService$0(this.f64212b, i7);
            }
        });
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void registerUserToken(Context context, boolean z6) {
        this.mBPushManager.reportEventLoginIn(context, new EventInfo(getToken(context), getPushType()), Boolean.valueOf(z6));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.vivo.push.IPushActionListener, java.lang.Object] */
    @Override // com.bilibili.lib.push.IPushRegistry
    public void unregisterPushService(Context context) {
        Utils.toggleComponentAvailability(context, false, VIVO_COMPONENTS);
        if (this.isRegisterSuccess) {
            PushClient.getInstance(context).turnOffPush((IPushActionListener) new Object());
        }
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void unregisterUserToken(Context context) {
        this.mBPushManager.reportEventLoginOut(context, new EventInfo(getToken(context), getPushType()));
    }
}
