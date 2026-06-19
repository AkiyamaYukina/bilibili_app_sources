package com.bilibili.ship.theseus.ogv;

import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvDanmakuInputColorsModule$provide$1.class */
final class OgvDanmakuInputColorsModule$provide$1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    final MutableState<Boolean> $useThemed$delegate;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvDanmakuInputColorsModule$provide$1(MutableState<Boolean> mutableState, Continuation<? super OgvDanmakuInputColorsModule$provide$1> continuation) {
        super(2, continuation);
        this.$useThemed$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvDanmakuInputColorsModule$provide$1 ogvDanmakuInputColorsModule$provide$1 = new OgvDanmakuInputColorsModule$provide$1(this.$useThemed$delegate, continuation);
        ogvDanmakuInputColorsModule$provide$1.I$0 = ((Number) obj).intValue();
        return ogvDanmakuInputColorsModule$provide$1;
    }

    public final Object invoke(int i7, Continuation<? super Unit> continuation) {
        return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$useThemed$delegate.setValue(Boolean.valueOf(this.I$0 == 0));
        return Unit.INSTANCE;
    }
}
