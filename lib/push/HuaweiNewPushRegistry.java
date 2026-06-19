package com.bilibili.lib.push;

import I3.I;
import I3.P;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.activity.ComponentActivity;
import androidx.annotation.Keep;
import com.bilibili.bililive.infra.log.LiveLog;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.push.utils.RomUtils;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.facebook.login.DeviceAuthDialog;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.agconnect.config.LazyInputStream;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.push.HmsMessaging;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HuaweiNewPushRegistry.class */
@Keep
public final class HuaweiNewPushRegistry implements IPushRegistry {

    @NotNull
    public static final a Companion = new Object();

    @NotNull
    private static final String EMUI_VERSION = "emui_version";
    private static final int GET_TOKEN_MAX_TRY = 1;

    @NotNull
    private static final String HARMONY_VERSION = "harmony_version";

    @NotNull
    private static final String SP_TASK_KEY = "sp_task_token_key";

    @NotNull
    private static final String SP_TASK_NAME = "sp_hw_task_info";

    @NotNull
    private static final String TAG = "HuaweiPushRegistry";

    @Nullable
    private NotificationPermissionCallback callback;
    private boolean isCalledRegisterUserToken;
    private long mLastReport;
    private boolean mNeedReport;
    private boolean mPushEnable;

    @Nullable
    private String mToken;

    @NotNull
    private final Lazy messaging$delegate = LazyKt.lazy(new I(8));

    @Nullable
    private final IPushManagerService mBPushManager = BPushManagerServiceProvider.INSTANCE.get();
    private int mGetTokenMaxTry = 1;

    @NotNull
    private String mAbTestGroup = "";

    @NotNull
    private MutableStateFlow<PushPermissionResult> stateFlow = StateFlowKt.MutableStateFlow((Object) null);

