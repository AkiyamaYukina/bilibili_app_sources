package com.bilibili.biligame.business.detail.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.app.comm.list.common.channel.detail.IChannelDetailPage;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailContent;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailInfo;
import com.bilibili.biligame.business.detail.widget.DetailTabLayout;
import com.bilibili.biligame.report3.ReportParams;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.biligame.ui.FragmentSelector;
import com.bilibili.biligame.ui.gamedetail.GameDetailCallback;
import com.bilibili.biligame.widget.TabLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/widget/DetailTabLayout.class */
@StabilityInferred(parameters = 0)
public final class DetailTabLayout extends TabLayout implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public List<Integer> f62629F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public GameDetailInfo f62630G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public GameDetailContent f62631H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f62632I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f62633J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f62634K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Nullable
    public ViewPager f62635L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public Toolbar f62636M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @Nullable
    public CollapsingToolbarLayout f62637N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @Nullable
    public a f62638O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @Nullable
    public FragmentManager f62639P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f62640Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @Nullable
    public GameDetailCallback f62641R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f62642S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @Nullable
    public JSONObject f62643T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f62644U;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/business/detail/widget/DetailTabLayout$a.class */
    public final class a extends FragmentStatePagerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final SparseArray<Fragment> f62645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public List<Integer> f62646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DetailTabLayout f62647c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull DetailTabLayout detailTabLayout, FragmentManager fragmentManager) {
            super(fragmentManager, 0);
            this.f62647c = detailTabLayout;
            this.f62645a = new SparseArray<>(5);
            this.f62646b = CollectionsKt.emptyList();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.f62646b.size();
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0163  */
        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.fragment.app.Fragment getItem(int r7) {
            /*
                Method dump skipped, instruction units count: 495
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.business.detail.widget.DetailTabLayout.a.getItem(int):androidx.fragment.app.Fragment");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NotNull
        public final CharSequence getPageTitle(int i7) {
            DetailTabLayout detailTabLayout = this.f62647c;
            Integer num = (Integer) CollectionsKt.getOrNull(detailTabLayout.f62629F, i7);
            return detailTabLayout.p(num != null ? num.intValue() : -1);
        }
    }

    @JvmOverloads
    public DetailTabLayout(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public DetailTabLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public DetailTabLayout(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f62629F = CollectionsKt.emptyList();
        this.f62633J = -1;
        this.f62634K = true;
        this.f62642S = true;
    }

    public static String o(int i7) {
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 5 ? null : "forum-tab" : "topic-tab" : "strategy-tab" : "comment-tab" : "detail-tab";
    }

    public final int getCurrentTab() {
        return this.f62633J;
    }

    @Nullable
    public final GameDetailCallback getGameDetailCallback() {
        return this.f62641R;
    }

    public final boolean getPrivateRecruit() {
        return this.f62640Q;
    }

    @Nullable
    public final JSONObject getReportExtra() {
        return this.f62643T;
    }

    public final boolean getTopicOffsetChanged() {
        return this.f62642S;
    }

    public final void n(int i7) {
        if (this.f62633J == i7 || i7 == 5) {
            return;
        }
        String str = "点击";
        if (i7 == 5) {
            int i8 = this.f62644U;
            if (i8 % 2 == 0) {
                this.f62644U = i8 - 1;
                str = "滑动";
            } else {
                this.f62644U = i8 + 1;
            }
        } else {
            int i9 = this.f62644U;
            if (i9 == 0) {
                str = "";
            } else if (i9 % 2 != 0) {
                str = "滑动";
            }
        }
        String strO = o(i7);
        if (strO != null) {
            ReportParams.Companion companion = ReportParams.Companion;
            GameDetailInfo gameDetailInfo = this.f62630G;
            ReporterV3.reportExposure("game-detail-page", "navigation-tabs", strO, companion.createWithGameBaseId(gameDetailInfo != null ? String.valueOf(gameDetailInfo.gameBaseId) : null).put(this.f62643T).put("switch_type", str).build());
        }
        int iIndexOf = this.f62629F.indexOf(Integer.valueOf(this.f62633J));
        if (this.f62633J != -1) {
            a aVar = this.f62638O;
            Fragment fragment = aVar != null ? aVar.f62645a.get(iIndexOf) : null;
            if (fragment != null && !fragment.isDetached() && (fragment instanceof FragmentSelector)) {
                ((FragmentSelector) fragment).notifyUnselected();
            }
        }
        this.f62633J = i7;
        a aVar2 = this.f62638O;
        Fragment fragment2 = null;
        if (aVar2 != null) {
            fragment2 = aVar2.f62645a.get(this.f62629F.indexOf(Integer.valueOf(i7)));
        }
        if ((fragment2 instanceof FragmentSelector) && fragment2.isAdded() && fragment2.isResumed()) {
            ((FragmentSelector) fragment2).notifySelected();
        }
        setTopicOffset(fragment2);
    }

    public final void onTabReselected(@Nullable TabLayout.Tab tab) {
        GameDetailCallback gameDetailCallback;
        if (tab == null) {
            return;
        }
        if (this.f62633J != -1 && (gameDetailCallback = this.f62641R) != null) {
            gameDetailCallback.onAppbarExpand(false, false);
        }
        a aVar = this.f62638O;
        Fragment fragment = aVar != null ? aVar.f62645a.get(tab.getPosition()) : null;
        if ((fragment instanceof FragmentSelector) && fragment.isAdded() && fragment.isResumed()) {
            ((FragmentSelector) fragment).notifyRefresh();
        }
    }

    public final void onTabSelected(@Nullable TabLayout.Tab tab) {
        GameDetailCallback gameDetailCallback;
        if (tab == null) {
            return;
        }
        this.f62644U++;
        if (tab.getTag() instanceof Integer) {
            int iIntValue = ((Integer) tab.getTag()).intValue();
            String strO = o(iIntValue);
            if (strO != null) {
                ReportParams.Companion companion = ReportParams.Companion;
                GameDetailInfo gameDetailInfo = this.f62630G;
                ReporterV3.reportClick("game-detail-page", "navigation-tabs", strO, companion.createWithGameBaseId(gameDetailInfo != null ? String.valueOf(gameDetailInfo.gameBaseId) : null).put(this.f62643T).build());
            }
            if (this.f62633J != -1 && iIntValue != 5 && (gameDetailCallback = this.f62641R) != null) {
                gameDetailCallback.onAppbarExpand(false, false);
            }
            if (iIntValue == 4) {
                a aVar = this.f62638O;
                Fragment fragment = null;
                if (aVar != null) {
                    fragment = aVar.f62645a.get(tab.getPosition());
                }
                if ((fragment instanceof IChannelDetailPage) && fragment.isAdded()) {
                    ((IChannelDetailPage) fragment).onDetailRefresh();
                }
            }
        }
    }

    public final void onTabUnselected(@Nullable TabLayout.Tab tab) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CharSequence p(int i7) {
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? "" : getContext().getString(2131823830) : getContext().getString(2131823346) : getContext().getString(2131823795) : getContext().getString(2131823833) : getContext().getString(2131823828) : getContext().getString(2131823829);
    }

    public final void selectTab(@NotNull TabLayout.Tab tab, boolean z6) {
        Object tag = tab.getTag();
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null && 5 == num.intValue()) {
            dispatchTabSelected(tab);
        } else {
            super.selectTab(tab, z6);
        }
    }

    public final void setCommented(boolean z6) {
        this.f62634K = z6;
    }

    public final void setGameDetailCallback(@Nullable GameDetailCallback gameDetailCallback) {
        this.f62641R = gameDetailCallback;
    }

    public final void setPrivateRecruit(boolean z6) {
        this.f62640Q = z6;
    }

    public final void setReportExtra(@Nullable JSONObject jSONObject) {
        this.f62643T = jSONObject;
    }

    public final void setTopicOffset(@Nullable Fragment fragment) {
        Toolbar toolbar;
        try {
            if (this.f62642S && this.f62633J == 4) {
                Fragment fragment2 = fragment;
                if (fragment == null) {
                    a aVar = this.f62638O;
                    fragment2 = aVar != null ? aVar.f62645a.get(this.f62629F.indexOf(4)) : null;
                }
                if (!(fragment2 instanceof IChannelDetailPage) || (toolbar = this.f62636M) == null) {
                    return;
                }
                final Fragment fragment3 = fragment2;
                toolbar.post(new Runnable(this, fragment3) { // from class: xo.c

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final DetailTabLayout f129380a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Fragment f129381b;

                    {
                        this.f129380a = this;
                        this.f129381b = fragment3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        DetailTabLayout detailTabLayout = this.f129380a;
                        IChannelDetailPage iChannelDetailPage = this.f129381b;
                        CollapsingToolbarLayout collapsingToolbarLayout = detailTabLayout.f62637N;
                        int measuredHeight = collapsingToolbarLayout != null ? collapsingToolbarLayout.getMeasuredHeight() : 0;
                        Toolbar toolbar2 = detailTabLayout.f62636M;
                        iChannelDetailPage.setInitOffset(measuredHeight - (toolbar2 != null ? toolbar2.getMeasuredHeight() : 0));
                        detailTabLayout.f62642S = false;
                    }
                });
            }
        } catch (Throwable th) {
        }
    }

    public final void setTopicOffsetChanged(boolean z6) {
        this.f62642S = z6;
    }
}
