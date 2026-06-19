package com.bilibili.studio.editor.moudle.caption.setting.ui.v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.viewpager.widget.ViewPager;
import ax0.d;
import bx0.C5170c;
import com.bilibili.studio.editor.moudle.caption.setting.presenter.e;
import com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import dx0.InterfaceC6891b;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/ui/v2/BiliEditorCaptionTemplateV2Fragment.class */
public final class BiliEditorCaptionTemplateV2Fragment extends BiliEditorCaptionBaseFragment implements InterfaceC6891b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final ArrayList<CaptionListItem> f105869i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f105870j = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f105871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PagerSlidingTabStrip f105872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewPager f105873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ArrayList<C5170c> f105874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ArrayList<BiliEditorCaptionTemplateListV2Fragment> f105875g = new ArrayList<>();

    @NotNull
    public final a h = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/ui/v2/BiliEditorCaptionTemplateV2Fragment$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorCaptionTemplateV2Fragment f105876a;

        public a(BiliEditorCaptionTemplateV2Fragment biliEditorCaptionTemplateV2Fragment) {
            this.f105876a = biliEditorCaptionTemplateV2Fragment;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131494050, viewGroup, false);
    }

    @Override // com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        f105869i.clear();
        f105870j = -1;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f105873e = (ViewPager) view.findViewById(2131316429);
        this.f105872d = view.findViewById(2131312846);
        this.f105871c = new d(getChildFragmentManager(), 1);
        ViewPager viewPager = this.f105873e;
        ViewPager viewPager2 = viewPager;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager2 = null;
        }
        d dVar = this.f105871c;
        d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageAdapter");
            dVar2 = null;
        }
        viewPager2.setAdapter(dVar2);
        PagerSlidingTabStrip pagerSlidingTabStrip = this.f105872d;
        PagerSlidingTabStrip pagerSlidingTabStrip2 = pagerSlidingTabStrip;
        if (pagerSlidingTabStrip == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabStrip");
            pagerSlidingTabStrip2 = null;
        }
        ViewPager viewPager3 = this.f105873e;
        if (viewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager3 = null;
        }
        pagerSlidingTabStrip2.setViewPager(viewPager3);
    }

    @Override // dx0.InterfaceC6891b
    @Nullable
    public final e v8() {
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment == null || !(parentFragment instanceof InterfaceC6891b)) {
            return null;
        }
        return ((InterfaceC6891b) parentFragment).v8();
    }
}
