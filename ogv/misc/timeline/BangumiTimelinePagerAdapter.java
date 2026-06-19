package com.bilibili.ogv.misc.timeline;

import android.os.Bundle;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.base.SharedPreferencesHelper;
import com.bilibili.lib.ui.BaseRecyclerViewFragment;
import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimeline;
import com.bilibili.ogv.misc.timeline.ui.entity.BangumiTimelineDay;
import java.util.List;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/BangumiTimelinePagerAdapter.class */
@StabilityInferred(parameters = 0)
public final class BangumiTimelinePagerAdapter extends FragmentStatePagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f69426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f69427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public List<BangumiTimelineDay> f69428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f69429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f69430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f69431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f69432g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/BangumiTimelinePagerAdapter$BangumiTimelineFragment.class */
    @StabilityInferred(parameters = 0)
    public static final class BangumiTimelineFragment extends BaseRecyclerViewFragment {
        public static final int $stable = 8;

        @NotNull
        public static final String BUNDLE_BANGUMI_DAY_KEY = "bangumi_day";

        @NotNull
        public static final String BUNDLE_BANGUMI_NEXT_DAY_KEY = "bangumi_next_day";

        @NotNull
        public static final String BUNDLE_CURRENT_TIME_TEXT = "current_time_text";

        @NotNull
        public static final String BUNDLE_DELAY_ID = "bangumi_delay_id";

        @NotNull
        public static final String BUNDLE_IS_SHOW_NIGHT = "is_show_night";

        @NotNull
        public static final String BUNDLE_NIGHT_MODE = "night_mode";

        @NotNull
        public static final String BUNDLE_SEE_MINE = "see_mine";

        @NotNull
        public static final a Companion = new Object();

        @Nullable
        private j adapter;

        @Nullable
        private BangumiTimelineDay bangumiDay;

        @Nullable
        private String mCurrentTimeText = "";
        private boolean mIsShowNight;
        private boolean mNightMode;
        private int mScrollOffset;
        private boolean mSeeMine;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/BangumiTimelinePagerAdapter$BangumiTimelineFragment$a.class */
        public static final class a {
        }

        private final boolean checkShowGuide(BangumiTimeline bangumiTimeline) {
            if (new SharedPreferencesHelper(getContext()).optBoolean(2131833238, false)) {
                return false;
            }
            if (bangumiTimeline != null) {
                long jD = bangumiTimeline.f69530k - this.bangumiDay.d();
                if (jD > 86400 && jD < 108000) {
                    return true;
                }
            }
            BangumiTimelineDay bangumiTimelineDay = this.bangumiDay;
            boolean z6 = false;
            if (bangumiTimelineDay != null) {
                z6 = false;
                if (bangumiTimelineDay.m() != null) {
                    z6 = false;
                    if (this.bangumiDay.m().size() > 0) {
                        long jD2 = this.bangumiDay.m().get(this.bangumiDay.m().size() - 1).f69530k - this.bangumiDay.d();
                        z6 = false;
                        if (jD2 > 86400) {
                            z6 = false;
                            if (jD2 < 108000) {
                                z6 = true;
                            }
                        }
                    }
                }
            }
            return z6;
        }

        @Nullable
        public final j getAdapter() {
            return this.adapter;
        }

        @Nullable
        public final BangumiTimelineDay getBangumiDay() {
            return this.bangumiDay;
        }

        @Override // com.bilibili.lib.ui.BaseRecyclerViewFragment
        public void onViewCreated(@NotNull RecyclerView recyclerView, @Nullable Bundle bundle) {
            boolean z6;
            super.onViewCreated(recyclerView, bundle);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
            BangumiTimelineDay bangumiTimelineDay = (BangumiTimelineDay) requireArguments().getParcelable(BUNDLE_BANGUMI_DAY_KEY);
            this.bangumiDay = bangumiTimelineDay;
            if (bangumiTimelineDay == null) {
                return;
            }
            this.mSeeMine = requireArguments().getBoolean(BUNDLE_SEE_MINE, false);
            this.mIsShowNight = requireArguments().getBoolean(BUNDLE_IS_SHOW_NIGHT, false);
            this.mCurrentTimeText = requireArguments().getString(BUNDLE_CURRENT_TIME_TEXT);
            if (this.bangumiDay.m() == null || this.bangumiDay.m().size() == 0) {
                this.mLoadingView.setVisibility(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mLoadingView.getLayoutParams();
                layoutParams.gravity = 1;
                float f7 = 100.0f;
                if (Float.isNaN(100.0f)) {
                    f7 = 0.0f;
                }
                layoutParams.setMargins(0, MathKt.roundToInt(TypedValue.applyDimension(1, f7, this.mLoadingView.getContext().getResources().getDisplayMetrics())), 0, 0);
                this.mLoadingView.setLayoutParams(layoutParams);
                this.mLoadingView.showEmptyTips();
                if (this.mSeeMine) {
                    this.mLoadingView.setImageResource(2131236937);
                    ((TextView) this.mLoadingView.findViewById(2131308733)).setText(2131822172);
                } else {
                    this.mLoadingView.setImageResource(2131236937);
                    ((TextView) this.mLoadingView.findViewById(2131308733)).setText(this.bangumiDay.j());
                }
                z6 = false;
            } else {
                this.mLoadingView.setVisibility(8);
                z6 = this.bangumiDay.n() && checkShowGuide((BangumiTimeline) requireArguments().getParcelable(BUNDLE_BANGUMI_NEXT_DAY_KEY)) && this.mIsShowNight;
            }
            this.mScrollOffset = MathKt.roundToInt(TypedValue.applyDimension(1, Float.isNaN(42.0f) ? 0.0f : 42.0f, requireContext().getResources().getDisplayMetrics()));
            this.adapter = new j(this.bangumiDay, this.mSeeMine, this.mNightMode, z6, this.mCurrentTimeText);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(this.adapter);
            recyclerView.setVerticalScrollBarEnabled(false);
            int iB = Uj0.c.b(6, recyclerView.getContext());
            recyclerView.setPadding(0, iB, 0, iB);
            recyclerView.setClipToPadding(false);
            int i7 = requireArguments().getInt(BUNDLE_DELAY_ID, -1);
            if (i7 != -1) {
                scrollToDelay(i7);
            }
        }

        public final void scrollToDelay(int i7) {
            BangumiTimelineDay bangumiTimelineDay = this.bangumiDay;
            if (bangumiTimelineDay == null || bangumiTimelineDay.m() == null) {
                return;
            }
            int size = this.bangumiDay.m().size();
            for (int i8 = 0; i8 < size; i8++) {
                if (this.bangumiDay.m().get(i8) != null && this.bangumiDay.m().get(i8).h() && this.bangumiDay.m().get(i8).f69532m == i7) {
                    ((LinearLayoutManager) getRecyclerView().getLayoutManager()).scrollToPositionWithOffset(i8, this.mScrollOffset);
                    return;
                }
            }
        }

        public final void setAdapter(@Nullable j jVar) {
            this.adapter = jVar;
        }

        public final void setBangumiDay(@Nullable BangumiTimelineDay bangumiTimelineDay) {
            this.bangumiDay = bangumiTimelineDay;
        }

        @Override // com.bilibili.lib.ui.BaseFragment
        public void setUserVisibleCompat(boolean z6) {
            j jVar;
            super.setUserVisibleCompat(z6);
            if (z6 && (jVar = this.adapter) != null && jVar.f69460e.n()) {
                jVar.notifyItemChanged(jVar.f69460e.f69550g, Boolean.FALSE);
            }
        }
    }

    public BangumiTimelinePagerAdapter(@NotNull FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f69429d = -1;
        this.f69430e = -1;
        this.f69432g = "";
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<BangumiTimelineDay> list = this.f69428c;
        return list == null ? 0 : list.size();
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    @NotNull
    public final Fragment getItem(int i7) {
        int i8;
        BangumiTimelineFragment bangumiTimelineFragment = new BangumiTimelineFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(BangumiTimelineFragment.BUNDLE_BANGUMI_DAY_KEY, this.f69428c.get(i7));
        if (this.f69428c.get(i7) != null && this.f69428c.get(i7).n() && (i8 = i7 + 1) < this.f69428c.size() && this.f69428c.get(i8) != null && this.f69428c.get(i8).m() != null && this.f69428c.get(i8).m().size() > 0) {
            bundle.putParcelable(BangumiTimelineFragment.BUNDLE_BANGUMI_NEXT_DAY_KEY, this.f69428c.get(i8).m().get(0));
        }
        bundle.putBoolean(BangumiTimelineFragment.BUNDLE_SEE_MINE, this.f69426a);
        bundle.putBoolean(BangumiTimelineFragment.BUNDLE_NIGHT_MODE, this.f69427b);
        bundle.putBoolean(BangumiTimelineFragment.BUNDLE_IS_SHOW_NIGHT, this.f69431f);
        bundle.putString(BangumiTimelineFragment.BUNDLE_CURRENT_TIME_TEXT, this.f69432g);
        if (this.f69429d == i7) {
            bundle.putInt(BangumiTimelineFragment.BUNDLE_DELAY_ID, this.f69430e);
            this.f69429d = -1;
        }
        bangumiTimelineFragment.setArguments(bundle);
        return bangumiTimelineFragment;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(@NotNull Object obj) {
        return -2;
    }
}
