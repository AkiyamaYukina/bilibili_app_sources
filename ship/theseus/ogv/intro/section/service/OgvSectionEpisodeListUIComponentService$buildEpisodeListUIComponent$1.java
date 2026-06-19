package com.bilibili.ship.theseus.ogv.intro.section.service;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.ogv.intro.section.bean.SectionType;
import com.bilibili.ship.theseus.ogv.intro.section.ui.c;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvSectionEpisodeListUIComponentService$buildEpisodeListUIComponent$1.class */
final class OgvSectionEpisodeListUIComponentService$buildEpisodeListUIComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final c.a $episodeListVm;
    final MutableStateFlow<List<UIComponent<?>>> $episodeUIComponentListFlow;
    final boolean $inLayer;
    final Flow<Boolean> $reservedFeatureEpisodeFlow;
    final OgvSeason $seasonInfo;
    final EpisodeSection $section;
    int label;
    final e this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvSectionEpisodeListUIComponentService$buildEpisodeListUIComponent$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvSectionEpisodeListUIComponentService$buildEpisodeListUIComponent$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final c.a $episodeListVm;
        final MutableStateFlow<List<UIComponent<?>>> $episodeUIComponentListFlow;
        final boolean $inLayer;
        final Flow<Boolean> $reservedFeatureEpisodeFlow;
        final OgvSeason $seasonInfo;
        final EpisodeSection $section;
        private Object L$0;
        int label;
        final e this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvSectionEpisodeListUIComponentService$buildEpisodeListUIComponent$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvSectionEpisodeListUIComponentService$buildEpisodeListUIComponent$1$1$1.class */
        public static final class C07191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final c.a $episodeListVm;
            final MutableStateFlow<List<UIComponent<?>>> $episodeUIComponentListFlow;
            final Flow<Boolean> $reservedFeatureEpisodeFlow;
            int label;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvSectionEpisodeListUIComponentService$buildEpisodeListUIComponent$1$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvSectionEpisodeListUIComponentService$buildEpisodeListUIComponent$1$1$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final c.a f93769a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final MutableStateFlow<List<UIComponent<?>>> f93770b;

                public a(c.a aVar, MutableStateFlow<List<UIComponent<?>>> mutableStateFlow) {
                    this.f93769a = aVar;
                    this.f93770b = mutableStateFlow;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    Unit unit;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    c.a aVar = this.f93769a;
                    if (aVar.f93826b == zBooleanValue) {
                        unit = Unit.INSTANCE;
                    } else {
                        MutableStateFlow<List<UIComponent<?>>> mutableStateFlow = this.f93770b;
                        mutableStateFlow.setValue(CollectionsKt.reversed((Iterable) mutableStateFlow.getValue()));
                        if (zBooleanValue != aVar.f93826b) {
                            aVar.f93826b = zBooleanValue;
                            aVar.notifyPropertyChanged(489);
                        }
                        unit = Unit.INSTANCE;
                    }
                    return unit;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07191(Flow<Boolean> flow, c.a aVar, MutableStateFlow<List<UIComponent<?>>> mutableStateFlow, Continuation<? super C07191> continuation) {
                super(2, continuation);
                this.$reservedFeatureEpisodeFlow = flow;
                this.$episodeListVm = aVar;
                this.$episodeUIComponentListFlow = mutableStateFlow;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07191(this.$reservedFeatureEpisodeFlow, this.$episodeListVm, this.$episodeUIComponentListFlow, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> flow = this.$reservedFeatureEpisodeFlow;
                    if (flow != null) {
                        a aVar = new a(this.$episodeListVm, this.$episodeUIComponentListFlow);
                        this.label = 1;
                        if (flow.collect(aVar, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvSectionEpisodeListUIComponentService$buildEpisodeListUIComponent$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvSectionEpisodeListUIComponentService$buildEpisodeListUIComponent$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final c.a $episodeListVm;
            int label;
            final e this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvSectionEpisodeListUIComponentService$buildEpisodeListUIComponent$1$1$2$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvSectionEpisodeListUIComponentService$buildEpisodeListUIComponent$1$1$2$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final c.a f93771a;

                public a(c.a aVar) {
                    this.f93771a = aVar;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    c.a aVar = this.f93771a;
                    if (iIntValue != aVar.f93828d) {
                        aVar.f93828d = iIntValue;
                        aVar.notifyPropertyChanged(285);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(e eVar, c.a aVar, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = eVar;
                this.$episodeListVm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$episodeListVm, continuation);
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
                    StateFlow<Integer> stateFlow = this.this$0.f93788d.f100020a;
                    a aVar = new a(this.$episodeListVm);
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
        public AnonymousClass1(EpisodeSection episodeSection, MutableStateFlow<List<UIComponent<?>>> mutableStateFlow, e eVar, OgvSeason ogvSeason, boolean z6, Flow<Boolean> flow, c.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$section = episodeSection;
            this.$episodeUIComponentListFlow = mutableStateFlow;
            this.this$0 = eVar;
            this.$seasonInfo = ogvSeason;
            this.$inLayer = z6;
            this.$reservedFeatureEpisodeFlow = flow;
            this.$episodeListVm = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$section, this.$episodeUIComponentListFlow, this.this$0, this.$seasonInfo, this.$inLayer, this.$reservedFeatureEpisodeFlow, this.$episodeListVm, continuation);
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
            EpisodeSection episodeSection = this.$section;
            if (episodeSection.f93531j == SectionType.FEATURE) {
                MutableStateFlow<List<UIComponent<?>>> mutableStateFlow = this.$episodeUIComponentListFlow;
                e eVar = this.this$0;
                OgvSeason ogvSeason = this.$seasonInfo;
                boolean z6 = this.$inLayer;
                eVar.getClass();
                mutableStateFlow.setValue(eVar.b(ogvSeason, episodeSection.h, episodeSection.f93531j, episodeSection.f93534m, z6));
            }
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C07191(this.$reservedFeatureEpisodeFlow, this.$episodeListVm, this.$episodeUIComponentListFlow, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$episodeListVm, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvSectionEpisodeListUIComponentService$buildEpisodeListUIComponent$1(EpisodeSection episodeSection, MutableStateFlow<List<UIComponent<?>>> mutableStateFlow, e eVar, OgvSeason ogvSeason, boolean z6, Flow<Boolean> flow, c.a aVar, Continuation<? super OgvSectionEpisodeListUIComponentService$buildEpisodeListUIComponent$1> continuation) {
        super(1, continuation);
        this.$section = episodeSection;
        this.$episodeUIComponentListFlow = mutableStateFlow;
        this.this$0 = eVar;
        this.$seasonInfo = ogvSeason;
        this.$inLayer = z6;
        this.$reservedFeatureEpisodeFlow = flow;
        this.$episodeListVm = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OgvSectionEpisodeListUIComponentService$buildEpisodeListUIComponent$1(this.$section, this.$episodeUIComponentListFlow, this.this$0, this.$seasonInfo, this.$inLayer, this.$reservedFeatureEpisodeFlow, this.$episodeListVm, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$section, this.$episodeUIComponentListFlow, this.this$0, this.$seasonInfo, this.$inLayer, this.$reservedFeatureEpisodeFlow, this.$episodeListVm, null);
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
