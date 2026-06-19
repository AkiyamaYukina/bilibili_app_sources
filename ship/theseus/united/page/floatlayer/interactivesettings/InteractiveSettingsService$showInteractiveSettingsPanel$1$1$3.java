package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import com.bilibili.app.screen.adjust.widget.q;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import lv0.C7893a;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsService$showInteractiveSettingsPanel$1$1$3.class */
public final class InteractiveSettingsService$showInteractiveSettingsPanel$1$1$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<q> $screenAdjustDialog;
    int label;
    final InteractiveSettingsService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.InteractiveSettingsService$showInteractiveSettingsPanel$1$1$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsService$showInteractiveSettingsPanel$1$1$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7893a.C1318a, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<q> $screenAdjustDialog;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<q> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$screenAdjustDialog = objectRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$screenAdjustDialog, continuation);
        }

        public final Object invoke(C7893a.C1318a c1318a, Continuation<? super Unit> continuation) {
            return create(c1318a, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BLog.i("InteractiveSettingsService", "episode changed, dismiss dialog");
            q qVar = (q) this.$screenAdjustDialog.element;
            if (qVar != null) {
                qVar.a();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveSettingsService$showInteractiveSettingsPanel$1$1$3(InteractiveSettingsService interactiveSettingsService, Ref.ObjectRef<q> objectRef, Continuation<? super InteractiveSettingsService$showInteractiveSettingsPanel$1$1$3> continuation) {
        super(1, continuation);
        this.this$0 = interactiveSettingsService;
        this.$screenAdjustDialog = objectRef;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InteractiveSettingsService$showInteractiveSettingsPanel$1$1$3(this.this$0, this.$screenAdjustDialog, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowDrop = FlowKt.drop(this.this$0.f99791k.f123393f, 1);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$screenAdjustDialog, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDrop, anonymousClass1, this) == coroutine_suspended) {
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
