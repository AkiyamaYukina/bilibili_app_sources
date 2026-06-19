package com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition;

import UC0.n;
import com.bilibili.studio.videoeditor.ms.transition.TransitionData;
import java.util.List;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/BiliEditorTransitionRepository$fetchAllTransition$2$netData$1.class */
public final class BiliEditorTransitionRepository$fetchAllTransition$2$netData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends TransitionData.TransitionTabBean>>, Object> {
    int label;
    final j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorTransitionRepository$fetchAllTransition$2$netData$1(j jVar, Continuation<? super BiliEditorTransitionRepository$fetchAllTransition$2$netData$1> continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorTransitionRepository$fetchAllTransition$2$netData$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends TransitionData.TransitionTabBean>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            j jVar = this.this$0;
            this.label = 1;
            jVar.getClass();
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            Lazy<n> lazy = n.f24629b;
            n.a.a().d(new i(cancellableContinuationImpl), new g(cancellableContinuationImpl), new h(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            obj = result;
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
