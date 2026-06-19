package com.bilibili.ship.theseus.united.page.comment;

import androidx.lifecycle.Lifecycle;
import com.bilibili.app.comment3.data.model.Ad;
import com.bilibili.app.comment3.data.model.CommentItem;
import com.bilibili.gripper.api.ad.biz.GAdBizKt;
import com.bilibili.gripper.api.ad.biz.GAdComment;
import com.bilibili.gripper.api.ad.biz.comment.AdCommentFrom;
import com.bilibili.gripper.api.ad.biz.comment.AdCommentShowParams;
import com.bilibili.gripper.api.ad.biz.comment.PageTrack;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.page.comment.TheseusCommentService;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$TheseusCommentExternalHandler$handleAdReportShow$2.class */
final class TheseusCommentService$TheseusCommentExternalHandler$handleAdReportShow$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<Ad> $ads;
    final CommentItem $commentItem;
    final PageTrack $pageTrack;
    int label;
    final TheseusCommentService this$0;
    final TheseusCommentService.TheseusCommentExternalHandler this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusCommentService$TheseusCommentExternalHandler$handleAdReportShow$2(List<Ad> list, TheseusCommentService theseusCommentService, PageTrack pageTrack, CommentItem commentItem, TheseusCommentService.TheseusCommentExternalHandler theseusCommentExternalHandler, Continuation<? super TheseusCommentService$TheseusCommentExternalHandler$handleAdReportShow$2> continuation) {
        super(2, continuation);
        this.$ads = list;
        this.this$0 = theseusCommentService;
        this.$pageTrack = pageTrack;
        this.$commentItem = commentItem;
        this.this$1 = theseusCommentExternalHandler;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusCommentService$TheseusCommentExternalHandler$handleAdReportShow$2(this.$ads, this.this$0, this.$pageTrack, this.$commentItem, this.this$1, continuation);
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
        List<Ad> list = this.$ads;
        TheseusCommentService theseusCommentService = this.this$0;
        PageTrack pageTrack = this.$pageTrack;
        CommentItem commentItem = this.$commentItem;
        TheseusCommentService.TheseusCommentExternalHandler theseusCommentExternalHandler = this.this$1;
        for (Ad ad : list) {
            GAdComment gAdComment = GAdBizKt.getGAdComment();
            Lifecycle lifecycle = theseusCommentService.f99230b;
            String str = ad.j;
            long j7 = commentItem.b;
            long j8 = commentItem.h.a.a;
            j jVarJ = theseusCommentService.f99234f.j();
            gAdComment.reportAdShow(lifecycle, new AdCommentShowParams(str, ad.e, pageTrack, j7, commentItem.a, j8, jVarJ != null ? (int) jVarJ.L() : 0, ((int) theseusCommentExternalHandler.f99254b.f99279d) * 1000, AdCommentFrom.UNIT_DETAIL));
        }
        return Unit.INSTANCE;
    }
}
