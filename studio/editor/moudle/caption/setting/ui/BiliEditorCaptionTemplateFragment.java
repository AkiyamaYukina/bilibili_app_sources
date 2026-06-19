package com.bilibili.studio.editor.moudle.caption.setting.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import ax0.d;
import bx0.C5170c;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import ex0.l;
import ex0.n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/ui/BiliEditorCaptionTemplateFragment.class */
public final class BiliEditorCaptionTemplateFragment extends BiliEditorCaptionBaseFragment {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final ArrayList<CaptionListItem> f105811j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f105812k = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f105813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PagerSlidingTabStrip f105814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewPager f105815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ArrayList<C5170c> f105816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ArrayList<BiliEditorCaptionTemplateListFragment> f105817g = new ArrayList<>();

    @NotNull
    public final a h = new a(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f105818i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/setting/ui/BiliEditorCaptionTemplateFragment$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorCaptionTemplateFragment f105819a;

        public a(BiliEditorCaptionTemplateFragment biliEditorCaptionTemplateFragment) {
            this.f105819a = biliEditorCaptionTemplateFragment;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131494048, viewGroup, false);
    }

    @Override // com.bilibili.studio.editor.moudle.caption.setting.ui.BiliEditorCaptionBaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        f105811j.clear();
        f105812k = -1;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f105815e = (ViewPager) view.findViewById(2131316429);
        this.f105814d = view.findViewById(2131312846);
        d dVar = new d(getChildFragmentManager(), 1);
        this.f105813c = dVar;
        dVar.f54265a = false;
        ViewPager viewPager = this.f105815e;
        ViewPager viewPager2 = viewPager;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager2 = null;
        }
        d dVar2 = this.f105813c;
        d dVar3 = dVar2;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageAdapter");
            dVar3 = null;
        }
        viewPager2.setAdapter(dVar3);
        PagerSlidingTabStrip pagerSlidingTabStrip = this.f105814d;
        PagerSlidingTabStrip pagerSlidingTabStrip2 = pagerSlidingTabStrip;
        if (pagerSlidingTabStrip == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabStrip");
            pagerSlidingTabStrip2 = null;
        }
        ViewPager viewPager3 = this.f105815e;
        if (viewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager3 = null;
        }
        pagerSlidingTabStrip2.setViewPager(viewPager3);
    }

    public final void qf(@NotNull ArrayList<C5170c> arrayList) {
        this.f105817g.clear();
        ArrayList arrayList2 = new ArrayList();
        for (C5170c c5170c : arrayList) {
            if (!c5170c.f57121b.isEmpty()) {
                arrayList2.add(c5170c);
            }
        }
        this.f105816f = new ArrayList<>(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        f105811j.clear();
        ArrayList<C5170c> arrayList5 = this.f105816f;
        if (arrayList5 != null) {
            for (C5170c c5170c2 : arrayList5) {
                arrayList3.add(c5170c2.f57120a);
                BiliEditorCaptionTemplateListFragment biliEditorCaptionTemplateListFragment = new BiliEditorCaptionTemplateListFragment();
                biliEditorCaptionTemplateListFragment.f105822e = this.h;
                this.f105817g.add(biliEditorCaptionTemplateListFragment);
                f105811j.addAll(c5170c2.f57121b);
                ArrayList<CaptionListItem> arrayList6 = c5170c2.f57121b;
                biliEditorCaptionTemplateListFragment.f105821d = arrayList6;
                n nVar = biliEditorCaptionTemplateListFragment.f105820c;
                if (nVar != null) {
                    nVar.f54261a = arrayList6;
                    nVar.notifyDataSetChanged();
                }
                arrayList4.add(biliEditorCaptionTemplateListFragment);
            }
        }
        d dVar = this.f105813c;
        d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageAdapter");
            dVar2 = null;
        }
        dVar2.f54266b = arrayList3;
        dVar2.f54267c = arrayList4;
        dVar2.notifyDataSetChanged();
        PagerSlidingTabStrip pagerSlidingTabStrip = this.f105814d;
        if (pagerSlidingTabStrip == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabStrip");
            pagerSlidingTabStrip = null;
        }
        pagerSlidingTabStrip.notifyDataSetChanged();
    }

    public final void rf(int i7) {
        ArrayList<CaptionListItem> arrayList = f105811j;
        if (arrayList.isEmpty()) {
            return;
        }
        CaptionListItem captionListItem = null;
        for (CaptionListItem captionListItem2 : arrayList) {
            captionListItem2.setSelected(false);
            if (captionListItem2.getId() == i7) {
                captionListItem2.setSelected(true);
                captionListItem = captionListItem2;
            }
        }
        CaptionListItem captionListItem3 = captionListItem;
        if (captionListItem == null) {
            CaptionListItem captionListItem4 = (CaptionListItem) CollectionsKt.firstOrNull(f105811j);
            if (captionListItem4 == null) {
                return;
            }
            captionListItem4.setSelected(true);
            captionListItem3 = captionListItem4;
            if (this.f105818i) {
                captionListItem4.setSelected(false);
                captionListItem3 = null;
            }
        }
        if (this.f105818i && captionListItem3 != null) {
            captionListItem3.setSelected(false);
        }
        Ref.IntRef intRef = new Ref.IntRef();
        ArrayList<C5170c> arrayList2 = this.f105816f;
        int i8 = 0;
        if (arrayList2 != null) {
            Iterator<C5170c> it = arrayList2.iterator();
            int i9 = 0;
            loop1: while (true) {
                i8 = 0;
                if (!it.hasNext()) {
                    break;
                }
                C5170c next = it.next();
                if (i9 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int i10 = 0;
                for (CaptionListItem captionListItem5 : next.f57121b) {
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (Intrinsics.areEqual(captionListItem5, captionListItem3)) {
                        intRef.element = i10;
                        i8 = i9;
                        break loop1;
                    }
                    i10++;
                }
                i9++;
            }
        }
        Iterator<BiliEditorCaptionTemplateListFragment> it2 = this.f105817g.iterator();
        while (it2.hasNext()) {
            it2.next().qf();
        }
        BiliEditorCaptionTemplateListFragment biliEditorCaptionTemplateListFragment = (BiliEditorCaptionTemplateListFragment) CollectionsKt.getOrNull(this.f105817g, i8);
        if (biliEditorCaptionTemplateListFragment != null) {
            biliEditorCaptionTemplateListFragment.jf(new l(biliEditorCaptionTemplateListFragment, intRef));
        }
        ViewPager viewPager = this.f105815e;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager = null;
        }
        viewPager.setCurrentItem(i8);
    }
}
