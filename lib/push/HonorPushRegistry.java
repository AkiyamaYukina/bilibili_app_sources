package com.bilibili.lib.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.hihonor.push.sdk.HonorPushCallback;
import com.hihonor.push.sdk.HonorPushClient;
import com.hihonor.push.sdk.ipc.HonorApiAvailability;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HonorPushRegistry.class */
@Keep
public final class HonorPushRegistry implements IPushRegistry {

    @NotNull
    public static final a Companion = new Object();
    private static final int GET_TOKEN_MAX_TRY = 1;

    @NotNull
    private static final String SP_TASK_KEY = "sp_task_token_key";

    @NotNull
    private static final String SP_TASK_NAME = "sp_hw_task_info";

    @NotNull
    private static final String TAG = "HonorPushRegistry";
    private boolean isCalledRegisterUserToken;
    private boolean mNeedReport;
    private boolean mPushEnable;

    @Nullable
    private String mToken;

    @NotNull
    private final Lazy honorPushClient$delegate = LazyKt.lazy(new I3.F(8));

    @Nullable
    private final IPushManagerService mBPushManager = BPushManagerServiceProvider.INSTANCE.get();
    private int mGetTokenMaxTry = 1;

    @NotNull
    private String mAbTestGroup = "";

    @NotNull
    private final Class<?>[] HONOR_COMPONENTS = {HonorPushService.class};

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HonorPushRegistry$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HonorPushRegistry$b.class */
    public static final class b implements HonorPushCallback<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HonorPushRegistry f64218a;

        public b(HonorPushRegistry honorPushRegistry) {
            this.f64218a = honorPushRegistry;
        }

        public final void onFailure(int i7, String str) {
            BPushLog.e(HonorPushRegistry.TAG, "getPushToken onFailure errorCode = " + i7 + ", errorString = " + str);
            this.f64218a.onConnectionFailed(i7, str);
        }

