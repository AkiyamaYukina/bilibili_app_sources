package com.bilibili.search2.main;

import com.bilibili.search2.api.SearchRank;
import com.bilibili.search2.api.SearchReferral;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/SearchRightSideManager$observeDiscoverState$1$1.class */
final class SearchRightSideManager$observeDiscoverState$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final M this$0;

    /* JADX INFO: renamed from: com.bilibili.search2.main.SearchRightSideManager$observeDiscoverState$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/SearchRightSideManager$observeDiscoverState$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<com.bilibili.search2.discover.h, com.bilibili.search2.discover.l, Continuation<? super Pair<? extends com.bilibili.search2.discover.h, ? extends com.bilibili.search2.discover.l>>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        public final Object invoke(com.bilibili.search2.discover.h hVar, com.bilibili.search2.discover.l lVar, Continuation<? super Pair<com.bilibili.search2.discover.h, com.bilibili.search2.discover.l>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = hVar;
            anonymousClass1.L$1 = lVar;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new Pair((com.bilibili.search2.discover.h) this.L$0, (com.bilibili.search2.discover.l) this.L$1);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.search2.main.SearchRightSideManager$observeDiscoverState$1$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/SearchRightSideManager$observeDiscoverState$1$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Pair<? extends com.bilibili.search2.discover.h, ? extends com.bilibili.search2.discover.l>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final M this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(M m7, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = m7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(Pair<com.bilibili.search2.discover.h, com.bilibili.search2.discover.l> pair, Continuation<? super Unit> continuation) {
            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            List<SearchRank> list;
            I i7;
            List<SearchReferral.Guess> list2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.L$0;
            com.bilibili.search2.discover.h hVar = (com.bilibili.search2.discover.h) pair.component1();
            com.bilibili.search2.discover.l lVar = (com.bilibili.search2.discover.l) pair.component2();
            M m7 = this.this$0;
            if (m7.f86726g && (((hVar != null && (list2 = hVar.f86435a) != null && (!list2.isEmpty())) || (lVar != null && (list = lVar.f86447a) != null && (!list.isEmpty()))) && (i7 = m7.f86725f) != null)) {
                i7.notifySectionData();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRightSideManager$observeDiscoverState$1$1(M m7, Continuation<? super SearchRightSideManager$observeDiscoverState$1$1> continuation) {
        super(2, continuation);
        this.this$0 = m7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchRightSideManager$observeDiscoverState$1$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MainSearchViewModel mainSearchViewModel = this.this$0.f86720a;
            Flow flowCombine = FlowKt.combine(mainSearchViewModel.f86735i, mainSearchViewModel.f86736j, new AnonymousClass1(null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == coroutine_suspended) {
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
