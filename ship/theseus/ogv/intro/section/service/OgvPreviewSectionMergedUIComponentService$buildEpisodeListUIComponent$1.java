package com.bilibili.ship.theseus.ogv.intro.section.service;

import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.ogv.intro.section.ui.c;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$buildEpisodeListUIComponent$1.class */
final class OgvPreviewSectionMergedUIComponentService$buildEpisodeListUIComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final c.a $episodeListVm;
    final MutableStateFlow<List<UIComponent<?>>> $episodeUIComponentListFlow;
    final OgvSeason $seasonInfo;
    int label;
    final OgvPreviewSectionMergedUIComponentService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$buildEpisodeListUIComponent$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$buildEpisodeListUIComponent$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final c.a $episodeListVm;
        final MutableStateFlow<List<UIComponent<?>>> $episodeUIComponentListFlow;
        final OgvSeason $seasonInfo;
        private Object L$0;
        int label;
        final OgvPreviewSectionMergedUIComponentService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$buildEpisodeListUIComponent$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$buildEpisodeListUIComponent$1$1$1.class */
        public static final class C07131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final MutableStateFlow<List<UIComponent<?>>> $episodeUIComponentListFlow;
            final OgvSeason $seasonInfo;
            int label;
            final OgvPreviewSectionMergedUIComponentService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$buildEpisodeListUIComponent$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$buildEpisodeListUIComponent$1$1$1$1.class */
            public static final class C07141 extends SuspendLambda implements Function2<EpisodeSection, Continuation<? super Unit>, Object> {
                final MutableStateFlow<List<UIComponent<?>>> $episodeUIComponentListFlow;
                final OgvSeason $seasonInfo;
                Object L$0;
                int label;
                final OgvPreviewSectionMergedUIComponentService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07141(MutableStateFlow<List<UIComponent<?>>> mutableStateFlow, OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService, OgvSeason ogvSeason, Continuation<? super C07141> continuation) {
                    super(2, continuation);
                    this.$episodeUIComponentListFlow = mutableStateFlow;
                    this.this$0 = ogvPreviewSectionMergedUIComponentService;
                    this.$seasonInfo = ogvSeason;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C07141 c07141 = new C07141(this.$episodeUIComponentListFlow, this.this$0, this.$seasonInfo, continuation);
                    c07141.L$0 = obj;
                    return c07141;
                }

                public final Object invoke(EpisodeSection episodeSection, Continuation<? super Unit> continuation) {
                    return create(episodeSection, continuation).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    EpisodeSection episodeSection = (EpisodeSection) this.L$0;
                    if (episodeSection == null) {
                        this.$episodeUIComponentListFlow.setValue(CollectionsKt.emptyList());
                    } else {
                        e eVar = this.this$0.f93748a;
                        OgvSeason ogvSeason = this.$seasonInfo;
                        eVar.getClass();
                        this.$episodeUIComponentListFlow.setValue(eVar.b(ogvSeason, episodeSection.h, episodeSection.f93531j, episodeSection.f93534m, false));
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07131(OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService, MutableStateFlow<List<UIComponent<?>>> mutableStateFlow, OgvSeason ogvSeason, Continuation<? super C07131> continuation) {
                super(2, continuation);
                this.this$0 = ogvPreviewSectionMergedUIComponentService;
                this.$episodeUIComponentListFlow = mutableStateFlow;
                this.$seasonInfo = ogvSeason;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07131(this.this$0, this.$episodeUIComponentListFlow, this.$seasonInfo, continuation);
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
                    MutableStateFlow<EpisodeSection> mutableStateFlow = ogvPreviewSectionMergedUIComponentService.f93758l;
                    C07141 c07141 = new C07141(this.$episodeUIComponentListFlow, ogvPreviewSectionMergedUIComponentService, this.$seasonInfo, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(mutableStateFlow, c07141, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$buildEpisodeListUIComponent$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$buildEpisodeListUIComponent$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final c.a $episodeListVm;
            int label;
            final OgvPreviewSectionMergedUIComponentService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$buildEpisodeListUIComponent$1$1$2$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$buildEpisodeListUIComponent$1$1$2$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final c.a f93763a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final OgvPreviewSectionMergedUIComponentService f93764b;

                public a(c.a aVar, OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService) {
                    this.f93763a = aVar;
                    this.f93764b = ogvPreviewSectionMergedUIComponentService;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    int iA = com.bilibili.ship.theseus.united.page.intro.a.a((WindowSizeClass) obj, this.f93764b.f93756j.f(), 12);
                    c.a aVar = this.f93763a;
                    if (iA != aVar.f93828d) {
                        aVar.f93828d = iA;
                        aVar.notifyPropertyChanged(285);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService, c.a aVar, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = ogvPreviewSectionMergedUIComponentService;
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
                    OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService = this.this$0;
                    StateFlow<WindowSizeClass> stateFlow = ogvPreviewSectionMergedUIComponentService.f93756j.f102939c;
                    a aVar = new a(this.$episodeListVm, ogvPreviewSectionMergedUIComponentService);
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
        public AnonymousClass1(OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService, MutableStateFlow<List<UIComponent<?>>> mutableStateFlow, OgvSeason ogvSeason, c.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvPreviewSectionMergedUIComponentService;
            this.$episodeUIComponentListFlow = mutableStateFlow;
            this.$seasonInfo = ogvSeason;
            this.$episodeListVm = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$episodeUIComponentListFlow, this.$seasonInfo, this.$episodeListVm, continuation);
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C07131(this.this$0, this.$episodeUIComponentListFlow, this.$seasonInfo, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$episodeListVm, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvPreviewSectionMergedUIComponentService$buildEpisodeListUIComponent$1(OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService, MutableStateFlow<List<UIComponent<?>>> mutableStateFlow, OgvSeason ogvSeason, c.a aVar, Continuation<? super OgvPreviewSectionMergedUIComponentService$buildEpisodeListUIComponent$1> continuation) {
        super(1, continuation);
        this.this$0 = ogvPreviewSectionMergedUIComponentService;
        this.$episodeUIComponentListFlow = mutableStateFlow;
        this.$seasonInfo = ogvSeason;
        this.$episodeListVm = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OgvPreviewSectionMergedUIComponentService$buildEpisodeListUIComponent$1(this.this$0, this.$episodeUIComponentListFlow, this.$seasonInfo, this.$episodeListVm, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$episodeUIComponentListFlow, this.$seasonInfo, this.$episodeListVm, null);
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
