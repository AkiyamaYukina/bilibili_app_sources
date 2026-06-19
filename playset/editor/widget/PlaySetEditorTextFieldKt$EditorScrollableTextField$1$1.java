package com.bilibili.playset.editor.widget;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/widget/PlaySetEditorTextFieldKt$EditorScrollableTextField$1$1.class */
final class PlaySetEditorTextFieldKt$EditorScrollableTextField$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function1<String, Unit> $onValueChange;
    final G.l $textState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlaySetEditorTextFieldKt$EditorScrollableTextField$1$1(Function1<? super String, Unit> function1, G.l lVar, Continuation<? super PlaySetEditorTextFieldKt$EditorScrollableTextField$1$1> continuation) {
        super(2, continuation);
        this.$onValueChange = function1;
        this.$textState = lVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaySetEditorTextFieldKt$EditorScrollableTextField$1$1(this.$onValueChange, this.$textState, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$onValueChange.invoke(this.$textState.c().f6521c.toString());
        return Unit.INSTANCE;
    }
}
