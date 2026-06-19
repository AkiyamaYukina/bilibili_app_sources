package com.bilibili.pegasus.vm;

import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.Store;
import com.bilibili.pegasus.data.base.PegasusResponse;
import com.bilibili.pegasus.data.request.PegasusResponseWrapper;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import lp0.C7878a;
import mp0.C8028c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/vm/RefreshAction$run$response$1$1.class */
public final class RefreshAction$run$response$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Resource<PegasusResponse> $it;
    final Ref.ObjectRef<List<PegasusHolderData>> $preStepItems;
    final Store<C8028c> $this_run;
    int label;
    final RefreshAction this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshAction$run$response$1$1(RefreshAction refreshAction, Resource<PegasusResponse> resource, Ref.ObjectRef<List<PegasusHolderData>> objectRef, Store<C8028c> store, Continuation<? super RefreshAction$run$response$1$1> continuation) {
        super(2, continuation);
        this.this$0 = refreshAction;
        this.$it = resource;
        this.$preStepItems = objectRef;
        this.$this_run = store;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RefreshAction$run$response$1$1(this.this$0, this.$it, this.$preStepItems, this.$this_run, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Function0<String> function0 = this.this$0.f79048a.h;
            if ((function0 != null ? (String) function0.invoke() : null) == null) {
                PegasusResponseWrapper pegasusResponseWrapperAvoidEmptyWindow = ActionsKt.avoidEmptyWindow(G.a(this.$it, this.this$0.f79048a));
                this.$preStepItems.element = pegasusResponseWrapperAvoidEmptyWindow.getItems();
                Store<C8028c> store = this.$this_run;
                C7878a c7878a = new C7878a(pegasusResponseWrapperAvoidEmptyWindow);
                this.label = 1;
                if (store.s(c7878a, this) == coroutine_suspended) {
                    return coroutine_suspended;
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
