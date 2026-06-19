package com.bilibili.search2.result.holder.aichat;

import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.search2.result.holder.aichat.SearchAIChatHolder$observeSideEffects$1;
import java.util.Map;
import kntr.app.search.aicard.SearchAICardViewFactory$special$;
import kntr.app.search.aicard.container.LikeState;
import kntr.app.search.aicard.redux.CardPhase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/SearchAIChatHolder$observeSideEffects$1.class */
final class SearchAIChatHolder$observeSideEffects$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final kntr.app.search.aicard.e $cardViewFactory;
    private Object L$0;
    int label;
    final SearchAIChatHolder this$0;

    /* JADX INFO: renamed from: com.bilibili.search2.result.holder.aichat.SearchAIChatHolder$observeSideEffects$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/SearchAIChatHolder$observeSideEffects$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final kntr.app.search.aicard.e $cardViewFactory;
        private Object L$0;
        int label;
        final SearchAIChatHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kntr.app.search.aicard.e eVar, SearchAIChatHolder searchAIChatHolder, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$cardViewFactory = eVar;
            this.this$0 = searchAIChatHolder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(SearchAIChatHolder searchAIChatHolder, String str) {
            BLRouter.routeTo(RouteRequestKt.toRouteRequest(str), searchAIChatHolder.f87754a.a.getContext());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(SearchAIChatHolder searchAIChatHolder) {
            searchAIChatHolder.f87761i = System.currentTimeMillis();
            l lVar = searchAIChatHolder.f87756c;
            if (lVar != null) {
                BuildersKt.launch$default(lVar.h, (CoroutineContext) null, (CoroutineStart) null, new SearchAIChatTyper$retry$1(lVar, null), 3, (Object) null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(SearchAIChatHolder searchAIChatHolder, String str, Map map) {
            int i7 = SearchAIChatHolder.f87753m;
            searchAIChatHolder.u0(str, map);
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$cardViewFactory, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [com.bilibili.search2.result.holder.aichat.f] */
        /* JADX WARN: Type inference failed for: r3v1, types: [com.bilibili.search2.result.holder.aichat.g] */
        /* JADX WARN: Type inference failed for: r4v2, types: [com.bilibili.search2.result.holder.aichat.h] */
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            kntr.app.search.aicard.e eVar = this.$cardViewFactory;
            final SearchAIChatHolder searchAIChatHolder = this.this$0;
            eVar.b(coroutineScope, (f) new Function1(searchAIChatHolder) { // from class: com.bilibili.search2.result.holder.aichat.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchAIChatHolder f87779a;

                {
                    this.f87779a = searchAIChatHolder;
                }

                public final Object invoke(Object obj2) {
                    return SearchAIChatHolder$observeSideEffects$1.AnonymousClass1.invokeSuspend$lambda$0(this.f87779a, (String) obj2);
                }
            }, (g) new Function0(searchAIChatHolder) { // from class: com.bilibili.search2.result.holder.aichat.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchAIChatHolder f87780a;

                {
                    this.f87780a = searchAIChatHolder;
                }

                public final Object invoke() {
                    return SearchAIChatHolder$observeSideEffects$1.AnonymousClass1.invokeSuspend$lambda$1(this.f87780a);
                }
            }, (h) new Function2(searchAIChatHolder) { // from class: com.bilibili.search2.result.holder.aichat.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchAIChatHolder f87781a;

                {
                    this.f87781a = searchAIChatHolder;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    return SearchAIChatHolder$observeSideEffects$1.AnonymousClass1.invokeSuspend$lambda$2(this.f87781a, (String) obj2, (Map) obj3);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.search2.result.holder.aichat.SearchAIChatHolder$observeSideEffects$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/SearchAIChatHolder$observeSideEffects$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final kntr.app.search.aicard.e $cardViewFactory;
        int label;
        final SearchAIChatHolder this$0;

        /* JADX INFO: renamed from: com.bilibili.search2.result.holder.aichat.SearchAIChatHolder$observeSideEffects$1$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/SearchAIChatHolder$observeSideEffects$1$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchAIChatHolder f87768a;

            public a(SearchAIChatHolder searchAIChatHolder) {
                this.f87768a = searchAIChatHolder;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Unit unit;
                CardPhase cardPhase = (CardPhase) obj;
                SearchAIChatHolder searchAIChatHolder = this.f87768a;
                searchAIChatHolder.f87762j = cardPhase;
                CardPhase cardPhase2 = CardPhase.CONTENT;
                if (cardPhase == cardPhase2) {
                    searchAIChatHolder.x0(kntr.app.search.aicard.container.b.a(searchAIChatHolder.r0(), false, false, (LikeState) null, true, 23));
                }
                if (cardPhase == CardPhase.LOADING) {
                    unit = Unit.INSTANCE;
                } else {
                    boolean z6 = cardPhase == cardPhase2 || cardPhase == CardPhase.ERROR || cardPhase == CardPhase.UNABLE;
                    if (((SearchAIChatItem) searchAIChatHolder.getData()).getHasReportedTerminalPhase() && z6) {
                        unit = Unit.INSTANCE;
                    } else {
                        searchAIChatHolder.v0(cardPhase, Boxing.boxDouble((System.currentTimeMillis() - searchAIChatHolder.f87761i) / 1000.0d), true);
                        if (z6) {
                            ((SearchAIChatItem) searchAIChatHolder.getData()).setHasReportedTerminalPhase(true);
                        }
                        unit = Unit.INSTANCE;
                    }
                }
                return unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(kntr.app.search.aicard.e eVar, SearchAIChatHolder searchAIChatHolder, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$cardViewFactory = eVar;
            this.this$0 = searchAIChatHolder;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$cardViewFactory, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlow = this.$cardViewFactory.a.b().g;
                a aVar = new a(this.this$0);
                this.label = 1;
                Object objCollect = stateFlow.collect(new SearchAICardViewFactory$special$.inlined.map.1.2(aVar), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = Unit.INSTANCE;
                }
                if (objCollect == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchAIChatHolder$observeSideEffects$1(kntr.app.search.aicard.e eVar, SearchAIChatHolder searchAIChatHolder, Continuation<? super SearchAIChatHolder$observeSideEffects$1> continuation) {
        super(2, continuation);
        this.$cardViewFactory = eVar;
        this.this$0 = searchAIChatHolder;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchAIChatHolder$observeSideEffects$1 searchAIChatHolder$observeSideEffects$1 = new SearchAIChatHolder$observeSideEffects$1(this.$cardViewFactory, this.this$0, continuation);
        searchAIChatHolder$observeSideEffects$1.L$0 = obj;
        return searchAIChatHolder$observeSideEffects$1;
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
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$cardViewFactory, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$cardViewFactory, this.this$0, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
