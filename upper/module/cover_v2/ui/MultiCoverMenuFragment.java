package com.bilibili.upper.module.cover_v2.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.base.MainThread;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.studio.comm.ab.ABManager;
import com.bilibili.upper.module.cover_v2.ui.caption.MultiCaptionFragment;
import com.bilibili.upper.module.cover_v2.ui.template.MultiCoverTemplateFragment;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/MultiCoverMenuFragment.class */
@StabilityInferred(parameters = 0)
public final class MultiCoverMenuFragment extends BaseFragment implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayList<String> f112901b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ArrayList<Fragment> f112902c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MultiCoverTemplateFragment f112903d = new MultiCoverTemplateFragment();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MultiCaptionFragment f112904e = new MultiCaptionFragment();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public a f112905f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/ui/MultiCoverMenuFragment$a.class */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final View f112906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final TabLayout f112907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ViewPager f112908c;

        public a(@NotNull View view) {
            this.f112906a = view.findViewById(2131318215);
            this.f112907b = view.findViewById(2131318184);
            this.f112908c = (ViewPager) view.findViewById(2131318185);
        }
    }

    public final KH0.i jf() {
        androidx.core.content.g gVarP3 = p3();
        if (gVarP3 instanceof com.bilibili.upper.module.cover_v2.ui.a) {
            return ((com.bilibili.upper.module.cover_v2.ui.a) gVarP3).C3();
        }
        return null;
    }

    public final void kf() {
        Object obj;
        a aVar;
        ViewPager viewPager;
        Map<String, String> map = ABManager.f105341a;
        String strA = ABManager.a(com.bilibili.studio.comm.ab.d.f105360l);
        switch (strA.hashCode()) {
            case -1504120493:
                if (!strA.equals("cover_noguide")) {
                }
                aVar = this.f112905f;
                if (aVar == null && (viewPager = aVar.f112908c) != null) {
                    viewPager.setCurrentItem(0, true);
                    break;
                }
                break;
            case -595358701:
                obj = "nocover_guide";
                strA.equals(obj);
                break;
            case 3387192:
                obj = "none";
                strA.equals(obj);
                break;
            case 170921076:
                if (!strA.equals("cover_guide")) {
                }
                aVar = this.f112905f;
                if (aVar == null) {
                }
                break;
        }
    }

    public final void lf(int i7) {
        final MultiCoverTemplateFragment multiCoverTemplateFragment = this.f112903d;
        multiCoverTemplateFragment.f112979e = i7;
        View view = multiCoverTemplateFragment.getView();
        if (view != null) {
            view.post(new Runnable(multiCoverTemplateFragment) { // from class: QH0.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MultiCoverTemplateFragment f19857a;

                {
                    this.f19857a = multiCoverTemplateFragment;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    MultiCoverTemplateFragment multiCoverTemplateFragment2 = this.f19857a;
                    multiCoverTemplateFragment2.mf(multiCoverTemplateFragment2.f112979e);
                    multiCoverTemplateFragment2.lf().f54930d.notifyDataSetChanged();
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131501572, viewGroup, false);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f7, int i8) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPageSelected(int r4) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.cover_v2.ui.MultiCoverMenuFragment.onPageSelected(int):void");
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        KH0.f fVar;
        TabLayout tabLayout;
        View view2;
        View view3;
        ViewPager viewPager;
        ViewPager viewPager2;
        TabLayout tabLayout2;
        super.onViewCreated(view, bundle);
        this.f112905f = new a(view);
        if (EH0.a.a()) {
            this.f112901b.add(requireContext().getString(2131849657));
            this.f112902c.add(this.f112903d);
        }
        this.f112901b.add(requireContext().getString(2131849401));
        this.f112902c.add(this.f112904e);
        a aVar = this.f112905f;
        if (aVar != null && (tabLayout2 = aVar.f112907b) != null) {
            tabLayout2.setupWithViewPager(aVar.f112908c);
        }
        a aVar2 = this.f112905f;
        if (aVar2 != null && (viewPager2 = aVar2.f112908c) != null) {
            viewPager2.addOnPageChangeListener(this);
        }
        a aVar3 = this.f112905f;
        if (aVar3 != null && (viewPager = aVar3.f112908c) != null) {
            viewPager.setAdapter(new l(this, getChildFragmentManager()));
        }
        a aVar4 = this.f112905f;
        if (aVar4 != null && (view3 = aVar4.f112906a) != null) {
            bG0.g.c(view3, !EH0.a.a());
        }
        MainThread.postOnMainThread(new EH0.i(this, 1));
        a aVar5 = this.f112905f;
        if (aVar5 != null && (view2 = aVar5.f112906a) != null) {
            view2.setOnClickListener(new BF0.f(this, 3));
        }
        a aVar6 = this.f112905f;
        if (aVar6 != null && (tabLayout = aVar6.f112907b) != null) {
            tabLayout.setOnTabSelectedListener(new k(this));
        }
        KH0.i iVarJf = jf();
        if (iVarJf == null || (fVar = iVarJf.f12753l) == null) {
            return;
        }
        ((ArrayList) fVar.f12739a).add(new m(this));
    }
}
