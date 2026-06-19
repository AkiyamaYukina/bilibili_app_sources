package com.bilibili.playerbizcommonv2.widget.speed;

import com.bilibili.playerbizcommonv2.widget.speed.n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/TripleSpeedFunctionWidgetV2$_uiStateFlow$2$1.class */
final class TripleSpeedFunctionWidgetV2$_uiStateFlow$2$1 extends SuspendLambda implements Function2<n.d, Continuation<? super Unit>, Object> {
    final MutableStateFlow<n.d> $delegate;
    Object L$0;
    int label;
    final n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripleSpeedFunctionWidgetV2$_uiStateFlow$2$1(n nVar, MutableStateFlow<n.d> mutableStateFlow, Continuation<? super TripleSpeedFunctionWidgetV2$_uiStateFlow$2$1> continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$delegate = mutableStateFlow;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TripleSpeedFunctionWidgetV2$_uiStateFlow$2$1 tripleSpeedFunctionWidgetV2$_uiStateFlow$2$1 = new TripleSpeedFunctionWidgetV2$_uiStateFlow$2$1(this.this$0, this.$delegate, continuation);
        tripleSpeedFunctionWidgetV2$_uiStateFlow$2$1.L$0 = obj;
        return tripleSpeedFunctionWidgetV2$_uiStateFlow$2$1;
    }

    public final Object invoke(n.d dVar, Continuation<? super Unit> continuation) {
        return create(dVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        n.d dVarA = (n.d) this.L$0;
        Iterator it = ((ArrayList) this.this$0.f83436c).iterator();
        while (it.hasNext()) {
            dVarA = ((r) it.next()).a();
        }
        this.$delegate.setValue(dVarA);
        return Unit.INSTANCE;
    }
}
