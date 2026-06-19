package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import kotlin.Result;
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
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsService$showPanel$1.class */
public final class InteractiveSettingsService$showPanel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InteractiveSettingsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveSettingsService$showPanel$1(InteractiveSettingsService interactiveSettingsService, Continuation<? super InteractiveSettingsService$showPanel$1> continuation) {
        super(2, continuation);
        this.this$0 = interactiveSettingsService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InteractiveSettingsService$showPanel$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            d dVar = this.this$0.f99785d;
            this.label = 1;
            Object objA = dVar.a(this);
            obj2 = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        InteractiveSettingsService interactiveSettingsService = this.this$0;
        if (Result.isSuccess-impl(obj2)) {
            InteractionManagementV2 interactionManagementV2A = ((InteractiveSettingsData) obj2).a();
            if (interactionManagementV2A == null || !interactionManagementV2A.a()) {
                BLog.i("InteractiveSettingsService$showPanel$1-invokeSuspend", "[theseus-united-InteractiveSettingsService$showPanel$1-invokeSuspend] panel not show, can not show");
            } else {
                interactiveSettingsService.f99785d.f99808c.setValue(interactionManagementV2A.b());
                if (((Boolean) interactiveSettingsService.f99796p.getValue()).booleanValue()) {
                    interactiveSettingsService.f99795o = BuildersKt.launch$default(interactiveSettingsService.f99782a, (CoroutineContext) null, (CoroutineStart) null, new InteractiveSettingsService$showInteractiveSettingsPanel$1(interactiveSettingsService, null), 3, (Object) null);
                } else {
                    BLog.i("InteractiveSettingsService-showInteractiveSettingsPanel", "[theseus-united-InteractiveSettingsService-showInteractiveSettingsPanel] InteractiveSettingsPanel is Showing");
                }
            }
        }
        if (Result.exceptionOrNull-impl(obj2) != null) {
            BLog.i("InteractiveSettingsService$showPanel$1-invokeSuspend", "[theseus-united-InteractiveSettingsService$showPanel$1-invokeSuspend] panel not show, request failed");
        }
        return Unit.INSTANCE;
    }
}
