package com.bilibili.ship.theseus.ogv.intro.section.service;

import androidx.databinding.ObservableArrayList;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.ogv.intro.section.ui.c;
import com.bilibili.ship.theseus.ogv.intro.section.ui.r;
import com.bilibili.ship.theseus.ogv.intro.section.ui.s;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$openMergedTitlesLayer$1.class */
final class OgvPreviewSectionMergedUIComponentService$openMergedTitlesLayer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final c.a $episodeListVm;
    final MutableStateFlow<List<UIComponent<?>>> $episodeUIComponentListFlow;
    final s.a $titlesVm;
    private Object L$0;
    Object L$1;
    int label;
    final OgvPreviewSectionMergedUIComponentService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$openMergedTitlesLayer$1$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$openMergedTitlesLayer$1$3.class */
    public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<EpisodeSection, List<? extends EpisodeSection>, Continuation<? super Pair<? extends EpisodeSection, ? extends List<? extends EpisodeSection>>>, Object>, SuspendFunction {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        public final Object invoke(EpisodeSection episodeSection, List<EpisodeSection> list, Continuation<? super Pair<EpisodeSection, ? extends List<EpisodeSection>>> continuation) {
            return OgvPreviewSectionMergedUIComponentService$openMergedTitlesLayer$1.invokeSuspend$lambda$0(episodeSection, list, continuation);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$openMergedTitlesLayer$1$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$openMergedTitlesLayer$1$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends EpisodeSection, ? extends List<? extends EpisodeSection>>, Continuation<? super Unit>, Object> {
        final MutableStateFlow<List<UIComponent<?>>> $episodeUIComponentListFlow;
        final s.a $titlesVm;
        Object L$0;
        int label;
        final OgvPreviewSectionMergedUIComponentService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(s.a aVar, OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService, MutableStateFlow<List<UIComponent<?>>> mutableStateFlow, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$titlesVm = aVar;
            this.this$0 = ogvPreviewSectionMergedUIComponentService;
            this.$episodeUIComponentListFlow = mutableStateFlow;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$titlesVm, this.this$0, this.$episodeUIComponentListFlow, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        public final Object invoke(Pair<EpisodeSection, ? extends List<EpisodeSection>> pair, Continuation<? super Unit> continuation) {
            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.L$0;
            EpisodeSection episodeSection = (EpisodeSection) pair.getFirst();
            List list = (List) pair.getSecond();
            this.$titlesVm.f93877b.clear();
            List list2 = list;
            ObservableArrayList<r> observableArrayList = this.$titlesVm.f93877b;
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
                this.$titlesVm.m(episodeSection.f93527e, this.this$0.f93751d);
                OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService2 = this.this$0;
                e eVar = ogvPreviewSectionMergedUIComponentService2.f93748a;
                OgvSeason ogvSeason = ogvPreviewSectionMergedUIComponentService2.f93749b;
                eVar.getClass();
                this.$episodeUIComponentListFlow.setValue(eVar.b(ogvSeason, episodeSection.h, episodeSection.f93531j, episodeSection.f93534m, true));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$openMergedTitlesLayer$1$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$openMergedTitlesLayer$1$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final s.a $titlesVm;
        int label;
        final OgvPreviewSectionMergedUIComponentService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.section.service.OgvPreviewSectionMergedUIComponentService$openMergedTitlesLayer$1$5$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/OgvPreviewSectionMergedUIComponentService$openMergedTitlesLayer$1$5$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final s.a f93767a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final OgvPreviewSectionMergedUIComponentService f93768b;

            public a(s.a aVar, OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService) {
                this.f93767a = aVar;
                this.f93768b = ogvPreviewSectionMergedUIComponentService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                int iA = com.bilibili.ship.theseus.united.page.intro.a.a((WindowSizeClass) obj, this.f93768b.f93756j.f(), 12);
                s.a aVar = this.f93767a;
                if (iA != aVar.f93881f) {
                    aVar.f93881f = iA;
                    aVar.notifyPropertyChanged(285);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService, s.a aVar, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = ogvPreviewSectionMergedUIComponentService;
            this.$titlesVm = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, this.$titlesVm, continuation);
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
                a aVar = new a(this.$titlesVm, ogvPreviewSectionMergedUIComponentService);
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
    public OgvPreviewSectionMergedUIComponentService$openMergedTitlesLayer$1(OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService, s.a aVar, MutableStateFlow<List<UIComponent<?>>> mutableStateFlow, c.a aVar2, Continuation<? super OgvPreviewSectionMergedUIComponentService$openMergedTitlesLayer$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvPreviewSectionMergedUIComponentService;
        this.$titlesVm = aVar;
        this.$episodeUIComponentListFlow = mutableStateFlow;
        this.$episodeListVm = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$lambda$0(EpisodeSection episodeSection, List list, Continuation continuation) {
        return new Pair(episodeSection, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(CoroutineScope coroutineScope) {
        CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvPreviewSectionMergedUIComponentService$openMergedTitlesLayer$1 ogvPreviewSectionMergedUIComponentService$openMergedTitlesLayer$1 = new OgvPreviewSectionMergedUIComponentService$openMergedTitlesLayer$1(this.this$0, this.$titlesVm, this.$episodeUIComponentListFlow, this.$episodeListVm, continuation);
        ogvPreviewSectionMergedUIComponentService$openMergedTitlesLayer$1.L$0 = obj;
        return ogvPreviewSectionMergedUIComponentService$openMergedTitlesLayer$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [com.bilibili.ship.theseus.ogv.intro.section.service.c] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
        Throwable th;
        com.bilibili.ship.theseus.ogv.intro.section.floatlayer.g gVar3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar3 = (com.bilibili.ship.theseus.ogv.intro.section.floatlayer.g) this.L$1;
            gVar2 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                gVar = gVar2;
                gVar.j(gVar3);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                gVar2.j(gVar3);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService = this.this$0;
        FlowKt.launchIn(FlowKt.onEach(FlowKt.flowCombine(ogvPreviewSectionMergedUIComponentService.f93758l, ogvPreviewSectionMergedUIComponentService.f93759m, AnonymousClass3.INSTANCE), new AnonymousClass4(this.$titlesVm, this.this$0, this.$episodeUIComponentListFlow, null)), coroutineScope);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, this.$titlesVm, null), 3, (Object) null);
        s.a aVar = this.$titlesVm;
        MutableStateFlow<List<UIComponent<?>>> mutableStateFlow = this.$episodeUIComponentListFlow;
        c.a aVar2 = this.$episodeListVm;
        OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService2 = this.this$0;
        com.bilibili.ship.theseus.ogv.intro.section.floatlayer.g gVar4 = new com.bilibili.ship.theseus.ogv.intro.section.floatlayer.g(aVar, mutableStateFlow, aVar2, ogvPreviewSectionMergedUIComponentService2.f93750c.f92119v, ogvPreviewSectionMergedUIComponentService2.f93756j.f102939c, new Function0(coroutineScope) { // from class: com.bilibili.ship.theseus.ogv.intro.section.service.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CoroutineScope f93783a;

            {
                this.f93783a = coroutineScope;
            }

            public final Object invoke() {
                return OgvPreviewSectionMergedUIComponentService$openMergedTitlesLayer$1.invokeSuspend$lambda$1(this.f93783a);
            }
        });
        OgvPreviewSectionMergedUIComponentService ogvPreviewSectionMergedUIComponentService3 = this.this$0;
        gVar = ogvPreviewSectionMergedUIComponentService3.f93754g;
        gVar.f(gVar4);
        try {
            TheseusFloatLayerService theseusFloatLayerService = ogvPreviewSectionMergedUIComponentService3.f93753f;
            this.L$0 = gVar;
            this.L$1 = gVar4;
            this.label = 1;
            if (theseusFloatLayerService.h(gVar4, theseusFloatLayerService.f99664n, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            gVar3 = gVar4;
            gVar.j(gVar3);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            gVar2 = gVar;
            th = th3;
            gVar3 = gVar4;
            gVar2.j(gVar3);
            throw th;
        }
    }
}
