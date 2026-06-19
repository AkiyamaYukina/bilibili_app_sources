package com.bilibili.ogv.misc.sponsor;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.ui.BaseToolbarFragment;
import com.bilibili.ogv.misc.sponsor.BangumiCategoryIndex;
import com.bilibili.ogv.misc.sponsor.BangumiFilterLayout;
import com.bilibili.ogv.misc.sponsor.BangumiSponsorRecommendFragment;
import com.bilibili.okretro.call.rxjava.c;
import com.bilibili.upper.module.contribute.picker.ui.w;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.bili.widget.LoadingImageView;
import xk0.g;
import xk0.h;
import xk0.i;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/sponsor/BangumiSponsorRecommendFragment.class */
public class BangumiSponsorRecommendFragment extends BaseToolbarFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f69356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GridLayoutManager f69357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LoadingImageView f69358d;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f69362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BangumiFilterLayout f69363j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f69359e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f69360f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f69361g = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<BangumiFilterLayout.a> f69364k = new ArrayList<>();

    public final void mf(final boolean z6) {
        if (this.h || this.f69362i) {
            return;
        }
        this.h = true;
        if (z6) {
            this.f69361g++;
            this.f69356b.showFooterLoading();
        } else {
            LoadingImageView loadingImageView = this.f69358d;
            if (loadingImageView != null) {
                loadingImageView.setVisibility(0);
                this.f69358d.setRefreshing();
            }
            this.f69361g = 1;
        }
        c.a(SponsorApiService.f69383a.getSeasonBySponsor(this.f69361g, 30, this.f69359e, this.f69360f).subscribe(new Consumer(this, z6) { // from class: xk0.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BangumiSponsorRecommendFragment f129291a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f129292b;

            {
                this.f129291a = this;
                this.f129292b = z6;
            }

            public final void accept(Object obj) {
                List<BangumiCategoryIndex.Bangumi> list;
                BangumiCategoryIndex bangumiCategoryIndex = (BangumiCategoryIndex) obj;
                BangumiSponsorRecommendFragment bangumiSponsorRecommendFragment = this.f129291a;
                bangumiSponsorRecommendFragment.h = false;
                LoadingImageView loadingImageView2 = bangumiSponsorRecommendFragment.f69358d;
                if (loadingImageView2 != null) {
                    loadingImageView2.setRefreshComplete();
                    bangumiSponsorRecommendFragment.f69358d.setVisibility(4);
                }
                if (bangumiSponsorRecommendFragment.f69361g >= bangumiCategoryIndex.f69314b || (list = bangumiCategoryIndex.f69313a) == null || list.isEmpty()) {
                    bangumiSponsorRecommendFragment.f69362i = true;
                }
                com.bilibili.ogv.misc.sponsor.a aVar = bangumiSponsorRecommendFragment.f69356b;
                int i7 = bangumiSponsorRecommendFragment.f69359e;
                List<BangumiCategoryIndex.Bangumi> list2 = bangumiCategoryIndex.f69313a;
                if (!this.f129292b || aVar.f69384f != i7) {
                    ((ArrayList) aVar.f69385g).clear();
                }
                if (list2 != null && !list2.isEmpty()) {
                    ((ArrayList) aVar.f69385g).addAll(list2);
                }
                aVar.f69384f = i7;
                if (bangumiSponsorRecommendFragment.f69362i) {
                    bangumiSponsorRecommendFragment.f69356b.showFooterEmpty();
                }
                bangumiSponsorRecommendFragment.f69356b.notifySectionData();
            }
        }, new Consumer(this, z6) { // from class: xk0.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BangumiSponsorRecommendFragment f129293a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f129294b;

            {
                this.f129293a = this;
                this.f129294b = z6;
            }

            public final void accept(Object obj) {
                BangumiSponsorRecommendFragment bangumiSponsorRecommendFragment = this.f129293a;
                bangumiSponsorRecommendFragment.h = false;
                if (this.f129294b) {
                    bangumiSponsorRecommendFragment.f69361g--;
                    bangumiSponsorRecommendFragment.f69356b.showLoadMoreError();
                    return;
                }
                LoadingImageView loadingImageView2 = bangumiSponsorRecommendFragment.f69358d;
                if (loadingImageView2 != null) {
                    loadingImageView2.setVisibility(0);
                    bangumiSponsorRecommendFragment.f69358d.setRefreshError();
                }
            }
        }), getLifecycle());
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        setTitle(getString(2131822075));
        mf(false);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(2131493142, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(2131306580);
        this.f69363j = (BangumiFilterLayout) viewInflate.findViewById(2131301549);
        this.f69358d = viewInflate.findViewById(2131303590);
        this.f69356b = new a();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        this.f69357c = gridLayoutManager;
        gridLayoutManager.setSmoothScrollbarEnabled(true);
        this.f69357c.setSpanSizeLookup(new g(this));
        recyclerView.setLayoutManager(this.f69357c);
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131166076);
        recyclerView.addItemDecoration(new h(dimensionPixelSize, (int) (dimensionPixelSize - TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()))));
        recyclerView.setAdapter(this.f69356b);
        recyclerView.addOnScrollListener(new i(this));
        String string = getString(2131821953);
        String string2 = getString(2131822192);
        String string3 = getString(2131821748);
        int i7 = 0;
        while (i7 < 3) {
            BangumiFilterLayout.a aVar = new BangumiFilterLayout.a();
            aVar.f69330a = new String[]{string, string2, string3}[i7];
            aVar.f69332c = i7 == 0;
            aVar.f69331b = i7 == 0;
            this.f69364k.add(aVar);
            i7++;
        }
        this.f69363j.setFilterData(this.f69364k);
        this.f69363j.setOnFilterItemClickListener(new w(this));
        return viewInflate;
    }
}
