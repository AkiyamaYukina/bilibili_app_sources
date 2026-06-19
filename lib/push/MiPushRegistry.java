package com.bilibili.lib.push;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.droid.ProcessUtils;
import com.bilibili.lib.push.BPushKeys;
import com.bilibili.lib.push.utils.RomUtils;
import com.xiaomi.mipush.sdk.MessageHandleService;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.push.H2;
import com.xiaomi.push.K2;
import com.xiaomi.push.ig;
import com.xiaomi.push.service.XMJobService;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.module.PushChannelRegion;
import com.xiaomi.push.service.receivers.NetworkStatusReceiver;
import com.xiaomi.push.service.receivers.PingReceiver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/MiPushRegistry.class */
@Keep
public class MiPushRegistry implements IPushRegistry {
    private static final String MIUI_SERVICE_FRAMEWORK_VERSION = "miui_service_framework_version";
    private static final String MIUI_VERSION = "miui_version";
    private static final String TAG = "MiPushRegistry";
    private static final Class<?>[] XIAOMI_COMPONENTS = {XMPushService.class, XMJobService.class, PushMessageHandler.class, MessageHandleService.class, MiMessageReceiver.class, PingReceiver.class};
    private BPushKeys.MiKeys mMiKeys;

    @Nullable
    private String mMiuiServiceFrameworkVersion;

    @NonNull
    private IPushManagerService mPushManagerService;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/MiPushRegistry$a.class */
    public final class a implements aW0.a {
        public final void a(String str, Throwable th) {
            Log.w("xiaomi", str, th);
        }

        public final void log(String str) {
        }
    }

