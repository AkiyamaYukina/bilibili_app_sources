package com.bilibili.routeui;

import Ks0.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.lib.ui.BaseToolbarFragment;
import com.bilibili.lib.ui.RouteConstKt;
import com.bilibili.magicasakura.widgets.TintToolbar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/routeui/PagerFragment.class */
public class PagerFragment extends BaseToolbarFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ks0.a f86265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PagerSlidingTabStrip f86266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewPager f86267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86268e = -1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/routeui/PagerFragment$a.class */
    public static final class a extends ViewPager.SimpleOnPageChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PagerFragment f86269a;

        public a(PagerFragment pagerFragment) {
            this.f86269a = pagerFragment;
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i7) {
            PagerFragment pagerFragment = this.f86269a;
            if (pagerFragment.f86268e != i7) {
                pagerFragment.f86268e = i7;
                pagerFragment.getClass();
            }
        }
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Object obj = getMProps().get(RouteConstKt.PROPS_TAB_DATA);
        if (obj == null) {
            throw new IllegalArgumentException("missing params");
        }
        this.f86265b = new Ks0.a(getMProps(), obj);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        String string;
        Integer color;
        View viewInflate = layoutInflater.inflate(2131494128, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(2131296811);
        if (viewFindViewById != null) {
            ViewCompat.setElevation(viewFindViewById, getResources().getDimensionPixelSize(2131165832));
            if (getMShowToolbar() && (string = getMProps().getString(RouteConstKt.PROPS_TOOLBAR_BGCOLOR)) != null && (color = parseColor(string)) != null) {
                viewFindViewById.setBackgroundColor(color.intValue());
            }
        }
        this.f86266c = viewInflate.findViewById(2131308542);
        this.f86267d = (ViewPager) viewInflate.findViewById(2131305458);
        return viewInflate;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, tv.danmaku.bili.widget.PagerSlidingTabStrip$TabClickListener] */
    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        TintToolbar mToolbar = getMToolbar();
        if (mToolbar != null) {
            ViewCompat.setElevation(mToolbar, 0.0f);
        }
        Ks0.a aVar = this.f86265b;
        Ks0.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCtlArgs");
            aVar2 = null;
        }
        setTitle(aVar2.f13001b);
        ViewPager viewPager = this.f86267d;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pager");
            viewPager = null;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Ks0.a aVar3 = this.f86265b;
        Ks0.a aVar4 = aVar3;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCtlArgs");
            aVar4 = null;
        }
        viewPager.setAdapter(new c(childFragmentManager, aVar4.f13002c));
        PagerSlidingTabStrip pagerSlidingTabStrip = this.f86266c;
        if (pagerSlidingTabStrip == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabs");
            pagerSlidingTabStrip = null;
        }
        Ks0.a aVar5 = this.f86265b;
        Ks0.a aVar6 = aVar5;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCtlArgs");
            aVar6 = null;
        }
        pagerSlidingTabStrip.setShouldExpand(Intrinsics.areEqual(aVar6.f13000a, "1"));
        pagerSlidingTabStrip.setOnPageChangeListener(new a(this));
        pagerSlidingTabStrip.setOnTabClickListener((PagerSlidingTabStrip.TabClickListener) new Object());
        ViewPager viewPager2 = this.f86267d;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pager");
            viewPager2 = null;
        }
        pagerSlidingTabStrip.setViewPager(viewPager2);
    }
}
