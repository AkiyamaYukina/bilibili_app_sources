package com.bilibili.ogv.kmm.operation.listcontent;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.P;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/listcontent/PerLoadUiService$Content$3$1.class */
final class PerLoadUiService$Content$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final PerLoadUiService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/listcontent/PerLoadUiService$Content$3$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PerLoadUiService f68540a;

        public a(PerLoadUiService perLoadUiService) {
            this.f68540a = perLoadUiService;
        }

        public final Object emit(Object obj, Continuation continuation) {
            Object objB;
            if (((Boolean) obj).booleanValue()) {
                objB = PerLoadUiService.b(this.f68540a, continuation);
                if (objB != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objB = Unit.INSTANCE;
                }
            } else {
                objB = Unit.INSTANCE;
            }
            return objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerLoadUiService$Content$3$1(PerLoadUiService perLoadUiService, Continuation<? super PerLoadUiService$Content$3$1> continuation) {
        super(2, continuation);
        this.this$0 = perLoadUiService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(PerLoadUiService perLoadUiService) {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) P.a(perLoadUiService.f68537l);
        return lazyListItemInfo != null && lazyListItemInfo.getIndex() >= perLoadUiService.f68537l.getLayoutInfo().getTotalItemsCount() - 2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PerLoadUiService$Content$3$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final PerLoadUiService perLoadUiService = this.this$0;
            Flow flowConflate = FlowKt.conflate(SnapshotStateKt.snapshotFlow(new Function0(perLoadUiService) { // from class: com.bilibili.ogv.kmm.operation.listcontent.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PerLoadUiService f68548a;

                {
                    this.f68548a = perLoadUiService;
                }

                public final Object invoke() {
                    return Boolean.valueOf(PerLoadUiService$Content$3$1.invokeSuspend$lambda$0(this.f68548a));
                }
            }));
            a aVar = new a(this.this$0);
            this.label = 1;
            if (flowConflate.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
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
