package com.bilibili.playset.editor;

import js0.C7722d;
import js0.InterfaceC7721c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetEditorStateMachine$initLoad$1$6$11.class */
final class PlaySetEditorStateMachine$initLoad$1$6$11 extends SuspendLambda implements Function3<InterfaceC7721c.l, com.freeletics.flowredux.dsl.l<C7722d>, Continuation<? super com.freeletics.flowredux.dsl.b<? extends C7722d>>, Object> {
    Object L$0;
    int label;

    public PlaySetEditorStateMachine$initLoad$1$6$11(Continuation<? super PlaySetEditorStateMachine$initLoad$1$6$11> continuation) {
        super(3, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7722d invokeSuspend$lambda$0(C7722d c7722d) {
        return C7722d.a(c7722d, 0, 0L, null, 0, null, null, false, false, false, false, false, null, !c7722d.f122606m, null, null, false, 0, 126975);
    }

    public final Object invoke(InterfaceC7721c.l lVar, com.freeletics.flowredux.dsl.l<C7722d> lVar2, Continuation<? super com.freeletics.flowredux.dsl.b<C7722d>> continuation) {
        PlaySetEditorStateMachine$initLoad$1$6$11 playSetEditorStateMachine$initLoad$1$6$11 = new PlaySetEditorStateMachine$initLoad$1$6$11(continuation);
        playSetEditorStateMachine$initLoad$1$6$11.L$0 = lVar2;
        return playSetEditorStateMachine$initLoad$1$6$11.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        com.freeletics.flowredux.dsl.l lVar = (com.freeletics.flowredux.dsl.l) this.L$0;
        ?? obj2 = new Object();
        lVar.getClass();
        return new com.freeletics.flowredux.dsl.m((Function1) obj2);
    }
}
