package com.bilibili.search2.result.holder.chatgpt.api;

import com.bilibili.app.comm.list.widget.opus.A;
import com.bilibili.app.comm.list.widget.opus.I;
import com.bilibili.app.comm.list.widget.opus.W;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/api/SearchChatResultItem$Bubble$typeWriterAnim$progressiveItem$1.class */
public final class SearchChatResultItem$Bubble$typeWriterAnim$progressiveItem$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super A>, Object> {
    final A $item;
    final Ref.IntRef $nextStep;
    final Ref.ObjectRef<I> $progression;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchChatResultItem$Bubble$typeWriterAnim$progressiveItem$1(Ref.ObjectRef<I> objectRef, Ref.IntRef intRef, A a7, Continuation<? super SearchChatResultItem$Bubble$typeWriterAnim$progressiveItem$1> continuation) {
        super(2, continuation);
        this.$progression = objectRef;
        this.$nextStep = intRef;
        this.$item = a7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchChatResultItem$Bubble$typeWriterAnim$progressiveItem$1(this.$progression, this.$nextStep, this.$item, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super A> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Ref.ObjectRef<I> objectRef = this.$progression;
        objectRef.element = ((I) objectRef.element).b(this.$nextStep.element);
        return W.b(this.$item, (I) this.$progression.element);
    }
}