    public MiPushRegistry() {
        IPushManagerService iPushManagerService = BPushManagerServiceProvider.INSTANCE.get();
        this.mPushManagerService = iPushManagerService;
        this.mMiKeys = iPushManagerService.getPushConfig().getPushMiKeys();
        this.mMiuiServiceFrameworkVersion = getMiuiServiceFrameworkVersion();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (kotlin.text.StringsKt.n(r0, r5) == true) goto L24;
     */
    @kotlin.jvm.JvmStatic
    @com.bilibili.lib.ghost.api.Invocation(category = com.bilibili.lib.ghost.api.InvocationCategory.INVOKE_NONE_STATIC, name = "getPackageInfo", owner = {"android.content.pm.PackageManager"})
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.pm.PackageInfo __Ghost$Insertion$com_bilibili_privacy_PrivacyGhost_getPackageInfo(@org.jetbrains.annotations.NotNull android.content.pm.PackageManager r4, @org.jetbrains.annotations.NotNull java.lang.String r5, int r6) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            com.bilibili.lib.blconfig.ConfigManager$Companion r0 = com.bilibili.lib.blconfig.ConfigManager.Companion     // Catch: java.lang.Exception -> L12
            com.bilibili.lib.blconfig.FeatureFlagContract r0 = r0.ab2()     // Catch: java.lang.Exception -> L12
            java.lang.String r1 = "ff.privacy.hook.agree.get_package_info"
            r2 = 1
            boolean r0 = r0.getWithDefault(r1, r2)     // Catch: java.lang.Exception -> L12
            r7 = r0
            goto L16
        L12:
            r9 = move-exception
            r0 = 1
            r7 = r0
        L16:
            com.bilibili.privacy.PrivacyHelper r0 = com.bilibili.privacy.PrivacyHelper.INSTANCE
            java.lang.String r1 = "pm_get_package_info"
            boolean r0 = r0.checkPrivacy$privacy_release(r1)
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L2c
            r0 = r7
            if (r0 != 0) goto L80
        L2c:
            com.bilibili.lib.blconfig.ConfigManager$Companion r0 = com.bilibili.lib.blconfig.ConfigManager.Companion     // Catch: java.lang.Exception -> L92
            com.bilibili.lib.blconfig.Contract r0 = r0.config()     // Catch: java.lang.Exception -> L92
            java.lang.String r1 = "privacy.pkg_info_whitelist"
            r2 = 0
            java.lang.Object r0 = r0.get(r1, r2)     // Catch: java.lang.Exception -> L92
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L92
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L53
            r0 = r10
            r1 = r5
            boolean r0 = kotlin.text.StringsKt.n(r0, r1)     // Catch: java.lang.Exception -> L92
            r7 = r0
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L53
            goto L80
        L53:
            r0 = r5
            boolean r0 = V0.f.c(r0)
            if (r0 == 0) goto L77
            r0 = r4
            r1 = 0
            android.content.pm.PackageInfo r0 = V0.e.a(r0, r1)
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r5
            if (r0 != 0) goto L75
            android.content.pm.PackageInfo r0 = new android.content.pm.PackageInfo
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = 2233(0x8b9, float:3.129E-42)
            r0.versionCode = r1
        L75:
            r0 = r4
            return r0
        L77:
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
        L80:
            r0 = r4
            r1 = r5
            r2 = r6
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)
            r5 = r0
            r0 = r9
            r4 = r0
            r0 = r5
            if (r0 == 0) goto L90
            r0 = r5
            r4 = r0
        L90:
            r0 = r4
            return r0
        L92:
            r10 = move-exception
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.push.MiPushRegistry.__Ghost$Insertion$com_bilibili_privacy_PrivacyGhost_getPackageInfo(android.content.pm.PackageManager, java.lang.String, int):android.content.pm.PackageInfo");
    }

    private EventInfo createEventInfo(int i7, long j7, @Nullable String str) {
        EventInfo eventInfo = new EventInfo(i7, j7, str);
        eventInfo.addExtraInfo(MIUI_SERVICE_FRAMEWORK_VERSION, this.mMiuiServiceFrameworkVersion);
        eventInfo.addExtraInfo(MIUI_VERSION, RomUtils.getMiuiVersion2());
        return eventInfo;
    }

    private EventInfo createEventInfo(@Nullable String str, int i7) {
        EventInfo eventInfo = new EventInfo(str, i7);
        eventInfo.addExtraInfo(MIUI_SERVICE_FRAMEWORK_VERSION, this.mMiuiServiceFrameworkVersion);
        eventInfo.addExtraInfo(MIUI_VERSION, RomUtils.getMiuiVersion2());
        return eventInfo;
    }

    @Nullable
    private String getMiuiServiceFrameworkVersion() {
        try {
            if (!isSupport()) {
                return null;
            }
            PackageInfo packageInfo__Ghost$Insertion$com_bilibili_privacy_PrivacyGhost_getPackageInfo = __Ghost$Insertion$com_bilibili_privacy_PrivacyGhost_getPackageInfo(BPushFoundation.getApp().getPackageManager(), "com.xiaomi.xmsf", 1);
            return packageInfo__Ghost$Insertion$com_bilibili_privacy_PrivacyGhost_getPackageInfo != null ? String.valueOf(packageInfo__Ghost$Insertion$com_bilibili_privacy_PrivacyGhost_getPackageInfo.versionCode) : "";
        } catch (PackageManager.NameNotFoundException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public void disposeCommandRegisterResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        long resultCode = miPushCommandMessage.getResultCode();
        if (resultCode == 0) {
            BPushLog.i(TAG, "onReceiveRegisterResult xiaomi push reportEventStartup");
            this.mPushManagerService.onPushTokenRegisterSuccess();
            this.mPushManagerService.reportEventStartup(context, createEventInfo(com.xiaomi.mipush.sdk.b.l(context), getPushType()));
        } else {
            this.mPushManagerService.reportEventRegisterFailed(context, createEventInfo(getPushType(), resultCode, miPushCommandMessage.getReason()));
            BPushLog.i(TAG, "onReceiveRegisterResult xiaomi push reportEventRegisterFailed");
            if (resultCode == 70000004) {
                this.mPushManagerService.degradeToDefaultPush();
                BPushLog.i(TAG, "xiaomi push register degrade");
            }
        }
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public Class<?>[] getPushComponents() {
        return XIAOMI_COMPONENTS;
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public int getPushType() {
        return 2;
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    @Nullable
    public String getToken(Context context) {
        return com.xiaomi.mipush.sdk.b.l(context);
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void init() {
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public boolean isSupport() {
        return RomUtils.isMiuiRom();
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [eW0.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.bilibili.lib.push.MiPushRegistry$a, java.lang.Object] */
    @Override // com.bilibili.lib.push.IPushRegistry
    public void registerPushService(Context context) {
        Utils.toggleComponentAvailability(context, true, XIAOMI_COMPONENTS);
        if (ProcessUtils.isMainProcess()) {
            String appId = this.mMiKeys.getAppId();
            String appKey = this.mMiKeys.getAppKey();
            Context context2 = com.xiaomi.mipush.sdk.b.a;
            ?? obj = new Object();
            ((eW0.i) obj).a = PushChannelRegion.China;
            com.xiaomi.mipush.sdk.b.f(context, "context");
            com.xiaomi.mipush.sdk.b.f(appId, "appID");
            com.xiaomi.mipush.sdk.b.f(appKey, "appToken");
            Context applicationContext = context.getApplicationContext();
            com.xiaomi.mipush.sdk.b.a = applicationContext;
            if (applicationContext == null) {
                com.xiaomi.mipush.sdk.b.a = context;
            }
            Context context3 = com.xiaomi.mipush.sdk.b.a;
            K2.a = context3.getApplicationContext();
            if (!NetworkStatusReceiver.a()) {
                Context context4 = com.xiaomi.mipush.sdk.b.a;
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    intentFilter.addCategory("android.intent.category.DEFAULT");
                    H2.b(context4.getApplicationContext(), new NetworkStatusReceiver((Object) null), intentFilter);
                } catch (Throwable th) {
                    aW0.b.d("dynamic register network status receiver failed:" + th);
                }
                com.xiaomi.push.B.c(com.xiaomi.mipush.sdk.b.a);
            }
            eW0.A aC = eW0.A.c(com.xiaomi.mipush.sdk.b.a);
            aC.b = obj;
            com.xiaomi.push.service.A.b(aC.a).e(ig.ao.a(), true);
            aC.b.getClass();
            aC.b.getClass();
            aC.b.getClass();
            aC.b.getClass();
            com.xiaomi.push.e.a(context3).c(0, new com.xiaomi.mipush.sdk.a(appId, appKey));
        }
        if (!this.mPushManagerService.getPushConfig().isDebug()) {
            eW0.c.a = true;
            eW0.c.a(context);
        }
        eW0.c.b = new Object();
        eW0.c.a(context);
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void registerUserToken(Context context, boolean z6) {
        this.mPushManagerService.reportEventLoginIn(context, createEventInfo(com.xiaomi.mipush.sdk.b.l(context), getPushType()), Boolean.valueOf(z6));
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void unregisterPushService(Context context) {
        Utils.toggleComponentAvailability(context, false, XIAOMI_COMPONENTS);
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void unregisterUserToken(Context context) {
        this.mPushManagerService.reportEventLoginOut(context, createEventInfo(com.xiaomi.mipush.sdk.b.l(context), getPushType()));
    }
}
