package com.bilibili.search2.main;

import com.bilibili.search2.halfscreen.SearchCoreHostFragment;
import com.bilibili.search2.main.data.SearchPageStateModel;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchCoreFragment$observeContainerRuntimeState$1.class */
final class BiliMainSearchCoreFragment$observeContainerRuntimeState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final SearchCoreHostFragment $host;
    final SearchPageStateModel $stateModel;
    final Ref.BooleanRef $wasFullScreen;
    int label;
    final BiliMainSearchCoreFragment this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchCoreFragment$observeContainerRuntimeState$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchPageStateModel f86679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BiliMainSearchCoreFragment f86680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Ref.BooleanRef f86681c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SearchCoreHostFragment f86682d;

        public a(SearchPageStateModel searchPageStateModel, BiliMainSearchCoreFragment biliMainSearchCoreFragment, Ref.BooleanRef booleanRef, SearchCoreHostFragment searchCoreHostFragment) {
            this.f86679a = searchPageStateModel;
            this.f86680b = biliMainSearchCoreFragment;
            this.f86681c = booleanRef;
            this.f86682d = searchCoreHostFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r13, kotlin.coroutines.Continuation r14) {
            /*
                Method dump skipped, instruction units count: 472
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.main.BiliMainSearchCoreFragment$observeContainerRuntimeState$1.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliMainSearchCoreFragment$observeContainerRuntimeState$1(BiliMainSearchCoreFragment biliMainSearchCoreFragment, SearchPageStateModel searchPageStateModel, Ref.BooleanRef booleanRef, SearchCoreHostFragment searchCoreHostFragment, Continuation<? super BiliMainSearchCoreFragment$observeContainerRuntimeState$1> continuation) {
        super(2, continuation);
        this.this$0 = biliMainSearchCoreFragment;
        this.$stateModel = searchPageStateModel;
        this.$wasFullScreen = booleanRef;
        this.$host = searchCoreHostFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliMainSearchCoreFragment$observeContainerRuntimeState$1(this.this$0, this.$stateModel, this.$wasFullScreen, this.$host, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        StateFlow<com.bilibili.search2.halfscreen.h> stateFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.search2.halfscreen.m mVarJf = this.this$0.jf();
            if (mVarJf == null || (stateFlow = mVarJf.f86610b) == null) {
                return Unit.INSTANCE;
            }
            a aVar = new a(this.$stateModel, this.this$0, this.$wasFullScreen, this.$host);
            this.label = 1;
            if (stateFlow.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
