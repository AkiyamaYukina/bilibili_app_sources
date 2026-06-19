package com.bilibili.ship.theseus.ugc.intro.uprecommend;

import J3.C2375r1;
import androidx.appcompat.widget.C3259x;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent;
import com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import java.util.ArrayList;
import java.util.List;
import kntr.common.comment.card.action.CardAction;
import kntr.common.comment.card.model.comment.CommentUserInfoRendererModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpService$create$1.class */
public final class RecommendUpService$create$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final com.bilibili.ship.theseus.ugc.intro.b $placeHolder;
    int label;
    final RecommendUpService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpService$create$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpService$create$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.ship.theseus.ugc.intro.b $placeHolder;
        private Object L$0;
        int label;
        final RecommendUpService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpService$create$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpService$create$1$1$1.class */
        public static final class C08931 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final CoroutineScope $$this$coroutineScope;
            final com.bilibili.ship.theseus.ugc.intro.b $placeHolder;
            final Ref.BooleanRef $recommendUpShowing;
            boolean Z$0;
            int label;
            final RecommendUpService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpService$create$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpService$create$1$1$1$1.class */
            public static final class C08941 extends SuspendLambda implements Function3<List<? extends RecommendUp>, RecommendUpRepository.LoadState, Continuation<? super Unit>, Object> {
                final com.bilibili.ship.theseus.ugc.intro.b $placeHolder;
                final Ref.BooleanRef $recommendUpShowing;
                Object L$0;
                Object L$1;
                int label;
                final RecommendUpService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08941(Ref.BooleanRef booleanRef, RecommendUpService recommendUpService, com.bilibili.ship.theseus.ugc.intro.b bVar, Continuation<? super C08941> continuation) {
                    super(3, continuation);
                    this.$recommendUpShowing = booleanRef;
                    this.this$0 = recommendUpService;
                    this.$placeHolder = bVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invokeSuspend$lambda$0(RecommendUpService recommendUpService, Ref.BooleanRef booleanRef, RecommendUpComponent recommendUpComponent) {
                    IntroRecycleViewService introRecycleViewService = (IntroRecycleViewService) recommendUpService.h.get();
                    if (introRecycleViewService != null) {
                        introRecycleViewService.e(recommendUpService.b(), recommendUpComponent);
                    }
                    RecommendUpRepository recommendUpRepository = recommendUpService.f97805e;
                    recommendUpRepository.f97796c = 1;
                    recommendUpRepository.h = null;
                    recommendUpRepository.f97797d.setValue(RecommendUpRepository.LoadState.NONE);
                    recommendUpRepository.f97799f.setValue(CollectionsKt.emptyList());
                    booleanRef.element = false;
                    return Unit.INSTANCE;
                }

                public final Object invoke(List<RecommendUp> list, RecommendUpRepository.LoadState loadState, Continuation<? super Unit> continuation) {
                    C08941 c08941 = new C08941(this.$recommendUpShowing, this.this$0, this.$placeHolder, continuation);
                    c08941.L$0 = list;
                    c08941.L$1 = loadState;
                    return c08941.invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Type inference failed for: r8v3, types: [com.bilibili.ship.theseus.ugc.intro.uprecommend.g] */
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    List list = (List) this.L$0;
                    RecommendUpRepository.LoadState loadState = (RecommendUpRepository.LoadState) this.L$1;
                    if (this.$recommendUpShowing.element) {
                        BLog.i("RecommendUpService$create$1$1$1$1-invokeSuspend", "[theseus-ugc-RecommendUpService$create$1$1$1$1-invokeSuspend] is not showing");
                        return Unit.INSTANCE;
                    }
                    if (list.isEmpty()) {
                        BLog.i("RecommendUpService$create$1$1$1$1-invokeSuspend", "[theseus-ugc-RecommendUpService$create$1$1$1$1-invokeSuspend] list is empty");
                        return Unit.INSTANCE;
                    }
                    RecommendUpRepository.LoadState loadState2 = RecommendUpRepository.LoadState.NONE;
                    if (loadState != loadState2) {
                        BLog.i("RecommendUpService$create$1$1$1$1-invokeSuspend", "[theseus-ugc-RecommendUpService$create$1$1$1$1-invokeSuspend] not valid load state");
                        return Unit.INSTANCE;
                    }
                    defpackage.a.b("[theseus-ugc-RecommendUpService$create$1$1$1$1-invokeSuspend] ", C3259x.a(list.size(), "replace component, data size: "), "RecommendUpService$create$1$1$1$1-invokeSuspend");
                    this.$recommendUpShowing.element = true;
                    IntroRecycleViewService introRecycleViewService = (IntroRecycleViewService) this.this$0.h.get();
                    if (introRecycleViewService != null) {
                        RecommendUpService recommendUpService = this.this$0;
                        final j jVar = new j(recommendUpService, this.$recommendUpShowing);
                        String str = recommendUpService.f97805e.h;
                        String str2 = str;
                        if (str == null) {
                            str2 = "";
                        }
                        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new RecommendUpComponent.a(str2, CollectionsKt.emptyList(), loadState2));
                        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        final int i7 = 0;
                        RecommendUpComponent recommendUpComponent = new RecommendUpComponent(FlowKt.asStateFlow(MutableStateFlow), recommendUpService.f97808i.f100020a, new c70.e(recommendUpService, 3), new com.bilibili.biligame.ui.minigame.more.g(recommendUpService, 5), new c70.f(recommendUpService, 5), new com.bilibili.lib.coroutineextension.g(1, new ArrayList(), recommendUpService), new Function0(i7, objectRef, jVar) { // from class: com.bilibili.ship.theseus.ugc.intro.uprecommend.g

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final int f97827a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final Object f97828b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final Object f97829c;

                            {
                                this.f97827a = i7;
                                this.f97828b = objectRef;
                                this.f97829c = jVar;
                            }

                            public final Object invoke() {
                                switch (this.f97827a) {
                                    case 0:
                                        RecommendUpComponent recommendUpComponent2 = (RecommendUpComponent) ((Ref.ObjectRef) this.f97828b).element;
                                        if (recommendUpComponent2 != null) {
                                            ((j) this.f97829c).invoke(recommendUpComponent2);
                                        }
                                        break;
                                    default:
                                        W41.a aVar = (W41.a) this.f97828b;
                                        CommentUserInfoRendererModel commentUserInfoRendererModel = (CommentUserInfoRendererModel) this.f97829c;
                                        CardAction.ClickUser.ReportPosition reportPosition = CardAction.ClickUser.ReportPosition.NAME;
                                        aVar.c.a(new CardAction.ClickUser(commentUserInfoRendererModel.a, commentUserInfoRendererModel.f, reportPosition));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, new C2375r1(7));
                        objectRef.element = recommendUpComponent;
                        introRecycleViewService.e(new RunningUIComponent(recommendUpComponent, 0, new RecommendUpService$createRecommendUpComponent$7(recommendUpService, MutableStateFlow, null), 2), this.$placeHolder);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08931(Ref.BooleanRef booleanRef, RecommendUpService recommendUpService, CoroutineScope coroutineScope, com.bilibili.ship.theseus.ugc.intro.b bVar, Continuation<? super C08931> continuation) {
                super(2, continuation);
                this.$recommendUpShowing = booleanRef;
                this.this$0 = recommendUpService;
                this.$$this$coroutineScope = coroutineScope;
                this.$placeHolder = bVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08931 c08931 = new C08931(this.$recommendUpShowing, this.this$0, this.$$this$coroutineScope, this.$placeHolder, continuation);
                c08931.Z$0 = ((Boolean) obj).booleanValue();
                return c08931;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                boolean z7 = this.$recommendUpShowing.element;
                if (z7 || !z6) {
                    defpackage.a.b("[theseus-ugc-RecommendUpService$create$1$1$1-invokeSuspend] ", com.bilibili.app.comm.bh.x5.a.a("not show state ", " ", z7, z6), "RecommendUpService$create$1$1$1-invokeSuspend");
                    return Unit.INSTANCE;
                }
                BLog.i("RecommendUpService$create$1$1$1-invokeSuspend", "[theseus-ugc-RecommendUpService$create$1$1$1-invokeSuspend] try request data");
                this.this$0.f97805e.b();
                RecommendUpService recommendUpService = this.this$0;
                RecommendUpRepository recommendUpRepository = recommendUpService.f97805e;
                FlowKt.launchIn(FlowKt.combine(recommendUpRepository.f97800g, recommendUpRepository.f97798e, new C08941(this.$recommendUpShowing, recommendUpService, this.$placeHolder, null)), this.$$this$coroutineScope);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RecommendUpService recommendUpService, com.bilibili.ship.theseus.ugc.intro.b bVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = recommendUpService;
            this.$placeHolder = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$placeHolder, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                RecommendUpService recommendUpService = this.this$0;
                SharedFlow<Boolean> sharedFlow = recommendUpService.f97806f.f100675e;
                C08931 c08931 = new C08931(booleanRef, recommendUpService, coroutineScope, this.$placeHolder, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c08931, this) == coroutine_suspended) {
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
    public RecommendUpService$create$1(RecommendUpService recommendUpService, com.bilibili.ship.theseus.ugc.intro.b bVar, Continuation<? super RecommendUpService$create$1> continuation) {
        super(1, continuation);
        this.this$0 = recommendUpService;
        this.$placeHolder = bVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new RecommendUpService$create$1(this.this$0, this.$placeHolder, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$placeHolder, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