    @NotNull
    private final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault());

    @NotNull
    private final Class<?>[] HUAWEI_COMPONENTS = {HmsPushService.class};

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HuaweiNewPushRegistry$a.class */
    public static final class a {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HuaweiNewPushRegistry$b.class */
    public static final class b extends LazyInputStream {
        public final InputStream get(Context context) {
            InputStream inputStreamOpen;
            try {
                inputStreamOpen = context.getAssets().open("agconnect-services.json");
            } catch (IOException e7) {
                inputStreamOpen = null;
            }
            return inputStreamOpen;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.lib.push.HuaweiNewPushRegistry$init$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HuaweiNewPushRegistry$init$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final HuaweiNewPushRegistry this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HuaweiNewPushRegistry huaweiNewPushRegistry, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = huaweiNewPushRegistry;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:10:0x0052
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r0 = r4
                int r0 = r0.label
                if (r0 != 0) goto L48
                r0 = r5
                kotlin.ResultKt.throwOnFailure(r0)
                android.content.Context r0 = com.bilibili.lib.push.BPushFoundation.getApp()     // Catch: java.lang.Throwable -> L52
                com.huawei.hms.aaid.HmsInstanceId r0 = com.huawei.hms.aaid.HmsInstanceId.getInstance(r0)     // Catch: java.lang.Throwable -> L52
                android.app.Application r1 = com.bilibili.lib.performance.EntryPointKt.getApp()     // Catch: java.lang.Throwable -> L52
                java.lang.String r1 = com.huawei.hms.utils.Util.getAppId(r1)     // Catch: java.lang.Throwable -> L52
                r2 = 0
                java.lang.String r0 = r0.getToken(r1, r2)     // Catch: java.lang.Throwable -> L52
                r6 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
                r5 = r0
                r0 = r5
                java.lang.String r1 = "HmsInstanceId from  hwPushOpt "
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L52
                r0 = r5
                r1 = r6
                java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L52
                java.lang.String r0 = "HuaweiPushRegistry"
                r1 = r5
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L52
                com.bilibili.lib.push.BPushLog.i(r0, r1)     // Catch: java.lang.Throwable -> L52
                r0 = r4
                com.bilibili.lib.push.HuaweiNewPushRegistry r0 = r0.this$0     // Catch: java.lang.Throwable -> L52
                android.content.Context r1 = com.bilibili.lib.push.BPushFoundation.getApp()     // Catch: java.lang.Throwable -> L52
                r2 = r6
                r0.setToken(r1, r2)     // Catch: java.lang.Throwable -> L52
            L44:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L52
                return r0
            L48:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L52:
                r5 = move-exception
                goto L44
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.push.HuaweiNewPushRegistry.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.lib.push.HuaweiNewPushRegistry$init$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HuaweiNewPushRegistry$init$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final HuaweiNewPushRegistry this$0;

        /* JADX INFO: renamed from: com.bilibili.lib.push.HuaweiNewPushRegistry$init$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HuaweiNewPushRegistry$init$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<PushPermissionResult, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final HuaweiNewPushRegistry this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HuaweiNewPushRegistry huaweiNewPushRegistry, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = huaweiNewPushRegistry;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(PushPermissionResult pushPermissionResult, Continuation<? super Unit> continuation) {
                return create(pushPermissionResult, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PushPermissionResult pushPermissionResult = (PushPermissionResult) this.L$0;
                if (pushPermissionResult == null) {
                    return Unit.INSTANCE;
                }
                if (pushPermissionResult.getSuccess()) {
                    BPushLog.i(HuaweiNewPushRegistry.TAG, "requestNotification success");
                    NotificationPermissionCallback notificationPermissionCallback = this.this$0.callback;
                    if (notificationPermissionCallback != null) {
                        notificationPermissionCallback.onResult(true, this.this$0.getPushType(), pushPermissionResult.getHasShow(), pushPermissionResult.getCode(), pushPermissionResult.getMsg());
                    }
                } else {
                    BPushLog.i(HuaweiNewPushRegistry.TAG, "requestNotification failed code = " + pushPermissionResult.getCode() + " msg = " + pushPermissionResult.getMsg());
                    NotificationPermissionCallback notificationPermissionCallback2 = this.this$0.callback;
                    if (notificationPermissionCallback2 != null) {
                        notificationPermissionCallback2.onResult(false, this.this$0.getPushType(), pushPermissionResult.getHasShow(), pushPermissionResult.getCode(), pushPermissionResult.getMsg());
                    }
                }
                this.this$0.callback = null;
                this.this$0.stateFlow.setValue((Object) null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HuaweiNewPushRegistry huaweiNewPushRegistry, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = huaweiNewPushRegistry;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow = this.this$0.stateFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final void addAbTestInfo(EventInfo eventInfo) {
        if (eventInfo != null) {
            eventInfo.addExtraInfo("honor_group", this.mAbTestGroup);
        }
    }

    private final boolean checkOthers() {
        try {
            String lowerCase = Build.BRAND.toLowerCase(Locale.ROOT);
            if (lowerCase.length() == 0 || !BPushManagerServiceProvider.INSTANCE.get().getPushConfig().getPushParams().brandListCheckHms().contains(lowerCase)) {
                return false;
            }
            boolean z6 = HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(BPushFoundation.getApp()) == 0;
            BPushLog.i(TAG, "isSupport hms available = " + z6);
            return z6;
        } catch (Exception e7) {
            return false;
        }
    }

    private final EventInfo createEventInfo(String str, int i7) {
        EventInfo eventInfo = new EventInfo(str, i7);
        eventInfo.addExtraInfo(EMUI_VERSION, RomUtils.getEmuiVersion());
        eventInfo.addExtraInfo(HARMONY_VERSION, RomUtils.getHarmonyVersion());
        addAbTestInfo(eventInfo);
        return eventInfo;
    }

    private final EventInfo createFailedEventInfo(int i7, long j7, String str) {
        EventInfo eventInfo = new EventInfo(i7, j7, str);
        eventInfo.addExtraInfo(EMUI_VERSION, RomUtils.getEmuiVersion());
        eventInfo.addExtraInfo(HARMONY_VERSION, RomUtils.getHarmonyVersion());
        return eventInfo;
    }

    private final HmsMessaging getMessaging() {
        return (HmsMessaging) this.messaging$delegate.getValue();
    }

    private final void getToken() {
        final int i7 = 0;
        BPushManagerServiceProvider.INSTANCE.get().getPushConfig().getExecutor().execute(new Runnable(this, i7) { // from class: com.bilibili.lib.push.r

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f64258a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f64259b;

            {
                this.f64258a = i7;
                this.f64259b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f64258a) {
                    case 0:
                        HuaweiNewPushRegistry.getToken$lambda$0((HuaweiNewPushRegistry) this.f64259b);
                        break;
                    case 1:
                        DeviceAuthDialog.lf((DeviceAuthDialog) this.f64259b);
                        break;
                    default:
                        hM.l lVar = (hM.l) this.f64259b;
                        View view = lVar.b;
                        LiveLog.d("LiveFollowTipsPopupWindow", new P(9));
                        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f).setDuration(1000L);
                        duration.setInterpolator(new LinearInterpolator());
                        duration.addListener(new hM.n(lVar));
                        duration.start();
                        ObjectAnimator objectAnimator = lVar.c;
                        if (objectAnimator != null && objectAnimator.isRunning()) {
                            lVar.c.cancel();
                            break;
                        }
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$0(HuaweiNewPushRegistry huaweiNewPushRegistry) {
        try {
            String token = HmsInstanceId.getInstance(BPushFoundation.getApp()).getToken(AGConnectServicesConfig.fromContext(BPushFoundation.getApp()).getString("client/app_id"), "HCM");
            BPushLog.i(TAG, "HmsInstanceId getToken HCM " + token);
            if (TextUtils.isEmpty(token)) {
                int i7 = huaweiNewPushRegistry.mGetTokenMaxTry;
                if (i7 > 0) {
                    huaweiNewPushRegistry.mGetTokenMaxTry = i7 - 1;
                    huaweiNewPushRegistry.getToken();
                } else {
                    huaweiNewPushRegistry.mGetTokenMaxTry = 1;
                }
            } else {
                huaweiNewPushRegistry.setToken(BPushFoundation.getApp(), token);
            }
        } catch (Exception e7) {
            BPushLog.e(TAG, e7.getMessage());
            huaweiNewPushRegistry.onConnectionFailed(-100, e7.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(HuaweiNewPushRegistry huaweiNewPushRegistry, Task task) {
        if (task.isSuccessful()) {
            huaweiNewPushRegistry.getToken();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HmsMessaging messaging_delegate$lambda$0() {
        return HmsMessaging.getInstance(BPushFoundation.getApp());
    }

    private final void onConnectionFailed(int i7, String str) {
        if (SystemClock.elapsedRealtime() - this.mLastReport < 1000) {
            BPushLog.w(TAG, "huawei push onConnectionFailed repeat");
            return;
        }
        this.mLastReport = SystemClock.elapsedRealtime();
        int pushType = getPushType();
        long j7 = i7;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        EventInfo eventInfoCreateFailedEventInfo = createFailedEventInfo(pushType, j7, str2);
        addAbTestInfo(eventInfoCreateFailedEventInfo);
        this.mBPushManager.reportEventRegisterFailed(BPushFoundation.getApp(), eventInfoCreateFailedEventInfo);
        this.mBPushManager.degradeToDefaultPush();
        BPushLog.w(TAG, "huawei push register degrade");
    }

    private final void requestNotification(ComponentActivity componentActivity, int i7, NotificationPermissionCallback notificationPermissionCallback) {
        this.callback = notificationPermissionCallback;
        BPushLog.i(TAG, "requestNotification");
        Intent intent = new Intent(componentActivity, (Class<?>) HuaweiNotificationActivity.class);
        intent.addFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE);
        BPushLog.i(TAG, "requestNotification -> startActivity");
        componentActivity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterPushService$lambda$0(Task task) {
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    @Nullable
    public Class<?>[] getPushComponents() {
        return this.HUAWEI_COMPONENTS;
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public int getPushType() {
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
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
            goto L80
        L22:
            r0 = 0
            r6 = r0
        L24:
            r0 = r6
            if (r0 == 0) goto L3a
            r0 = r6
            java.lang.String r1 = "sp_task_token_key"
            java.lang.String r2 = "-1"
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L1e
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L3e
        L3a:
            java.lang.String r0 = "-1"
            r6 = r0
        L3e:
            r0 = r4
            boolean r0 = r0.mNeedReport     // Catch: java.lang.Exception -> L1e
            if (r0 == 0) goto L7e
            r0 = r6
            java.lang.String r1 = "-1"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.Exception -> L1e
            if (r0 != 0) goto L7e
            r0 = r4
            r1 = 0
            r0.mNeedReport = r1     // Catch: java.lang.Exception -> L1e
            java.lang.String r0 = "HuaweiPushRegistry"
            java.lang.String r1 = "reportLocalToken"
            com.bilibili.lib.push.BPushLog.i(r0, r1)     // Catch: java.lang.Exception -> L1e
            r0 = r4
            r1 = r6
            r2 = r4
            int r2 = r2.getPushType()     // Catch: java.lang.Exception -> L1e
            com.bilibili.lib.push.EventInfo r0 = r0.createEventInfo(r1, r2)     // Catch: java.lang.Exception -> L1e
            r7 = r0
            r0 = r5
            if (r0 == 0) goto L7e
            r0 = r4
            com.bilibili.lib.push.IPushManagerService r0 = r0.mBPushManager     // Catch: java.lang.Exception -> L1e
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L7e
            r0 = r8
            r1 = r5
            r2 = r7
            r0.reportLocalToken(r1, r2)     // Catch: java.lang.Exception -> L1e
        L7e:
            r0 = r6
            return r0
        L80:
            java.lang.String r0 = "HuaweiPushRegistry"
            r1 = r5
            java.lang.String r1 = r1.getMessage()
            com.bilibili.lib.push.BPushLog.e(r0, r1)
            java.lang.String r0 = "-1"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.push.HuaweiNewPushRegistry.getToken(android.content.Context):java.lang.String");
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void init() {
        try {
            if (EntryPointKt.getHwPushOpt()) {
                BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
            }
            AGConnectServicesConfig.fromContext(BPushFoundation.getApp()).overlayWith(new b(BPushFoundation.getApp()));
            getMessaging().setAutoInitEnabled(true);
            getMessaging().turnOnPush().addOnCompleteListener(new q(this));
            BuildersKt.launch$default(this.scope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        } catch (Exception e7) {
            BPushLog.e(TAG, e7.getMessage());
        }
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public boolean isSupport() {
        if (RomUtils.isHuaweiRom()) {
            return true;
        }
        return checkOthers();
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public boolean isSupportPermissionRequest() {
        return true;
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
            Utils.toggleComponentAvailability(context, true, this.HUAWEI_COMPONENTS);
        }
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void registerUserToken(@Nullable Context context, boolean z6) {
        synchronized (this) {
            String str = this.mToken;
            if (str != null) {
                IPushManagerService iPushManagerService = this.mBPushManager;
                if (iPushManagerService != null) {
                    iPushManagerService.reportEventLoginIn(context, createEventInfo(str, getPushType()), Boolean.valueOf(z6));
                }
            } else {
                this.isCalledRegisterUserToken = true;
            }
        }
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void requestNotificationPermission(@Nullable ComponentActivity componentActivity, int i7, @Nullable NotificationPermissionCallback notificationPermissionCallback) {
        if (componentActivity == null) {
            return;
        }
        requestNotification(componentActivity, i7, notificationPermissionCallback);
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
                iPushManagerService2.reportEventStartup(context, createEventInfo(str, getPushType()));
            }
            if (this.isCalledRegisterUserToken) {
                this.isCalledRegisterUserToken = false;
                IPushManagerService iPushManagerService3 = this.mBPushManager;
                if (iPushManagerService3 != null) {
                    iPushManagerService3.reportEventLoginIn(context, createEventInfo(str, getPushType()), Boolean.FALSE);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.huawei.hmf.tasks.OnCompleteListener, java.lang.Object] */
    @Override // com.bilibili.lib.push.IPushRegistry
    public void unregisterPushService(@Nullable Context context) {
        getMessaging().turnOffPush().addOnCompleteListener((OnCompleteListener) new Object());
        synchronized (this) {
            this.mPushEnable = false;
            Unit unit = Unit.INSTANCE;
        }
        if (context != null) {
            Utils.toggleComponentAvailability(context, false, this.HUAWEI_COMPONENTS);
        }
    }

    @Override // com.bilibili.lib.push.IPushRegistry
    public void unregisterUserToken(@Nullable Context context) {
        IPushManagerService iPushManagerService;
        if (context == null || (iPushManagerService = this.mBPushManager) == null) {
            return;
        }
        iPushManagerService.reportEventLoginOut(context, createEventInfo(this.mToken, getPushType()));
    }

    public final void updateStateFlow(@NotNull PushPermissionResult pushPermissionResult) {
        this.stateFlow.setValue(pushPermissionResult);
    }
}
