package com.bilibili.music.podcast.fragment;

import Pa.P;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bz0.C5175a;
import bz0.f;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/SwipeRefreshFragment.class */
public abstract class SwipeRefreshFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f66796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f66797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public SwipeRefreshLayout f66798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public RecyclerView f66799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f66800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f66801g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f66802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f66803j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/fragment/SwipeRefreshFragment$a.class */
    public static final class a extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SwipeRefreshFragment f66804a;

        public a(SwipeRefreshFragment swipeRefreshFragment) {
            this.f66804a = swipeRefreshFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            RecyclerView.Adapter adapter;
            if (i8 >= 0) {
                SwipeRefreshFragment swipeRefreshFragment = this.f66804a;
                if (swipeRefreshFragment.f66796b || recyclerView.getChildCount() <= 0) {
                    return;
                }
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null || (adapter = recyclerView.getAdapter()) == null || linearLayoutManager.findLastCompletelyVisibleItemPosition() < (adapter.getItemCount() - 1) - swipeRefreshFragment.jf() || swipeRefreshFragment.f66796b || swipeRefreshFragment.f66797c) {
                    return;
                }
                swipeRefreshFragment.f66796b = true;
                swipeRefreshFragment.nf();
            }
        }
    }

    public SwipeRefreshFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f66801g = LazyKt.lazy(lazyThreadSafetyMode, new C5175a(this, 4));
        this.h = LazyKt.lazy(lazyThreadSafetyMode, new AN.a(this, 6));
        this.f66802i = LazyKt.lazy(lazyThreadSafetyMode, new P(this, 3));
        this.f66803j = LazyKt.lazy(lazyThreadSafetyMode, new f(this, 3));
    }

    public int jf() {
        return 4;
    }

    public abstract boolean kf();

    public final void lf() {
        this.f66796b = false;
        SwipeRefreshLayout swipeRefreshLayout = this.f66798d;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.removeCallbacks((Runnable) this.f66801g.getValue());
        }
        int iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f66800f);
        if (iElapsedRealtime < 0 || iElapsedRealtime >= 500) {
            SwipeRefreshLayout swipeRefreshLayout2 = this.f66798d;
            if (swipeRefreshLayout2 != null) {
                swipeRefreshLayout2.post((Runnable) this.h.getValue());
                return;
            }
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout3 = this.f66798d;
        if (swipeRefreshLayout3 != null) {
            swipeRefreshLayout3.postDelayed((Runnable) this.h.getValue(), BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE - iElapsedRealtime);
        }
    }

    public abstract void mf();

    public void nf() {
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        SwipeRefreshLayout swipeRefreshLayout = this.f66798d;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.f66798d;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.destroyDrawingCache();
        }
        SwipeRefreshLayout swipeRefreshLayout3 = this.f66798d;
        if (swipeRefreshLayout3 != null) {
            swipeRefreshLayout3.clearAnimation();
        }
        this.f66798d = null;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    @CallSuper
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        RecyclerView recyclerView;
        SwipeRefreshLayout swipeRefreshLayoutFindViewById = view.findViewById(2131301959);
        this.f66798d = swipeRefreshLayoutFindViewById;
        if (swipeRefreshLayoutFindViewById != null) {
            swipeRefreshLayoutFindViewById.setOnRefreshListener((SwipeRefreshLayout.OnRefreshListener) this.f66803j.getValue());
            swipeRefreshLayoutFindViewById.setColorSchemeResources(new int[]{2131103284});
        }
        this.f66799e = (RecyclerView) view.findViewById(2131301956);
        if (!kf() || (recyclerView = this.f66799e) == null) {
            return;
        }
        recyclerView.addOnScrollListener((a) this.f66802i.getValue());
    }
}
