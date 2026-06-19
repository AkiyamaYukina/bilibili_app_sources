package com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm;

import Fu0.a;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bilibili.api.BiliApiException;
import com.bilibili.bplus.followinglist.opus.manager.y;
import com.bilibili.community.follow.FollowSeasonStatus;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm.OgvAllFilmsLayerService;
import com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm.OgvAllFilmsLayerService$showAllFilmsLayer$1;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/allfilm/OgvAllFilmsLayerService$showAllFilmsLayer$1.class */
public final class OgvAllFilmsLayerService$showAllFilmsLayer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $filmListId;
    private Object L$0;
    Object L$1;
    int label;
    final OgvAllFilmsLayerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm.OgvAllFilmsLayerService$showAllFilmsLayer$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/allfilm/OgvAllFilmsLayerService$showAllFilmsLayer$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final long $filmListId;
        final MutableState<OgvAllFilmsLayerService.a> $state$delegate;
        int label;
        final OgvAllFilmsLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j7, OgvAllFilmsLayerService ogvAllFilmsLayerService, MutableState<OgvAllFilmsLayerService.a> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$filmListId = j7;
            this.this$0 = ogvAllFilmsLayerService;
            this.$state$delegate = mutableState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0$0$0(OgvAllFilmsLayerService ogvAllFilmsLayerService, FilmInLayer filmInLayer) {
            PageReportService.i(ogvAllFilmsLayerService.f92702e, "united.player-video-detail.playlist-detail.card.show", filmInLayer.f92692j, 4);
            PageReportService.i(ogvAllFilmsLayerService.f92702e, "united.player-video-detail.playlist-detail.follow-btn.show", filmInLayer.f92692j, 4);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0$1(OgvAllFilmsLayerService ogvAllFilmsLayerService, OgvAllFilms ogvAllFilms) {
            PageReportService.i(ogvAllFilmsLayerService.f92702e, "united.player-video-detail.playlist-detail.0.show", ogvAllFilms.f92697d, 4);
            PageReportService.i(ogvAllFilmsLayerService.f92702e, "united.player-video-detail.playlist-detail.favor-btn.show", ogvAllFilms.f92697d, 4);
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$filmListId, this.this$0, this.$state$delegate, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            y yVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Fu0.a.f6447a.getClass();
                Fu0.a aVar = a.C0039a.f6449b;
                long j7 = this.$filmListId;
                this.label = 1;
                Object allFilm = aVar.getAllFilm(j7, "playview", this);
                obj = allFilm;
                if (allFilm == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
            long j8 = this.$filmListId;
            final OgvAllFilmsLayerService ogvAllFilmsLayerService = this.this$0;
            MutableState<OgvAllFilmsLayerService.a> mutableState = this.$state$delegate;
            boolean z6 = biliApiResponse instanceof BiliApiResponse.BusinessFailure;
            OgvAllFilmsLayerService.a.C0695a c0695a = OgvAllFilmsLayerService.a.C0695a.f92703a;
            if (z6) {
                BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
                new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
            } else {
                if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                    if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final OgvAllFilms ogvAllFilms = (OgvAllFilms) ((BiliApiResponse.Success) biliApiResponse).getData();
                    List<FilmInLayer> listA = ogvAllFilms.a();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
                    Iterator<T> it = listA.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        yVar = com.bilibili.ship.theseus.united.report.a.f104837a;
                        if (!zHasNext) {
                            break;
                        }
                        final FilmInLayer filmInLayer = (FilmInLayer) it.next();
                        long j9 = filmInLayer.f92684a;
                        FollowSeasonStatus followSeasonStatus = FollowSeasonStatus.UNKNOWN;
                        com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
                        com.bilibili.community.follow.c.b(j9, filmInLayer.f92687d, followSeasonStatus);
                        arrayList.add(new ExposureEntry(yVar, new Function0(ogvAllFilmsLayerService, filmInLayer) { // from class: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm.k

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final OgvAllFilmsLayerService f92751a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final FilmInLayer f92752b;

                            {
                                this.f92751a = ogvAllFilmsLayerService;
                                this.f92752b = filmInLayer;
                            }

                            public final Object invoke() {
                                return OgvAllFilmsLayerService$showAllFilmsLayer$1.AnonymousClass1.invokeSuspend$lambda$0$0$0(this.f92751a, this.f92752b);
                            }
                        }));
                    }
                    OgvAllFilmsLayerService$showAllFilmsLayer$1.invokeSuspend$lambda$1(mutableState, new OgvAllFilmsLayerService.a.c(ogvAllFilms, arrayList, new ExposureEntry(yVar, new Function0(ogvAllFilmsLayerService, ogvAllFilms) { // from class: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm.l

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final OgvAllFilmsLayerService f92753a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final OgvAllFilms f92754b;

                        {
                            this.f92753a = ogvAllFilmsLayerService;
                            this.f92754b = ogvAllFilms;
                        }

                        public final Object invoke() {
                            return OgvAllFilmsLayerService$showAllFilmsLayer$1.AnonymousClass1.invokeSuspend$lambda$0$1(this.f92753a, this.f92754b);
                        }
                    })));
                    com.bilibili.community.filmsfavorite.b bVar = com.bilibili.community.filmsfavorite.b.a;
                    com.bilibili.community.filmsfavorite.b.c.a(Long.valueOf(j8), Boolean.valueOf(ogvAllFilms.f92695b));
                    return Unit.INSTANCE;
                }
                ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            }
            OgvAllFilmsLayerService$showAllFilmsLayer$1.invokeSuspend$lambda$1(mutableState, c0695a);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/allfilm/OgvAllFilmsLayerService$showAllFilmsLayer$1$a.class */
    public static final class a implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvAllFilmsLayerService f92708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FilmInLayer f92709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final State<com.bilibili.community.follow.b> f92710c;

        public a(OgvAllFilmsLayerService ogvAllFilmsLayerService, FilmInLayer filmInLayer, State<com.bilibili.community.follow.b> state) {
            this.f92708a = ogvAllFilmsLayerService;
            this.f92709b = filmInLayer;
            this.f92710c = state;
        }

        public final Object invoke() {
            OgvAllFilmsLayerService ogvAllFilmsLayerService = this.f92708a;
            PageReportService pageReportService = ogvAllFilmsLayerService.f92702e;
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            FilmInLayer filmInLayer = this.f92709b;
            mapCreateMapBuilder.putAll(filmInLayer.f92692j);
            State<com.bilibili.community.follow.b> state = this.f92710c;
            mapCreateMapBuilder.put("follow", OgvAllFilmsLayerService$showAllFilmsLayer$1.invokeSuspend$lambda$2$6$0$0$0(state).a ? "0" : "1");
            Unit unit = Unit.INSTANCE;
            PageReportService.g(pageReportService, "united.player-video-detail.playlist-detail.follow-btn.click", MapsKt.build(mapCreateMapBuilder), 4);
            BuildersKt.launch$default(ogvAllFilmsLayerService.f92699b, (CoroutineContext) null, (CoroutineStart) null, new OgvAllFilmsLayerService$follow$1(ogvAllFilmsLayerService, OgvAllFilmsLayerService$showAllFilmsLayer$1.invokeSuspend$lambda$2$6$0$0$0(state), filmInLayer, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/allfilm/OgvAllFilmsLayerService$showAllFilmsLayer$1$b.class */
    public static final class b implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvAllFilmsLayerService f92711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FilmInLayer f92712b;

        public b(OgvAllFilmsLayerService ogvAllFilmsLayerService, FilmInLayer filmInLayer) {
            this.f92711a = ogvAllFilmsLayerService;
            this.f92712b = filmInLayer;
        }

        public final Object invoke() {
            OgvAllFilmsLayerService ogvAllFilmsLayerService = this.f92711a;
            PageReportService pageReportService = ogvAllFilmsLayerService.f92702e;
            FilmInLayer filmInLayer = this.f92712b;
            PageReportService.g(pageReportService, "united.player-video-detail.playlist-detail.card.click", filmInLayer.f92692j, 4);
            BLRouter.routeTo(new RouteRequest.Builder(filmInLayer.f92688e).build(), ogvAllFilmsLayerService.f92698a);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/allfilm/OgvAllFilmsLayerService$showAllFilmsLayer$1$c.class */
    public static final class c implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f92713a;

        public c(List list) {
            this.f92713a = list;
        }

        public final Object invoke(Object obj) {
            this.f92713a.get(((Number) obj).intValue());
            return null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/allfilm/OgvAllFilmsLayerService$showAllFilmsLayer$1$d.class */
    public static final class d implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f92714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OgvAllFilmsLayerService.a f92715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final OgvAllFilmsLayerService f92716c;

        public d(List list, OgvAllFilmsLayerService.a aVar, OgvAllFilmsLayerService ogvAllFilmsLayerService) {
            this.f92714a = list;
            this.f92715b = aVar;
            this.f92716c = ogvAllFilmsLayerService;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x01c4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 526
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm.OgvAllFilmsLayerService$showAllFilmsLayer$1.d.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvAllFilmsLayerService$showAllFilmsLayer$1(OgvAllFilmsLayerService ogvAllFilmsLayerService, long j7, Continuation<? super OgvAllFilmsLayerService$showAllFilmsLayer$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvAllFilmsLayerService;
        this.$filmListId = j7;
    }

    private static final OgvAllFilmsLayerService.a invokeSuspend$lambda$0(MutableState<OgvAllFilmsLayerService.a> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(MutableState<OgvAllFilmsLayerService.a> mutableState, OgvAllFilmsLayerService.a aVar) {
        mutableState.setValue(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02bd  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit invokeSuspend$lambda$2(kotlinx.coroutines.CoroutineScope r9, final long r10, final com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm.OgvAllFilmsLayerService r12, androidx.compose.runtime.MutableState r13, androidx.compose.runtime.Composer r14, int r15) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm.OgvAllFilmsLayerService$showAllFilmsLayer$1.invokeSuspend$lambda$2(kotlinx.coroutines.CoroutineScope, long, com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm.OgvAllFilmsLayerService, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$2$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$5$0(OgvAllFilmsLayerService ogvAllFilmsLayerService, OgvAllFilms ogvAllFilms, long j7, State state) {
        PageReportService.g(ogvAllFilmsLayerService.f92702e, "united.player-video-detail.playlist-detail.favor-btn.click", ogvAllFilms.f92697d, 4);
        BuildersKt.launch$default(ogvAllFilmsLayerService.f92699b, (CoroutineContext) null, (CoroutineStart) null, new OgvAllFilmsLayerService$showAllFilmsLayer$1$component$1$4$1$1(ogvAllFilmsLayerService, j7, state, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$6$0(OgvAllFilms ogvAllFilms, OgvAllFilmsLayerService.a aVar, OgvAllFilmsLayerService ogvAllFilmsLayerService, LazyListScope lazyListScope) {
        List<FilmInLayer> listA = ogvAllFilms.a();
        lazyListScope.items(listA.size(), null, new c(listA), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new d(listA, aVar, ogvAllFilmsLayerService)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.bilibili.community.follow.b invokeSuspend$lambda$2$6$0$0$0(State<com.bilibili.community.follow.b> state) {
        return state.getValue();
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvAllFilmsLayerService$showAllFilmsLayer$1 ogvAllFilmsLayerService$showAllFilmsLayer$1 = new OgvAllFilmsLayerService$showAllFilmsLayer$1(this.this$0, this.$filmListId, continuation);
        ogvAllFilmsLayerService$showAllFilmsLayer$1.L$0 = obj;
        return ogvAllFilmsLayerService$showAllFilmsLayer$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        OgvAllFilmsLayerService ogvAllFilmsLayerService;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ogvAllFilmsLayerService = (OgvAllFilmsLayerService) this.L$1;
            gVar2 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                gVar = gVar2;
                gVar.j(ogvAllFilmsLayerService);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                gVar2.j(ogvAllFilmsLayerService);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        final MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(OgvAllFilmsLayerService.a.b.f92704a, null, 2, null);
        final long j7 = this.$filmListId;
        final OgvAllFilmsLayerService ogvAllFilmsLayerService2 = this.this$0;
        Eu0.e eVar = new Eu0.e(ComposableLambdaKt.composableLambdaInstance(-143627312, true, new Function2(coroutineScope, j7, ogvAllFilmsLayerService2, mutableStateMutableStateOf$default) { // from class: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CoroutineScope f92740a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f92741b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final OgvAllFilmsLayerService f92742c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final MutableState f92743d;

            {
                this.f92740a = coroutineScope;
                this.f92741b = j7;
                this.f92742c = ogvAllFilmsLayerService2;
                this.f92743d = mutableStateMutableStateOf$default;
            }

            public final Object invoke(Object obj2, Object obj3) {
                int iIntValue = ((Integer) obj3).intValue();
                OgvAllFilmsLayerService ogvAllFilmsLayerService3 = this.f92742c;
                MutableState mutableState = this.f92743d;
                return OgvAllFilmsLayerService$showAllFilmsLayer$1.invokeSuspend$lambda$2(this.f92740a, this.f92741b, ogvAllFilmsLayerService3, mutableState, (Composer) obj2, iIntValue);
            }
        }));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$filmListId, this.this$0, mutableStateMutableStateOf$default, null), 3, (Object) null);
        ogvAllFilmsLayerService = this.this$0;
        gVar = ogvAllFilmsLayerService.f92701d;
        gVar.f(ogvAllFilmsLayerService);
        try {
            TheseusFloatLayerService theseusFloatLayerService = ogvAllFilmsLayerService.f92700c;
            this.L$0 = gVar;
            this.L$1 = ogvAllFilmsLayerService;
            this.label = 1;
            if (theseusFloatLayerService.h(eVar, theseusFloatLayerService.f99664n, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            gVar.j(ogvAllFilmsLayerService);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            gVar2 = gVar;
            th = th3;
            gVar2.j(ogvAllFilmsLayerService);
            throw th;
        }
    }
}
