package com.bilibili.ship.theseus.cheese.biz.catalog;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import bu0.C5165a;
import eu0.C6985d;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogTabFragment$flowDataState$4.class */
final class CheeseCatalogTabFragment$flowDataState$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final CheeseCatalogTabFragment this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogTabFragment$flowDataState$4$a.class */
    public static final /* synthetic */ class a implements FlowCollector, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bu0.c f89143a;

        public a(bu0.c cVar) {
            this.f89143a = cVar;
        }

        public final Object emit(Object obj, Continuation continuation) {
            Object objInvokeSuspend$notifyEpItemChange = CheeseCatalogTabFragment$flowDataState$4.invokeSuspend$notifyEpItemChange(this.f89143a, (C6985d) obj, continuation);
            if (objInvokeSuspend$notifyEpItemChange != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objInvokeSuspend$notifyEpItemChange = Unit.INSTANCE;
            }
            return objInvokeSuspend$notifyEpItemChange;
        }

        public final boolean equals(Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof FlowCollector) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        public final Function<?> getFunctionDelegate() {
            return new AdaptedFunctionReference(2, this.f89143a, bu0.c.class, "notifyEpItemChange", "notifyEpItemChange(Lcom/bilibili/ship/theseus/cheese/biz/common/CheeseEpisodeData;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCatalogTabFragment$flowDataState$4(CheeseCatalogTabFragment cheeseCatalogTabFragment, Continuation<? super CheeseCatalogTabFragment$flowDataState$4> continuation) {
        super(2, continuation);
        this.this$0 = cheeseCatalogTabFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invokeSuspend$notifyEpItemChange(bu0.c cVar, C6985d c6985d, Continuation continuation) {
        int iO = cVar.O(c6985d);
        Integer numValueOf = Integer.valueOf(iO);
        if (iO < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            int i7 = 0;
            for (Object obj : (ArrayList) cVar.f57024e) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Object obj2 = ((C5165a) obj).f57015b;
                C6985d c6985d2 = obj2 instanceof C6985d ? (C6985d) obj2 : null;
                if (c6985d2 != null && c6985d.f117510e == c6985d2.f117510e) {
                    c6985d2.f117529y = c6985d.f117529y;
                }
                i7++;
            }
            cVar.notifyItemChanged(iIntValue, "watch_time_change");
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseCatalogTabFragment$flowDataState$4(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CheeseCatalogTabFragment cheeseCatalogTabFragment = this.this$0;
            Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(cheeseCatalogTabFragment.f89134e.f90693w, cheeseCatalogTabFragment.getViewLifecycleOwner().getLifecycle(), Lifecycle.State.RESUMED);
            a aVar = new a(this.this$0.f89141m);
            this.label = 1;
            if (flowFlowWithLifecycle.collect(aVar, this) == coroutine_suspended) {
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
