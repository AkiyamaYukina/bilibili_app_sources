package com.bilibili.ship.theseus.united.page.danmaku;

import com.bilibili.app.gemini.player.feature.subtitle.GeminiSubtitleReportDialog;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$showSubtitleReportDialog$$inlined$awaitCancel$2.class */
public final class ChronosBusinessService$showSubtitleReportDialog$$inlined$awaitCancel$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final GeminiSubtitleReportDialog $dialog$inlined;
    int label;
    final ChronosBusinessService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChronosBusinessService$showSubtitleReportDialog$$inlined$awaitCancel$2(Continuation continuation, GeminiSubtitleReportDialog geminiSubtitleReportDialog, ChronosBusinessService chronosBusinessService) {
        super(2, continuation);
        this.$dialog$inlined = geminiSubtitleReportDialog;
        this.this$0 = chronosBusinessService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChronosBusinessService$showSubtitleReportDialog$$inlined$awaitCancel$2(continuation, this.$dialog$inlined, this.this$0);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            this.$dialog$inlined.dismissAllowingStateLoss();
            this.this$0.f99332c.i(this.$dialog$inlined);
            throw th;
        }
    }
}
