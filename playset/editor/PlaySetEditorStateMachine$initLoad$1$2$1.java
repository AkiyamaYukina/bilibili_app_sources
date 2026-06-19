package com.bilibili.playset.editor;

import js0.C7722d;
import js0.InterfaceC7720b;
import js0.InterfaceC7721c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetEditorStateMachine$initLoad$1$2$1.class */
final class PlaySetEditorStateMachine$initLoad$1$2$1 extends SuspendLambda implements Function3<InterfaceC7721c.d, com.freeletics.flowredux.dsl.l<C7722d>, Continuation<? super com.freeletics.flowredux.dsl.b<? extends C7722d>>, Object> {
    Object L$0;
    Object L$1;
    int label;

    public PlaySetEditorStateMachine$initLoad$1$2$1(Continuation<? super PlaySetEditorStateMachine$initLoad$1$2$1> continuation) {
        super(3, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7722d invokeSuspend$lambda$0(InterfaceC7721c.d dVar, C7722d c7722d) {
        int i7 = dVar.f122580a;
        InterfaceC7720b interfaceC7720b = i7 == 0 ? InterfaceC7720b.a.f122571a : InterfaceC7720b.e.f122576a;
        boolean z6 = i7 != 0;
        String str = dVar.f122584e;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        return C7722d.a(c7722d, i7, dVar.f122581b, str2, dVar.f122585f, dVar.f122582c, dVar.f122583d, z6, dVar.f122586g, false, false, false, null, false, null, interfaceC7720b, false, 0, 113664);
    }

    public final Object invoke(InterfaceC7721c.d dVar, com.freeletics.flowredux.dsl.l<C7722d> lVar, Continuation<? super com.freeletics.flowredux.dsl.b<C7722d>> continuation) {
        PlaySetEditorStateMachine$initLoad$1$2$1 playSetEditorStateMachine$initLoad$1$2$1 = new PlaySetEditorStateMachine$initLoad$1$2$1(continuation);
        playSetEditorStateMachine$initLoad$1$2$1.L$0 = dVar;
        playSetEditorStateMachine$initLoad$1$2$1.L$1 = lVar;
        return playSetEditorStateMachine$initLoad$1$2$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final InterfaceC7721c.d dVar = (InterfaceC7721c.d) this.L$0;
        com.freeletics.flowredux.dsl.l lVar = (com.freeletics.flowredux.dsl.l) this.L$1;
        Function1 function1 = new Function1(dVar) { // from class: com.bilibili.playset.editor.t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final InterfaceC7721c.d f84840a;

            {
                this.f84840a = dVar;
            }

            public final Object invoke(Object obj2) {
                return PlaySetEditorStateMachine$initLoad$1$2$1.invokeSuspend$lambda$0(this.f84840a, (C7722d) obj2);
            }
        };
        lVar.getClass();
        return new com.freeletics.flowredux.dsl.m(function1);
    }
}
