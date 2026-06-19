package com.bilibili.ship.theseus.united.page.charge;

import G0.g;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.playerbizcommon.utils.l;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/charge/ChargeService$showChargePayLayer$2$1$2.class */
public final class ChargeService$showChargePayLayer$2$1$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final l $ugcSoftKeyBoardHelper;
    final TheseusWebUIComponent $uiComponent;
    int label;
    final ChargeService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.charge.ChargeService$showChargePayLayer$2$1$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/charge/ChargeService$showChargePayLayer$2$1$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<WindowSizeClass> $screenSize;
        final l $ugcSoftKeyBoardHelper;
        final TheseusWebUIComponent $uiComponent;
        Object L$0;
        int label;
        final ChargeService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<WindowSizeClass> objectRef, l lVar, ChargeService chargeService, TheseusWebUIComponent theseusWebUIComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$screenSize = objectRef;
            this.$ugcSoftKeyBoardHelper = lVar;
            this.this$0 = chargeService;
            this.$uiComponent = theseusWebUIComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$screenSize, this.$ugcSoftKeyBoardHelper, this.this$0, this.$uiComponent, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
            return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                WindowSizeClass windowSizeClass = (WindowSizeClass) this.L$0;
                if (!Intrinsics.areEqual(this.$screenSize.element, windowSizeClass)) {
                    this.$screenSize.element = windowSizeClass;
                    this.$ugcSoftKeyBoardHelper.c();
                    InputMethodManagerHelper.tryHideSoftInput(this.this$0.f99167b);
                    this.$uiComponent.j(0);
                    this.label = 1;
                    if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$ugcSoftKeyBoardHelper.b(this.this$0.f99167b.getWindow());
            this.$uiComponent.g();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargeService$showChargePayLayer$2$1$2(ChargeService chargeService, l lVar, TheseusWebUIComponent theseusWebUIComponent, Continuation<? super ChargeService$showChargePayLayer$2$1$2> continuation) {
        super(1, continuation);
        this.this$0 = chargeService;
        this.$ugcSoftKeyBoardHelper = lVar;
        this.$uiComponent = theseusWebUIComponent;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ChargeService$showChargePayLayer$2$1$2(this.this$0, this.$ugcSoftKeyBoardHelper, this.$uiComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            Ref.ObjectRef objectRefB = g.b(obj);
            objectRefB.element = this.this$0.f99172g.b();
            ChargeService chargeService = this.this$0;
            StateFlow<WindowSizeClass> stateFlow = chargeService.f99172g.f102939c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRefB, this.$ugcSoftKeyBoardHelper, chargeService, this.$uiComponent, null);
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
