package com.bilibili.pegasus.promo.operation;

import Kp0.e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SharedRecycledViewPool;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.homepage.startdust.OnPageSelectChangeListener;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.lib.ui.theme.ThemeWatcher;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.pegasus.api.D;
import com.bilibili.pegasus.api.g;
import com.bilibili.pegasus.api.h;
import com.bilibili.pegasus.api.model.PromoOperationTab;
import com.bilibili.pegasus.card.base.F;
import com.bilibili.pegasus.card.base.d;
import com.bilibili.pegasus.promo.BasePromoFragment;
import com.bilibili.pegasus.utils.v;
import com.bilibili.pegasus.utils.x;
import ha0.c;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/operation/BaseOperationFragment.class */
@StabilityInferred(parameters = 0)
public class BaseOperationFragment extends BasePromoFragment implements ThemeWatcher.Observer, OnPageSelectChangeListener, c {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f78507N = 0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public String f78509H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public String f78510I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f78511J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f78512K;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f78508G = 2;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final a f78513L = new a(this);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @NotNull
    public final Lazy f78514M = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Kp0.a(this, 0));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/operation/BaseOperationFragment$a.class */
    public static final class a extends BiliApiDataCallback<PromoOperationTab> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BaseOperationFragment f78515b;

        public a(BaseOperationFragment baseOperationFragment) {
            this.f78515b = baseOperationFragment;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final boolean isCancel() {
            int i7 = BaseOperationFragment.f78507N;
            return this.f78515b.activityDie();
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(PromoOperationTab promoOperationTab) {
            final PromoOperationTab promoOperationTab2 = promoOperationTab;
            final BaseOperationFragment baseOperationFragment = this.f78515b;
            if (promoOperationTab2 != null && !x.q(promoOperationTab2.item)) {
                final int i7 = 0;
                HandlerThreads.runOn(2, new Runnable(i7, baseOperationFragment, promoOperationTab2) { // from class: Kp0.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f12986a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f12987b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Object f12988c;

                    {
                        this.f12986a = i7;
                        this.f12987b = baseOperationFragment;
                        this.f12988c = promoOperationTab2;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instruction units count: 513
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: Kp0.b.run():void");
                    }
                });
            } else {
                baseOperationFragment.If();
                baseOperationFragment.uf();
                baseOperationFragment.mf().notifyDataSetChanged();
                baseOperationFragment.Ff(2131232151, 2131841350);
            }
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            BaseOperationFragment baseOperationFragment = this.f78515b;
            baseOperationFragment.If();
            baseOperationFragment.If();
            if (baseOperationFragment.nf().c() == 0) {
                baseOperationFragment.Ff(2131232151, 2131841503);
            } else {
                PromoToast.showBottomToast(baseOperationFragment.p3(), 2131841349);
            }
        }
    }

    @Override // com.bilibili.pegasus.promo.BasePromoFragment
    public final void Df() {
    }

    @Override // com.bilibili.pegasus.promo.BasePromoFragment
    public final void Ef() {
        RecyclerView mRecyclerView = getMRecyclerView();
        if (mRecyclerView != null) {
            RecyclerView mRecyclerView2 = getMRecyclerView();
            mRecyclerView.setPadding(0, 0, 0, mRecyclerView2 != null ? mRecyclerView2.getPaddingBottom() : 0);
        }
    }

    public final void If() {
        this.f78457c = false;
        this.f78511J = true;
        setRefreshCompleted();
        View viewWf = wf();
        if (viewWf != null) {
            viewWf.setVisibility(8);
        }
    }

    @Override // com.bilibili.pegasus.promo.BaseListFragment
    public final boolean canLoadNextPage() {
        return false;
    }

    @Override // com.bilibili.pegasus.promo.e
    public final boolean e7() {
        return false;
    }

    @Override // com.bilibili.pegasus.promo.BaseListFragment
    public final boolean hasNextPage() {
        return false;
    }

    @Override // com.bilibili.pegasus.promo.BasePegasusFragment
    public int of() {
        return this.f78508G;
    }

    @Override // com.bilibili.pegasus.promo.BasePegasusFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Bundle arguments2 = getArguments();
            this.f78510I = arguments2 != null ? arguments2.getString("name", "") : null;
            Object obj = arguments.get("tab_id");
            Object obj2 = obj;
            if (obj == null) {
                obj2 = "0";
            }
            this.f78509H = String.valueOf(obj2);
        }
        this.f78465j = new F(new d(), of());
        this.f78464i = new Ip0.a(nf());
        ThemeWatcher.getInstance().subscribe(this);
        this.f78511J = false;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131495234, viewGroup, false);
    }

    @Override // com.bilibili.pegasus.promo.BasePegasusFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f78511J = false;
        ThemeWatcher.getInstance().unSubscribe(this);
        BiliImageLoader.INSTANCE.clearMemoryCaches();
    }

    @Override // com.bilibili.pegasus.promo.BasePromoFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f78511J = false;
        super.onDestroyView();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentHide(@NotNull Flag flag) {
        super.onFragmentHide(flag);
        mf().notifyUserVisible(false);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        super.onFragmentShow(flag);
        mf().notifyUserVisible(true);
    }

    @Override // com.bilibili.pegasus.promo.BasePromoFragment, com.bilibili.pegasus.promo.BaseListFragment
    public final void onLoadNextPage() {
    }

    public final void onPageReSelected() {
        ListExtentionsKt.smoothScrollToTop(getMRecyclerView());
    }

    public final void onPageSelected(@androidx.annotation.Nullable @Nullable Map<String, ? extends Object> map) {
    }

    public final void onPageUnselected() {
        super.setUserVisibleCompat(false);
    }

    @Override // com.bilibili.pegasus.promo.BasePromoFragment
    @CallSuper
    public final void onRefresh() {
        super.onRefresh();
        for (e eVar : (ArrayList) nf().a) {
            if (eVar instanceof e) {
                eVar.onTabRefresh();
            }
        }
        Gf();
    }

    @Override // com.bilibili.lib.ui.theme.ThemeWatcher.Observer
    public final void onThemeChanged() {
        RecyclerView mRecyclerView;
        if (p3() != null && getMRecyclerView() != null && (mRecyclerView = getMRecyclerView()) != null) {
            mRecyclerView.setBackgroundColor(ThemeUtils.getColorById(p3(), R$color.Ga1));
        }
        if (((Boolean) v.f78890a.getValue()).booleanValue()) {
            ((SharedRecycledViewPool) this.f78514M.getValue()).clear();
        }
    }

    @Override // com.bilibili.pegasus.promo.BasePromoFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        RecyclerView mRecyclerView;
        super.onViewCreated(view, bundle);
        BLog.i("IndexOperationFragment", "CardReuse onViewCreated");
        if (((Boolean) v.f78890a.getValue()).booleanValue() && (mRecyclerView = getMRecyclerView()) != null) {
            mRecyclerView.setRecycledViewPool((SharedRecycledViewPool) this.f78514M.getValue());
        }
        RecyclerView mRecyclerView2 = getMRecyclerView();
        if (mRecyclerView2 != null) {
            mRecyclerView2.setBackgroundColor(ThemeUtils.getColorById(getContext(), R$color.Ga1));
        }
        TintLinearLayout tintLinearLayout = (TintLinearLayout) view.findViewById(2131312205);
        if (tintLinearLayout != null) {
            tintLinearLayout.setVisibility(8);
        }
        vf();
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131166069);
        RecyclerView mRecyclerView3 = getMRecyclerView();
        if (mRecyclerView3 != null) {
            mRecyclerView3.addItemDecoration(new Kp0.d(dimensionPixelOffset));
        }
        RecyclerView mRecyclerView4 = getMRecyclerView();
        if (mRecyclerView4 != null) {
            mRecyclerView4.setHasFixedSize(true);
        }
        RecyclerView mRecyclerView5 = getMRecyclerView();
        if (mRecyclerView5 != null) {
            mRecyclerView5.setPadding(0, ListExtentionsKt.toPx(8.0f), 0, c.H3(view.getContext()));
        }
        SwipeRefreshLayout swipeRefreshLayoutXf = xf();
        if (swipeRefreshLayoutXf != null) {
            swipeRefreshLayoutXf.setStyle(1);
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment
    public void setUserVisibleCompat(boolean z6) {
        super.setUserVisibleCompat(z6);
        if (p3() == null || nf().c() != 0 || !z6 || this.f78511J || this.f78457c || this.f78512K) {
            return;
        }
        this.f78511J = true;
        Gf();
    }

    @Override // com.bilibili.pegasus.promo.BasePromoFragment
    public final void zf() {
        FragmentActivity fragmentActivityP3 = p3();
        String str = this.f78509H;
        a aVar = this.f78513L;
        BiliCall operationTab = ((D) ServiceGenerator.createService(D.class)).getOperationTab(BiliAccounts.get(fragmentActivityP3).getAccessKey(), str);
        g gVar = new g();
        gVar.a.add(0, new Object());
        CollectionsKt.addAll(gVar.a, h.a);
        operationTab.setParser(gVar).enqueue(aVar);
    }
}
