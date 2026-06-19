package com.bilibili.ship.theseus.cheese.biz.catalog;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import eu0.C6985d;
import fu0.C7200w;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/m.class */
public final class m extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheeseCatalogTabFragment f89188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f89189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LottieAnimationView f89190c;

    public m(CheeseCatalogTabFragment cheeseCatalogTabFragment, LinearLayout linearLayout, LottieAnimationView lottieAnimationView) {
        this.f89188a = cheeseCatalogTabFragment;
        this.f89189b = linearLayout;
        this.f89190c = lottieAnimationView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
        int i8;
        if (i7 == 0) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            CheeseCatalogTabFragment cheeseCatalogTabFragment = this.f89188a;
            int i9 = cheeseCatalogTabFragment.f89141m.f57021b;
            if (iFindFirstVisibleItemPosition <= i9 && i9 <= iFindLastVisibleItemPosition) {
                LinearLayout linearLayout = this.f89189b;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                    return;
                }
                return;
            }
            C6985d c6985dA = cheeseCatalogTabFragment.f89134e.a();
            if (c6985dA != null && (i8 = c6985dA.f117509d) != 1 && i8 != 3) {
                C7200w c7200w = cheeseCatalogTabFragment.f89138j;
                if (c7200w != null) {
                    c7200w.f119627g.setVisibility(8);
                    return;
                }
                return;
            }
            LinearLayout linearLayout2 = this.f89189b;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            boolean z6 = cheeseCatalogTabFragment.f89139k;
            LottieAnimationView lottieAnimationView = this.f89190c;
            if (z6) {
                if (lottieAnimationView != null) {
                    lottieAnimationView.playAnimation();
                }
            } else if (lottieAnimationView != null) {
                lottieAnimationView.pauseAnimation();
            }
        }
    }
}
