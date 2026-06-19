package com.bilibili.pegasus.hot.base;

import By0.M1;
import By0.O1;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.ad.utils.m;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comment3.ui.holder.handle.Q;
import com.bilibili.app.comment3.ui.holder.handle.S;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.bililive.room.biz.shopping.service.q;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.lib.ui.theme.ThemeWatcher;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.api.modelv2.HotPageConfig;
import com.bilibili.pegasus.api.modelv2.PegasusHotFeedResponse;
import com.bilibili.pegasus.card.C;
import com.bilibili.pegasus.card.base.C;
import com.bilibili.pegasus.card.base.F;
import com.bilibili.pegasus.card.base.a;
import com.bilibili.pegasus.card.base.d;
import com.bilibili.pegasus.promo.BasePromoFragment;
import com.bilibili.pegasus.utils.t;
import com.bilibili.video.story.action.h0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.common.home.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/hot/base/BaseHotFragment.class */
@StabilityInferred(parameters = 0)
public abstract class BaseHotFragment extends BasePromoFragment implements ThemeWatcher.Observer {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f78117N = 0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f78118G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f78119H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public HotPageConfig f78120I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f78121J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f78122K = R$color.Ga1;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f78123L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f78124M;

    @Override // com.bilibili.pegasus.promo.BasePromoFragment
    public final void Df() {
        if (this.f78496y != null) {
            F fNf = nf();
            a<?, ?> aVar = this.f78496y;
            if (aVar == null) {
                return;
            }
            int iIndexOf = ((ArrayList) fNf.a).indexOf(aVar);
            if (iIndexOf >= 0 && iIndexOf >= 0 && iIndexOf < ((ArrayList) fNf.a).size()) {
                ((ArrayList) fNf.a).remove(iIndexOf);
            }
            Cf(iIndexOf);
            if (iIndexOf >= 0) {
                mf().notifyItemRemoved(iIndexOf);
            }
            this.f78496y = null;
        }
    }

    public final void If() {
        this.f78457c = false;
        this.f78119H = true;
        setRefreshCompleted();
        Of(R$color.f64616Wh0);
        View viewWf = wf();
        if (viewWf != null) {
            viewWf.setVisibility(8);
        }
    }

    public final void Jf() {
        If();
        if (this.f78487p) {
            if (nf().c() == 0) {
                Of(R$color.Ga1);
                Ff(2131232151, 2131841350);
            }
        } else if (this.f78458d) {
            m mVar = new m(this, 5);
            RecyclerView mRecyclerView = getMRecyclerView();
            if (mRecyclerView == null || !mRecyclerView.isComputingLayout()) {
                mVar.invoke();
            } else {
                HandlerThreads.post(0, new h0(mVar, 1));
            }
            this.f78458d = false;
        }
        this.f78118G = false;
    }

    public final void Kf() {
        If();
        if (nf().c() != 0) {
            PromoToast.showBottomToast(getApplicationContext(), 2131845208);
            return;
        }
        Of(R$color.Ga1);
        if (ConnectivityMonitor.getInstance().isNetworkActive()) {
            Ff(2131236940, 2131841503);
        } else {
            Ff(2131236939, 2131841649);
        }
    }

    public final void Lf(@NotNull PegasusHotFeedResponse pegasusHotFeedResponse) {
        If();
        ArrayList arrayList = pegasusHotFeedResponse.items;
        if (arrayList == null) {
            return;
        }
        uf();
        ((ArrayList) this.f78488q).clear();
        ((ArrayList) this.f78488q).addAll(arrayList);
        q qVar = new q(2, this, arrayList);
        RecyclerView mRecyclerView = getMRecyclerView();
        if (mRecyclerView == null || !mRecyclerView.isComputingLayout()) {
            qVar.invoke();
        } else {
            HandlerThreads.post(0, new ZD0.a(qVar, 1));
        }
        RecyclerView mRecyclerView2 = getMRecyclerView();
        if (mRecyclerView2 != null) {
            mRecyclerView2.scrollToPosition(0);
        }
        if (this.f78118G) {
            this.f78118G = false;
        }
    }

    public void Mf(@NotNull PegasusHotFeedResponse pegasusHotFeedResponse) {
        this.f78118G = false;
        If();
        ArrayList arrayList = pegasusHotFeedResponse.items;
        if (arrayList == null) {
            return;
        }
        int iC = mf().f10355b.c();
        int iLf = lf(arrayList);
        ((ArrayList) this.f78488q).addAll(arrayList);
        mf().notifyItemRangeInserted(iC, iLf);
    }

    public boolean Nf() {
        return (activityDie() || xf() == null) ? false : true;
    }

    public final void Of(int i7) {
        RecyclerView mRecyclerView = getMRecyclerView();
        if (mRecyclerView != null) {
            mRecyclerView.setBackgroundColor(ThemeUtils.getColorById(p3(), i7));
        }
        this.f78122K = i7;
    }

