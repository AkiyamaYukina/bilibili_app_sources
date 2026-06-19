package com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist;

import Fu0.a;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.bilibili.api.BiliApiException;
import com.bilibili.bplus.followinglist.opus.manager.y;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.ship.theseus.ogv.intro.filmlist.Film;
import com.bilibili.ship.theseus.ogv.intro.filmlist.OgvFilms;
import com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.OgvMoreFilmsLayerService;
import com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.OgvMoreFilmsLayerService$showMoreFilmsLayer$1;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/morefilmlist/OgvMoreFilmsLayerService$showMoreFilmsLayer$1.class */
public final class OgvMoreFilmsLayerService$showMoreFilmsLayer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $queryType;
    private Object L$0;
    Object L$1;
    int label;
    final OgvMoreFilmsLayerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.OgvMoreFilmsLayerService$showMoreFilmsLayer$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/morefilmlist/OgvMoreFilmsLayerService$showMoreFilmsLayer$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final int $queryType;
        final MutableState<OgvMoreFilmsLayerService.a> $state$delegate;
        int label;
        final OgvMoreFilmsLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvMoreFilmsLayerService ogvMoreFilmsLayerService, int i7, MutableState<OgvMoreFilmsLayerService.a> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvMoreFilmsLayerService;
            this.$queryType = i7;
            this.$state$delegate = mutableState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0$0$0(OgvMoreFilmsLayerService ogvMoreFilmsLayerService, OgvFilms ogvFilms) {
            PageReportService.i(ogvMoreFilmsLayerService.f92756b, "united.player-video-detail.playlist-more.module.show", ogvFilms.f92677i, 4);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0$1$0$0(OgvMoreFilmsLayerService ogvMoreFilmsLayerService, Film film) {
            PageReportService.i(ogvMoreFilmsLayerService.f92756b, "united.player-video-detail.playlist-more.card.show", film.f92668g, 4);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0$2(OgvMoreFilmsLayerService ogvMoreFilmsLayerService) {
            PageReportService.i(ogvMoreFilmsLayerService.f92756b, "united.player-video-detail.playlist-more.0.show", null, 6);
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$queryType, this.$state$delegate, continuation);
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
                long j7 = this.this$0.f92760f;
                int i8 = this.$queryType;
                this.label = 1;
                Object moreFilm = aVar.getMoreFilm(j7, i8, "playview", this);
                obj = moreFilm;
                if (moreFilm == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
            final OgvMoreFilmsLayerService ogvMoreFilmsLayerService = this.this$0;
            MutableState<OgvMoreFilmsLayerService.a> mutableState = this.$state$delegate;
            boolean z6 = biliApiResponse instanceof BiliApiResponse.BusinessFailure;
            OgvMoreFilmsLayerService.a.C0696a c0696a = OgvMoreFilmsLayerService.a.C0696a.f92763a;
            if (z6) {
                BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
                new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
            } else {
                if (!(biliApiResponse instanceof BiliApiResponse.ServiceUnavailable)) {
                    if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list = (List) ((BiliApiResponse.Success) biliApiResponse).getData();
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        yVar = com.bilibili.ship.theseus.united.report.a.f104837a;
                        if (!zHasNext) {
                            break;
                        }
                        final OgvFilms ogvFilms = (OgvFilms) it.next();
                        arrayList.add(new ExposureEntry(yVar, new Function0(ogvMoreFilmsLayerService, ogvFilms) { // from class: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.e

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final OgvMoreFilmsLayerService f92793a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final OgvFilms f92794b;

                            {
                                this.f92793a = ogvMoreFilmsLayerService;
                                this.f92794b = ogvFilms;
                            }

                            public final Object invoke() {
                                return OgvMoreFilmsLayerService$showMoreFilmsLayer$1.AnonymousClass1.invokeSuspend$lambda$0$0$0(this.f92793a, this.f92794b);
                            }
                        }));
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        List<Film> listB = ((OgvFilms) it2.next()).b();
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listB, 10));
                        for (final Film film : listB) {
                            arrayList3.add(new ExposureEntry(yVar, new Function0(ogvMoreFilmsLayerService, film) { // from class: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.f

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final OgvMoreFilmsLayerService f92795a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final Film f92796b;

                                {
                                    this.f92795a = ogvMoreFilmsLayerService;
                                    this.f92796b = film;
                                }

                                public final Object invoke() {
                                    return OgvMoreFilmsLayerService$showMoreFilmsLayer$1.AnonymousClass1.invokeSuspend$lambda$0$1$0$0(this.f92795a, this.f92796b);
                                }
                            }));
                        }
                        arrayList2.add(arrayList3);
                    }
                    OgvMoreFilmsLayerService$showMoreFilmsLayer$1.invokeSuspend$lambda$1(mutableState, new OgvMoreFilmsLayerService.a.c(list, arrayList, arrayList2, new ExposureEntry(yVar, new Function0(ogvMoreFilmsLayerService) { // from class: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.g

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final OgvMoreFilmsLayerService f92797a;

                        {
                            this.f92797a = ogvMoreFilmsLayerService;
                        }

                        public final Object invoke() {
                            return OgvMoreFilmsLayerService$showMoreFilmsLayer$1.AnonymousClass1.invokeSuspend$lambda$0$2(this.f92797a);
                        }
                    })));
                    return Unit.INSTANCE;
                }
                ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            }
            OgvMoreFilmsLayerService$showMoreFilmsLayer$1.invokeSuspend$lambda$1(mutableState, c0696a);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/morefilmlist/OgvMoreFilmsLayerService$showMoreFilmsLayer$1$a.class */
    public static final class a implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvFilms f92769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OgvMoreFilmsLayerService f92770b;

        public a(OgvMoreFilmsLayerService ogvMoreFilmsLayerService, OgvFilms ogvFilms) {
            this.f92769a = ogvFilms;
            this.f92770b = ogvMoreFilmsLayerService;
        }

        public final Object invoke() {
            OgvFilms ogvFilms = this.f92769a;
            if (!StringsKt.isBlank(ogvFilms.f92674e)) {
                OgvMoreFilmsLayerService ogvMoreFilmsLayerService = this.f92770b;
                PageReportService.g(ogvMoreFilmsLayerService.f92756b, "united.player-video-detail.playlist-more.all-btn.click", ogvFilms.f92677i, 4);
                ogvMoreFilmsLayerService.h.a(ogvFilms.a());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/morefilmlist/OgvMoreFilmsLayerService$showMoreFilmsLayer$1$b.class */
    public static final class b implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvFilms f92771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OgvMoreFilmsLayerService.a f92772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f92773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final OgvMoreFilmsLayerService f92774d;

        public b(OgvFilms ogvFilms, OgvMoreFilmsLayerService.a aVar, int i7, OgvMoreFilmsLayerService ogvMoreFilmsLayerService) {
            this.f92771a = ogvFilms;
            this.f92772b = aVar;
            this.f92773c = i7;
            this.f92774d = ogvMoreFilmsLayerService;
        }

        public final Object invoke(Object obj) {
            List<Film> listB = this.f92771a.b();
            ((LazyListScope) obj).items(listB.size(), null, new i(listB), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new j(listB, this.f92772b, this.f92773c, this.f92774d)));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/morefilmlist/OgvMoreFilmsLayerService$showMoreFilmsLayer$1$c.class */
    public static final class c implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f92775a;

        public c(List list) {
            this.f92775a = list;
        }

        public final Object invoke(Object obj) {
            this.f92775a.get(((Number) obj).intValue());
            return null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/morefilmlist/OgvMoreFilmsLayerService$showMoreFilmsLayer$1$d.class */
    public static final class d implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f92776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Modifier f92777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final OgvMoreFilmsLayerService.a f92778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final OgvMoreFilmsLayerService f92779d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final State f92780e;

        public d(List list, Modifier modifier, OgvMoreFilmsLayerService.a aVar, OgvMoreFilmsLayerService ogvMoreFilmsLayerService, State state) {
            this.f92776a = list;
            this.f92777b = modifier;
            this.f92778c = aVar;
            this.f92779d = ogvMoreFilmsLayerService;
            this.f92780e = state;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x01d7  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0295  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 732
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.OgvMoreFilmsLayerService$showMoreFilmsLayer$1.d.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvMoreFilmsLayerService$showMoreFilmsLayer$1(OgvMoreFilmsLayerService ogvMoreFilmsLayerService, int i7, Continuation<? super OgvMoreFilmsLayerService$showMoreFilmsLayer$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvMoreFilmsLayerService;
        this.$queryType = i7;
    }

    private static final OgvMoreFilmsLayerService.a invokeSuspend$lambda$0(MutableState<OgvMoreFilmsLayerService.a> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(MutableState<OgvMoreFilmsLayerService.a> mutableState, OgvMoreFilmsLayerService.a aVar) {
        mutableState.setValue(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d6  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit invokeSuspend$lambda$2(final com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.OgvMoreFilmsLayerService r13, kotlinx.coroutines.CoroutineScope r14, androidx.compose.runtime.MutableState r15, androidx.compose.runtime.Composer r16, int r17) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.OgvMoreFilmsLayerService$showMoreFilmsLayer$1.invokeSuspend$lambda$2(com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.OgvMoreFilmsLayerService, kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$2$0(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit invokeSuspend$lambda$2$3(final com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.OgvMoreFilmsLayerService.a r14, final androidx.compose.ui.Modifier r15, final androidx.compose.runtime.State r16, final com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.OgvMoreFilmsLayerService r17, androidx.compose.runtime.Composer r18, int r19) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.OgvMoreFilmsLayerService$showMoreFilmsLayer$1.invokeSuspend$lambda$2$3(com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.OgvMoreFilmsLayerService$a, androidx.compose.ui.Modifier, androidx.compose.runtime.State, com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.OgvMoreFilmsLayerService, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$3$0$0(List list, Modifier modifier, OgvMoreFilmsLayerService.a aVar, OgvMoreFilmsLayerService ogvMoreFilmsLayerService, State state, LazyListScope lazyListScope) {
        lazyListScope.items(list.size(), null, new c(list), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new d(list, modifier, aVar, ogvMoreFilmsLayerService, state)));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvMoreFilmsLayerService$showMoreFilmsLayer$1 ogvMoreFilmsLayerService$showMoreFilmsLayer$1 = new OgvMoreFilmsLayerService$showMoreFilmsLayer$1(this.this$0, this.$queryType, continuation);
        ogvMoreFilmsLayerService$showMoreFilmsLayer$1.L$0 = obj;
        return ogvMoreFilmsLayerService$showMoreFilmsLayer$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        OgvMoreFilmsLayerService ogvMoreFilmsLayerService;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ogvMoreFilmsLayerService = (OgvMoreFilmsLayerService) this.L$1;
            gVar2 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                gVar = gVar2;
                gVar.j(ogvMoreFilmsLayerService);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                gVar2.j(ogvMoreFilmsLayerService);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        final MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(OgvMoreFilmsLayerService.a.b.f92764a, null, 2, null);
        final OgvMoreFilmsLayerService ogvMoreFilmsLayerService2 = this.this$0;
        Eu0.e eVar = new Eu0.e(ComposableLambdaKt.composableLambdaInstance(386809759, true, new Function2(ogvMoreFilmsLayerService2, coroutineScope, mutableStateMutableStateOf$default) { // from class: com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvMoreFilmsLayerService f92790a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final CoroutineScope f92791b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final MutableState f92792c;

            {
                this.f92790a = ogvMoreFilmsLayerService2;
                this.f92791b = coroutineScope;
                this.f92792c = mutableStateMutableStateOf$default;
            }

            public final Object invoke(Object obj2, Object obj3) {
                int iIntValue = ((Integer) obj3).intValue();
                CoroutineScope coroutineScope2 = this.f92791b;
                MutableState mutableState = this.f92792c;
                return OgvMoreFilmsLayerService$showMoreFilmsLayer$1.invokeSuspend$lambda$2(this.f92790a, coroutineScope2, mutableState, (Composer) obj2, iIntValue);
            }
        }));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$queryType, mutableStateMutableStateOf$default, null), 3, (Object) null);
        OgvMoreFilmsLayerService ogvMoreFilmsLayerService3 = this.this$0;
        gVar = ogvMoreFilmsLayerService3.f92759e;
        gVar.f(ogvMoreFilmsLayerService3);
        try {
            TheseusFloatLayerService theseusFloatLayerService = ogvMoreFilmsLayerService3.f92758d;
            this.L$0 = gVar;
            this.L$1 = ogvMoreFilmsLayerService3;
            this.label = 1;
            if (theseusFloatLayerService.h(eVar, theseusFloatLayerService.f99664n, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            ogvMoreFilmsLayerService = ogvMoreFilmsLayerService3;
            gVar.j(ogvMoreFilmsLayerService);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            ogvMoreFilmsLayerService = ogvMoreFilmsLayerService3;
            gVar2 = gVar;
            th = th3;
            gVar2.j(ogvMoreFilmsLayerService);
            throw th;
        }
    }
}
