package com.bilibili.ship.theseus.ogv.intro.section.service;

import androidx.databinding.ObservableArrayList;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.ogv.intro.section.ui.r;
import com.bilibili.ship.theseus.ogv.intro.section.ui.s;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$buildMergedTitlesRunningUIComponent$1.class */
final class OgvPreviewSectionMergedUIComponentService$buildMergedTitlesRunningUIComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final s.a $vm;
    int label;
    final OgvPreviewSectionMergedUIComponentService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$buildMergedTitlesRunningUIComponent$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$buildMergedTitlesRunningUIComponent$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final s.a $vm;
        private Object L$0;
        int label;
        final OgvPreviewSectionMergedUIComponentService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$buildMergedTitlesRunningUIComponent$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$buildMergedTitlesRunningUIComponent$1$1$1.class */
        public static final class C07151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final s.a $vm;
            int label;
            final OgvPreviewSectionMergedUIComponentService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$buildMergedTitlesRunningUIComponent$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$buildMergedTitlesRunningUIComponent$1$1$1$1.class */
            public static final class C07161 extends SuspendLambda implements Function3<EpisodeSection, List<? extends EpisodeSection>, Continuation<? super Pair<? extends EpisodeSection, ? extends List<? extends EpisodeSection>>>, Object> {
                Object L$0;
                Object L$1;
                int label;

                public C07161(Continuation<? super C07161> continuation) {
                    super(3, continuation);
                }

                public final Object invoke(EpisodeSection episodeSection, List<EpisodeSection> list, Continuation<? super Pair<EpisodeSection, ? extends List<EpisodeSection>>> continuation) {
                    C07161 c07161 = new C07161(continuation);
                    c07161.L$0 = episodeSection;
                    c07161.L$1 = list;
                    return c07161.invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return new Pair((EpisodeSection) this.L$0, (List) this.L$1);
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$buildMergedTitlesRunningUIComponent$1$1$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$buildMergedTitlesRunningUIComponent$1$1$1$2.class */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<Pair<? extends EpisodeSection, ? extends List<? extends EpisodeSection>>, Continuation<? super Unit>, Object> {
                final s.a $vm;
                Object L$0;
                int label;
                final OgvPreviewSectionMergedUIComponentService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(s.a aVar, OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$vm = aVar;
                    this.this$0 = ogvPreviewSectionMergedUIComponentService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$vm, this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                public final Object invoke(Pair<EpisodeSection, ? extends List<EpisodeSection>> pair, Continuation<? super Unit> continuation) {
                    return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.L$0;
                    EpisodeSection episodeSection = (EpisodeSection) pair.getFirst();
                    List list = (List) pair.getSecond();
                    this.$vm.f93877b.clear();
                    List list2 = list;
                    ObservableArrayList<r> observableArrayList = this.$vm.f93877b;
                    OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService = this.this$0;
                    int i7 = 0;
                    for (Object obj2 : list2) {
                        if (i7 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        observableArrayList.add(OgvPreviewSectionMergedUIComponentService.a(ogvPreviewSectionMergedUIComponentService, (EpisodeSection) obj2, i7));
                        i7++;
                    }
                    if (episodeSection != null) {
                        s.a aVar = this.$vm;
                        if (true != aVar.f93880e) {
                            aVar.f93880e = true;
                            aVar.notifyPropertyChanged(727);
                        }
                        this.$vm.m(episodeSection.f93527e, this.this$0.f93751d);
                    } else {
                        s.a aVar2 = this.$vm;
                        if (aVar2.f93880e) {
                            aVar2.f93880e = false;
                            aVar2.notifyPropertyChanged(727);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07151(OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService, s.a aVar, Continuation<? super C07151> continuation) {
                super(2, continuation);
                this.this$0 = ogvPreviewSectionMergedUIComponentService;
                this.$vm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07151(this.this$0, this.$vm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService = this.this$0;
                    Flow flowFlowCombine = FlowKt.flowCombine(ogvPreviewSectionMergedUIComponentService.f93758l, ogvPreviewSectionMergedUIComponentService.f93759m, new C07161(null));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$vm, this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowFlowCombine, anonymousClass2, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$buildMergedTitlesRunningUIComponent$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$buildMergedTitlesRunningUIComponent$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final s.a $vm;
            int label;
            final OgvPreviewSectionMergedUIComponentService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$buildMergedTitlesRunningUIComponent$1$1$2$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$buildMergedTitlesRunningUIComponent$1$1$2$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final s.a f93765a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final OgvPreviewSectionMergedUIComponentService f93766b;

                public a(s.a aVar, OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService) {
                    this.f93765a = aVar;
                    this.f93766b = ogvPreviewSectionMergedUIComponentService;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    int iA = com.bilibili.ship.theseus.united.page.intro.a.a((WindowSizeClass) obj, this.f93766b.f93756j.f(), 12);
                    s.a aVar = this.f93765a;
                    if (iA != aVar.f93881f) {
                        aVar.f93881f = iA;
                        aVar.notifyPropertyChanged(285);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService, s.a aVar, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = ogvPreviewSectionMergedUIComponentService;
                this.$vm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$vm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService = this.this$0;
                    StateFlow<WindowSizeClass> stateFlow = ogvPreviewSectionMergedUIComponentService.f93756j.f102939c;
                    a aVar = new a(this.$vm, ogvPreviewSectionMergedUIComponentService);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService, s.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvPreviewSectionMergedUIComponentService;
            this.$vm = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$vm, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C07151(this.this$0, this.$vm, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$vm, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvPreviewSectionMergedUIComponentService$buildMergedTitlesRunningUIComponent$1(OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService, s.a aVar, Continuation<? super OgvPreviewSectionMergedUIComponentService$buildMergedTitlesRunningUIComponent$1> continuation) {
        super(1, continuation);
        this.this$0 = ogvPreviewSectionMergedUIComponentService;
        this.$vm = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OgvPreviewSectionMergedUIComponentService$buildMergedTitlesRunningUIComponent$1(this.this$0, this.$vm, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$vm, null);
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