    @Override // com.bilibili.pegasus.promo.BaseListFragment
    public final boolean canLoadNextPage() {
        return !this.f78457c;
    }

    @Override // com.bilibili.pegasus.promo.e
    public final boolean e7() {
        return true;
    }

    @Override // com.bilibili.pegasus.promo.BaseListFragment
    public final void kf(@NotNull RecyclerView recyclerView, int i7) {
        View viewFindViewByPosition;
        if (i7 != 0 || ((ArrayList) this.f78488q).isEmpty()) {
            return;
        }
        int size = ((ArrayList) this.f78488q).size() - 1;
        int viewType = ((BasicIndexItem) ((ArrayList) this.f78488q).get(size)).getViewType();
        List list = C.a;
        if (viewType == 1636546651) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null || (viewFindViewByPosition = linearLayoutManager.findViewByPosition(size)) == null || !viewFindViewByPosition.getLocalVisibleRect(new Rect()) || this.f78121J) {
                return;
            }
            Neurons.reportExposure$default(false, android.support.v4.media.a.a("creation.", of() == 4 ? "hot-tab" : "hot-page", ".instruction.0.show"), (Map) null, (List) null, 12, (Object) null);
            this.f78121J = true;
        }
    }

    @Override // com.bilibili.pegasus.promo.BasePegasusFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f78465j = new F(new d(), of());
        this.f78464i = new Ip0.a(nf());
        ThemeWatcher.getInstance().subscribe(this);
        if (Intrinsics.areEqual("cold", com.bilibili.pegasus.api.C.a)) {
            int i7 = 1;
            this.f78118G = true;
            if (BiliAccounts.get(getContext()).isLogin()) {
                i7 = 2;
            }
            this.f78489r = i7;
        }
        this.f78119H = false;
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = getArguments();
        }
        this.f78124M = arguments != null ? arguments.getLong("hot_page_id") : 0L;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131495233, viewGroup, false);
    }

    @Override // com.bilibili.pegasus.promo.BasePegasusFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ThemeWatcher.getInstance().unSubscribe(this);
        this.f78119H = false;
        ((ArrayList) this.f78488q).clear();
        super.onDestroy();
        BiliImageLoader.INSTANCE.clearMemoryCaches();
    }

    @Override // com.bilibili.pegasus.promo.BasePromoFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (isDetached()) {
            getChildFragmentManager().executePendingTransactions();
        }
        super.onDestroyView();
        this.f78119H = false;
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

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (c.a()) {
            mf().notifyUserVisible(false);
        }
    }

    @Override // com.bilibili.pegasus.promo.BasePromoFragment
    public void onRefresh() {
        super.onRefresh();
        Gf();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (c.a()) {
            if (((ArrayList) this.f78488q).isEmpty() && !this.f78457c && !this.f78119H) {
                BLog.i("BaseHotFragment", "load data from onResume");
                Gf();
            }
            mf().notifyUserVisible(true);
        }
        int iC = mf().f10355b.c();
        for (int i7 = 0; i7 < iC; i7++) {
            RecyclerView mRecyclerView = getMRecyclerView();
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = mRecyclerView != null ? mRecyclerView.findViewHolderForAdapterPosition(i7) : null;
            if (viewHolderFindViewHolderForAdapterPosition instanceof C.a) {
                C.a aVar = (C.a) viewHolderFindViewHolderForAdapterPosition;
                if (C.a.y0(aVar.q0())) {
                    aVar.l.b(false);
                }
            }
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("hot_page_id", this.f78124M);
    }

    @Override // com.bilibili.lib.ui.theme.ThemeWatcher.Observer
    public final void onThemeChanged() {
        if (activityDie()) {
            return;
        }
        Of(this.f78122K);
    }

    @Override // com.bilibili.pegasus.promo.BasePromoFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f78123L && ((ArrayList) this.f78488q).isEmpty() && !this.f78457c && !this.f78119H) {
            this.f78123L = false;
            BLog.i("BaseHotFragment", "load data from onViewCreated");
            Gf();
        }
        vf();
    }

    @Override // com.bilibili.lib.ui.BaseFragment
    public void setUserVisibleCompat(boolean z6) {
        super.setUserVisibleCompat(z6);
        if (!Nf()) {
            if (z6) {
                this.f78123L = true;
            }
        } else {
            if (!z6 || !((ArrayList) this.f78488q).isEmpty() || this.f78457c || this.f78119H) {
                return;
            }
            BLog.i("BaseHotFragment", "load data from setUserVisibleCompat");
            Gf();
        }
    }

    @Override // com.bilibili.pegasus.promo.BasePromoFragment
    public final void vf() {
        super.vf();
        Of(this.f78122K);
    }

    @Override // com.bilibili.pegasus.promo.BasePromoFragment
    @NotNull
    public final RecyclerView.ItemDecoration yf() {
        return new t(new M1(this, 4), new Q(this, 2), new O1(this, 2), new S(this, 1), R$color.Ga2);
    }
}
