package com.bilibili.search2.result.vertical.live;

import Bl.D;
import Bl.e0;
import Bl.i0;
import Bl.k;
import Bl.k0;
import Ot0.g;
import Ot0.h;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.component.e;
import com.bilibili.search2.result.all.C6053g;
import com.bilibili.search2.result.base.BaseSearchResultFragment;
import com.bilibili.search2.result.base.BaseSearchResultViewModel;
import com.bilibili.search2.result.base.SearchState;
import com.bilibili.search2.result.base.q;
import com.bilibili.search2.result.base.u;
import com.bilibili.search2.result.base.w;
import com.bilibili.search2.result.base.x;
import dt0.AbstractC6839b;
import dt0.AbstractC6843f;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import xt0.C9006a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/SearchResultLiveFragment.class */
@StabilityInferred(parameters = 0)
public final class SearchResultLiveFragment extends BaseSearchResultFragment<d> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final SparseArray<Long> f88577w = new SparseArray<>();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public String f88578u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f88579v;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/SearchResultLiveFragment$a.class */
    public final class a extends w<AbstractC6843f<BaseSearchItem>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Function1<? super Boolean, Unit> f88580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SearchResultLiveFragment f88581f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull SearchResultLiveFragment searchResultLiveFragment, Function1<? super Boolean, Unit> function1) {
            super(function1);
            this.f88581f = searchResultLiveFragment;
            this.f88580e = function1;
        }

        @Override // com.bilibili.search2.result.all.AbstractC6048b
        public final AbstractC6839b P(int i7, ViewGroup viewGroup) {
            AbstractC6839b abstractC6839bA;
            if (i7 == -1225140971) {
                abstractC6839bA = new Ot0.c(D.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
            } else if (i7 == 312266535) {
                abstractC6839bA = new h(k0.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
            } else if (i7 == 1008942158) {
                int i8 = g.f18069l;
                SearchResultLiveFragment searchResultLiveFragment = this.f88581f;
                abstractC6839bA = new g(i0.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), searchResultLiveFragment.f88579v, searchResultLiveFragment.f88578u);
            } else if (i7 == -1793498294) {
                abstractC6839bA = new C9006a(e0.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
            } else {
                int i9 = C6053g.f87282b;
                abstractC6839bA = C6053g.a.a(viewGroup);
            }
            return abstractC6839bA;
        }

        @Override // com.bilibili.search2.result.base.w, com.bilibili.search2.result.all.AbstractC6048b
        /* JADX INFO: renamed from: T */
        public final void O(@NotNull AbstractC6843f<BaseSearchItem> abstractC6843f, int i7) {
            if (abstractC6843f instanceof Ot0.c) {
                ((Ot0.c) abstractC6843f).f18060u = this.f87670d;
            } else if (abstractC6843f instanceof g) {
                ((g) abstractC6843f).f18078j = this.f87670d;
            }
            abstractC6843f.bindFragment(this.f88581f);
            super.O(abstractC6843f, i7);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i7) {
            return i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/SearchResultLiveFragment$b.class */
    public static final class b extends GridLayoutManager.SpanSizeLookup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchResultLiveFragment f88582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f88583b;

        public b(SearchResultLiveFragment searchResultLiveFragment, int i7) {
            this.f88582a = searchResultLiveFragment;
            this.f88583b = i7;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public final int getSpanSize(int i7) {
            return this.f88582a.mf().getItemViewType(i7) == 1008942158 ? 1 : this.f88583b;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.search2.result.vertical.live.SearchResultLiveFragment$loadData$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/SearchResultLiveFragment$loadData$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final boolean $reset;
        int label;
        final SearchResultLiveFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchResultLiveFragment searchResultLiveFragment, boolean z6, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = searchResultLiveFragment;
            this.$reset = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$reset, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                SearchResultLiveFragment searchResultLiveFragment = this.this$0;
                MutableSharedFlow<u> mutableSharedFlow = searchResultLiveFragment.f87474d;
                u.k kVar = new u.k(new x.b(searchResultLiveFragment.f88578u, ((SearchState) searchResultLiveFragment.rf().f87499f.getValue()).getPage(), this.$reset));
                this.label = 1;
                if (mutableSharedFlow.emit(kVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.search2.result.vertical.live.SearchResultLiveFragment$onCreateView$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/SearchResultLiveFragment$onCreateView$2.class */
    public static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public AnonymousClass2(Object obj) {
            super(1, obj, SearchResultLiveFragment.class, "loadData", "loadData(Z)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z6) {
            ((SearchResultLiveFragment) ((CallableReference) this).receiver).loadData(z6);
        }
    }

    public SearchResultLiveFragment() {
        super(false);
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void Jf() {
        PageViewTracker.getInstance().setExtra(this, "live.live-search.0.0.pv", Mf());
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final BaseSearchResultViewModel Kf() {
        return (d) new ViewModelProvider(this).get(d.class);
    }

    public final Bundle Mf() {
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = null;
        try {
            bundle = com.bilibili.search2.result.vertical.live.a.a();
            com.bilibili.search2.result.vertical.live.a.b(bundle);
        } catch (Throwable th) {
        }
        try {
            Bundle arguments = getArguments();
            bundle.putString("query", (arguments == null || (bundle2 = arguments.getBundle("default_extra_bundle")) == null) ? "" : bundle2.getString("keyword"));
            String trackId = rf().getTrackId();
            if (trackId == null) {
                trackId = "";
            }
            bundle.putString("trackid", trackId);
            bundle.putString("is_recall", Intrinsics.areEqual(rf().M0(), Boolean.TRUE) ? "0" : "1");
        } catch (Throwable th2) {
            bundle3 = bundle;
            bundle = bundle3;
            if (bundle3 == null) {
                bundle = new Bundle();
            }
        }
        return bundle;
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "live.live-search.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        return Mf();
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final String getUniqueKey() {
        return "live.live-search.0.0.pvLiveMasterSearchResultFragment";
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void loadData(boolean z6) {
        if (z6 || !rf().Q0()) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, z6, null), 3, (Object) null);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Bundle bundle2 = arguments.getBundle("default_extra_bundle");
            if (bundle2 == null) {
                this.f88578u = arguments.getString("keyword");
                com.bilibili.search2.utils.extension.a.a(arguments);
            } else {
                this.f88578u = bundle2.getString("keyword");
                com.bilibili.search2.utils.extension.a.a(bundle2);
            }
            String str = this.f88578u;
            boolean zA = false;
            if (str != null) {
                int length = str.length() - 1;
                int i7 = 0;
                boolean z6 = false;
                while (i7 <= length) {
                    boolean z7 = Intrinsics.compare(str.charAt(!z6 ? i7 : length), 32) <= 0;
                    if (z6) {
                        if (!z7) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z7) {
                        i7++;
                    } else {
                        z6 = true;
                    }
                }
                zA = false;
                if (!Intrinsics.areEqual("", str.subSequence(i7, length + 1).toString())) {
                    zA = com.bilibili.adcommon.utils.ext.d.a("^[0-9]*$", str);
                }
            }
            this.f88579v = zA;
        }
        f88577w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        k kVarInflate = k.inflate(layoutInflater, viewGroup, false);
        RecyclerView recyclerView = kVarInflate.c;
        this.h = recyclerView;
        this.f87475e = kVarInflate.b;
        Context context = recyclerView.getContext();
        int i7 = 2;
        if (context != null && e.g(context) && e.b(context).f86403d > ListExtentionsKt.toPx(WindowSizeClass.WIDTH_DP_EXPANDED_LOWER_BOUND)) {
            i7 = 3;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), i7);
        gridLayoutManager.setSmoothScrollbarEnabled(true);
        gridLayoutManager.setSpanSizeLookup(new b(this, i7));
        RecyclerView recyclerView2 = this.h;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(gridLayoutManager);
        }
        int iDpToPx = DimenUtilsKt.dpToPx(e.c(getContext()));
        int iDpToPx2 = DimenUtilsKt.dpToPx(i7 >= 3 ? 12 : 8);
        RecyclerView recyclerView3 = this.h;
        if (recyclerView3 != null) {
            recyclerView3.setPadding(iDpToPx, recyclerView3.getPaddingTop(), iDpToPx, recyclerView3.getPaddingBottom());
        }
        RecyclerView recyclerView4 = this.h;
        if (recyclerView4 != null) {
            recyclerView4.setClipToPadding(false);
        }
        RecyclerView recyclerView5 = this.h;
        if (recyclerView5 != null) {
            recyclerView5.addItemDecoration(new Ot0.d(iDpToPx2));
        }
        this.f87478i = new a(this, new AnonymousClass2(this));
        mf().setHasStableIds(true);
        RecyclerView recyclerView6 = this.h;
        if (recyclerView6 != null) {
            recyclerView6.setAdapter(mf());
        }
        this.f87477g = kVarInflate.d;
        return kVarInflate.a;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Mt0.a, com.bilibili.search2.result.vertical.live.report.LiveReportPageVisitEvent] */
    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment, com.bilibili.lib.ui.BaseFragment
    public final void setUserVisibleCompat(boolean z6) {
        super.setUserVisibleCompat(z6);
        if (z6) {
            xf(this);
            ?? aVar = new Mt0.a();
            aVar.f88591a = "live_searchresult_show";
            Mt0.c.a(aVar);
            if (((SearchState) rf().f87499f.getValue()).getPage() == 0 && mf().f87275a.size() == 0 && !Intrinsics.areEqual(rf().R0(), Boolean.TRUE)) {
                loadData(true);
            }
        }
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final boolean sf(@NotNull q.a aVar) {
        BLog.v("SearchResultLiveFragment", "showEvent " + aVar);
        return false;
    }
}
