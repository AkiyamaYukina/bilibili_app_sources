package com.bilibili.tgwt.filmselection;

import G3.H0;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.widget.ImageViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.ui.BaseToolbarFragment;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.magicasakura.widgets.TintToolbar;
import com.bilibili.ogvcommon.deprecated.EmptyFragment;
import com.bilibili.ogvcommon.deprecated.EmptyStateView;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.tgwt.api.FilmSelectionPageTabVo;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/filmselection/FilmSelectionTabFragment.class */
@StabilityInferred(parameters = 0)
public final class FilmSelectionTabFragment extends BaseToolbarFragment implements IPvTracker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ViewPager f111167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public EmptyStateView f111168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public a f111169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public List<FilmSelectionPageTabVo> f111170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f111171f = "1";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/filmselection/FilmSelectionTabFragment$a.class */
    public final class a extends FragmentStatePagerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FilmSelectionTabFragment f111172a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FilmSelectionTabFragment filmSelectionTabFragment) {
            super(filmSelectionTabFragment.getChildFragmentManager());
            this.f111172a = filmSelectionTabFragment;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            List<FilmSelectionPageTabVo> list = this.f111172a.f111170e;
            return list != null ? list.size() : 0;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        @NotNull
        public final Fragment getItem(int i7) {
            Lazy lazy = LazyKt.lazy(new H0(9));
            FilmSelectionTabFragment filmSelectionTabFragment = this.f111172a;
            List<FilmSelectionPageTabVo> list = filmSelectionTabFragment.f111170e;
            FilmSelectionPageTabVo filmSelectionPageTabVo = list != null ? list.get(i7) : null;
            if (filmSelectionPageTabVo == null) {
                return (EmptyFragment) lazy.getValue();
            }
            FilmAllTypeFragment filmAllTypeFragment = new FilmAllTypeFragment();
            Bundle bundle = new Bundle();
            filmAllTypeFragment.setArguments(bundle);
            bundle.putString("type", filmSelectionTabFragment.f111171f);
            bundle.putParcelable("tab_data", filmSelectionPageTabVo);
            return filmAllTypeFragment;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(@NotNull Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @Nullable
        public final CharSequence getPageTitle(int i7) {
            FilmSelectionPageTabVo filmSelectionPageTabVo;
            List<FilmSelectionPageTabVo> list = this.f111172a.f111170e;
            return (list == null || (filmSelectionPageTabVo = list.get(i7)) == null) ? null : filmSelectionPageTabVo.getTitle();
        }
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "pgc.watch-together-select.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        return new Bundle();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        if (i7 != 18 || intent == null) {
            return;
        }
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            fragmentActivityP3.setResult(18, intent);
        }
        FragmentActivity fragmentActivityP32 = p3();
        if (fragmentActivityP32 != null) {
            fragmentActivityP32.finish();
        }
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f111171f = arguments.getString("type", "1");
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), 2131888041)).inflate(2131500506, viewGroup, false);
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        setTitle(getString(2131836294));
        this.f111168c = (EmptyStateView) view.findViewById(2131301025);
        ViewPager viewPager = (ViewPager) view.findViewById(2131305458);
        if (viewPager != null) {
            viewPager.setOffscreenPageLimit(3);
            a aVar = new a(this);
            this.f111169d = aVar;
            viewPager.setAdapter(aVar);
        } else {
            viewPager = null;
        }
        this.f111167b = viewPager;
        view.findViewById(2131308542).setupWithViewPager(this.f111167b);
        ViewPager viewPager2 = this.f111167b;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(0);
        }
        if (Intrinsics.areEqual(this.f111171f, "1") || Intrinsics.areEqual(this.f111171f, "4")) {
            TintToolbar mToolbar = getMToolbar();
            if (mToolbar != null) {
                mToolbar.setNavigationIcon(2131230780);
            }
            TintToolbar mToolbar2 = getMToolbar();
            if (mToolbar2 != null) {
                mToolbar2.setNavigationOnClickListener(new com.bilibili.lib.mod.d(1, this));
            }
        } else if (Intrinsics.areEqual(this.f111171f, "3")) {
            TintToolbar mToolbar3 = getMToolbar();
            if (mToolbar3 != null) {
                mToolbar3.setNavigationIcon(2131230782);
            }
            TintToolbar mToolbar4 = getMToolbar();
            if (mToolbar4 != null) {
                mToolbar4.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.tgwt.filmselection.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FilmSelectionTabFragment f111187a;

                    {
                        this.f111187a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        FilmSelectionTabFragment filmSelectionTabFragment = this.f111187a;
                        FragmentActivity fragmentActivityP3 = filmSelectionTabFragment.p3();
                        if (fragmentActivityP3 != null) {
                            fragmentActivityP3.setResult(18);
                        }
                        FragmentActivity fragmentActivityP32 = filmSelectionTabFragment.p3();
                        if (fragmentActivityP32 != null) {
                            fragmentActivityP32.finish();
                        }
                    }
                });
            }
        }
        ImageView imageView = (ImageView) view.findViewById(2131310872);
        Garb curGarb = GarbManager.getCurGarb();
        if (imageView != null) {
            ImageViewCompat.setImageTintList(imageView, curGarb.isPure() ? AppCompatResources.getColorStateList(requireContext(), 2131103911) : ColorStateList.valueOf(curGarb.getFontColor()));
        }
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.tgwt.filmselection.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FilmSelectionTabFragment f111188a;

            {
                this.f111188a = this;
            }

            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FilmSelectionTabFragment filmSelectionTabFragment = this.f111188a;
                String str = filmSelectionTabFragment.f111171f;
                int iHashCode = str.hashCode();
                if (iHashCode != 49) {
                    if (iHashCode != 51) {
                        if (iHashCode == 52 && str.equals("4")) {
                            BLRouter.routeTo$default(new RouteRequest.Builder("bilibili://pgc/theater/search").extras(new EL.m(1)).build(), (Context) null, 2, (Object) null);
                            return;
                        }
                    } else if (str.equals("3")) {
                        BLRouter.routeTo(new RouteRequest.Builder("bilibili://pgc/theater/search").requestCode(18).extras((Function1) new Object()).build(), filmSelectionTabFragment);
                        return;
                    }
                } else if (str.equals("1")) {
                    BLRouter.routeTo$default(new RouteRequest.Builder("bilibili://pgc/theater/search").extras((Function1) new Object()).build(), (Context) null, 2, (Object) null);
                    return;
                }
                com.bapis.bilibili.account.interfaces.v1.g.a(null, "bilibili://pgc/theater/search", 2, null);
            }
        });
        TintToolbar mToolbar5 = getMToolbar();
        if (mToolbar5 != null) {
            mToolbar5.setElevation(0.0f);
        }
        EmptyStateView emptyStateView = this.f111168c;
        if (emptyStateView != null) {
            int i7 = EmptyStateView.f73157k;
            emptyStateView.b(0, false);
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new FilmSelectionTabFragment$getTabs$1(this, null), 3, (Object) null);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z6) {
        super.setUserVisibleHint(z6);
        PageViewTracker.getInstance().setFragmentVisibility(this, z6);
    }
}
