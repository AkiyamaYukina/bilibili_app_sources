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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetEditorStateMachine$initLoad$1$6$3.class */
final class PlaySetEditorStateMachine$initLoad$1$6$3 extends SuspendLambda implements Function3<InterfaceC7721c.e, com.freeletics.flowredux.dsl.l<C7722d>, Continuation<? super com.freeletics.flowredux.dsl.b<? extends C7722d>>, Object> {
    Object L$0;
    Object L$1;
    int label;

    public PlaySetEditorStateMachine$initLoad$1$6$3(Continuation<? super PlaySetEditorStateMachine$initLoad$1$6$3> continuation) {
        super(3, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7722d invokeSuspend$lambda$0(InterfaceC7721c.e eVar, C7722d c7722d) {
        return C7722d.a(c7722d, 0, 0L, eVar.f122587a, 0, null, null, false, false, false, false, false, null, false, null, null, false, 0, 131059);
    }

    public final Object invoke(InterfaceC7721c.e eVar, com.freeletics.flowredux.dsl.l<C7722d> lVar, Continuation<? super com.freeletics.flowredux.dsl.b<C7722d>> continuation) {
        PlaySetEditorStateMachine$initLoad$1$6$3 playSetEditorStateMachine$initLoad$1$6$3 = new PlaySetEditorStateMachine$initLoad$1$6$3(continuation);
        playSetEditorStateMachine$initLoad$1$6$3.L$0 = eVar;
        playSetEditorStateMachine$initLoad$1$6$3.L$1 = lVar;
        return playSetEditorStateMachine$initLoad$1$6$3.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final InterfaceC7721c.e eVar = (InterfaceC7721c.e) this.L$0;
        com.freeletics.flowredux.dsl.l lVar = (com.freeletics.flowredux.dsl.l) this.L$1;
        Function1 function1 = new Function1(eVar) { // from class: com.bilibili.playset.editor.B

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterfaceC7721c.e f84737a;

            {
                this.f84737a = eVar;
            }

            public final Object invoke(Object obj2) {
                return PlaySetEditorStateMachine$initLoad$1$6$3.invokeSuspend$lambda$0(this.f84737a, (C7722d) obj2);
            }
        };
        lVar.getClass();
        return new com.freeletics.flowredux.dsl.m(function1);
    }
}
