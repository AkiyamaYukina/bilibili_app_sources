package com.bilibili.tgwt.watermark;

import com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.a;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/watermark/PgcPlayerWatermarkFunctionWidget$repeatOnWidgetShow$2.class */
public final class PgcPlayerWatermarkFunctionWidget$repeatOnWidgetShow$2 extends SuspendLambda implements Function3<a.b, Boolean, Continuation<? super Pair<? extends a.b, ? extends Boolean>>, Object> {
    Object L$0;
    boolean Z$0;
    int label;

    public PgcPlayerWatermarkFunctionWidget$repeatOnWidgetShow$2(Continuation<? super PgcPlayerWatermarkFunctionWidget$repeatOnWidgetShow$2> continuation) {
        super(3, continuation);
    }

    public final Object invoke(a.b bVar, boolean z6, Continuation<? super Pair<a.b, Boolean>> continuation) {
        PgcPlayerWatermarkFunctionWidget$repeatOnWidgetShow$2 pgcPlayerWatermarkFunctionWidget$repeatOnWidgetShow$2 = new PgcPlayerWatermarkFunctionWidget$repeatOnWidgetShow$2(continuation);
        pgcPlayerWatermarkFunctionWidget$repeatOnWidgetShow$2.L$0 = bVar;
        pgcPlayerWatermarkFunctionWidget$repeatOnWidgetShow$2.Z$0 = z6;
        return pgcPlayerWatermarkFunctionWidget$repeatOnWidgetShow$2.invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((a.b) obj, ((Boolean) obj2).booleanValue(), (Continuation<? super Pair<a.b, Boolean>>) obj3);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new Pair((a.b) this.L$0, Boxing.boxBoolean(this.Z$0));
    }
}
