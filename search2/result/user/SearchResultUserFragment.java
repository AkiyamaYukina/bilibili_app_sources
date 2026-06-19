package com.bilibili.search2.result.user;

import QK.r;
import Yt0.C3151e;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.alipay.alipaysecuritysdk.rds.constant.DictionaryKeys;
import com.bapis.bilibili.polymer.app.search.v1.UserSort;
import com.bapis.bilibili.polymer.app.search.v1.UserType;
import com.bilibili.app.comm.list.widget.search.SearchNestedCoordinatorLayout;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.moduleservice.account.AccountService;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchResultAll;
import com.bilibili.search2.api.SearchUpperItem;
import com.bilibili.search2.main.data.SearchPageStateModel;
import com.bilibili.search2.main.z;
import com.bilibili.search2.result.base.BaseSearchResultFragment;
import com.bilibili.search2.result.base.BaseSearchResultViewModel;
import com.bilibili.search2.result.base.q;
import com.bilibili.search2.result.base.s;
import com.bilibili.search2.result.base.u;
import com.bilibili.search2.result.base.w;
import com.bilibili.search2.result.base.x;
import com.bilibili.search2.result.widget.m;
import com.bilibili.search2.widget.SearchDropDownMenuHead;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.dropdownmenu.DropDownMenuContent;
import tv.danmaku.bili.widget.dropdownmenu.DropDownMenuHead;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/user/SearchResultUserFragment.class */
@StabilityInferred(parameters = 0)
public final class SearchResultUserFragment extends BaseSearchResultFragment<h> {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static boolean f88520K;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public SearchDropDownMenuHead f88521A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public DropDownMenuContent f88522B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public String f88523C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public String f88524D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public UserSort f88525E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public UserType f88526F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public String f88527G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public TintTextView f88528H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f88529I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f88530J;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public SearchResultAll.NavInfo f88531u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public List<d> f88532v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public List<k> f88533w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final List<String> f88534x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public AppBarLayout f88535y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f88536z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/user/SearchResultUserFragment$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f88537a;

