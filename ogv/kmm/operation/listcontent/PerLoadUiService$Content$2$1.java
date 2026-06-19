package com.bilibili.ogv.kmm.operation.listcontent;

import androidx.compose.foundation.lazy.LazyListState;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/listcontent/PerLoadUiService$Content$2$1.class */
final class PerLoadUiService$Content$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    int label;
    final PerLoadUiService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerLoadUiService$Content$2$1(PerLoadUiService perLoadUiService, Continuation<? super PerLoadUiService$Content$2$1> continuation) {
        super(2, continuation);
        this.this$0 = perLoadUiService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PerLoadUiService$Content$2$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            PerLoadUiService perLoadUiService = this.this$0;
            if (perLoadUiService.f68527a.f67991f != 0) {
                Iterator<T> it = perLoadUiService.f68534i.iterator();
                int i8 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i8 = -1;
                        break;
                    }
                    com.bilibili.ogv.kmm.operation.api.d dVar = ((a) it.next()).f68543c;
                    if (dVar != null && dVar.getId() == perLoadUiService.f68527a.f67991f) {
                        break;
                    }
                    i8++;
                }
                Integer numBoxInt = Boxing.boxInt(i8);
                if (numBoxInt.intValue() < 0) {
                    numBoxInt = null;
                }
                if (numBoxInt != null) {
                    PerLoadUiService perLoadUiService2 = this.this$0;
                    int iIntValue = numBoxInt.intValue();
                    LazyListState lazyListState = perLoadUiService2.f68537l;
                    this.I$0 = iIntValue;
                    this.I$1 = 0;
                    this.label = 1;
                    if (LazyListState.animateScrollToItem$default(lazyListState, iIntValue, 0, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
