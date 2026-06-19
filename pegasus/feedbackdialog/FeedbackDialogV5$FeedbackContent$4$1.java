package com.bilibili.pegasus.feedbackdialog;

import com.bilibili.app.comm.list.common.feed.FeedbackEventType;
import com.bilibili.app.comm.list.common.feed.PegasusProblemReporter;
import kntr.app.pegasus.feedbackdialog.model.FeedbackModelKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/feedbackdialog/FeedbackDialogV5$FeedbackContent$4$1.class */
public final class FeedbackDialogV5$FeedbackContent$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final FeedbackDialogV5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackDialogV5$FeedbackContent$4$1(FeedbackDialogV5 feedbackDialogV5, Continuation<? super FeedbackDialogV5$FeedbackContent$4$1> continuation) {
        super(2, continuation);
        this.this$0 = feedbackDialogV5;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeedbackDialogV5$FeedbackContent$4$1(this.this$0, continuation);
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
        PegasusProblemReporter.INSTANCE.reportFeedbackState(FeedbackEventType.PANEL_EXPOSE, MapsKt.plus(MapsKt.mapOf(new Pair[]{TuplesKt.to("has_dislike", FeedbackModelKt.hasDislike(this.this$0.f77482c) ? "1" : "0"), TuplesKt.to("has_feedback", FeedbackModelKt.hasFeedback(this.this$0.f77482c) ? "1" : "0"), TuplesKt.to("has_watch_later", FeedbackModelKt.hasWatchLater(this.this$0.f77482c) ? "1" : "0"), TuplesKt.to("has_like", "0")}), this.this$0.f77483d));
        return Unit.INSTANCE;
    }
}
