package com.bilibili.playset.editor;

import js0.C7722d;
import js0.InterfaceC7720b;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetEditorStateMachine$initLoad$1$4$1.class */
final class PlaySetEditorStateMachine$initLoad$1$4$1 extends SuspendLambda implements Function2<com.freeletics.flowredux.dsl.l<C7722d>, Continuation<? super com.freeletics.flowredux.dsl.b<? extends C7722d>>, Object> {
    Object L$0;
    int label;
    final J this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaySetEditorStateMachine$initLoad$1$4$1(J j7, Continuation<? super PlaySetEditorStateMachine$initLoad$1$4$1> continuation) {
        super(2, continuation);
        this.this$0 = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7722d invokeSuspend$lambda$0(Object obj, C7722d c7722d) {
        C7722d c7722dA;
        if (Result.isSuccess-impl(obj)) {
            InterfaceC7720b.a aVar = InterfaceC7720b.a.f122571a;
            if (Result.isFailure-impl(obj)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            c7722dA = C7722d.a(c7722d, 0, 0L, null, 0, null, null, false, false, true, num == null || num.intValue() != 0, false, null, false, null, aVar, false, 0, 113919);
        } else {
            c7722dA = C7722d.a(c7722d, 0, 0L, null, 0, null, null, false, false, true, false, false, null, false, null, InterfaceC7720b.C1304b.f122572a, false, 0, 114431);
        }
        return c7722dA;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaySetEditorStateMachine$initLoad$1$4$1 playSetEditorStateMachine$initLoad$1$4$1 = new PlaySetEditorStateMachine$initLoad$1$4$1(this.this$0, continuation);
        playSetEditorStateMachine$initLoad$1$4$1.L$0 = obj;
        return playSetEditorStateMachine$initLoad$1$4$1;
    }

    public final Object invoke(com.freeletics.flowredux.dsl.l<C7722d> lVar, Continuation<? super com.freeletics.flowredux.dsl.b<C7722d>> continuation) {
        return create(lVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        com.freeletics.flowredux.dsl.l lVar;
        Object objH;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            lVar = (com.freeletics.flowredux.dsl.l) this.L$0;
            String strA = w8.y.a();
            J j7 = this.this$0;
            this.L$0 = lVar;
            this.label = 1;
            objH = J.h(j7, strA, this);
            if (objH == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.freeletics.flowredux.dsl.l lVar2 = (com.freeletics.flowredux.dsl.l) this.L$0;
            ResultKt.throwOnFailure(obj);
            objH = ((Result) obj).unbox-impl();
            lVar = lVar2;
        }
        final Object obj2 = objH;
        Function1 function1 = new Function1(obj2) { // from class: com.bilibili.playset.editor.u

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f84841a;

            {
                this.f84841a = obj2;
            }

            public final Object invoke(Object obj3) {
                return PlaySetEditorStateMachine$initLoad$1$4$1.invokeSuspend$lambda$0(this.f84841a, (C7722d) obj3);
            }
        };
        lVar.getClass();
        return new com.freeletics.flowredux.dsl.m(function1);
    }
}
