package com.bilibili.studio.editor.moudle.editormain.ui.fragments.transition;

import com.bilibili.studio.videoeditor.ms.transition.TransitionSelectItem;
import java.util.HashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/transition/BiliEditorTransitionRepository$fetchAllTransition$2$downloaded$1.class */
public final class BiliEditorTransitionRepository$fetchAllTransition$2$downloaded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends TransitionSelectItem>>, Object> {
    int label;
    final j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorTransitionRepository$fetchAllTransition$2$downloaded$1(j jVar, Continuation<? super BiliEditorTransitionRepository$fetchAllTransition$2$downloaded$1> continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorTransitionRepository$fetchAllTransition$2$downloaded$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends TransitionSelectItem>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.getClass();
        String str = OC0.h.f17810a;
        HashMap map = new HashMap();
        OC0.h.K(OC0.h.f17815f, map);
        OC0.h.K(OC0.h.f17816g, map);
        OC0.h.K(OC0.h.h, map);
        return map;
    }
}
