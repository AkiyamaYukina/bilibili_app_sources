package com.bilibili.ship.theseus.ogv;

import com.bapis.bilibili.app.viewunite.v1.ArcRefreshReply;
import com.bilibili.ship.theseus.united.page.comment.TheseusCommentService;
import com.bilibili.ship.theseus.united.page.tab.CommentTabGuideService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ArchiveUpdateService$refreshArchiveInfo$2.class */
final class ArchiveUpdateService$refreshArchiveInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ArcRefreshReply $reply;
    int label;
    final ArchiveUpdateService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArchiveUpdateService$refreshArchiveInfo$2(ArchiveUpdateService archiveUpdateService, ArcRefreshReply arcRefreshReply, Continuation<? super ArchiveUpdateService$refreshArchiveInfo$2> continuation) {
        super(2, continuation);
        this.this$0 = archiveUpdateService;
        this.$reply = arcRefreshReply;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ArchiveUpdateService$refreshArchiveInfo$2(this.this$0, this.$reply, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CommentTabGuideService commentTabGuideService = this.this$0.f91207g;
            TheseusCommentService.b bVarA = com.bilibili.ship.theseus.united.page.comment.g.a(this.$reply.getReplyStyle());
            this.label = 1;
            if (commentTabGuideService.a(bVarA, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
