package com.bilibili.playset.editor;

import js0.InterfaceC7721c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetEditorViewModel$dispatch$1.class */
public final class PlaySetEditorViewModel$dispatch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final InterfaceC7721c $action;
    int label;
    final PlaySetEditorViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaySetEditorViewModel$dispatch$1(PlaySetEditorViewModel playSetEditorViewModel, InterfaceC7721c interfaceC7721c, Continuation<? super PlaySetEditorViewModel$dispatch$1> continuation) {
        super(2, continuation);
        this.this$0 = playSetEditorViewModel;
        this.$action = interfaceC7721c;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaySetEditorViewModel$dispatch$1(this.this$0, this.$action, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            J j7 = this.this$0.f84794a;
            InterfaceC7721c interfaceC7721c = this.$action;
            this.label = 1;
            if (j7.d(interfaceC7721c, this) == coroutine_suspended) {
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
