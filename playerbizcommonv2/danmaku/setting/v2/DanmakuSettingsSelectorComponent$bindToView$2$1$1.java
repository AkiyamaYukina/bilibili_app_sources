package com.bilibili.playerbizcommonv2.danmaku.setting.v2;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/setting/v2/DanmakuSettingsSelectorComponent$bindToView$2$1$1.class */
final class DanmakuSettingsSelectorComponent$bindToView$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final State<Integer> $selectedIndex$delegate;
    final MutableState<Float> $sliderPosition;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DanmakuSettingsSelectorComponent$bindToView$2$1$1(MutableState<Float> mutableState, State<Integer> state, Continuation<? super DanmakuSettingsSelectorComponent$bindToView$2$1$1> continuation) {
        super(2, continuation);
        this.$sliderPosition = mutableState;
        this.$selectedIndex$delegate = state;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DanmakuSettingsSelectorComponent$bindToView$2$1$1(this.$sliderPosition, this.$selectedIndex$delegate, continuation);
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
        MutableState<Float> mutableState = this.$sliderPosition;
        State<Integer> state = this.$selectedIndex$delegate;
        int i7 = D.f81268d;
        mutableState.setValue(Boxing.boxFloat(state.getValue().intValue()));
        return Unit.INSTANCE;
    }
}
