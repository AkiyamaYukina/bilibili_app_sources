package com.bilibili.playset.editor;

import com.bilibili.playset.api.PlaySet;
import js0.C7719a;
import js0.C7722d;
import js0.InterfaceC7720b;
import js0.InterfaceC7721c;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetEditorStateMachine$initLoad$1$6$1.class */
final class PlaySetEditorStateMachine$initLoad$1$6$1 extends SuspendLambda implements Function3<InterfaceC7721c.a, com.freeletics.flowredux.dsl.l<C7722d>, Continuation<? super com.freeletics.flowredux.dsl.b<? extends C7722d>>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final J this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaySetEditorStateMachine$initLoad$1$6$1(J j7, Continuation<? super PlaySetEditorStateMachine$initLoad$1$6$1> continuation) {
        super(3, continuation);
        this.this$0 = j7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7722d invokeSuspend$lambda$0(C7722d c7722d) {
        return C7722d.a(c7722d, 0, 0L, null, 0, null, null, false, false, false, false, true, null, false, null, null, false, 0, 130047);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7722d invokeSuspend$lambda$1(int i7, Object obj, C7722d c7722d) {
        if (Result.isFailure-impl(obj)) {
            obj = null;
        }
        return C7722d.a(c7722d, 0, 0L, null, 0, null, null, false, false, false, false, false, "", false, null, new InterfaceC7720b.c(i7, (PlaySet) obj), false, 0, 111615);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7722d invokeSuspend$lambda$2(Object obj, C7722d c7722d) {
        return C7722d.a(c7722d, 0, 0L, null, 0, null, null, false, false, false, false, false, "", false, new C7719a(Result.exceptionOrNull-impl(obj)), null, false, 0, 119807);
    }

    public final Object invoke(InterfaceC7721c.a aVar, com.freeletics.flowredux.dsl.l<C7722d> lVar, Continuation<? super com.freeletics.flowredux.dsl.b<C7722d>> continuation) {
        PlaySetEditorStateMachine$initLoad$1$6$1 playSetEditorStateMachine$initLoad$1$6$1 = new PlaySetEditorStateMachine$initLoad$1$6$1(this.this$0, continuation);
        playSetEditorStateMachine$initLoad$1$6$1.L$0 = lVar;
        return playSetEditorStateMachine$initLoad$1$6$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2;
        C7722d c7722d;
        Object obj3;
        com.freeletics.flowredux.dsl.l lVar;
        com.freeletics.flowredux.dsl.m mVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.freeletics.flowredux.dsl.l lVar2 = (com.freeletics.flowredux.dsl.l) this.L$0;
            String strA = w8.y.a();
            ?? obj4 = new Object();
            lVar2.getClass();
            com.freeletics.flowredux.dsl.l.b((Function1) obj4);
            C7722d c7722d2 = (C7722d) lVar2.a;
            String str2 = c7722d2.f122598d != 0 ? null : c7722d2.f122597c;
            int i8 = c7722d2.f122595a;
            String str3 = c7722d2.f122599e;
            if (i8 == 1) {
                J j7 = this.this$0;
                str = str3 != null ? str3 : "";
                this.L$0 = lVar2;
                this.L$1 = c7722d2;
                this.label = 1;
                Object objF = J.f(j7, strA, str, c7722d2.f122600f, str2, c7722d2.h ? 1 : 0, this);
                obj2 = objF;
                if (objF == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                J j8 = this.this$0;
                str = str3 != null ? str3 : "";
                this.L$0 = lVar2;
                this.L$1 = c7722d2;
                this.label = 2;
                Object objG = J.g(j8, strA, str, c7722d2.f122600f, str2, c7722d2.h ? 1 : 0, c7722d2.f122596b, this);
                obj2 = objG;
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            c7722d = c7722d2;
            obj3 = obj2;
            lVar = lVar2;
        } else {
            if (i7 != 1 && i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7722d = (C7722d) this.L$1;
            com.freeletics.flowredux.dsl.l lVar3 = (com.freeletics.flowredux.dsl.l) this.L$0;
            ResultKt.throwOnFailure(obj);
            obj3 = ((Result) obj).unbox-impl();
            lVar = lVar3;
        }
        if (Result.isSuccess-impl(obj3)) {
            final int i9 = c7722d.f122595a == 1 ? 2131842633 : 2131842517;
            final Object obj5 = obj3;
            Function1 function1 = new Function1(i9, obj5) { // from class: com.bilibili.playset.editor.w

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f84861a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f84862b;

                {
                    this.f84861a = i9;
                    this.f84862b = obj5;
                }

                public final Object invoke(Object obj6) {
                    return PlaySetEditorStateMachine$initLoad$1$6$1.invokeSuspend$lambda$1(this.f84861a, this.f84862b, (C7722d) obj6);
                }
            };
            lVar.getClass();
            mVar = new com.freeletics.flowredux.dsl.m(function1);
        } else {
            final Object obj6 = obj3;
            Function1 function12 = new Function1(obj6) { // from class: com.bilibili.playset.editor.x

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Object f85060a;

                {
                    this.f85060a = obj6;
                }

                public final Object invoke(Object obj7) {
                    return PlaySetEditorStateMachine$initLoad$1$6$1.invokeSuspend$lambda$2(this.f85060a, (C7722d) obj7);
                }
            };
            lVar.getClass();
            mVar = new com.freeletics.flowredux.dsl.m(function12);
        }
        return mVar;
    }
}
