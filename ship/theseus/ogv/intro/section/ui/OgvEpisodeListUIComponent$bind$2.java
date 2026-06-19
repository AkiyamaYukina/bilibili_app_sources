package com.bilibili.ship.theseus.ogv.intro.section.ui;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import zu0.X;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/OgvEpisodeListUIComponent$bind$2.class */
final class OgvEpisodeListUIComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final com.bilibili.app.gemini.ui.f $adapter;
    final X $binding;
    private Object L$0;
    int label;
    final c this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.ui.OgvEpisodeListUIComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/OgvEpisodeListUIComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.app.gemini.ui.f $adapter;
        int label;
        final c this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.ui.OgvEpisodeListUIComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/OgvEpisodeListUIComponent$bind$2$1$1.class */
        public static final class C07261 extends SuspendLambda implements Function2<List<? extends UIComponent<?>>, Continuation<? super Unit>, Object> {
            final com.bilibili.app.gemini.ui.f $adapter;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07261(com.bilibili.app.gemini.ui.f fVar, Continuation<? super C07261> continuation) {
                super(2, continuation);
                this.$adapter = fVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07261 c07261 = new C07261(this.$adapter, continuation);
                c07261.L$0 = obj;
                return c07261;
            }

            public final Object invoke(List<? extends UIComponent<?>> list, Continuation<? super Unit> continuation) {
                return create(list, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$adapter.N((List) this.L$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, com.bilibili.app.gemini.ui.f fVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$adapter = fVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$adapter, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow = this.this$0.f93822a;
                C07261 c07261 = new C07261(this.$adapter, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c07261, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.ui.OgvEpisodeListUIComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/OgvEpisodeListUIComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final X $binding;
        int label;
        final c this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.ui.OgvEpisodeListUIComponent$bind$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/OgvEpisodeListUIComponent$bind$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function3<OgvEpisode, List<? extends UIComponent<?>>, Continuation<? super Pair<? extends OgvEpisode, ? extends List<? extends UIComponent<?>>>>, Object> {
            Object L$0;
            Object L$1;
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            public final Object invoke(OgvEpisode ogvEpisode, List<? extends UIComponent<?>> list, Continuation<? super Pair<OgvEpisode, ? extends List<? extends UIComponent<?>>>> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = ogvEpisode;
                anonymousClass1.L$1 = list;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new Pair((OgvEpisode) this.L$0, (List) this.L$1);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.ui.OgvEpisodeListUIComponent$bind$2$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/ui/OgvEpisodeListUIComponent$bind$2$2$2.class */
        public static final class C07272 extends SuspendLambda implements Function2<Pair<? extends OgvEpisode, ? extends List<? extends UIComponent<?>>>, Continuation<? super Unit>, Object> {
            final X $binding;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07272(X x6, Continuation<? super C07272> continuation) {
                super(2, continuation);
                this.$binding = x6;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07272 c07272 = new C07272(this.$binding, continuation);
                c07272.L$0 = obj;
                return c07272;
            }

            public final Object invoke(Pair<OgvEpisode, ? extends List<? extends UIComponent<?>>> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                List list = (List) pair.getSecond();
                OgvEpisode ogvEpisode = (OgvEpisode) pair.getFirst();
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UIComponent) it.next()).a());
                }
                Iterator it2 = arrayList.iterator();
                int i7 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i7 = -1;
                        break;
                    }
                    if (Intrinsics.areEqual(ogvEpisode != null ? Boxing.boxLong(ogvEpisode.f93555a) : null, ((m) it2.next()).f93840d)) {
                        break;
                    }
                    i7++;
                }
                if (i7 != -1) {
                    RecyclerView.LayoutManager layoutManager = this.$binding.f130602w.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = null;
                    if (layoutManager instanceof LinearLayoutManager) {
                        linearLayoutManager = (LinearLayoutManager) layoutManager;
                    }
                    if (linearLayoutManager != null) {
                        linearLayoutManager.scrollToPositionWithOffset(i7, (int) Uj0.c.a(48, this.$binding.getRoot().getContext()));
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(c cVar, X x6, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$binding = x6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                c cVar = this.this$0;
                Flow flowFlowCombine = FlowKt.flowCombine(cVar.f93824c, cVar.f93822a, new AnonymousClass1(null));
                C07272 c07272 = new C07272(this.$binding, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFlowCombine, c07272, this) == coroutine_suspended) {
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
    public OgvEpisodeListUIComponent$bind$2(c cVar, com.bilibili.app.gemini.ui.f fVar, X x6, Continuation<? super OgvEpisodeListUIComponent$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$adapter = fVar;
        this.$binding = x6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvEpisodeListUIComponent$bind$2 ogvEpisodeListUIComponent$bind$2 = new OgvEpisodeListUIComponent$bind$2(this.this$0, this.$adapter, this.$binding, continuation);
        ogvEpisodeListUIComponent$bind$2.L$0 = obj;
        return ogvEpisodeListUIComponent$bind$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$adapter, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$binding, null), 3, (Object) null);
    }
}
