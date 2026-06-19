package com.bilibili.pegasus.promo;

import Pb.G;
import US0.Q;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.appcompat.app.n;
import androidx.compose.foundation.N;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.router.ListCommonRouter;
import com.bilibili.app.comm.list.widget.recyclerview.PreloadGridLayoutManager;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.fasthybrid.uimodule.widget.playet.D;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.imageviewer.utils.ImageExtentionKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.menu.FloatMenuWindow;
import com.bilibili.lib.ui.menu.IFloatMenuItem;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.api.model.PullDownTipsItem;
import com.bilibili.pegasus.card.base.F;
import com.bilibili.pegasus.promo.BaseListFragment;
import com.tencent.bugly.crashreport.CrashReport;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/BasePromoFragment.class */
@StabilityInferred(parameters = 0)
public abstract class BasePromoFragment extends BasePegasusFragment<F> implements SwipeRefreshLayout.OnRefreshListener, e {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final KProperty<Object>[] f78481F = {new MutablePropertyReference1Impl(BasePromoFragment.class, "mSwipeRefreshLayout", "getMSwipeRefreshLayout()Ltv/danmaku/bili/widget/swiperefresh/SwipeRefreshLayout;", 0), new MutablePropertyReference1Impl(BasePromoFragment.class, "mEmptyView", "getMEmptyView()Landroid/view/View;", 0), new MutablePropertyReference1Impl(BasePromoFragment.class, "mEmptyText", "getMEmptyText()Landroid/widget/TextView;", 0), new MutablePropertyReference1Impl(BasePromoFragment.class, "mEmptyImage", "getMEmptyImage()Lcom/bilibili/lib/image2/view/BiliImageView;", 0)};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public RecyclerView.ItemDecoration f78482A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public PopupWindow f78483B;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f78487p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f78489r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public PullDownTipsItem f78492u;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public com.bilibili.pegasus.card.base.a<?, ?> f78496y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f78497z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final List<BasicIndexItem> f78488q = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public String f78490s = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.comm.list.common.widget.a f78491t = new com.bilibili.app.comm.list.common.widget.a(jf());

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.comm.list.common.widget.a f78493v = new com.bilibili.app.comm.list.common.widget.a(jf());

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.comm.list.common.widget.a f78494w = new com.bilibili.app.comm.list.common.widget.a(jf());

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.comm.list.common.widget.a f78495x = new com.bilibili.app.comm.list.common.widget.a(jf());

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final BaseListFragment.a f78484C = new BaseListFragment.a(this);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final D f78485D = new D(this, 1);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ad.adview.videodetail.relate.card92.a f78486E = new com.bilibili.ad.adview.videodetail.relate.card92.a(this, 1);

    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "dismiss", owner = {"android.widget.PopupWindow"}, scope = {})
    public static void tf(@NotNull Object obj) {
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(Pb.F.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
            }
        }
        ((PopupWindow) obj).dismiss();
    }

    public final void Af(@Nullable BasicIndexItem basicIndexItem) {
        RecyclerView mRecyclerView = getMRecyclerView();
        if (mRecyclerView == null || this.f78464i == null || basicIndexItem == null) {
            return;
        }
        int childCount = mRecyclerView.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            com.bilibili.pegasus.card.base.b childViewHolder = mRecyclerView.getChildViewHolder(mRecyclerView.getChildAt(i7));
            com.bilibili.pegasus.card.base.b bVar = childViewHolder instanceof com.bilibili.pegasus.card.base.b ? childViewHolder : null;
            if (Intrinsics.areEqual(basicIndexItem, bVar != null ? ((ao.a) bVar).a : null)) {
                mf().notifyItemChanged(childViewHolder.getBindingAdapterPosition(), "PAYLOAD_UPDATE_TRANSLATE");
            }
        }
    }

    public final boolean Bf() {
        if (this.f78457c || activityDie()) {
            return false;
        }
        this.f78457c = true;
        SwipeRefreshLayout swipeRefreshLayoutXf = xf();
        if (swipeRefreshLayoutXf != null) {
            swipeRefreshLayoutXf.post(this.f78485D);
        }
        this.f78487p = true;
        this.f78458d = true;
        return true;
    }

    public final void Cf(int i7) {
        if (i7 < 0 || ((ArrayList) this.f78488q).size() <= i7) {
            return;
        }
        ((ArrayList) this.f78488q).remove(i7);
    }

    public void Df() {
        if (this.f78496y != null) {
            F fNf = nf();
            com.bilibili.pegasus.card.base.a<?, ?> aVar = this.f78496y;
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

    public void Ef() {
        RecyclerView mRecyclerView = getMRecyclerView();
        if (mRecyclerView != null) {
            RecyclerView mRecyclerView2 = getMRecyclerView();
            mRecyclerView.setPadding(0, 0, 0, mRecyclerView2 != null ? mRecyclerView2.getPaddingBottom() : 0);
        }
    }

    public final void Ff(@DrawableRes int i7, @StringRes int i8) {
        com.bilibili.app.comm.list.common.widget.a aVar = this.f78495x;
        KProperty<Object>[] kPropertyArr = f78481F;
        KProperty<Object> kProperty = kPropertyArr[3];
        BiliImageView biliImageView = (BiliImageView) aVar.b;
        if (biliImageView != null) {
            ImageExtentionKt.displayImageResource(biliImageView, i7);
        }
        com.bilibili.app.comm.list.common.widget.a aVar2 = this.f78494w;
        KProperty<Object> kProperty2 = kPropertyArr[2];
        TextView textView = (TextView) aVar2.b;
        if (textView != null) {
            textView.setText(i8);
        }
        View viewWf = wf();
        if (viewWf != null) {
            viewWf.setVisibility(0);
        }
    }

    public final void Gf() {
        if (Bf()) {
            zf();
        }
    }

    public final void Hf() {
        if (activityDie() || this.f78457c) {
            return;
        }
        this.f78457c = true;
        this.f78487p = false;
        zf();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView mRecyclerView;
        PopupWindow popupWindow = this.f78483B;
        if (popupWindow != null) {
            tf(popupWindow);
        }
        super.onDestroyView();
        RecyclerView mRecyclerView2 = getMRecyclerView();
        if (mRecyclerView2 != null) {
            mRecyclerView2.removeOnScrollListener(this.f78484C);
        }
        if (this.f78484C != null && (mRecyclerView = getMRecyclerView()) != null) {
            mRecyclerView.removeOnChildAttachStateChangeListener(this.f78484C);
        }
        SwipeRefreshLayout swipeRefreshLayoutXf = xf();
        if (swipeRefreshLayoutXf != null) {
            swipeRefreshLayoutXf.setRefreshing(false);
        }
        SwipeRefreshLayout swipeRefreshLayoutXf2 = xf();
        if (swipeRefreshLayoutXf2 != null) {
            swipeRefreshLayoutXf2.destroyDrawingCache();
        }
        SwipeRefreshLayout swipeRefreshLayoutXf3 = xf();
        if (swipeRefreshLayoutXf3 != null) {
            swipeRefreshLayoutXf3.clearAnimation();
        }
    }

    @Override // com.bilibili.pegasus.promo.BaseListFragment
    public void onLoadNextPage() {
        Hf();
    }

    @CallSuper
    public void onRefresh() {
        this.f78497z = SystemClock.elapsedRealtime();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        RecyclerView mRecyclerView;
        super.onViewCreated(view, bundle);
        SwipeRefreshLayout swipeRefreshLayoutFindViewById = view.findViewById(2131312766);
        com.bilibili.app.comm.list.common.widget.a aVar = this.f78491t;
        KProperty<Object>[] kPropertyArr = f78481F;
        aVar.a(swipeRefreshLayoutFindViewById, kPropertyArr[0]);
        SwipeRefreshLayout swipeRefreshLayoutXf = xf();
        if (swipeRefreshLayoutXf != null) {
            swipeRefreshLayoutXf.setOnRefreshListener(this);
        }
        SwipeRefreshLayout swipeRefreshLayoutXf2 = xf();
        if (swipeRefreshLayoutXf2 != null) {
            swipeRefreshLayoutXf2.setColorSchemeResources(new int[]{2131103284});
        }
        this.f78460f.a((RecyclerView) view.findViewById(2131306595), BaseListFragment.h[0]);
        RecyclerView mRecyclerView2 = getMRecyclerView();
        if (mRecyclerView2 != null) {
            mRecyclerView2.addOnScrollListener(this.f78484C);
        }
        if (this.f78484C != null && (mRecyclerView = getMRecyclerView()) != null) {
            mRecyclerView.addOnChildAttachStateChangeListener(this.f78484C);
        }
        this.f78493v.a(view.findViewById(2131301032), kPropertyArr[1]);
        View viewWf = wf();
        this.f78495x.a(viewWf != null ? viewWf.findViewById(2131301157) : null, kPropertyArr[3]);
        View viewWf2 = wf();
        TextView textView = null;
        if (viewWf2 != null) {
            textView = (TextView) viewWf2.findViewById(2131301181);
        }
        this.f78494w.a(textView, kPropertyArr[2]);
        ListCommonRouter.isInMagicWindow(getContext());
    }

    @Override // com.bilibili.pegasus.promo.BasePegasusFragment
    /* JADX INFO: renamed from: pf */
    public final void P1(@NotNull com.bilibili.pegasus.card.base.e eVar) {
        super.P1(eVar);
        int i7 = eVar.a;
        if (i7 == 1) {
            boolean z6 = eVar.b("action:feed:view_type") instanceof Integer;
            if (xf() != null) {
                ListExtentionsKt.smoothScrollToTop(getMRecyclerView());
                Gf();
                return;
            }
            return;
        }
        if (i7 == 6 && !activityDie()) {
            Object objB = eVar.b("action:popup:parent");
            View view = objB instanceof View ? (View) objB : null;
            if (view == null) {
                return;
            }
            Object objB2 = eVar.b("action:popup:anchor");
            View view2 = objB2 instanceof View ? (View) objB2 : null;
            if (view2 == null) {
                return;
            }
            Object objB3 = eVar.b("action:popup:menu");
            List list = null;
            if (objB3 instanceof List) {
                list = (List) objB3;
            }
            if (list == null) {
                return;
            }
            PopupWindow popupWindow = this.f78483B;
            if (popupWindow != null) {
                tf(popupWindow);
            }
            this.f78483B = FloatMenuWindow.show(getContext(), view, view2, (List<IFloatMenuItem>) list);
        }
    }

    @Override // com.bilibili.pegasus.promo.BasePegasusFragment
    public final void qf() {
        if (((ArrayList) this.f78488q).size() == 1) {
            Hf();
        }
    }

    @Override // com.bilibili.pegasus.promo.BasePegasusFragment
    public final void rf(int i7) {
        if (i7 < 0) {
            return;
        }
        super.rf(i7);
        Df();
        this.f78458d = true;
        Cf(i7);
    }

    public final void setRefreshCompleted() {
        SwipeRefreshLayout swipeRefreshLayoutXf = xf();
        if (swipeRefreshLayoutXf != null) {
            swipeRefreshLayoutXf.removeCallbacks(this.f78485D);
        }
        int iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f78497z);
        if (iElapsedRealtime < 0 || iElapsedRealtime >= 500) {
            SwipeRefreshLayout swipeRefreshLayoutXf2 = xf();
            if (swipeRefreshLayoutXf2 != null) {
                swipeRefreshLayoutXf2.post(this.f78486E);
                return;
            }
            return;
        }
        SwipeRefreshLayout swipeRefreshLayoutXf3 = xf();
        if (swipeRefreshLayoutXf3 != null) {
            swipeRefreshLayoutXf3.postDelayed(this.f78486E, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE - iElapsedRealtime);
        }
    }

    public final void uf() {
        ((ArrayList) nf().a).clear();
        this.f78496y = null;
    }

    public void vf() {
        RecyclerView mRecyclerView = getMRecyclerView();
        if (mRecyclerView != null) {
            mRecyclerView.setClipToPadding(false);
        }
        RecyclerView mRecyclerView2 = getMRecyclerView();
        if (mRecyclerView2 != null) {
            mRecyclerView2.setHasFixedSize(true);
        }
        final Context context = getContext();
        if (context != null) {
            PreloadGridLayoutManager preloadGridLayoutManager = new PreloadGridLayoutManager(context, this) { // from class: com.bilibili.pegasus.promo.BasePromoFragment$setV2StyleLayoutManager$manager$1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final BasePromoFragment f78498b;

                {
                    this.f78498b = this;
                }

                public final boolean canScrollVertically() {
                    return super.canScrollVertically() && this.f78498b.f78466k;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
                    try {
                        super/*androidx.recyclerview.widget.GridLayoutManager*/.onLayoutChildren(recycler, state);
                    } catch (IndexOutOfBoundsException e7) {
                        CrashReport.postCatchedException(e7);
                        BLog.e("BasePromoFragment", e7);
                    }
                }
            };
            preloadGridLayoutManager.setSpanSizeLookup(new d(this));
            Ef();
            preloadGridLayoutManager.setRecycleChildrenOnDetach(true);
            RecyclerView mRecyclerView3 = getMRecyclerView();
            if (mRecyclerView3 != null) {
                mRecyclerView3.setLayoutManager(preloadGridLayoutManager);
            }
        }
        if (this.f78482A == null) {
            this.f78482A = yf();
        }
        RecyclerView mRecyclerView4 = getMRecyclerView();
        if (mRecyclerView4 != null) {
            mRecyclerView4.addItemDecoration(this.f78482A);
        }
        RecyclerView mRecyclerView5 = getMRecyclerView();
        if (mRecyclerView5 != null) {
            mRecyclerView5.setAdapter(mf());
        }
    }

    public final View wf() {
        com.bilibili.app.comm.list.common.widget.a aVar = this.f78493v;
        KProperty<Object> kProperty = f78481F[1];
        return (View) aVar.b;
    }

    @Nullable
    public final SwipeRefreshLayout xf() {
        com.bilibili.app.comm.list.common.widget.a aVar = this.f78491t;
        KProperty<Object> kProperty = f78481F[0];
        return (SwipeRefreshLayout) aVar.b;
    }

    @NotNull
    public RecyclerView.ItemDecoration yf() {
        return new Ip0.b(new E61.f(this, 5), new W.d(this, 3), new N(this, 3), new Q(this, 2), R$color.Ga2, 1.0f);
    }

    public abstract void zf();
}
