package com.bilibili.ogv.operation.entrance.indexpage;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.bangumi.ui.common.BangumiWebFragment;
import com.bilibili.bangumi.ui.common.OGVWebData;
import com.bilibili.bangumi.ui.common.OGVWebStyle;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RequestMode;
import com.bilibili.lib.blrouter.RouteInfo;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteResponse;
import com.bilibili.lib.ui.BaseToolbarFragment;
import com.bilibili.magicasakura.widgets.TintToolbar;
import com.bilibili.ogv.operation.api.OperationPageTabVo;
import com.bilibili.ogv.operation.entrance.indexpage.BangumiCategoryIndexTabFragment;
import com.bilibili.ogvcommon.deprecated.EmptyFragment;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.routeui.launcher.AbstractLauncherKt;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/BangumiCategoryIndexTabFragment.class */
@StabilityInferred(parameters = 0)
public final class BangumiCategoryIndexTabFragment extends BaseToolbarFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public PagerSlidingTabStrip f70122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ViewPager f70123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ComposeView f70124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f70125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f70126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f70127g;

    @Nullable
    public a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ArrayList<OperationPageTabVo> f70128i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final HashMap<Integer, WeakReference<Fragment>> f70129j = new HashMap<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final HashMap<String, String> f70130k = new HashMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f70131l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public String f70132m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/BangumiCategoryIndexTabFragment$a.class */
    public final class a extends FragmentStatePagerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiCategoryIndexTabFragment f70133a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BangumiCategoryIndexTabFragment bangumiCategoryIndexTabFragment) {
            super(bangumiCategoryIndexTabFragment.getChildFragmentManager());
            this.f70133a = bangumiCategoryIndexTabFragment;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.f70133a.f70128i.size();
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        @NotNull
        public final Fragment getItem(int i7) {
            BangumiWebFragment bangumiWebFragment;
            long j7;
            Class clazz;
            Lazy lazy = LazyKt.lazy(new Ba1.c(1));
            BangumiCategoryIndexTabFragment bangumiCategoryIndexTabFragment = this.f70133a;
            OperationPageTabVo operationPageTabVo = (OperationPageTabVo) CollectionsKt.getOrNull(bangumiCategoryIndexTabFragment.f70128i, i7);
            if (operationPageTabVo == null) {
                BLog.e("BangumiCategoryIndexTabFragment", "未获取到operationPageInfo");
                bangumiCategoryIndexTabFragment.f70129j.put(Integer.valueOf(i7), new WeakReference<>((EmptyFragment) lazy.getValue()));
                return (EmptyFragment) lazy.getValue();
            }
            if (operationPageTabVo.isH5Link()) {
                BangumiWebFragment bangumiWebFragment2 = new BangumiWebFragment((com.bilibili.ogv.infra.jsb.d) null);
                Map<String, String> report = operationPageTabVo.getReport();
                Bundle arguments = bangumiCategoryIndexTabFragment.getArguments();
                Bundle bundle = arguments;
                if (arguments == null) {
                    bundle = new Bundle();
                }
                String link = operationPageTabVo.getLink();
                if (link == null) {
                    link = "";
                }
                Map<String, String> mapEmptyMap = report;
                if (report == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                String string = bundle.getString("page_name");
                if (string == null) {
                    string = "";
                }
                bundle.putString("ogv_web_data", JsonUtilKt.toJson(new OGVWebData(8, link, string, (String) null, mapEmptyMap)));
                bundle.putString("ogv_web_style", JsonUtilKt.toJson(new OGVWebStyle(false, false, 0, false, 0, (String) null, false, (Integer) null, 191)));
                bangumiWebFragment2.setArguments(bundle);
                bangumiWebFragment = bangumiWebFragment2;
            } else {
                String link2 = operationPageTabVo.getLink();
                RouteRequest routeRequestBuild = new RouteRequest.Builder(link2 != null ? link2 : "").build();
                RouteResponse routeResponseExecute = BLRouter.newCall$default(routeRequestBuild, bangumiCategoryIndexTabFragment.getContext(), this.f70133a, RequestMode.ROUTE, false, 16, (Object) null).execute();
                if (routeResponseExecute.isSuccess()) {
                    Object obj = routeResponseExecute.getObj();
                    RouteInfo routeInfo = obj instanceof RouteInfo ? (RouteInfo) obj : null;
                    Object objNewInstance = (routeInfo == null || (clazz = routeInfo.getClazz()) == null) ? null : clazz.newInstance();
                    bangumiWebFragment = objNewInstance instanceof Fragment ? (Fragment) objNewInstance : null;
                    if (bangumiWebFragment == null) {
                        BLog.e("BangumiCategoryIndexTabFragment", "路由结果解析失败");
                        bangumiWebFragment = (EmptyFragment) lazy.getValue();
                    } else {
                        if (bangumiWebFragment instanceof CategoryIndexFragment) {
                            Map<String, String> report2 = operationPageTabVo.getReport();
                            CategoryIndexFragment categoryIndexFragment = (CategoryIndexFragment) bangumiWebFragment;
                            Bundle bundleCreateExtrasForFragment = AbstractLauncherKt.createExtrasForFragment(routeRequestBuild, routeInfo);
                            bundleCreateExtrasForFragment.putInt("page_index", i7);
                            bundleCreateExtrasForFragment.putLong("index_type", operationPageTabVo.getIndexType());
                            bundleCreateExtrasForFragment.putString("page_name", bangumiCategoryIndexTabFragment.f70125e);
                            bundleCreateExtrasForFragment.putString("page_type", bangumiCategoryIndexTabFragment.f70132m);
                            Bundle bundle2 = new Bundle();
                            if (report2 != null) {
                                for (Map.Entry<String, String> entry : report2.entrySet()) {
                                    bundle2.putString(entry.getKey(), entry.getValue());
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                            bundleCreateExtrasForFragment.putBundle("report", bundle2);
                            try {
                                String str = bangumiCategoryIndexTabFragment.f70127g;
                                j7 = 0;
                                if (str != null) {
                                    j7 = Long.parseLong(str);
                                }
                            } catch (NumberFormatException e7) {
                                j7 = 0;
                            }
                            if (operationPageTabVo.getIndexType() == j7 || Intrinsics.areEqual(bangumiCategoryIndexTabFragment.f70132m, "type_bangumi")) {
                                for (Map.Entry<String, String> entry2 : bangumiCategoryIndexTabFragment.f70130k.entrySet()) {
                                    bundleCreateExtrasForFragment.putString(entry2.getKey(), entry2.getValue());
                                }
                            }
                            categoryIndexFragment.setArguments(bundleCreateExtrasForFragment);
                        } else {
                            bangumiWebFragment.setArguments(AbstractLauncherKt.createExtrasForFragment(routeRequestBuild, routeInfo));
                        }
                        BLog.e("BangumiCategoryIndexTabFragment", bangumiWebFragment.toString());
                    }
                } else {
                    bangumiWebFragment = (EmptyFragment) lazy.getValue();
                }
            }
            bangumiCategoryIndexTabFragment.f70129j.put(Integer.valueOf(i7), new WeakReference<>(bangumiWebFragment));
            return bangumiWebFragment;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(@NotNull Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @Nullable
        public final CharSequence getPageTitle(int i7) {
            return this.f70133a.f70128i.get(i7).getTitle();
        }
    }

    public final void mf() {
        if (!Intrinsics.areEqual(this.f70132m, "type_bangumi")) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.f70122b;
            if (pagerSlidingTabStrip != null) {
                pagerSlidingTabStrip.setVisibility(0);
            }
            String str = this.f70125e;
            if (str == null || str.length() == 0) {
                ComposeView composeView = this.f70124d;
                if (composeView != null) {
                    Ba.d dVar = new Ba.d(this, 2);
                    composeView.setVisibility(0);
                    composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-202755488, true, new Tl0.c(null, dVar, 0)));
                    return;
                }
                return;
            }
            ComposeView composeView2 = this.f70124d;
            if (composeView2 != null) {
                Tl0.f.a(composeView2);
            }
            Single<List<OperationPageTabVo>> operationPageTab = Dk0.b.f2961a.getOperationPageTab(this.f70125e, 0);
            Functions.v vVar = Functions.a;
            com.bilibili.okretro.call.rxjava.c.a(operationPageTab.subscribe(new Consumer(this) { // from class: Hk0.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BangumiCategoryIndexTabFragment f8693a;

                {
                    this.f8693a = this;
                }

                public final void accept(Object obj) {
                    int i7;
                    long j7;
                    List list = (List) obj;
                    boolean zIsEmpty = list.isEmpty();
                    BangumiCategoryIndexTabFragment bangumiCategoryIndexTabFragment = this.f8693a;
                    if (zIsEmpty) {
                        ComposeView composeView3 = bangumiCategoryIndexTabFragment.f70124d;
                        if (composeView3 != null) {
                            ES0.y yVar = new ES0.y(bangumiCategoryIndexTabFragment, 1);
                            composeView3.setVisibility(0);
                            composeView3.setContent(ComposableLambdaKt.composableLambdaInstance(-202755488, true, new Tl0.c(null, yVar, 0)));
                            return;
                        }
                        return;
                    }
                    bangumiCategoryIndexTabFragment.f70128i.clear();
                    Iterator it = list.iterator();
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        i7 = i9;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (i8 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        OperationPageTabVo operationPageTabVo = (OperationPageTabVo) next;
                        int i10 = i7;
                        if (operationPageTabVo.isValidLink()) {
                            bangumiCategoryIndexTabFragment.f70128i.add(operationPageTabVo);
                            try {
                                String str2 = bangumiCategoryIndexTabFragment.f70127g;
                                j7 = 0;
                                if (str2 != null) {
                                    j7 = Long.parseLong(str2);
                                }
                            } catch (NumberFormatException e7) {
                                j7 = 0;
                            }
                            i10 = i7;
                            if (operationPageTabVo.getIndexType() == j7) {
                                i10 = i8;
                            }
                        }
                        i8++;
                        i9 = i10;
                    }
                    if (bangumiCategoryIndexTabFragment.f70128i.isEmpty()) {
                        ComposeView composeView4 = bangumiCategoryIndexTabFragment.f70124d;
                        if (composeView4 != null) {
                            ES0.z zVar = new ES0.z(bangumiCategoryIndexTabFragment, 1);
                            composeView4.setVisibility(0);
                            composeView4.setContent(ComposableLambdaKt.composableLambdaInstance(-202755488, true, new Tl0.c(null, zVar, 0)));
                            return;
                        }
                        return;
                    }
                    ComposeView composeView5 = bangumiCategoryIndexTabFragment.f70124d;
                    if (composeView5 != null) {
                        composeView5.setVisibility(8);
                    }
                    BangumiCategoryIndexTabFragment.a aVar = bangumiCategoryIndexTabFragment.h;
                    if (aVar != null) {
                        aVar.notifyDataSetChanged();
                    }
                    ViewPager viewPager = bangumiCategoryIndexTabFragment.f70123c;
                    if (viewPager != null) {
                        viewPager.setCurrentItem(i7, false);
                    }
                    PagerSlidingTabStrip pagerSlidingTabStrip2 = bangumiCategoryIndexTabFragment.f70122b;
                    if (pagerSlidingTabStrip2 != null) {
                        pagerSlidingTabStrip2.notifyDataSetChanged();
                    }
                }
            }, new Hk0.f(this)), getLifecycle());
            return;
        }
        this.f70128i.clear();
        ComposeView composeView3 = this.f70124d;
        if (composeView3 != null) {
            composeView3.setVisibility(8);
        }
        ArrayList<OperationPageTabVo> arrayList = this.f70128i;
        OperationPageTabVo operationPageTabVo = new OperationPageTabVo();
        operationPageTabVo.setLink("bilibili://pgc/tab/media-index?page_name=bangumi-index");
        operationPageTabVo.setIndexType(this.f70131l);
        arrayList.add(operationPageTabVo);
        a aVar = this.h;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
        ViewPager viewPager = this.f70123c;
        if (viewPager != null) {
            viewPager.setCurrentItem(0, false);
        }
        PagerSlidingTabStrip pagerSlidingTabStrip2 = this.f70122b;
        if (pagerSlidingTabStrip2 != null) {
            pagerSlidingTabStrip2.notifyDataSetChanged();
        }
        PagerSlidingTabStrip pagerSlidingTabStrip3 = this.f70122b;
        if (pagerSlidingTabStrip3 != null) {
            pagerSlidingTabStrip3.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r6) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation.entrance.indexpage.BangumiCategoryIndexTabFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment
    public final void onCreateToolbarMenu(@NotNull Menu menu, @NotNull MenuInflater menuInflater) {
        super.onCreateToolbarMenu(menu, menuInflater);
        menuInflater.inflate(2131558444, menu);
        final MenuItem menuItemFindItem = menu.findItem(2131310963);
        menuItemFindItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this, menuItemFindItem) { // from class: Hk0.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BangumiCategoryIndexTabFragment f8695a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final MenuItem f8696b;

            {
                this.f8695a = this;
                this.f8696b = menuItemFindItem;
            }

            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.f8695a.onOptionsItemSelected(this.f8696b);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), 2131886299)).inflate(2131499658, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(@NotNull MenuItem menuItem) {
        if (menuItem.getItemId() == 2131310963) {
            com.bapis.bilibili.account.interfaces.v1.g.a(null, "bilibili://search", 2, null);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        setTitle(this.f70126f);
        this.f70124d = (ComposeView) view.findViewById(2131301025);
        ViewPager viewPager = (ViewPager) view.findViewById(2131305458);
        if (viewPager != null) {
            viewPager.setOffscreenPageLimit(10);
            a aVar = new a(this);
            this.h = aVar;
            viewPager.setAdapter(aVar);
        } else {
            viewPager = null;
        }
        this.f70123c = viewPager;
        PagerSlidingTabStrip pagerSlidingTabStripFindViewById = view.findViewById(2131308542);
        pagerSlidingTabStripFindViewById.setViewPager(this.f70123c);
        this.f70122b = pagerSlidingTabStripFindViewById;
        ViewPager viewPager2 = this.f70123c;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(0);
        }
        TintToolbar mToolbar = getMToolbar();
        if (mToolbar != null) {
            mToolbar.setElevation(0.0f);
        }
        PagerSlidingTabStrip pagerSlidingTabStrip = this.f70122b;
        if (pagerSlidingTabStrip != null) {
            pagerSlidingTabStrip.setElevation(0.0f);
        }
        mf();
    }
}
