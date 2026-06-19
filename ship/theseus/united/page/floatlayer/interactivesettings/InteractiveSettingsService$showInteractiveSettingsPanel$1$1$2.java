package com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings;

import com.bilibili.app.screen.adjust.widget.q;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/interactivesettings/InteractiveSettingsService$showInteractiveSettingsPanel$1$1$2.class */
public final class InteractiveSettingsService$showInteractiveSettingsPanel$1$1$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<q> $screenAdjustDialog;
    int label;
    final InteractiveSettingsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveSettingsService$showInteractiveSettingsPanel$1$1$2(InteractiveSettingsService interactiveSettingsService, Ref.ObjectRef<q> objectRef, Continuation<? super InteractiveSettingsService$showInteractiveSettingsPanel$1$1$2> continuation) {
        super(1, continuation);
        this.this$0 = interactiveSettingsService;
        this.$screenAdjustDialog = objectRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(Ref.ObjectRef objectRef, boolean z6) {
        BLog.i("InteractiveSettingsService", "back action triggered");
        q qVar = (q) objectRef.element;
        if (qVar == null) {
            return true;
        }
        qVar.a();
        return true;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InteractiveSettingsService$showInteractiveSettingsPanel$1$1$2(this.this$0, this.$screenAdjustDialog, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BackActionRepository backActionRepository = this.this$0.f99792l;
            final Ref.ObjectRef<q> objectRef = this.$screenAdjustDialog;
            Function1<? super Boolean, Boolean> function1 = new Function1(objectRef) { // from class: com.bilibili.ship.theseus.united.page.floatlayer.interactivesettings.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Ref.ObjectRef f99825a;

                {
                    this.f99825a = objectRef;
                }

                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(InteractiveSettingsService$showInteractiveSettingsPanel$1$1$2.invokeSuspend$lambda$0(this.f99825a, ((Boolean) obj2).booleanValue()));
                }
            };
            this.label = 1;
            if (backActionRepository.b(function1, this) == coroutine_suspended) {
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