        public final void onSuccess(Object obj) {
            String str = (String) obj;
            BPushLog.d(HonorPushRegistry.TAG, "getPushToken onSuccess token :: " + str);
            HonorPushRegistry honorPushRegistry = this.f64218a;
            if (str != null && str.length() != 0) {
                honorPushRegistry.setToken(BPushFoundation.getApp(), str);
            } else if (honorPushRegistry.mGetTokenMaxTry <= 0) {
                honorPushRegistry.mGetTokenMaxTry = 1;
            } else {
                honorPushRegistry.mGetTokenMaxTry--;
                honorPushRegistry.getToken();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HonorPushRegistry$c.class */
    public static final class c implements HonorPushCallback<Void> {
        public final void onFailure(int i7, String str) {
            BPushLog.d(HonorPushRegistry.TAG, "turnOnNotificationCenter onFailure errorCode = " + i7 + ", errorString = " + str);
        }

        public final void onSuccess(Object obj) {
            BPushLog.d(HonorPushRegistry.TAG, "turnOnNotificationCenter success");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HonorPushRegistry$d.class */
    public static final class d implements HonorPushCallback<Void> {
        public final void onFailure(int i7, String str) {
            BPushLog.e(HonorPushRegistry.TAG, "turnOffNotificationCenter onFailure errorCode = " + i7 + ", errorString = " + str);
        }

        public final void onSuccess(Object obj) {
            BPushLog.i(HonorPushRegistry.TAG, "turnOffNotificationCenter success");
        }
    }

    private final EventInfo getEventInfo() {
        EventInfo eventInfo = new EventInfo(this.mToken, getPushType());
        eventInfo.addExtraInfo("honor_group", this.mAbTestGroup);
        return eventInfo;
    }

    private final HonorPushClient getHonorPushClient() {
        return (HonorPushClient) this.honorPushClient$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getToken() {
        BPushManagerServiceProvider.INSTANCE.get().getPushConfig().getExecutor().execute(new Runnable(this) { // from class: com.bilibili.lib.push.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final HonorPushRegistry f64256a;

            {
                this.f64256a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                HonorPushRegistry.getToken$lambda$0(this.f64256a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$0(HonorPushRegistry honorPushRegistry) {
        try {
            honorPushRegistry.getHonorPushClient().getPushToken(new b(honorPushRegistry));
        } catch (Exception e7) {
            BPushLog.e(TAG, e7.getMessage());
            honorPushRegistry.onConnectionFailed(-101, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConnectionFailed(int i7, String str) {
        int pushType = getPushType();
        long j7 = i7;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        EventInfo eventInfo = new EventInfo(pushType, j7, str2);
        eventInfo.addExtraInfo("honor_group", this.mAbTestGroup);
        this.mBPushManager.reportEventRegisterFailed(BPushFoundation.getApp(), eventInfo);
        this.mBPushManager.degradeToDefaultPush();
        BPushLog.w(TAG, "Honor push register degrade");
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    @Nullable
    public Class<?>[] getPushComponents() {
        return this.HONOR_COMPONENTS;
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public int getPushType() {
        return 9;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    @Override // com.bilibili.lib.push.IPushRegistry
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getToken(@org.jetbrains.annotations.Nullable android.content.Context r5) {
        /*
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.mToken
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lf
            r0 = r4
            java.lang.String r0 = r0.mToken
            return r0
        Lf:
            r0 = r5
            if (r0 == 0) goto L22
            r0 = r5
            java.lang.String r1 = "sp_hw_task_info"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)     // Catch: java.lang.Exception -> L1e
            r6 = r0
            goto L24
        L1e:
            r5 = move-exception
            goto L7f
        L22:
            r0 = 0
            r6 = r0
        L24:
            r0 = r6
            if (r0 == 0) goto L39
            r0 = r6
            java.lang.String r1 = "sp_task_token_key"
            java.lang.String r2 = "-1"
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L1e
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L3c
        L39:
            java.lang.String r0 = "-1"
            r6 = r0
        L3c:
            r0 = r4
            boolean r0 = r0.mNeedReport     // Catch: java.lang.Exception -> L1e
            if (r0 == 0) goto L7d
            r0 = r6
            java.lang.String r1 = "-1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.Exception -> L1e
            if (r0 != 0) goto L7d
            r0 = r4
            r1 = 0
            r0.mNeedReport = r1     // Catch: java.lang.Exception -> L1e
            java.lang.String r0 = "HonorPushRegistry"
            java.lang.String r1 = "reportLocalToken"
            com.bilibili.lib.push.BPushLog.i(r0, r1)     // Catch: java.lang.Exception -> L1e
            com.bilibili.lib.push.EventInfo r0 = new com.bilibili.lib.push.EventInfo     // Catch: java.lang.Exception -> L1e
            r7 = r0
            r0 = r7
            r1 = r6
            r2 = r4
            int r2 = r2.getPushType()     // Catch: java.lang.Exception -> L1e
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L1e
            r0 = r5
            if (r0 == 0) goto L7d
            r0 = r4
            com.bilibili.lib.push.IPushManagerService r0 = r0.mBPushManager     // Catch: java.lang.Exception -> L1e
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L7d
            r0 = r8
            r1 = r5
            r2 = r7
            r0.reportLocalToken(r1, r2)     // Catch: java.lang.Exception -> L1e
        L7d:
            r0 = r6
            return r0
        L7f:
            java.lang.String r0 = "HonorPushRegistry"
            r1 = r5
            java.lang.String r1 = r1.getMessage()
            com.bilibili.lib.push.BPushLog.e(r0, r1)
            java.lang.String r0 = "-1"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.push.HonorPushRegistry.getToken(android.content.Context):java.lang.String");
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void init() {
        try {
            getHonorPushClient().init(BPushFoundation.getApp().getApplicationContext(), false);
            getToken();
        } catch (Exception e7) {
            BPushLog.e(TAG, e7.getMessage());
        }
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public boolean isSupport() {
        boolean z6 = HonorApiAvailability.isHonorMobileServicesAvailable(BPushFoundation.getApp()) == 0;
        BPushLog.i(TAG, "check honor mobile services available:" + z6);
        return z6;
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void registerPushService(@Nullable Context context) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorRemove;
        BPushConfig pushConfig;
        IPushParams pushParams;
        try {
            IPushManagerService iPushManagerService = this.mBPushManager;
            if ((iPushManagerService == null || (pushConfig = iPushManagerService.getPushConfig()) == null || (pushParams = pushConfig.getPushParams()) == null) ? true : pushParams.featureFlag("dd.push_token_clear_before_register")) {
                if (context != null) {
                    try {
                        sharedPreferences = context.getSharedPreferences(SP_TASK_NAME, 0);
                    } catch (Exception e7) {
                        BPushLog.e(TAG, e7.getMessage());
                    }
                } else {
                    sharedPreferences = null;
                }
                if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null && (editorRemove = editorEdit.remove(SP_TASK_KEY)) != null) {
                    editorRemove.apply();
                }
            }
        } catch (Exception e8) {
            BPushLog.w("OppoPushRegistry", e8.getMessage());
        }
        if (context != null) {
            Utils.toggleComponentAvailability(context, true, this.HONOR_COMPONENTS);
        }
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void registerUserToken(@Nullable Context context, boolean z6) {
        synchronized (this) {
            if (this.mToken != null) {
                IPushManagerService iPushManagerService = this.mBPushManager;
                if (iPushManagerService != null) {
                    iPushManagerService.reportEventLoginIn(context, getEventInfo(), Boolean.valueOf(z6));
                }
            } else {
                this.isCalledRegisterUserToken = true;
            }
        }
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void setAbTestGroup(@Nullable String str) {
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        this.mAbTestGroup = str2;
    }

    public final void setToken(@NotNull Context context, @NotNull String str) {
        synchronized (this) {
            if (TextUtils.equals(str, this.mToken)) {
                return;
            }
            this.mToken = str;
            this.mNeedReport = true;
            try {
                context.getSharedPreferences(SP_TASK_NAME, 0).edit().putString(SP_TASK_KEY, str).apply();
            } catch (Exception e7) {
                BPushLog.e(TAG, e7.getMessage());
            }
            IPushManagerService iPushManagerService = this.mBPushManager;
            if (iPushManagerService != null) {
                iPushManagerService.onPushTokenRegisterSuccess();
            }
            IPushManagerService iPushManagerService2 = this.mBPushManager;
            if (iPushManagerService2 != null) {
                iPushManagerService2.reportEventStartup(context, getEventInfo());
            }
            if (this.isCalledRegisterUserToken) {
                this.isCalledRegisterUserToken = false;
                IPushManagerService iPushManagerService3 = this.mBPushManager;
                if (iPushManagerService3 != null) {
                    iPushManagerService3.reportEventLoginIn(context, getEventInfo(), Boolean.FALSE);
                }
            }
            getHonorPushClient().turnOnNotificationCenter(new c());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.hihonor.push.sdk.HonorPushCallback, java.lang.Object] */
    @Override // com.bilibili.lib.push.IPushRegistry
    public void unregisterPushService(@Nullable Context context) {
        getHonorPushClient().turnOffNotificationCenter((HonorPushCallback) new Object());
        synchronized (this) {
            this.mPushEnable = false;
            Unit unit = Unit.INSTANCE;
        }
        if (context != null) {
            Utils.toggleComponentAvailability(context, false, this.HONOR_COMPONENTS);
        }
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void unregisterUserToken(@Nullable Context context) {
        IPushManagerService iPushManagerService;
        if (context == null || (iPushManagerService = this.mBPushManager) == null) {
            return;
        }
        iPushManagerService.reportEventLoginOut(context, getEventInfo());
    }
}
