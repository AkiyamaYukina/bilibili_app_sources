package com.bilibili.ship.theseus.playlist;

import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.uicomponent.D;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectMediaActionEffect$2.class */
final class PlaylistService$collectMediaActionEffect$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final com.bilibili.ship.theseus.playlist.uicomponent.D $component;
    private Object L$0;
    int label;
    final E this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistService$collectMediaActionEffect$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectMediaActionEffect$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.ship.theseus.playlist.uicomponent.D $component;
        int label;
        final E this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistService$collectMediaActionEffect$2$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectMediaActionEffect$2$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final E f95176a;

            public a(E e7) {
                this.f95176a = e7;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX WARN: Type inference failed for: r4v7, types: [com.bilibili.ship.theseus.playlist.F] */
            /* JADX WARN: Type inference failed for: r6v4, types: [com.bilibili.ship.theseus.playlist.G] */
            public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                Object obj2;
                final D.b bVar = (D.b) obj;
                final E e7 = this.f95176a;
                Job job = e7.f94957z;
                boolean z6 = true;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    e7.f94957z = null;
                }
                if (bVar.f95942a.s()) {
                    com.bilibili.ship.theseus.united.utils.q.b(2131841505);
                    obj2 = Unit.INSTANCE;
                } else {
                    boolean z7 = bVar instanceof D.b.C0800b;
                    PageReportService pageReportService = e7.f94943l;
                    PlaylistRepository playlistRepository = e7.f94937e;
                    int i7 = 0;
                    MultiTypeMedia multiTypeMedia = bVar.f95942a;
                    if (z7) {
                        MutableSharedFlow<Unit> mutableSharedFlow = e7.f94949r.f95042k;
                        obj2 = Unit.INSTANCE;
                        mutableSharedFlow.tryEmit(obj2);
                        PageReportService.g(pageReportService, "united.player-video-detail.playlist-video-card.three.click", N.b(multiTypeMedia), 4);
                        if (multiTypeMedia.h() || playlistRepository.f95092O) {
                            z6 = false;
                        }
                        com.bilibili.ship.theseus.playlist.uicomponent.t tVar = new com.bilibili.ship.theseus.playlist.uicomponent.t(z6, multiTypeMedia.n(), multiTypeMedia.f95224L, 2);
                        com.bilibili.ship.theseus.united.page.screensize.a aVar = e7.f94950s;
                        if (aVar.i()) {
                            final int i8 = 0;
                            Object objF = e7.f94940i.f(new com.bilibili.ship.theseus.playlist.uicomponent.o(tVar, e7.f94947p, new Function0(i8, e7, bVar) { // from class: com.bilibili.ship.theseus.playlist.F

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final int f94964a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final Object f94965b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final Object f94966c;

                                {
                                    this.f94964a = i8;
                                    this.f94965b = e7;
                                    this.f94966c = bVar;
                                }

                                public final Object invoke() {
                                    switch (this.f94964a) {
                                        case 0:
                                            ((E) this.f94965b).h.b(((D.b) this.f94966c).f95942a);
                                            break;
                                        default:
                                            ((Function1) this.f94965b).invoke(((G.l) this.f94966c).c().f6521c.toString());
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, new com.bilibili.bplus.followinglist.page.opus.share.j(2, e7, bVar), new Function0(e7, bVar) { // from class: com.bilibili.ship.theseus.playlist.G

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final E f94967a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final D.b f94968b;

                                {
                                    this.f94967a = e7;
                                    this.f94968b = bVar;
                                }

                                public final Object invoke() {
                                    y yVar = this.f94967a.h;
                                    MultiTypeMedia multiTypeMedia2 = this.f94968b.f95942a;
                                    yVar.getClass();
                                    BuildersKt.launch$default(yVar.f96134a, (CoroutineContext) null, (CoroutineStart) null, new PlaylistMediaActionService$translation$1(multiTypeMedia2, yVar, null), 3, (Object) null);
                                    return Unit.INSTANCE;
                                }
                            }), null, continuation);
                            if (objF == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                obj2 = objF;
                            }
                        } else {
                            WindowSizeClass windowSizeClassB = aVar.b();
                            MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boxing.boxBoolean(false));
                            tVar.f96094e = false;
                            tVar.f96095f = false;
                            ArrayList arrayList = new ArrayList();
                            SelectKt$selectCancellingUnselected$scope$1 selectKt$selectCancellingUnselected$scope$1 = new SelectKt$selectCancellingUnselected$scope$1(arrayList);
                            E e8 = this.f95176a;
                            selectKt$selectCancellingUnselected$scope$1.b(new PlaylistService$collectMediaActionEffect$2$1$1$4$1(e8, windowSizeClassB, MutableStateFlow, null));
                            selectKt$selectCancellingUnselected$scope$1.b(new PlaylistService$collectMediaActionEffect$2$1$1$4$2(e8, bVar, MutableStateFlow, tVar, null));
                            Object objFirst = FlowKt.first(FlowKt.merge(arrayList), continuation);
                            if (objFirst == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                obj2 = objFirst;
                            }
                        }
                    } else if (bVar instanceof D.b.a) {
                        Iterator<MultiTypeMedia> it = playlistRepository.d().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i7 = -1;
                                break;
                            }
                            if (it.next().d() == multiTypeMedia.d()) {
                                break;
                            }
                            i7++;
                        }
                        if (i7 == -1) {
                            BLog.e("PlaylistService$collectMediaActionEffect$2$1$1-emit", "[theseus-playlist-PlaylistService$collectMediaActionEffect$2$1$1-emit] Invalid media index!", (Throwable) null);
                            obj2 = Unit.INSTANCE;
                        } else {
                            playlistRepository.j(new com.bilibili.biligame.ui.gamelist.b(bVar, 2));
                            obj2 = Unit.INSTANCE;
                        }
                    } else {
                        if (bVar instanceof D.b.d) {
                            if (multiTypeMedia.d() == playlistRepository.c().f95137a.d()) {
                                obj2 = Unit.INSTANCE;
                            } else {
                                playlistRepository.l(0);
                                PlaylistSchedulingService.g(e7.f94941j, multiTypeMedia, multiTypeMedia.b(), null, null, 12);
                                PageReportService.g(pageReportService, "united.player-video-detail.playlist-video-card.0.click", N.b(multiTypeMedia), 4);
                                E.d(e7);
                            }
                        } else {
                            if (!(bVar instanceof D.b.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            playlistRepository.l(0);
                            D.b.c cVar = (D.b.c) bVar;
                            PlaylistSchedulingService.g(e7.f94941j, bVar.f95942a, cVar.f95944b, null, null, 12);
                            PageReportService.g(pageReportService, "united.player-video-detail.playlist-video-card.0.click", N.a(multiTypeMedia, cVar.f95944b), 4);
                            E.d(e7);
                        }
                        obj2 = Unit.INSTANCE;
                    }
                }
                return obj2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.ship.theseus.playlist.uicomponent.D d7, E e7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$component = d7;
            this.this$0 = e7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$component, this.this$0, continuation);
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
                SharedFlow<D.b> sharedFlow = this.$component.h;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
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
    public PlaylistService$collectMediaActionEffect$2(com.bilibili.ship.theseus.playlist.uicomponent.D d7, E e7, Continuation<? super PlaylistService$collectMediaActionEffect$2> continuation) {
        super(2, continuation);
        this.$component = d7;
        this.this$0 = e7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistService$collectMediaActionEffect$2 playlistService$collectMediaActionEffect$2 = new PlaylistService$collectMediaActionEffect$2(this.$component, this.this$0, continuation);
        playlistService$collectMediaActionEffect$2.L$0 = obj;
        return playlistService$collectMediaActionEffect$2;
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
        return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$component, this.this$0, null), 3, (Object) null);
    }
}
