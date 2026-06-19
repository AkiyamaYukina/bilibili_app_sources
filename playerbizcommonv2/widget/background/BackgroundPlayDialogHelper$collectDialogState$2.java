package com.bilibili.playerbizcommonv2.widget.background;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/background/BackgroundPlayDialogHelper$collectDialogState$2.class */
final class BackgroundPlayDialogHelper$collectDialogState$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    final Function3<RunningUIComponent, Function0<Unit>, Continuation<? super Unit>, Object> $keepEnforceDialogShowing;
    final Function1<Continuation<? super Unit>, Object> $waitHalfScreen;
    boolean Z$0;
    int label;
    final g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlayDialogHelper$collectDialogState$2(g gVar, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Function3<? super RunningUIComponent, ? super Function0<Unit>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super BackgroundPlayDialogHelper$collectDialogState$2> continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$waitHalfScreen = function1;
        this.$keepEnforceDialogShowing = function3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BackgroundPlayDialogHelper$collectDialogState$2 backgroundPlayDialogHelper$collectDialogState$2 = new BackgroundPlayDialogHelper$collectDialogState$2(this.this$0, this.$waitHalfScreen, this.$keepEnforceDialogShowing, continuation);
        backgroundPlayDialogHelper$collectDialogState$2.Z$0 = ((Boolean) obj).booleanValue();
        return backgroundPlayDialogHelper$collectDialogState$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
        return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            boolean z6 = this.Z$0;
            g gVar = this.this$0;
            Function1<Continuation<? super Unit>, Object> function1 = this.$waitHalfScreen;
            Function3<RunningUIComponent, Function0<Unit>, Continuation<? super Unit>, Object> function3 = this.$keepEnforceDialogShowing;
            this.label = 1;
            if (g.a(gVar, z6, function1, function3, this) == coroutine_suspended) {
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
