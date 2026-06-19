package com.bilibili.ship.theseus.united.page.comment;

import com.bilibili.app.comment3.CommentV3Fragment;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$3$5$1$5$invokeSuspend$$inlined$collectInteractionChange$1.class */
public final class TheseusCommentService$createNewState$3$5$1$5$invokeSuspend$$inlined$collectInteractionChange$1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    final CommentV3Fragment $fragment$inlined;
    Object L$0;
    int label;
    final TheseusCommentService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusCommentService$createNewState$3$5$1$5$invokeSuspend$$inlined$collectInteractionChange$1(TheseusCommentService theseusCommentService, Continuation continuation, CommentV3Fragment commentV3Fragment) {
        super(2, continuation);
        this.this$0 = theseusCommentService;
        this.$fragment$inlined = commentV3Fragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusCommentService$createNewState$3$5$1$5$invokeSuspend$$inlined$collectInteractionChange$1 theseusCommentService$createNewState$3$5$1$5$invokeSuspend$$inlined$collectInteractionChange$1 = new TheseusCommentService$createNewState$3$5$1$5$invokeSuspend$$inlined$collectInteractionChange$1(this.this$0, continuation, this.$fragment$inlined);
        theseusCommentService$createNewState$3$5$1$5$invokeSuspend$$inlined$collectInteractionChange$1.L$0 = obj;
        return theseusCommentService$createNewState$3$5$1$5$invokeSuspend$$inlined$collectInteractionChange$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((Boolean) obj, (Continuation<? super Unit>) obj2);
    }

    public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return create(bool, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Object obj2 = this.L$0;
        String accessKey = this.this$0.f99246s.getAccessKey();
        if (accessKey == null) {
            return Unit.INSTANCE;
        }
        this.$fragment$inlined.rf(accessKey, ((Boolean) obj2).booleanValue());
        return Unit.INSTANCE;
    }
}
