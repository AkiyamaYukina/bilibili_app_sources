package com.bilibili.search2.halfscreen;

import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/SearchCoreHostTopBarKt$SearchCoreHostTopBar$3$1.class */
final class SearchCoreHostTopBarKt$SearchCoreHostTopBar$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $fixedClipHeightPx;
    final Function2<Integer, Integer, Unit> $onOgvTopBarDrawMetricsChanged;
    final MutableState<Integer> $topBarWidthPx$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchCoreHostTopBarKt$SearchCoreHostTopBar$3$1(int i7, Function2<? super Integer, ? super Integer, Unit> function2, MutableState<Integer> mutableState, Continuation<? super SearchCoreHostTopBarKt$SearchCoreHostTopBar$3$1> continuation) {
        super(2, continuation);
        this.$fixedClipHeightPx = i7;
        this.$onOgvTopBarDrawMetricsChanged = function2;
        this.$topBarWidthPx$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchCoreHostTopBarKt$SearchCoreHostTopBar$3$1(this.$fixedClipHeightPx, this.$onOgvTopBarDrawMetricsChanged, this.$topBarWidthPx$delegate, continuation);
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
        if (this.$topBarWidthPx$delegate.getValue().intValue() > 0 && this.$fixedClipHeightPx > 0) {
            this.$onOgvTopBarDrawMetricsChanged.invoke(Boxing.boxInt(this.$topBarWidthPx$delegate.getValue().intValue()), Boxing.boxInt(this.$fixedClipHeightPx));
        }
        return Unit.INSTANCE;
    }
}
