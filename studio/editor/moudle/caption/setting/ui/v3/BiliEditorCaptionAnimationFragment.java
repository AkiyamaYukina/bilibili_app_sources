package com.bilibili.studio.editor.moudle.caption.setting.ui.v3;

import BS0.B;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import ax0.d;
import bx0.C5168a;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment;
import com.bilibili.studio.editor.moudle.caption.setting.ui.v2.BiliEditorCaptionSettingV2Fragment;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.videoeditor.extension.FragmentExtKt;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import gx0.b;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/ui/v3/BiliEditorCaptionAnimationFragment.class */
public final class BiliEditorCaptionAnimationFragment extends BiliEditorCaptionBaseFragment {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final ArrayList<CaptionListItem> f105877j = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f105878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PagerSlidingTabStrip f105879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewPager f105880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f105881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public ArrayList<C5168a> f105882g;

    @NotNull
    public final ArrayList<BiliEditorCaptionAnimationListFragment> h = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f105883i;

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131501048, viewGroup, false);
    }

    @Override // com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        f105877j.clear();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentHide(@NotNull Flag flag) {
        super.onFragmentHide(flag);
        this.f105883i = true;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        ArrayList<C5168a> arrayList;
        super.onFragmentShow(flag);
        if (this.f105883i) {
            this.f105883i = false;
            ViewPager viewPager = this.f105880e;
            ViewPager viewPager2 = viewPager;
            if (viewPager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                viewPager2 = null;
            }
            int currentItem = viewPager2.getCurrentItem();
            rf();
            rf();
            rf();
            ViewPager viewPager3 = this.f105880e;
            ViewPager viewPager4 = viewPager3;
            if (viewPager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                viewPager4 = null;
            }
            if (currentItem != viewPager4.getCurrentItem() || (arrayList = this.f105882g) == null) {
                return;
            }
            ViewPager viewPager5 = this.f105880e;
            if (viewPager5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                viewPager5 = null;
            }
            if (((C5168a) CollectionsKt.getOrNull(arrayList, viewPager5.getCurrentItem())) != null) {
                rf();
            }
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        rf();
        rf();
        this.f105881f = view.findViewById(2131317248);
        this.f105880e = (ViewPager) view.findViewById(2131316429);
        this.f105879d = view.findViewById(2131312846);
        this.f105878c = new d(getChildFragmentManager(), 1);
        ViewPager viewPager = this.f105880e;
        ViewPager viewPager2 = viewPager;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager2 = null;
        }
        d dVar = this.f105878c;
        d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageAdapter");
            dVar2 = null;
        }
        viewPager2.setAdapter(dVar2);
        PagerSlidingTabStrip pagerSlidingTabStrip = this.f105879d;
        PagerSlidingTabStrip pagerSlidingTabStrip2 = pagerSlidingTabStrip;
        if (pagerSlidingTabStrip == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabStrip");
            pagerSlidingTabStrip2 = null;
        }
        ViewPager viewPager3 = this.f105880e;
        ViewPager viewPager4 = viewPager3;
        if (viewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager4 = null;
        }
        pagerSlidingTabStrip2.setViewPager(viewPager4);
        ViewPager viewPager5 = this.f105880e;
        if (viewPager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            viewPager5 = null;
        }
        viewPager5.addOnPageChangeListener(new b(this));
        rf();
        FragmentExtKt.post(this, new B(this, 5));
    }

    public final void qf() {
        View view = getParentFragment() instanceof BiliEditorCaptionSettingV2Fragment ? ((BiliEditorCaptionSettingV2Fragment) getParentFragment()).f105840k : null;
        if ((view != null ? view.getLayoutParams() : null) instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) (view != null ? view.getLayoutParams() : null);
            if (layoutParams != null) {
                View view2 = this.f105881f;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("seekBarWrapper");
                    view2 = null;
                }
                layoutParams.bottomMargin = DensityUtil.dp2px(view2.getVisibility() == 8 ? 33.0f : 91.0f);
            }
            if (view != null) {
                view.setLayoutParams(layoutParams);
            }
        }
    }

    public final void rf() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || !(parentFragment instanceof BiliEditorCaptionSettingV2Fragment)) {
            return;
        }
    }
}
