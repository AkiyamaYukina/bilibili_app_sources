package com.bilibili.search2.result.column;

import Ps0.C;
import Ps0.C2787h;
import Yt0.C3151e;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.search.SearchNestedCoordinatorLayout;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.fasthybrid.ability.ui.iaa.slot.o;
import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.Column;
import com.bilibili.search2.api.FilterValue;
import com.bilibili.search2.main.data.SearchPageStateModel;
import com.bilibili.search2.main.z;
import com.bilibili.search2.result.base.BaseSearchResultFragment;
import com.bilibili.search2.result.base.BaseSearchResultViewModel;
import com.bilibili.search2.result.base.SearchState;
import com.bilibili.search2.result.base.q;
import com.bilibili.search2.result.base.x;
import com.bilibili.search2.result.m;
import com.bilibili.search2.utils.B;
import com.bilibili.search2.widget.SearchDropDownMenuHead;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.dropdownmenu.DropDownMenuContent;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/column/SearchResultColumnFragment.class */
@StabilityInferred(parameters = 0)
public final class SearchResultColumnFragment extends BaseSearchResultFragment<j> implements m {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public static String f87709I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public static final String[][] f87710J;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public String f87711A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public String f87712B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f87713C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public String f87714D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public String f87715E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f87716F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f87717G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public x.a f87718H;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public List<Column.Category> f87719u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public AppBarLayout f87720v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f87721w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SearchDropDownMenuHead f87722x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public DropDownMenuContent f87723y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public b f87724z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/column/SearchResultColumnFragment$a.class */
    public static final class a extends BiliApiCallback<GeneralResponse<List<? extends Column.Category>>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SearchResultColumnFragment f87725b;

