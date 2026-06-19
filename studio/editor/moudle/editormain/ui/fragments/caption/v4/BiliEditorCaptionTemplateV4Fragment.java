package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import bx0.C5170c;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/BiliEditorCaptionTemplateV4Fragment.class */
@AndroidEntryPoint
public final class BiliEditorCaptionTemplateV4Fragment extends Hilt_BiliEditorCaptionTemplateV4Fragment {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final ArrayList<CaptionListItem> f106543n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f106544o = -1;
    public ax0.d h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PagerSlidingTabStrip f106545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewPager f106546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public ArrayList<C5170c> f106547k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final ArrayList<BiliEditorCaptionTemplateListV4Fragment> f106548l = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final a f106549m = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/v4/BiliEditorCaptionTemplateV4Fragment$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorCaptionTemplateV4Fragment f106550a;

        public a(BiliEditorCaptionTemplateV4Fragment biliEditorCaptionTemplateV4Fragment) {
            this.f106550a = biliEditorCaptionTemplateV4Fragment;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131501681, viewGroup, false);
    }

    @Override // com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        f106543n.clear();
        f106544o = -1;
        if (EntryPointKt.getMemleakOptEnable()) {
            this.f106548l.clear();
            ArrayList<C5170c> arrayList = this.f106547k;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.f106547k = null;
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f106546j = (ViewPager) view.findViewById(2131316429);
        this.f106545i = view.findViewById(2131312846);
        this.h = new ax0.d(getChildFragmentManager(), 1);
        ViewPager viewPager = this.f106546j;
        ViewPager viewPager2 = viewPager;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager2 = null;
        }
        ax0.d dVar = this.h;
        ax0.d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageAdapter");
            dVar2 = null;
        }
        viewPager2.setAdapter(dVar2);
        PagerSlidingTabStrip pagerSlidingTabStrip = this.f106545i;
        PagerSlidingTabStrip pagerSlidingTabStrip2 = pagerSlidingTabStrip;
        if (pagerSlidingTabStrip == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabStrip");
            pagerSlidingTabStrip2 = null;
        }
        ViewPager viewPager3 = this.f106546j;
        if (viewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager3 = null;
        }
        pagerSlidingTabStrip2.setViewPager(viewPager3);
    }
}
