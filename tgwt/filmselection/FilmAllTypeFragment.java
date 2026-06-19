package com.bilibili.tgwt.filmselection;

import DD0.AbstractC1551y;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.ogvcommon.deprecated.EmptyFragment;
import com.bilibili.ogvcommon.widget.DisableSlideViewPager;
import com.bilibili.tgwt.api.FilmSelectionPageTabVo;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/filmselection/FilmAllTypeFragment.class */
@StabilityInferred(parameters = 0)
public final class FilmAllTypeFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC1551y f111161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f111162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public FilmSelectionPageTabVo f111163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f111164e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/filmselection/FilmAllTypeFragment$a.class */
    public final class a extends FragmentStatePagerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FilmAllTypeFragment f111165a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FilmAllTypeFragment filmAllTypeFragment) {
            super(filmAllTypeFragment.getChildFragmentManager());
            this.f111165a = filmAllTypeFragment;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            List<FilmSelectionPageTabVo.FilmSelectionPageChildTabVo> listA;
            FilmSelectionPageTabVo filmSelectionPageTabVo = this.f111165a.f111163d;
            return (filmSelectionPageTabVo == null || (listA = filmSelectionPageTabVo.a()) == null) ? 0 : listA.size();
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        @NotNull
        public final Fragment getItem(int i7) {
            List<FilmSelectionPageTabVo.FilmSelectionPageChildTabVo> listA;
            FilmAllTypeFragment filmAllTypeFragment = this.f111165a;
            FilmSelectionPageTabVo filmSelectionPageTabVo = filmAllTypeFragment.f111163d;
            FilmSelectionPageTabVo.FilmSelectionPageChildTabVo filmSelectionPageChildTabVo = (filmSelectionPageTabVo == null || (listA = filmSelectionPageTabVo.a()) == null) ? null : listA.get(i7);
            if (filmSelectionPageChildTabVo == null) {
                return new EmptyFragment();
            }
            FilmSelectionFragment filmSelectionFragment = new FilmSelectionFragment();
            Bundle bundle = new Bundle();
            filmSelectionFragment.setArguments(bundle);
            bundle.putString("tabType", filmSelectionPageChildTabVo.a());
            FilmSelectionPageTabVo filmSelectionPageTabVo2 = filmAllTypeFragment.f111163d;
            bundle.putString("tabChildType", filmSelectionPageTabVo2 != null ? filmSelectionPageTabVo2.b() : null);
            String str = filmAllTypeFragment.f111164e;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mType");
                str = null;
            }
            bundle.putString("type", str);
            return filmSelectionFragment;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(@NotNull Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @Nullable
        public final CharSequence getPageTitle(int i7) {
            List<FilmSelectionPageTabVo.FilmSelectionPageChildTabVo> listA;
            FilmSelectionPageTabVo.FilmSelectionPageChildTabVo filmSelectionPageChildTabVo;
            FilmSelectionPageTabVo filmSelectionPageTabVo = this.f111165a.f111163d;
            return (filmSelectionPageTabVo == null || (listA = filmSelectionPageTabVo.a()) == null || (filmSelectionPageChildTabVo = listA.get(i7)) == null) ? null : filmSelectionPageChildTabVo.getTitle();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        AbstractC1551y abstractC1551yInflate = AbstractC1551y.inflate(LayoutInflater.from(getContext()), viewGroup, false);
        this.f111161b = abstractC1551yInflate;
        AbstractC1551y abstractC1551y = abstractC1551yInflate;
        if (abstractC1551yInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            abstractC1551y = null;
        }
        return abstractC1551y.getRoot();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        List<FilmSelectionPageTabVo.FilmSelectionPageChildTabVo> listA;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f111164e = arguments.getString("type", "1");
            this.f111163d = (FilmSelectionPageTabVo) arguments.getParcelable("tab_data");
        }
        AbstractC1551y abstractC1551y = this.f111161b;
        AbstractC1551y abstractC1551y2 = abstractC1551y;
        if (abstractC1551y == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            abstractC1551y2 = null;
        }
        DisableSlideViewPager disableSlideViewPager = abstractC1551y2.f2684z;
        disableSlideViewPager.setOffscreenPageLimit(3);
        a aVar = new a(this);
        this.f111162c = aVar;
        disableSlideViewPager.setAdapter(aVar);
        disableSlideViewPager.setCurrentItem(0);
        FilmSelectionPageTabVo filmSelectionPageTabVo = this.f111163d;
        if (filmSelectionPageTabVo == null || (listA = filmSelectionPageTabVo.a()) == null) {
            return;
        }
        Context contextRequireContext = requireContext();
        c cVar = new c();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(contextRequireContext, 0, false);
        if (!Intrinsics.areEqual(linearLayoutManager, cVar.f111184b)) {
            cVar.f111184b = linearLayoutManager;
            cVar.notifyPropertyChanged(669);
        }
        b bVar = new b(contextRequireContext);
        if (!Intrinsics.areEqual(bVar, cVar.f111185c)) {
            cVar.f111185c = bVar;
            cVar.notifyPropertyChanged(326);
        }
        List<FilmSelectionPageTabVo.FilmSelectionPageChildTabVo> list = listA;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i7 = 0;
        for (Object obj : list) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String title = ((FilmSelectionPageTabVo.FilmSelectionPageChildTabVo) obj).getTitle();
            String str = title;
            if (title == null) {
                str = "";
            }
            arrayList.add(new j(str, i7 == 0, new com.bilibili.tgwt.filmselection.a(cVar, i7)));
            i7++;
        }
        if (!Intrinsics.areEqual(arrayList, cVar.f111183a)) {
            cVar.f111183a = arrayList;
            cVar.notifyPropertyChanged(670);
        }
        cVar.f111186d = new JW.b(2, cVar, this);
        AbstractC1551y abstractC1551y3 = this.f111161b;
        AbstractC1551y abstractC1551y4 = abstractC1551y3;
        if (abstractC1551y3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            abstractC1551y4 = null;
        }
        abstractC1551y4.q(cVar);
        a aVar2 = this.f111162c;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerAdapter");
            aVar2 = null;
        }
        aVar2.notifyDataSetChanged();
    }
}
