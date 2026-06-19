package com.bilibili.playerbizcommon.features.background;

import android.app.Activity;
import com.bilibili.moduleservice.player.MiniPlayerAutoPlaySetting;
import java.lang.ref.WeakReference;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/background/BackgroundPlayService$initTopActivityObserve$1.class */
public final class BackgroundPlayService$initTopActivityObserve$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final BackgroundPlayService this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommon.features.background.BackgroundPlayService$initTopActivityObserve$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/background/BackgroundPlayService$initTopActivityObserve$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<WeakReference<Activity>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final BackgroundPlayService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BackgroundPlayService backgroundPlayService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = backgroundPlayService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(WeakReference<Activity> weakReference, Continuation<? super Unit> continuation) {
            return create(weakReference, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Activity activity;
            MiniPlayerAutoPlaySetting miniPlayerAutoPlaySetting;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WeakReference weakReference = (WeakReference) this.L$0;
            if (weakReference == null || (activity = (Activity) weakReference.get()) == null) {
                return Unit.INSTANCE;
            }
            PlayerContainer playerContainer = this.this$0.f79581a;
            PlayerContainer playerContainer2 = playerContainer;
            if (playerContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
                playerContainer2 = null;
            }
            if (activity != ContextUtilKt.findActivityOrNull(playerContainer2.getContext()) && !BackgroundPlayService.access$isCurrentActivityActive(this.this$0)) {
                IPlayerCoreService iPlayerCoreService = this.this$0.f79583c;
                if (iPlayerCoreService == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
                    iPlayerCoreService = null;
                }
                if (iPlayerCoreService.getState() == 4 && ((miniPlayerAutoPlaySetting = this.this$0.f79597r) == null || !miniPlayerAutoPlaySetting.getSpEnableInnerAutoMiniPlay())) {
                    this.this$0.e();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayService$initTopActivityObserve$1(BackgroundPlayService backgroundPlayService, Continuation<? super BackgroundPlayService$initTopActivityObserve$1> continuation) {
        super(2, continuation);
        this.this$0 = backgroundPlayService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BackgroundPlayService$initTopActivityObserve$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<WeakReference<Activity>> stateFlow = this.this$0.f79579G.f79609b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