        public a(r rVar) {
            this.f88537a = rVar;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f88537a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f88537a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.search2.result.user.SearchResultUserFragment$loadData$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/user/SearchResultUserFragment$loadData$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final boolean $reset;
        int label;
        final SearchResultUserFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SearchResultUserFragment searchResultUserFragment, boolean z6, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = searchResultUserFragment;
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
                SearchResultUserFragment searchResultUserFragment = this.this$0;
                MutableSharedFlow<u> mutableSharedFlow = searchResultUserFragment.f87474d;
                String str = searchResultUserFragment.rf().f88555k;
                SearchResultAll.NavInfo navInfo = this.this$0.f88531u;
                int type = navInfo == null ? 0 : navInfo.getType();
                SearchResultUserFragment searchResultUserFragment2 = this.this$0;
                String str2 = searchResultUserFragment2.f88527G;
                String str3 = searchResultUserFragment2.f88523C;
                String str4 = searchResultUserFragment2.f88524D;
                boolean z6 = this.$reset;
                int iIncrementAndGet = searchResultUserFragment2.rf().f87498e.incrementAndGet();
                boolean z7 = Xs0.b.f28321a;
                u.k kVar = new u.k(new x.e(str, type, str2, str3, str4, z6, iIncrementAndGet, z7 ? null : this.this$0.f88525E, z7 ? null : this.this$0.f88526F, this.this$0.rf().L0()));
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

    public SearchResultUserFragment() {
        super(false);
        this.f88532v = new ArrayList();
        this.f88533w = new ArrayList();
        this.f88534x = CollectionsKt.listOf(new String[]{"sort", DictionaryKeys.V2_USER});
        this.f88536z = -1;
        this.f88523C = "totalrank";
        this.f88527G = "0";
        AccountService accountService = (AccountService) BLRouter.INSTANCE.get(AccountService.class, "default");
        if (accountService != null) {
            f88520K = accountService.isNewVipLabel();
        }
        this.f88529I = true;
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void C1() {
        super.C1();
        ListExtentionsKt.gone(this.f88528H);
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void Cf() {
        w<?> wVarMf = null;
        String strDd = DeviceDecision.INSTANCE.dd("search_user_footer_text", (String) null);
        if (this.f87478i != null) {
            wVarMf = mf();
        }
        if (wVarMf != null) {
            s sVar = wVarMf.f87669c;
            sVar.f87607a = 1;
            sVar.f87608b = 2131847738;
            sVar.f87609c = strDd;
            wVarMf.V();
        }
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void Ef() {
        super.Ef();
        ListExtentionsKt.gone(this.f88528H);
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void Ff() {
        super.Ff();
        ListExtentionsKt.visible(this.f88528H);
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void Jf() {
        PageViewTracker.getInstance().setExtra(this, "search.user-search.0.0.pv", Mf());
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final BaseSearchResultViewModel Kf() {
        return (h) new ViewModelProvider(this).get(h.class);
    }

    public final Bundle Mf() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        try {
            Bundle arguments = getArguments();
            bundle2.putString("query", (arguments == null || (bundle = arguments.getBundle("default_extra_bundle")) == null) ? "" : bundle.getString("keyword"));
            bundle2.putString("searchpage", "user-search");
            String trackId = rf().getTrackId();
            if (trackId == null) {
                trackId = "";
            }
            bundle2.putString("trackid", trackId);
            bundle2.putString("is_recall", Intrinsics.areEqual(rf().M0(), Boolean.TRUE) ? "0" : "1");
        } catch (Throwable th) {
            BLog.e("SearchResultUserFragment", "genPvExtra error: ", th);
        }
        return bundle2;
    }

    public final ArrayList<C3151e> Nf() {
        ArrayList<C3151e> arrayList = new ArrayList<>();
        try {
            String[] stringArray = getApplicationContext().getResources().getStringArray(2130903126);
            this.f88532v = CollectionsKt.mutableListOf(new d[]{new d(stringArray[0], "totalrank", "", "default"), new d(stringArray[1], "fans", "0", "fans_desc"), new d(stringArray[2], "fans", "1", "fans"), new d(stringArray[3], "level", "0", "lv_desc"), new d(stringArray[4], "level", "1", "lv")});
            String[] stringArray2 = getApplicationContext().getResources().getStringArray(2130903135);
            this.f88533w = CollectionsKt.mutableListOf(new k[]{new k(stringArray2[0], "0", "all"), new k(stringArray2[1], "1", "up"), new k(stringArray2[2], "3", "auth_user"), new k(stringArray2[3], "2", DictionaryKeys.V2_USER)});
            C3151e c3151e = new C3151e();
            d dVar = (d) CollectionsKt.getOrNull(this.f88532v, 0);
            ((Hh1.c) c3151e).a = dVar != null ? dVar.f88545a : null;
            ((Hh1.c) c3151e).c = new ArrayList();
            int i7 = 0;
            for (Object obj : this.f88532v) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                d dVar2 = (d) obj;
                C3151e c3151e2 = new C3151e();
                ((Hh1.c) c3151e2).a = dVar2 != null ? dVar2.f88545a : null;
                ((Hh1.c) c3151e2).b = i7 == 0;
                List list = ((Hh1.c) c3151e).c;
                if (list != null) {
                    ((ArrayList) list).add(c3151e2);
                }
                i7++;
            }
            arrayList.add(c3151e);
            C3151e c3151e3 = new C3151e();
            k kVar = (k) CollectionsKt.getOrNull(this.f88533w, 0);
            ((Hh1.c) c3151e3).a = kVar != null ? kVar.f88574a : null;
            ((Hh1.c) c3151e3).c = new ArrayList();
            int i8 = 0;
            for (Object obj2 : this.f88533w) {
                if (i8 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                k kVar2 = (k) obj2;
                C3151e c3151e4 = new C3151e();
                ((Hh1.c) c3151e4).a = kVar2 != null ? kVar2.f88574a : null;
                ((Hh1.c) c3151e4).b = i8 == 0;
                List list2 = ((Hh1.c) c3151e3).c;
                if (list2 != null) {
                    ((ArrayList) list2).add(c3151e4);
                }
                i8++;
            }
            arrayList.add(c3151e3);
            return arrayList;
        } catch (IndexOutOfBoundsException e7) {
            BLog.e("SearchResultUserFragment", e7);
            return arrayList;
        } catch (NullPointerException e8) {
            BLog.e("SearchResultUserFragment", e8);
            return arrayList;
        }
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "search.user-search.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        return Mf();
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void hideLoading() {
        super.hideLoading();
        ListExtentionsKt.gone(this.f88528H);
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void jf(@Nullable Boolean bool) {
        Jf();
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            ListExtentionsKt.visible(this.f88521A);
            yf();
        } else if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            DropDownMenuHead dropDownMenuHead = this.f88521A;
            if (dropDownMenuHead != null) {
            }
            yf();
        }
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final boolean kf() {
        AppBarLayout appBarLayout = this.f88535y;
        if (appBarLayout != null) {
            appBarLayout.setExpanded(true, false);
        }
        return super.kf();
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void loadData(boolean z6) {
        if (z6 || !rf().Q0()) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, z6, null), 3, (Object) null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        if (i8 == -1 && i7 == 101 && intent != null) {
            long jI = zO.a.i(intent, EditCustomizeSticker.TAG_MID);
            boolean zE = zO.a.e(intent, "followed", false);
            if (jI != -1) {
                w<?> wVarMf = this.f87478i != null ? mf() : null;
                if (wVarMf != null) {
                    int size = wVarMf.f87275a.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        BaseSearchItem baseSearchItemQ = wVarMf.Q(i9);
                        if (baseSearchItemQ instanceof SearchUpperItem) {
                            SearchUpperItem searchUpperItem = (SearchUpperItem) baseSearchItemQ;
                            if (Intrinsics.areEqual(String.valueOf(jI), searchUpperItem.getParam()) && searchUpperItem.getRelation() != null && searchUpperItem.getRelation().isUserFollowUp() != zE) {
                                searchUpperItem.getRelation().setStatusWithFollow(zE);
                                wVarMf.notifyItemChanged(i9);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        MutableLiveData<Boolean> mutableLiveData;
        Bundle bundle2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (bundle2 = arguments.getBundle("default_extra_bundle")) != null) {
            h hVarRf = rf();
            String string = bundle2.getString("keyword");
            String str = string;
            if (string == null) {
                str = "";
            }
            hVarRf.f88555k = str;
            this.f88531u = (SearchResultAll.NavInfo) bundle2.getParcelable("navi_info");
        }
        SearchPageStateModel searchPageStateModelD = z.d(this);
        this.f87488s = searchPageStateModelD;
        if (searchPageStateModelD == null || (mutableLiveData = searchPageStateModelD.h) == null) {
            return;
        }
        mutableLiveData.observe(this, new a(new r(this, 2)));
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131494169, viewGroup, false);
        this.f87475e = viewInflate.findViewById(2131303590);
        this.f87477g = (TextView) viewInflate.findViewById(2131310274);
        pf().setOnClickListener(new e(this, 0));
        this.f88528H = (TintTextView) viewInflate.findViewById(2131301182);
        this.f88521A = (SearchDropDownMenuHead) viewInflate.findViewById(2131300347);
        this.f88522B = viewInflate.findViewById(2131300346);
        this.h = (RecyclerView) viewInflate.findViewById(2131306595);
        int iBf = BaseSearchResultFragment.Bf(this);
        Context contextRequireContext = requireContext();
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            int px = ListExtentionsKt.toPx(com.bilibili.search2.component.e.c(contextRequireContext));
            int px2 = ListExtentionsKt.toPx(com.bilibili.search2.component.e.g(contextRequireContext) ? 8 : 0);
            boolean zJ = com.bilibili.search2.component.e.j(contextRequireContext);
            int px3 = 0;
            if (iBf >= 2) {
                px3 = ListExtentionsKt.toPx(18);
            }
            recyclerView.addItemDecoration(new m(px, px2, px3, 3, zJ));
        }
        RecyclerView recyclerView2 = this.h;
        if (recyclerView2 != null) {
            SearchResultUserAdapter searchResultUserAdapter = new SearchResultUserAdapter(this);
            this.f87478i = searchResultUserAdapter;
            recyclerView2.setAdapter(searchResultUserAdapter);
        }
        BaseSearchResultFragment.Af(this, iBf);
        SearchNestedCoordinatorLayout searchNestedCoordinatorLayoutFindViewById = viewInflate.findViewById(2131315978);
        if (searchNestedCoordinatorLayoutFindViewById != null) {
            searchNestedCoordinatorLayoutFindViewById.setShouldParentScrollUp(new Function2(this) { // from class: com.bilibili.search2.result.user.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchResultUserFragment f88552a;

                {
                    this.f88552a = this;
                }

                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    boolean z6 = SearchResultUserFragment.f88520K;
                    boolean zHa = false;
                    if (iIntValue > 0) {
                        Ii.a parentFragment = this.f88552a.getParentFragment();
                        if (parentFragment instanceof Ii.a) {
                            zHa = parentFragment.Ha();
                        }
                    }
                    return Boolean.valueOf(zHa);
                }
            });
        }
        AppBarLayout appBarLayoutFindViewById = viewInflate.findViewById(2131296646);
        this.f88535y = appBarLayoutFindViewById;
        if (appBarLayoutFindViewById != null) {
            appBarLayoutFindViewById.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener(this) { // from class: com.bilibili.search2.result.user.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchResultUserFragment f88553a;

                {
                    this.f88553a = this;
                }

                public final void onOffsetChanged(AppBarLayout appBarLayout, int i7) {
                    SearchResultUserFragment searchResultUserFragment = this.f88553a;
                    if (i7 != searchResultUserFragment.f88536z) {
                        searchResultUserFragment.f88536z = i7;
                        searchResultUserFragment.rf().f87500g = appBarLayout.getHeight() + i7;
                        bY.c<RecyclerView> cVarNf = searchResultUserFragment.nf();
                        if (cVarNf != null) {
                            cVarNf.h();
                        }
                    }
                }
            });
        }
        return viewInflate;
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment, com.bilibili.lib.ui.BaseFragment
    public final void setUserVisibleCompat(boolean z6) {
        super.setUserVisibleCompat(z6);
        if (z6) {
            xf(this);
            if (((h) rf()).N0() == 0 && mf().f87275a.size() == 0 && !Intrinsics.areEqual(((h) rf()).R0(), Boolean.TRUE)) {
                loadData(true);
                If(this.f88521A);
            }
        }
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final boolean sf(@NotNull q.a aVar) {
        BLog.v("SearchResultUserFragment", "showEvent " + aVar);
        return false;
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void showLoading() {
        super.showLoading();
        ListExtentionsKt.gone(this.f88528H);
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final int tf() {
        int iTf;
        SearchDropDownMenuHead searchDropDownMenuHead = this.f88521A;
        if (searchDropDownMenuHead == null || !searchDropDownMenuHead.d()) {
            iTf = super.tf();
        } else {
            Context context = getContext();
            iTf = context != null ? ((int) context.obtainStyledAttributes(new int[]{2130969563}).getDimension(0, 0.0f)) + ((int) context.getResources().getDimension(2131166961)) : ListExtentionsKt.toPx(80);
        }
        return iTf;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x025d  */
    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zf(java.util.List r7, com.bilibili.search2.result.base.BaseSearchResultViewModel r8) {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.user.SearchResultUserFragment.zf(java.util.List, com.bilibili.search2.result.base.BaseSearchResultViewModel):void");
    }
}
