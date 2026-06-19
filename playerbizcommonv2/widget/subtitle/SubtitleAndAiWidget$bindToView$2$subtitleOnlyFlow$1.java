package com.bilibili.playerbizcommonv2.widget.subtitle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiWidget$bindToView$2$subtitleOnlyFlow$1.class */
public final class SubtitleAndAiWidget$bindToView$2$subtitleOnlyFlow$1 extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
    boolean Z$0;
    boolean Z$1;
    int label;

    public SubtitleAndAiWidget$bindToView$2$subtitleOnlyFlow$1(Continuation<? super SubtitleAndAiWidget$bindToView$2$subtitleOnlyFlow$1> continuation) {
        super(3, continuation);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Continuation<? super Boolean>) obj3);
    }

    public final Object invoke(boolean z6, boolean z7, Continuation<? super Boolean> continuation) {
        SubtitleAndAiWidget$bindToView$2$subtitleOnlyFlow$1 subtitleAndAiWidget$bindToView$2$subtitleOnlyFlow$1 = new SubtitleAndAiWidget$bindToView$2$subtitleOnlyFlow$1(continuation);
        subtitleAndAiWidget$bindToView$2$subtitleOnlyFlow$1.Z$0 = z6;
        subtitleAndAiWidget$bindToView$2$subtitleOnlyFlow$1.Z$1 = z7;
        return subtitleAndAiWidget$bindToView$2$subtitleOnlyFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(this.Z$0 && !this.Z$1);
    }
}
