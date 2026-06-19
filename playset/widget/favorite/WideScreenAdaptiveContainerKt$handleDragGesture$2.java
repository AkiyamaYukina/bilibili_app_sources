package com.bilibili.playset.widget.favorite;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/WideScreenAdaptiveContainerKt$handleDragGesture$2.class */
final class WideScreenAdaptiveContainerKt$handleDragGesture$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final float $dismissThresholdPx;
    final float $maxDragOffset;
    final Function0<Unit> $onDismiss;
    final n $sheetState;
    final float $velocityThreshold;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WideScreenAdaptiveContainerKt$handleDragGesture$2(n nVar, float f7, float f8, Function0<Unit> function0, float f9, Continuation<? super WideScreenAdaptiveContainerKt$handleDragGesture$2> continuation) {
        super(2, continuation);
        this.$sheetState = nVar;
        this.$velocityThreshold = f7;
        this.$dismissThresholdPx = f8;
        this.$onDismiss = function0;
        this.$maxDragOffset = f9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(VelocityTracker velocityTracker, n nVar, float f7, PointerInputChange pointerInputChange) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (PointerEventKt.positionChange(pointerInputChange) & 4294967295L));
        velocityTracker.m3137addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), pointerInputChange.m3099getPositionF1C5BW0());
        nVar.f85772b.setFloatValue(RangesKt.coerceIn(nVar.f85772b.getFloatValue() + fIntBitsToFloat, 0.0f, f7));
        if (fIntBitsToFloat != 0.0f) {
            pointerInputChange.consume();
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WideScreenAdaptiveContainerKt$handleDragGesture$2 wideScreenAdaptiveContainerKt$handleDragGesture$2 = new WideScreenAdaptiveContainerKt$handleDragGesture$2(this.$sheetState, this.$velocityThreshold, this.$dismissThresholdPx, this.$onDismiss, this.$maxDragOffset, continuation);
        wideScreenAdaptiveContainerKt$handleDragGesture$2.L$0 = obj;
        return wideScreenAdaptiveContainerKt$handleDragGesture$2;
    }

    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return create(awaitPointerEventScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.widget.favorite.WideScreenAdaptiveContainerKt$handleDragGesture$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
