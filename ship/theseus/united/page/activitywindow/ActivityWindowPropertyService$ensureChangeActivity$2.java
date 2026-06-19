package com.bilibili.ship.theseus.united.page.activitywindow;

import android.os.Build;
import android.view.Window;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import kntr.base.utils.foundation.RomUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowPropertyService$ensureChangeActivity$2.class */
final class ActivityWindowPropertyService$ensureChangeActivity$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final boolean $isFullScreen;
    private Object L$0;
    int label;
    final ActivityWindowPropertyService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.activitywindow.ActivityWindowPropertyService$ensureChangeActivity$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/ActivityWindowPropertyService$ensureChangeActivity$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final boolean $isFullScreen;
        int label;
        final ActivityWindowPropertyService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityWindowPropertyService activityWindowPropertyService, boolean z6, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityWindowPropertyService;
            this.$isFullScreen = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$isFullScreen, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object objCollect;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            boolean z6 = true;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ActivityWindowPropertyService activityWindowPropertyService = this.this$0;
                boolean z7 = this.$isFullScreen;
                this.label = 1;
                activityWindowPropertyService.getClass();
                if (z7) {
                    if (RomUtils.isHonorRom()) {
                        activityWindowPropertyService.b(false);
                        objCollect = Unit.INSTANCE;
                    } else {
                        WindowCompat.setDecorFitsSystemWindows(activityWindowPropertyService.f98852i, false);
                        Window window = activityWindowPropertyService.f98852i;
                        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
                        BLog.i("ActivityWindowPropertyService-hideWindowSysUi", "[theseus-united-ActivityWindowPropertyService-hideWindowSysUi] hide system ui");
                        insetsController.hide(WindowInsetsCompat.Type.systemBars());
                        insetsController.setSystemBarsBehavior(2);
                        objCollect = FlowKt.callbackFlow(new ActivityWindowPropertyService$insetChangeFlow$1(insetsController, null)).collect(new h(activityWindowPropertyService, insetsController), this);
                        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCollect = Unit.INSTANCE;
                        }
                    }
                    if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCollect = Unit.INSTANCE;
                    }
                } else {
                    if (RomUtils.isHonorRom()) {
                        activityWindowPropertyService.b(true);
                    } else {
                        WindowCompat.setDecorFitsSystemWindows(activityWindowPropertyService.f98852i, true);
                        Window window2 = activityWindowPropertyService.f98852i;
                        WindowInsetsControllerCompat insetsController2 = WindowCompat.getInsetsController(window2, window2.getDecorView());
                        insetsController2.setAppearanceLightStatusBars(false);
                        if (Build.VERSION.SDK_INT >= 26) {
                            if (activityWindowPropertyService.f98850f.f() || MultipleThemeUtils.isNightTheme(activityWindowPropertyService.f98848d)) {
                                z6 = false;
                            }
                            insetsController2.setAppearanceLightNavigationBars(z6);
                        }
                        BLog.i("ActivityWindowPropertyService-showWindowSysUi", "[theseus-united-ActivityWindowPropertyService-showWindowSysUi] show system ui");
                        insetsController2.show(WindowInsetsCompat.Type.systemBars());
                    }
                    objCollect = Unit.INSTANCE;
                }
                if (objCollect == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityWindowPropertyService$ensureChangeActivity$2(ActivityWindowPropertyService activityWindowPropertyService, boolean z6, Continuation<? super ActivityWindowPropertyService$ensureChangeActivity$2> continuation) {
        super(2, continuation);
        this.this$0 = activityWindowPropertyService;
        this.$isFullScreen = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ActivityWindowPropertyService$ensureChangeActivity$2 activityWindowPropertyService$ensureChangeActivity$2 = new ActivityWindowPropertyService$ensureChangeActivity$2(this.this$0, this.$isFullScreen, continuation);
        activityWindowPropertyService$ensureChangeActivity$2.L$0 = obj;
        return activityWindowPropertyService$ensureChangeActivity$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$isFullScreen, null), 3, (Object) null);
    }
}
