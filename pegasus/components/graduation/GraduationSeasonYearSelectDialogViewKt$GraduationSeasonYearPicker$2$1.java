package com.bilibili.pegasus.components.graduation;

import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/GraduationSeasonYearSelectDialogViewKt$GraduationSeasonYearPicker$2$1.class */
final class GraduationSeasonYearSelectDialogViewKt$GraduationSeasonYearPicker$2$1 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
    final MutableState<Float> $dragOffsetPx$delegate;
    final float $itemHeightPx;
    final Function1<Integer, Unit> $onYearChanged;
    final int $selectedIndex;
    final List<a0> $years;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GraduationSeasonYearSelectDialogViewKt$GraduationSeasonYearPicker$2$1(int i7, float f7, List<a0> list, Function1<? super Integer, Unit> function1, MutableState<Float> mutableState, Continuation<? super GraduationSeasonYearSelectDialogViewKt$GraduationSeasonYearPicker$2$1> continuation) {
        super(3, continuation);
        this.$selectedIndex = i7;
        this.$itemHeightPx = f7;
        this.$years = list;
        this.$onYearChanged = function1;
        this.$dragOffsetPx$delegate = mutableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((CoroutineScope) obj, ((Number) obj2).floatValue(), (Continuation<? super Unit>) obj3);
    }

    public final Object invoke(CoroutineScope coroutineScope, float f7, Continuation<? super Unit> continuation) {
        return new GraduationSeasonYearSelectDialogViewKt$GraduationSeasonYearPicker$2$1(this.$selectedIndex, this.$itemHeightPx, this.$years, this.$onYearChanged, this.$dragOffsetPx$delegate, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i7 = this.$selectedIndex;
        MutableState<Float> mutableState = this.$dragOffsetPx$delegate;
        float f7 = s0.f76204b;
        this.$onYearChanged.invoke(Boxing.boxInt(this.$years.get(RangesKt.coerceIn(i7 - MathKt.roundToInt(mutableState.getValue().floatValue() / this.$itemHeightPx), 0, CollectionsKt.getLastIndex(this.$years))).f76103a));
        this.$dragOffsetPx$delegate.setValue(Float.valueOf(0.0f));
        return Unit.INSTANCE;
    }
}