        public a(SearchResultColumnFragment searchResultColumnFragment) {
            this.f87725b = searchResultColumnFragment;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            ArrayList arrayList = new ArrayList();
            SearchResultColumnFragment searchResultColumnFragment = this.f87725b;
            searchResultColumnFragment.f87719u = arrayList;
            Column.Category category = new Column.Category();
            category.setName(SearchResultColumnFragment.f87709I);
            category.setId(0L);
            List<Column.Category> list = searchResultColumnFragment.f87719u;
            if (list != null) {
                ((ArrayList) list).add(category);
            }
            searchResultColumnFragment.Of(false, null);
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onSuccess(GeneralResponse<List<? extends Column.Category>> generalResponse) {
            List<Column.Category> list;
            GeneralResponse<List<? extends Column.Category>> generalResponse2 = generalResponse;
            if (generalResponse2 != null) {
                List<? extends Column.Category> list2 = generalResponse2.data;
                if (list2 != null) {
                    if (list2.isEmpty()) {
                        list2 = null;
                    }
                    if (list2 != null) {
                        ArrayList arrayList = new ArrayList();
                        SearchResultColumnFragment searchResultColumnFragment = this.f87725b;
                        searchResultColumnFragment.f87719u = arrayList;
                        for (Column.Category category : list2) {
                            if (category != null && (list = searchResultColumnFragment.f87719u) != null) {
                                ((ArrayList) list).add(category);
                            }
                        }
                        searchResultColumnFragment.Of(false, null);
                        return;
                    }
                }
            }
            onError(new Exception());
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.String[], java.lang.String[][]] */
    static {
        String strN = B.n(2131841399);
        f87710J = new String[]{new String[]{strN, null}, new String[]{B.n(2131847714), "pubdate"}, new String[]{B.n(2131847740), "attention"}};
    }

    public SearchResultColumnFragment() {
        super(false);
        this.f87721w = -1;
        this.f87724z = new b();
        this.f87714D = "";
        this.f87715E = "";
        this.f87716F = true;
    }

    @Override // com.bilibili.search2.result.m
    public final void J6(@NotNull Map<String, String> map) {
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
        String str = map.get("from_seid");
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        this.f87714D = str2;
        String str3 = map.get("from_source");
        if (str3 == null) {
            str3 = "";
        }
        this.f87715E = str3;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new SearchResultColumnFragment$resetTabState$1(this, null), 3, (Object) null);
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void Jf() {
        PageViewTracker.getInstance().setExtra(this, "read.column-search.0.0.pv", Mf());
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final BaseSearchResultViewModel Kf() {
        return (j) new ViewModelProvider(this).get(j.class);
    }

    public final Bundle Mf() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        try {
            Bundle arguments = getArguments();
            bundle2.putString("query", (arguments == null || (bundle = arguments.getBundle("default_extra_bundle")) == null) ? "" : bundle.getString("keyword"));
            String trackId = rf().getTrackId();
            if (trackId == null) {
                trackId = "";
            }
            bundle2.putString("trackid", trackId);
        } catch (Throwable th) {
        }
        return bundle2;
    }

    public final void Nf(boolean z6) {
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new SearchResultColumnFragment$getResult$1(this, z6, null), 3, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r0v151, types: [Hh1.c, Yt0.e, java.lang.Object] */
    public final void Of(boolean z6, C c7) {
        ArrayList<? extends Hh1.c> arrayList;
        Hh1.c cVar;
        if (!z6) {
            ArrayList<? extends Hh1.c> arrayList2 = new ArrayList<>();
            Hh1.c cVar2 = new Hh1.c();
            String[][] strArr = f87710J;
            cVar2.a = strArr[0][0];
            arrayList2.add(cVar2);
            if (cVar2.c == null) {
                cVar2.c = new ArrayList();
            }
            int length = strArr.length;
            int i7 = 0;
            while (i7 < length) {
                Hh1.c cVar3 = new Hh1.c();
                cVar3.a = f87710J[i7][0];
                cVar3.b = i7 == 0;
                List list = cVar2.c;
                if (list != null) {
                    ((ArrayList) list).add(cVar3);
                }
                i7++;
            }
            Hh1.c cVar4 = new Hh1.c();
            cVar4.a = f87709I;
            arrayList2.add(cVar4);
            if (cVar4.c == null) {
                cVar4.c = new ArrayList();
                Hh1.c cVar5 = new Hh1.c();
                cVar5.a = f87709I;
                cVar5.b = true;
                List list2 = cVar4.c;
                if (list2 != null) {
                    ((ArrayList) list2).add(cVar5);
                }
            }
            int size = this.f87719u.size();
            int i8 = 0;
            while (true) {
                arrayList = arrayList2;
                if (i8 >= size) {
                    break;
                }
                Hh1.c cVar6 = new Hh1.c();
                cVar6.a = ((Column.Category) ((ArrayList) this.f87719u).get(i8)).getName();
                ((ArrayList) cVar4.c).add(cVar6);
                i8++;
            }
        } else {
            ArrayList<? extends Hh1.c> arrayList3 = new ArrayList<>();
            arrayList = arrayList3;
            if (c7 != null) {
                List<C2787h> list3 = c7.f19111a;
                arrayList = arrayList3;
                if (list3 != null) {
                    Iterator<T> it = list3.iterator();
                    int i9 = 0;
                    while (true) {
                        arrayList = arrayList3;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (i9 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        C2787h c2787h = (C2787h) next;
                        ?? c3151e = new C3151e();
                        ((Hh1.c) c3151e).a = c2787h.f19201a;
                        boolean z7 = c2787h.f19206f;
                        c3151e.f29211m = z7;
                        c3151e.f29204e = i9;
                        ((Hh1.c) c3151e).c = new ArrayList();
                        com.bilibili.search2.result.base.j jVar = (com.bilibili.search2.result.base.j) CollectionsKt.getOrNull(rf().h, i9);
                        com.bilibili.search2.result.base.j jVar2 = jVar;
                        if (jVar == null) {
                            jVar2 = new com.bilibili.search2.result.base.j(c2787h);
                            ((ArrayList) rf().h).add(i9, jVar2);
                        }
                        int i10 = 0;
                        for (Object obj : c2787h.f19202b) {
                            if (i10 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            FilterValue filterValue = (FilterValue) obj;
                            C3151e c3151e2 = new C3151e();
                            ((Hh1.c) c3151e2).a = filterValue.getValue();
                            ((Hh1.c) c3151e2).d = filterValue.getParam();
                            c3151e2.f29210l = c2787h.f19205e;
                            c3151e2.f29209k = filterValue.getSubModuleForNeuron();
                            c3151e2.f29211m = z7;
                            ((Hh1.c) c3151e2).b = jVar2.b(i10);
                            List list4 = ((Hh1.c) c3151e).c;
                            if (list4 != null) {
                                ((ArrayList) list4).add(c3151e2);
                            }
                            i10++;
                        }
                        List list5 = ((Hh1.c) c3151e).c;
                        ((Hh1.c) c3151e).a = (list5 == null || (cVar = (Hh1.c) CollectionsKt.getOrNull(list5, 0)) == null) ? null : cVar.a;
                        arrayList3.add(c3151e);
                        i9++;
                    }
                }
            }
        }
        DropDownMenuContent dropDownMenuContent = this.f87723y;
        DropDownMenuContent dropDownMenuContent2 = dropDownMenuContent;
        if (dropDownMenuContent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDropDownMenuContent");
            dropDownMenuContent2 = null;
        }
        dropDownMenuContent2.a();
        Context context = getContext();
        d dVar = context != null ? com.bilibili.search2.component.e.g(context) : false ? new d(ListExtentionsKt.toPx(8.0f), ListExtentionsKt.toPx(11.5f), ListExtentionsKt.toPx(8), ListExtentionsKt.toPx(16), ListExtentionsKt.toPx(com.bilibili.search2.component.e.c(context))) : new d(ListExtentionsKt.toPx(6), ListExtentionsKt.toPx(5), ListExtentionsKt.toPx(10), ListExtentionsKt.toPx(12), ListExtentionsKt.toPx(com.bilibili.search2.component.e.c(context)));
        DropDownMenuContent dropDownMenuContent3 = this.f87723y;
        DropDownMenuContent dropDownMenuContent4 = dropDownMenuContent3;
        if (dropDownMenuContent3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDropDownMenuContent");
            dropDownMenuContent4 = null;
        }
        dropDownMenuContent4.setItemDecoration(new e(dVar.f87731a, dVar.f87732b, dVar.f87734d, dVar.f87735e, dVar.f87733c));
        Context context2 = getContext();
        boolean zG = context2 != null ? com.bilibili.search2.component.e.g(context2) : false;
        SearchDropDownMenuHead searchDropDownMenuHead = this.f87722x;
        SearchDropDownMenuHead searchDropDownMenuHead2 = searchDropDownMenuHead;
        if (searchDropDownMenuHead == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDropDownMenu");
            searchDropDownMenuHead2 = null;
        }
        int px = ListExtentionsKt.toPx(com.bilibili.search2.component.e.c(getContext()));
        searchDropDownMenuHead2.f88928G = zG;
        searchDropDownMenuHead2.f88929H = zG ? px : 0;
        if (arrayList.size() > 0) {
            SearchDropDownMenuHead searchDropDownMenuHead3 = this.f87722x;
            SearchDropDownMenuHead searchDropDownMenuHead4 = searchDropDownMenuHead3;
            if (searchDropDownMenuHead3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDropDownMenu");
                searchDropDownMenuHead4 = null;
            }
            DropDownMenuContent dropDownMenuContent5 = this.f87723y;
            DropDownMenuContent dropDownMenuContent6 = dropDownMenuContent5;
            if (dropDownMenuContent5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDropDownMenuContent");
                dropDownMenuContent6 = null;
            }
            searchDropDownMenuHead4.e(dropDownMenuContent6, arrayList, this.f87724z);
        } else {
            BLog.e("SearchResultColumnFragment", "setDropDownMenu: menuItems is empty, not set filter data");
        }
        SearchDropDownMenuHead searchDropDownMenuHead5 = this.f87722x;
        SearchDropDownMenuHead searchDropDownMenuHead6 = searchDropDownMenuHead5;
        if (searchDropDownMenuHead5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDropDownMenu");
            searchDropDownMenuHead6 = null;
        }
        searchDropDownMenuHead6.setHideIndicator(true);
        SearchDropDownMenuHead searchDropDownMenuHead7 = this.f87722x;
        if (searchDropDownMenuHead7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDropDownMenu");
            searchDropDownMenuHead7 = null;
        }
        searchDropDownMenuHead7.setOnSubMenuItemClickListener(new g(this));
    }

    public final void Pf() {
        BiliCall<GeneralResponse<List<Column.Category>>> articleCategories = ((com.bilibili.search2.result.column.api.a) ServiceGenerator.createService(com.bilibili.search2.result.column.api.a.class)).getArticleCategories();
        if (articleCategories != null) {
            articleCategories.enqueue(new a(this));
        }
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "read.column-search.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        return Mf();
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final boolean kf() {
        AppBarLayout appBarLayout = this.f87720v;
        if (appBarLayout != null) {
            appBarLayout.setExpanded(true, false);
        }
        return super.kf();
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void loadData(boolean z6) {
        if (z6 || !rf().Q0()) {
            Nf(!z6);
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f87719u == null) {
            Pf();
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        MutableLiveData<Boolean> mutableLiveData;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Bundle bundle2 = arguments.getBundle("default_extra_bundle");
            this.f87711A = bundle2 == null ? arguments.getString("keyword") : bundle2.getString("keyword");
        }
        f87709I = getString(2131847892);
        SearchPageStateModel searchPageStateModelD = z.d(this);
        this.f87488s = searchPageStateModelD;
        if (searchPageStateModelD == null || (mutableLiveData = searchPageStateModelD.h) == null) {
            return;
        }
        mutableLiveData.observe(this, new i(new EF0.g(this, 4)));
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i7 = 0;
        View viewInflate = layoutInflater.inflate(2131494167, viewGroup, false);
        this.h = (RecyclerView) viewInflate.findViewById(2131306595);
        int iBf = BaseSearchResultFragment.Bf(this);
        Context contextRequireContext = requireContext();
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            int px = ListExtentionsKt.toPx(com.bilibili.search2.component.e.c(contextRequireContext));
            if (com.bilibili.search2.component.e.g(contextRequireContext)) {
                i7 = 8;
            }
            recyclerView.addItemDecoration(new com.bilibili.search2.result.widget.m(px, ListExtentionsKt.toPx(i7), 0, 35, com.bilibili.search2.component.e.j(contextRequireContext)));
        }
        this.f87475e = viewInflate.findViewById(2131303590);
        this.f87477g = (TextView) viewInflate.findViewById(2131310274);
        this.f87722x = (SearchDropDownMenuHead) viewInflate.findViewById(2131300347);
        this.f87723y = viewInflate.findViewById(2131300346);
        SearchNestedCoordinatorLayout searchNestedCoordinatorLayoutFindViewById = viewInflate.findViewById(2131299139);
        if (searchNestedCoordinatorLayoutFindViewById != null) {
            searchNestedCoordinatorLayoutFindViewById.setShouldParentScrollUp(new o(this, 1));
        }
        AppBarLayout appBarLayoutFindViewById = viewInflate.findViewById(2131296646);
        this.f87720v = appBarLayoutFindViewById;
        if (appBarLayoutFindViewById != null) {
            appBarLayoutFindViewById.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener(this) { // from class: com.bilibili.search2.result.column.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchResultColumnFragment f87746a;

                {
                    this.f87746a = this;
                }

                public final void onOffsetChanged(AppBarLayout appBarLayout, int i8) {
                    SearchResultColumnFragment searchResultColumnFragment = this.f87746a;
                    if (i8 != searchResultColumnFragment.f87721w) {
                        searchResultColumnFragment.f87721w = i8;
                        searchResultColumnFragment.rf().f87500g = appBarLayout.getHeight() + i8;
                        bY.c<RecyclerView> cVarNf = searchResultColumnFragment.nf();
                        if (cVarNf != null) {
                            cVarNf.h();
                        }
                    }
                }
            });
        }
        this.f87478i = new f(this, new SearchResultColumnFragment$initAdapter$1(this));
        RecyclerView recyclerView2 = this.h;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(mf());
        }
        BaseSearchResultFragment.Af(this, iBf);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.bilibili.search2.result.base.BaseSearchResultFragment, com.bilibili.search2.result.column.SearchResultColumnFragment] */
    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment, com.bilibili.lib.ui.BaseFragment
    public final void setUserVisibleCompat(boolean z6) {
        super.setUserVisibleCompat(z6);
        if (z6) {
            xf(this);
            SearchDropDownMenuHead searchDropDownMenuHead = null;
            if (this.f87718H == null) {
                if (((j) rf()).N0() == 0) {
                    List<BaseSearchItem> allResultList = ((SearchState) ((j) rf()).f87499f.getValue()).getAllResultList();
                    if ((allResultList == null || allResultList.isEmpty()) && !Intrinsics.areEqual(((j) rf()).R0(), Boolean.TRUE)) {
                        SearchDropDownMenuHead searchDropDownMenuHead2 = this.f87722x;
                        if (searchDropDownMenuHead2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mDropDownMenu");
                        } else {
                            searchDropDownMenuHead = searchDropDownMenuHead2;
                        }
                        If(searchDropDownMenuHead);
                        Nf(false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.f87719u != null) {
                this.f87724z = new b();
                DropDownMenuContent dropDownMenuContent = this.f87723y;
                DropDownMenuContent dropDownMenuContent2 = dropDownMenuContent;
                if (dropDownMenuContent == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDropDownMenuContent");
                    dropDownMenuContent2 = null;
                }
                dropDownMenuContent2.a();
                Of(false, null);
            }
            SearchDropDownMenuHead searchDropDownMenuHead3 = this.f87722x;
            if (searchDropDownMenuHead3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDropDownMenu");
                searchDropDownMenuHead3 = null;
            }
            If(searchDropDownMenuHead3);
            Nf(false);
        }
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final boolean sf(@NotNull q.a aVar) {
        BLog.v("SearchResultColumnFragment", "showEvent " + aVar);
        return false;
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final int tf() {
        Context context = getContext();
        return context != null ? ((int) context.obtainStyledAttributes(new int[]{2130969563}).getDimension(0, 0.0f)) + ((int) context.getResources().getDimension(2131166961)) : ListExtentionsKt.toPx(80);
    }

    @Override // com.bilibili.search2.result.base.BaseSearchResultFragment
    public final void zf(List list, BaseSearchResultViewModel baseSearchResultViewModel) {
        j jVar = (j) baseSearchResultViewModel;
        this.f87714D = "";
        this.f87715E = "";
        this.f87718H = null;
        super.zf(list, jVar);
        if (jVar.N0() != 1 || this.f87717G) {
            return;
        }
        this.f87717G = true;
        if (!DeviceDecision.INSTANCE.getBoolean("search.filter.new_column_filter", true)) {
            this.f87716F = false;
            Pf();
            return;
        }
        C searchFilter = ((SearchState) jVar.f87499f.getValue()).getSearchFilter();
        if (searchFilter != null) {
            C c7 = null;
            if (!searchFilter.f19111a.isEmpty()) {
                c7 = searchFilter;
            }
            if (c7 != null) {
                this.f87716F = true;
                Of(true, c7);
                return;
            }
        }
        this.f87716F = false;
        Pf();
    }
}
