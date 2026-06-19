package com.bilibili.search2.discover;

import HG0.C2068a0;
import HG0.Y;
import Ps0.C2800v;
import UR0.S;
import Vt0.C2958c;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.utils.BiliCallLifeCycleObserverKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.base.BiliContext;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.bplus.baseplus.NestedCompatRecycleView;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.lib.blkv.SharedPrefX;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.pageview.model.PageViewsEvent;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.search2.api.DefaultKeyword;
import com.bilibili.search2.api.NegativeFeedback;
import com.bilibili.search2.api.SearchReferral;
import com.bilibili.search2.api.SearchService;
import com.bilibili.search2.eastereggs.SearchLocalDataManager;
import com.bilibili.search2.main.MainSearchViewModel;
import com.bilibili.search2.main.data.SearchPageStateModel;
import com.bilibili.search2.main.data.SearchUserActManager;
import com.bilibili.search2.main.z;
import com.bilibili.search2.stardust.expose.SearchDiscoverExposeClient;
import com.bilibili.search2.stardust.recommend.FeedbackSearchWord;
import com.bilibili.search2.stardust.recommend.FeedbackSearchWordType;
import com.bilibili.search2.stardust.recommend.RecommendBottomSheetDialog;
import com.bilibili.search2.utils.B;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import w8.y;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/BiliMainSearchDiscoverFragment.class */
@StabilityInferred(parameters = 0)
@AndroidEntryPoint
public final class BiliMainSearchDiscoverFragment extends Hilt_BiliMainSearchDiscoverFragment implements m, IPvTracker {
    public NestedCompatRecycleView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Qt0.d f86406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SearchPageStateModel f86407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f86408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final a f86409l = new a(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f86410m = LazyKt.lazy(new Aa.f(this, 1));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<com.bilibili.search2.stardust.expose.f> f86411n = StateFlowKt.MutableStateFlow(new com.bilibili.search2.stardust.expose.f(0));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f86412o = LazyKt.lazy(new Aa.g(this, 2));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public SearchDiscoverExposeClient f86413p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public o f86414q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Inject
    public com.bilibili.search2.component.c f86415r;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/BiliMainSearchDiscoverFragment$a.class */
    public static final class a extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliMainSearchDiscoverFragment f86416a;

        public a(BiliMainSearchDiscoverFragment biliMainSearchDiscoverFragment) {
            this.f86416a = biliMainSearchDiscoverFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            super.onScrollStateChanged(recyclerView, i7);
            if (i7 != 0) {
                this.f86416a.nf().f86755b.setValue(new SearchPageStateModel.c(false, false));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/BiliMainSearchDiscoverFragment$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliMainSearchDiscoverFragment f86417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f86418b;

        public b(BiliMainSearchDiscoverFragment biliMainSearchDiscoverFragment, Rect rect) {
            this.f86417a = biliMainSearchDiscoverFragment;
            this.f86418b = rect;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.search2.discover.BiliMainSearchDiscoverFragment$onViewCreated$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/BiliMainSearchDiscoverFragment$onViewCreated$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final BiliMainSearchDiscoverFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.search2.discover.BiliMainSearchDiscoverFragment$onViewCreated$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/BiliMainSearchDiscoverFragment$onViewCreated$4$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliMainSearchDiscoverFragment f86419a;

            public a(BiliMainSearchDiscoverFragment biliMainSearchDiscoverFragment) {
                this.f86419a = biliMainSearchDiscoverFragment;
            }

            public final Object emit(Object obj, Continuation continuation) {
                FragmentActivity fragmentActivityP3;
                ((Boolean) obj).getClass();
                BiliMainSearchDiscoverFragment biliMainSearchDiscoverFragment = this.f86419a;
                if (Intrinsics.areEqual(biliMainSearchDiscoverFragment.nf().f86769q.getValue(), Boxing.boxBoolean(true))) {
                    biliMainSearchDiscoverFragment.nf().f86769q.setValue(Boxing.boxBoolean(false));
                } else if (Intrinsics.areEqual(biliMainSearchDiscoverFragment.nf().f86770r.getValue(), Boxing.boxBoolean(true))) {
                    biliMainSearchDiscoverFragment.nf().f86770r.setValue(Boxing.boxBoolean(false));
                } else if (!biliMainSearchDiscoverFragment.nf().f86776x && DeviceDecision.INSTANCE.getBoolean("search_discover_default_word_refresh", true) && (fragmentActivityP3 = biliMainSearchDiscoverFragment.p3()) != null) {
                    SearchPageStateModel.d dVar = biliMainSearchDiscoverFragment.nf().f86777y;
                    if (wD0.a.b()) {
                        String strN = B.n(2131847794);
                        DefaultKeyword defaultKeyword = new DefaultKeyword();
                        defaultKeyword.setShow(strN);
                        defaultKeyword.setWord(strN);
                        dVar.a(defaultKeyword);
                    } else {
                        com.bilibili.app.comm.list.common.api.c cVar = (com.bilibili.app.comm.list.common.api.c) w8.d.a(BLRouter.INSTANCE, com.bilibili.app.comm.list.common.api.c.class, "IDefaultKeywordService");
                        if (cVar != null) {
                            cVar.a((String) null, 0, 0, (String) null, true).observe(fragmentActivityP3, new f(new Vs0.f(dVar, 4)));
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(BiliMainSearchDiscoverFragment biliMainSearchDiscoverFragment, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = biliMainSearchDiscoverFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow<Boolean> mutableSharedFlow = this.this$0.of().f86462i;
                a aVar = new a(this.this$0);
                this.label = 1;
                Object objCollect = mutableSharedFlow.collect(new BiliMainSearchDiscoverFragment$onViewCreated$4$invokeSuspend$$inlined$filter$1$2(aVar), this);
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

    /* JADX INFO: renamed from: com.bilibili.search2.discover.BiliMainSearchDiscoverFragment$onViewCreated$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/BiliMainSearchDiscoverFragment$onViewCreated$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final BiliMainSearchDiscoverFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.search2.discover.BiliMainSearchDiscoverFragment$onViewCreated$6$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/BiliMainSearchDiscoverFragment$onViewCreated$6$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<n, Continuation<? super Unit>, Object> {
            int label;
            final BiliMainSearchDiscoverFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BiliMainSearchDiscoverFragment biliMainSearchDiscoverFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = biliMainSearchDiscoverFragment;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(n nVar, Continuation<? super Unit> continuation) {
                return create(nVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                GridLayoutManager.SpanSizeLookup spanSizeLookup;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                RecyclerView recyclerView = this.this$0.h;
                RecyclerView recyclerView2 = recyclerView;
                if (recyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDiscoverList");
                    recyclerView2 = null;
                }
                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                if (gridLayoutManager != null && (spanSizeLookup = gridLayoutManager.getSpanSizeLookup()) != null) {
                    spanSizeLookup.invalidateSpanGroupIndexCache();
                }
                Qt0.d dVar = this.this$0.f86406i;
                if (dVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSearchDiscoverAdapter");
                    dVar = null;
                }
                dVar.notifySectionData();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(BiliMainSearchDiscoverFragment biliMainSearchDiscoverFragment, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = biliMainSearchDiscoverFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<n> stateFlow = this.this$0.of().f86464k;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.bilibili.search2.discover.m
    public final void P0(int i7, int i8, @Nullable String str, boolean z6) {
        Context context = getContext();
        String str2 = null;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            String str3 = d.f86431a;
            o oVar = this.f86414q;
            if (oVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchDiscoverDataCallback");
                oVar = null;
            }
            SharedPreferencesHelper sharedPreferencesHelper = new SharedPreferencesHelper(applicationContext);
            if (z6 || sharedPreferencesHelper.optBoolean("pref_search_discovery_expended", true)) {
                com.bilibili.search2.discover.b bVar = new com.bilibili.search2.discover.b(i7, oVar);
                String strA = y.a();
                PageViewsEvent lastEndPv = PageViewTracker.getInstance().getLastEndPv();
                String str4 = lastEndPv != null ? lastEndPv.eventId : null;
                Map map = lastEndPv != null ? lastEndPv.extra : null;
                String str5 = map != null ? (String) map.get(GameCardButton.extraAvid) : null;
                if (map != null) {
                    str2 = (String) map.get("query");
                }
                String strB = SearchUserActManager.b();
                if (str == null) {
                    str = "";
                }
                BiliCallLifeCycleObserverKt.enqueue(((SearchService) ServiceGenerator.createService(SearchService.class)).guessRecommend(strA, i7, i8, str4, str5, str2, strB, str), this, bVar);
            }
        }
    }

    @Override // com.bilibili.search2.discover.m
    public final void W7(@Nullable String str) {
        com.bilibili.app.comm.list.common.api.c cVar;
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 == null || (cVar = (com.bilibili.app.comm.list.common.api.c) w8.d.a(BLRouter.INSTANCE, com.bilibili.app.comm.list.common.api.c.class, "IDefaultKeywordService")) == null) {
            return;
        }
        cVar.a((String) null, 3, 0, str, false).observe(fragmentActivityP3, new f(new C2068a0(this, 4)));
    }

    @Override // com.bilibili.search2.discover.m
    public final void Za() {
        nf().f86755b.setValue(new SearchPageStateModel.c(false, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [androidx.fragment.app.Fragment, com.bilibili.search2.stardust.recommend.RecommendBottomSheetDialog] */
    @Override // com.bilibili.search2.discover.m
    public final void e9(int i7) {
        NegativeFeedback negativeFeedback;
        FragmentActivity fragmentActivityP3;
        FragmentManager supportFragmentManager;
        h hVar;
        List<SearchReferral.Guess> list;
        h hVar2 = (h) of().f86456b.getValue();
        if (hVar2 == null || (negativeFeedback = hVar2.f86437c) == null || (fragmentActivityP3 = p3()) == null || (supportFragmentManager = fragmentActivityP3.getSupportFragmentManager()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Context context = getContext();
        boolean zA = context != null ? new C2958c(context).a() : true;
        DefaultKeyword value = nf().f86758e.getValue();
        if (value != null) {
            arrayList.add(new FeedbackSearchWord(value.getWord(), value.getTrackId(), FeedbackSearchWordType.SEARCH_DEFAULT, !zA));
        }
        if (zA && (hVar = (h) of().f86456b.getValue()) != null && (list = hVar.f86435a) != null) {
            int i8 = 0;
            for (Object obj : list) {
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                SearchReferral.Guess guess = (SearchReferral.Guess) obj;
                arrayList.add(new FeedbackSearchWord(guess.showName, guess.trackId, FeedbackSearchWordType.SEARCH_RECOMMEND, i8 == i7));
                i8++;
            }
        }
        Qt0.d dVar = this.f86406i;
        Qt0.d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchDiscoverAdapter");
            dVar2 = null;
        }
        ?? recommendBottomSheetDialog = new RecommendBottomSheetDialog();
        Bundle bundle = new Bundle();
        bundle.putSerializable("negative_feedback", negativeFeedback);
        bundle.putSerializable("arg_items", arrayList);
        recommendBottomSheetDialog.setArguments(bundle);
        recommendBottomSheetDialog.f88779k = null;
        recommendBottomSheetDialog.f88778j = dVar2;
        recommendBottomSheetDialog.show(supportFragmentManager, "RecommendBottomSheetDialog");
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "search.search-discover.0.0.pv";
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.bilibili.pvtracker.IPvTracker
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle getPvExtra() {
        /*
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r4
            com.bilibili.search2.main.data.SearchPageStateModel r0 = r0.nf()     // Catch: java.lang.IllegalStateException -> L3c
            androidx.lifecycle.MutableLiveData<com.bilibili.search2.api.DefaultKeyword> r0 = r0.f86758e     // Catch: java.lang.IllegalStateException -> L3c
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.IllegalStateException -> L3c
            com.bilibili.search2.api.DefaultKeyword r0 = (com.bilibili.search2.api.DefaultKeyword) r0     // Catch: java.lang.IllegalStateException -> L3c
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L25
            r0 = r5
            java.lang.String r0 = r0.getWord()     // Catch: java.lang.IllegalStateException -> L3c
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L28
        L25:
            java.lang.String r0 = ""
            r5 = r0
        L28:
            r0 = r7
            java.lang.String r1 = "searchpage"
            java.lang.String r2 = "search-discover"
            r0.putString(r1, r2)     // Catch: java.lang.IllegalStateException -> L3c
            r0 = r7
            java.lang.String r1 = "query"
            r2 = r5
            r0.putString(r1, r2)     // Catch: java.lang.IllegalStateException -> L3c
            goto L47
        L3c:
            r5 = move-exception
            r0 = r7
            java.lang.String r1 = "searchpage"
            java.lang.String r2 = "search-discover"
            r0.putString(r1, r2)
        L47:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.discover.BiliMainSearchDiscoverFragment.getPvExtra():android.os.Bundle");
    }

    @Override // com.bilibili.search2.main.BaseMainSearchChildFragment
    @NotNull
    public final String jf() {
        return "search.search-discover.cancel-search.0.click";
    }

    @Override // com.bilibili.search2.main.BaseMainSearchChildFragment
    @NotNull
    public final String kf() {
        return "search-discover";
    }

    @Override // com.bilibili.search2.main.BaseMainSearchChildFragment
    public final void lf(boolean z6) {
        PageViewTracker.getInstance().setFragmentVisibility(this, !z6);
        if (z6) {
            return;
        }
        Boolean value = nf().f86762j.getValue();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(value, bool)) {
            String str = d.f86431a;
            Context context = getContext();
            o oVar = this.f86414q;
            if (oVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchDiscoverDataCallback");
                oVar = null;
            }
            d.a(context, oVar);
            Qt0.d dVar = this.f86406i;
            Qt0.d dVar2 = dVar;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchDiscoverAdapter");
                dVar2 = null;
            }
            P0(0, !new SharedPreferencesHelper(p3()).optBoolean("pref_search_discovery_expended", true) ? 1 : 0, null, !(dVar2.getSectionFromType(3) != null && dVar2.getSectionFromType(3).contentSize > 0));
        }
        nf().f86757d.setValue(Integer.valueOf(SearchPageStateModel.ElevationValue.RESULT_ELEVATION.getValue()));
        if (Intrinsics.areEqual(nf().f86762j.getValue(), bool)) {
            return;
        }
        nf().f86755b.setValue(new SearchPageStateModel.c(true, true));
    }

    @NotNull
    public final SearchPageStateModel nf() {
        SearchPageStateModel searchPageStateModel = this.f86407j;
        if (searchPageStateModel != null) {
            return searchPageStateModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
        return null;
    }

    public final p of() {
        return (p) this.f86410m.getValue();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        SharedPrefX sharedPrefX = SearchLocalDataManager.f86501a;
        SearchLocalDataManager.l();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131494105, viewGroup, false);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentHide(@NotNull Flag flag) {
        super.onFragmentHide(flag);
        BLog.i("[read][Search]BiliMainSearchDiscoverFragment", "onFragmentHide");
        com.bilibili.search2.stardust.expose.f fVar = (com.bilibili.search2.stardust.expose.f) this.f86411n.getValue();
        this.f86411n.setValue(new com.bilibili.search2.stardust.expose.f(false, !fVar.f88750a ? fVar.f88751b : SystemClock.elapsedRealtime()));
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        super.onFragmentShow(flag);
        BLog.i("[read][Search]BiliMainSearchDiscoverFragment", "onFragmentShow");
        com.bilibili.search2.stardust.expose.f fVar = (com.bilibili.search2.stardust.expose.f) this.f86411n.getValue();
        this.f86411n.setValue(new com.bilibili.search2.stardust.expose.f(true, fVar.f88750a ? fVar.f88751b : SystemClock.elapsedRealtime()));
    }

    @Override // com.bilibili.search2.main.BaseMainSearchChildFragment, com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z6) {
        super.onHiddenChanged(z6);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new BiliMainSearchDiscoverFragment$handlePageVisibilityChanged$1(this, null), 3, (Object) null);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        o oVar = null;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new BiliMainSearchDiscoverFragment$handlePageVisibilityChanged$1(this, null), 3, (Object) null);
        String str = d.f86431a;
        Context context = getContext();
        o oVar2 = this.f86414q;
        if (oVar2 != null) {
            oVar = oVar2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("searchDiscoverDataCallback");
        }
        d.a(context, oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.recyclerview.widget.RecyclerView$Adapter] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        FragmentActivity fragmentActivityP3;
        Float floatOrNull;
        super.onViewCreated(view, bundle);
        this.h = view.findViewById(2131310904);
        com.bilibili.search2.component.c cVar = this.f86415r;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchDiscoverFactory");
            cVar = null;
        }
        NestedCompatRecycleView nestedCompatRecycleView = this.h;
        NestedCompatRecycleView nestedCompatRecycleView2 = nestedCompatRecycleView;
        if (nestedCompatRecycleView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDiscoverList");
            nestedCompatRecycleView2 = null;
        }
        cVar.a(this, nestedCompatRecycleView2, new S(this, 2)).a();
        this.f86406i = new Qt0.d(this, of(), this);
        NestedCompatRecycleView nestedCompatRecycleView3 = this.h;
        NestedCompatRecycleView nestedCompatRecycleView4 = nestedCompatRecycleView3;
        if (nestedCompatRecycleView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDiscoverList");
            nestedCompatRecycleView4 = null;
        }
        Qt0.d dVar = this.f86406i;
        Qt0.d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchDiscoverAdapter");
            dVar2 = null;
        }
        nestedCompatRecycleView4.setAdapter(dVar2);
        int i7 = (com.bilibili.search2.component.a.b() && (fragmentActivityP3 = p3()) != null && KScreenAdjustUtilsKt.widthBreakPointLarge(ScreenAdjustUtilsKt.windowSize(fragmentActivityP3))) ? 2 : 1;
        this.f86408k = i7;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), i7);
        gridLayoutManager.setSpanSizeLookup(new e(this, i7));
        RecyclerView recyclerView = this.h;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDiscoverList");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView3 = this.h;
        RecyclerView recyclerView4 = recyclerView3;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDiscoverList");
            recyclerView4 = null;
        }
        recyclerView4.setItemAnimator(null);
        RecyclerView recyclerView5 = this.h;
        RecyclerView recyclerView6 = recyclerView5;
        if (recyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDiscoverList");
            recyclerView6 = null;
        }
        recyclerView6.addOnScrollListener(this.f86409l);
        this.f86407j = z.d(this);
        p pVarOf = of();
        pVarOf.getClass();
        this.f86414q = new o(pVarOf);
        String str = d.f86431a;
        Context context = getContext();
        o oVar = this.f86414q;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchDiscoverDataCallback");
            oVar = null;
        }
        C2800v.a(this, GAdCoreKt.getGAdExtra().get(), !new SharedPreferencesHelper(BiliContext.application()).optBoolean("pref_search_discovery_expended", true) ? 1 : 0, new c(context, oVar));
        of().f86460f.observe(getViewLifecycleOwner(), new f(new Aa.i(this, 4)));
        of().f86458d.observe(getViewLifecycleOwner(), new f(new com.bilibili.bililive.biz.pkv2.adapter.container.i(this, 2)));
        of().f86456b.observe(getViewLifecycleOwner(), new f(new Y(this, 5)));
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        b bVar = new b(this, new Rect());
        RecyclerView recyclerView7 = this.h;
        RecyclerView recyclerView8 = recyclerView7;
        if (recyclerView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDiscoverList");
            recyclerView8 = null;
        }
        com.bilibili.search2.stardust.expose.g gVar = new com.bilibili.search2.stardust.expose.g(recyclerView8);
        SearchDiscoverExposeClient searchDiscoverExposeClient = new SearchDiscoverExposeClient(gVar, ((MainSearchViewModel) this.f86412o.getValue()).f86732e, this.f86411n, LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()));
        searchDiscoverExposeClient.f88734e = true;
        searchDiscoverExposeClient.f88736g = 0.01f;
        String strDd = DeviceDecision.INSTANCE.dd("search_discover_exposure_threshold", "0.7");
        searchDiscoverExposeClient.f88735f = (strDd == null || (floatOrNull = StringsKt.toFloatOrNull(strDd)) == null) ? 0.7f : floatOrNull.floatValue();
        gVar.f88753b = bVar;
        this.f86413p = searchDiscoverExposeClient;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this, null), 3, (Object) null);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final boolean shouldReport() {
        return !(nf().f86756c.getValue() != null ? r0.f86789a : false);
    }
}
