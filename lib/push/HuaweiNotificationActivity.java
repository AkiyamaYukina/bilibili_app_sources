package com.bilibili.lib.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.lib.tribe.core.internal.Hooks;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/HuaweiNotificationActivity.class */
public final class HuaweiNotificationActivity extends ComponentActivity {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f64221y = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public String f64222x = "";

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object K6(com.bilibili.lib.push.HuaweiNotificationActivity r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.lib.push.HuaweiNotificationActivity$enableNotification$1
            if (r0 == 0) goto L2a
            r0 = r6
            com.bilibili.lib.push.HuaweiNotificationActivity$enableNotification$1 r0 = (com.bilibili.lib.push.HuaweiNotificationActivity$enableNotification$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2a
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L34
        L2a:
            com.bilibili.lib.push.HuaweiNotificationActivity$enableNotification$1 r0 = new com.bilibili.lib.push.HuaweiNotificationActivity$enableNotification$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L34:
            r0 = r6
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L61
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L57
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r9
            r5 = r0
            goto L8e
        L57:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L61:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getDefault()
            r9 = r0
            com.bilibili.lib.push.HuaweiNotificationActivity$enableNotification$2 r0 = new com.bilibili.lib.push.HuaweiNotificationActivity$enableNotification$2
            r1 = r0
            r2 = r5
            r3 = 0
            r1.<init>(r2, r3)
            r5 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r9
            r1 = r5
            r2 = r6
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r1, r2)
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            r1 = r8
            if (r0 != r1) goto L8e
            r0 = r8
            r5 = r0
            goto L96
        L8e:
            r0 = r5
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.unbox-impl()
            r5 = r0
        L96:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.push.HuaweiNotificationActivity.K6(com.bilibili.lib.push.HuaweiNotificationActivity, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void L6(int i7, boolean z6, boolean z7) {
        IPushRegistry pushRegistry = BPushManagerServiceProvider.INSTANCE.get().getPushRegistry();
        if (pushRegistry instanceof HuaweiNewPushRegistry) {
            if (z6) {
                ((HuaweiNewPushRegistry) pushRegistry).updateStateFlow(new PushPermissionResult(true, z7, i7, null, 8, null));
            } else {
                ((HuaweiNewPushRegistry) pushRegistry).updateStateFlow(new PushPermissionResult(false, z7, i7, this.f64222x));
            }
        }
        finish();
    }

    @Override // lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        BPushLog.i("HuaweiPushRegistry", "HuaweiNotificationActivity onActivityResult, resultCode: " + i8);
        if (i7 == 100) {
            L6(0, i8 == -1, true);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(24);
    }

    @Override // lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f64222x = "";
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new HuaweiNotificationActivity$request$1(BPushManagerServiceProvider.INSTANCE.get().getPushConfig().getPushParams().huaweiNotificationTimeout(), this, null), 3, (Object) null);
    }
}
