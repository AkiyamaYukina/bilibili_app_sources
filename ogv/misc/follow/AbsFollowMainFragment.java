package com.bilibili.ogv.misc.follow;

import android.content.Context;
import android.content.Intent;
import android.graphics.ColorMatrix;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.bilibili.ad.adview.pegasus.banner.toplive.k;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.lib.ui.theme.ThemeWatcher;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.ogv.misc.follow.AbsFollowMainFragment;
import com.bilibili.ogv.misc.follow.FollowSubFragment;
import com.bilibili.ogvcommon.widget.DisableSlideViewPager;
import com.bilibili.pegasus.channelv3.feed.holder.b;
import com.google.android.material.appbar.AppBarLayout;
import hf0.C7436a;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pk0.C8309d;
import pk0.C8316k;
import pk0.C8317l;
import pk0.C8318m;
import pk0.C8331z;
import rk0.C8529a;
import sk0.C8596a;
import tv.danmaku.bili.widget.section.adapter.PageAdapter;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/AbsFollowMainFragment.class */
@StabilityInferred(parameters = 0)
public abstract class AbsFollowMainFragment extends BaseFragment implements View.OnClickListener, AppBarLayout.OnOffsetChangedListener, ThemeWatcher.Observer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public View f69000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TextView f69001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public TextView f69002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public TextView f69003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TextView f69004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public DisableSlideViewPager f69005g;

    @Nullable
    public ConstraintLayout h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public ImageView f69006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public View f69007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public TextView f69008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public TextView f69009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public PageAdapter f69010m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public String f69011n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f69012o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public C8318m f69013p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/AbsFollowMainFragment$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a implements PageAdapter.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f69014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f69015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final FollowSubFragment f69016c;

        public a(int i7, int i8, @NotNull FollowSubFragment followSubFragment) {
            this.f69014a = i7;
            this.f69015b = i8;
            this.f69016c = followSubFragment;
            Bundle bundle = new Bundle();
            bundle.putInt(NotificationCompat.CATEGORY_STATUS, i8);
            bundle.putInt("type", i7);
            followSubFragment.setArguments(bundle);
        }

        public final int getId() {
            return (this.f69014a * 10) + this.f69015b;
        }

        @NotNull
        public final PageAdapter.Page getPage() {
            return this.f69016c;
        }

        @NotNull
        public final CharSequence getTitle(@NotNull Context context) {
            return "";
        }
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [androidx.recyclerview.widget.RecyclerView$Adapter, qk0.c] */
    public final void jf() {
        SwipeRefreshLayout swipeRefreshLayout;
        ?? r02;
        TextView textView = this.f69004f;
        if (textView != null) {
            textView.setText(getString(2131821888));
        }
        TextView textView2 = this.f69004f;
        if (textView2 != null) {
            KProperty<Object> kProperty = C8309d.f125414a[1];
            textView2.setTag(C8309d.f125416c, "manager");
        }
        nf(false);
        FollowSubFragment followSubFragmentPf = pf();
        if (followSubFragmentPf != null && (r02 = followSubFragmentPf.f69088r) != 0) {
            r02.f126089o = false;
            r02.notifyDataSetChanged();
        }
        FollowSubFragment followSubFragmentPf2 = pf();
        if (followSubFragmentPf2 != null && (swipeRefreshLayout = followSubFragmentPf2.f64721b) != null) {
            swipeRefreshLayout.setEnabled(true);
        }
        ConstraintLayout constraintLayout = this.h;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(4);
        }
        ImageView imageView = this.f69006i;
        if (imageView != null) {
            imageView.setSelected(false);
        }
        FollowSubFragment followSubFragmentPf3 = pf();
        if (followSubFragmentPf3 != null) {
            followSubFragmentPf3.of(false);
        }
    }

    public final void kf(boolean z6) {
        if (z6) {
            TextView textView = this.f69004f;
            if (textView != null) {
                textView.setClickable(false);
            }
            TextView textView2 = this.f69004f;
            if (textView2 != null) {
                textView2.setAlpha(0.5f);
                return;
            }
            return;
        }
        TextView textView3 = this.f69004f;
        if (textView3 != null) {
            textView3.setClickable(true);
        }
        TextView textView4 = this.f69004f;
        if (textView4 != null) {
            textView4.setAlpha(1.0f);
        }
    }

    public final void lf(boolean z6) {
        if (z6) {
            TextView textView = this.f69008k;
            if (textView != null) {
                textView.setClickable(false);
            }
            TextView textView2 = this.f69009l;
            if (textView2 != null) {
                textView2.setClickable(false);
            }
            TextView textView3 = this.f69008k;
            if (textView3 != null) {
                textView3.setAlpha(0.5f);
            }
            TextView textView4 = this.f69009l;
            if (textView4 != null) {
                textView4.setAlpha(0.5f);
                return;
            }
            return;
        }
        TextView textView5 = this.f69008k;
        if (textView5 != null) {
            textView5.setClickable(true);
        }
        TextView textView6 = this.f69009l;
        if (textView6 != null) {
            textView6.setClickable(true);
        }
        TextView textView7 = this.f69008k;
        if (textView7 != null) {
            textView7.setAlpha(1.0f);
        }
        TextView textView8 = this.f69009l;
        if (textView8 != null) {
            textView8.setAlpha(1.0f);
        }
    }

    public final void mf(boolean z6) {
        if (z6) {
            View view = this.f69007j;
            if (view != null) {
                view.setClickable(false);
            }
            View view2 = this.f69007j;
            if (view2 != null) {
                view2.setAlpha(0.5f);
            }
            ImageView imageView = this.f69006i;
            if (imageView != null) {
                imageView.setBackgroundResource(2131231119);
                return;
            }
            return;
        }
        View view3 = this.f69007j;
        if (view3 != null) {
            view3.setClickable(true);
        }
        View view4 = this.f69007j;
        if (view4 != null) {
            view4.setAlpha(1.0f);
        }
        ImageView imageView2 = this.f69006i;
        if (imageView2 != null) {
            imageView2.setBackgroundResource(2131231106);
        }
    }

    public final void nf(boolean z6) {
        if (z6) {
            TextView textView = this.f69001c;
            if (textView != null) {
                textView.setAlpha(0.5f);
                textView.setClickable(false);
            }
            TextView textView2 = this.f69002d;
            if (textView2 != null) {
                textView2.setAlpha(0.5f);
                textView2.setClickable(false);
            }
            TextView textView3 = this.f69003e;
            if (textView3 != null) {
                textView3.setAlpha(0.5f);
                textView3.setClickable(false);
                return;
            }
            return;
        }
        TextView textView4 = this.f69001c;
        if (textView4 != null) {
            textView4.setAlpha(1.0f);
            textView4.setClickable(true);
        }
        TextView textView5 = this.f69002d;
        if (textView5 != null) {
            textView5.setAlpha(1.0f);
            textView5.setClickable(true);
        }
        TextView textView6 = this.f69003e;
        if (textView6 != null) {
            textView6.setAlpha(1.0f);
            textView6.setClickable(true);
        }
    }

    public final AppBarLayout of() {
        View view;
        View view2 = getView();
        do {
            if ((view2 != null ? view2.getParent() : null) == null) {
                return null;
            }
            Object parent = view2.getParent();
            view = parent instanceof View ? (View) parent : null;
            view2 = view;
        } while (!(view instanceof CoordinatorLayout));
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            if (viewGroup.getChildAt(i7) instanceof AppBarLayout) {
                return viewGroup.getChildAt(i7);
            }
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        PageAdapter pageAdapter;
        super.onActivityResult(i7, i8, intent);
        if (i7 != 1001 || (pageAdapter = this.f69010m) == null) {
            return;
        }
        int count = pageAdapter.getCount();
        for (int i9 = 0; i9 < count; i9++) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            PageAdapter pageAdapter2 = this.f69010m;
            Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag(PageAdapter.getTagName(2131316429, pageAdapter2 != null ? pageAdapter2.getPage(i9) : null));
            if (fragmentFindFragmentByTag instanceof FollowSubFragment) {
                FollowSubFragment followSubFragment = (FollowSubFragment) fragmentFindFragmentByTag;
                followSubFragment.f69083m = 1;
                followSubFragment.f69085o = false;
                followSubFragment.kf(false);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        String str;
        SparseBooleanArray sparseBooleanArray;
        MutableLiveData<Boolean> mutableLiveData;
        if (Intrinsics.areEqual(view, this.f69001c)) {
            rf(0);
            sf(0);
            return;
        }
        if (Intrinsics.areEqual(view, this.f69002d)) {
            rf(1);
            sf(1);
            return;
        }
        if (Intrinsics.areEqual(view, this.f69003e)) {
            rf(2);
            sf(2);
            return;
        }
        if (!Intrinsics.areEqual(view, this.f69004f)) {
            if (Intrinsics.areEqual(view, this.f69007j)) {
                ImageView imageView = this.f69006i;
                if (imageView != null) {
                    imageView.setSelected(true ^ imageView.isSelected());
                    FollowSubFragment followSubFragmentPf = pf();
                    if (followSubFragmentPf != null) {
                        followSubFragmentPf.of(imageView.isSelected());
                    }
                    ColorMatrix colorMatrix = C8596a.f127281a;
                    C8596a.a(imageView, Cj0.a.a(requireContext()));
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, this.f69008k)) {
                TextView textView = this.f69008k;
                Integer num = null;
                if (textView != null) {
                    KProperty<Object> kProperty = C8309d.f125414a[0];
                    num = (Integer) textView.getTag(C8309d.f125415b);
                }
                int iIntValue = num.intValue();
                FollowSubFragment followSubFragmentPf2 = pf();
                if (followSubFragmentPf2 != null) {
                    followSubFragmentPf2.qf(iIntValue, new b(this, 1));
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(view, this.f69009l)) {
                TextView textView2 = this.f69009l;
                Integer num2 = null;
                if (textView2 != null) {
                    KProperty<Object> kProperty2 = C8309d.f125414a[0];
                    num2 = (Integer) textView2.getTag(C8309d.f125415b);
                }
                int iIntValue2 = num2.intValue();
                FollowSubFragment followSubFragmentPf3 = pf();
                if (followSubFragmentPf3 != null) {
                    followSubFragmentPf3.qf(iIntValue2, new k(this, 4));
                    return;
                }
                return;
            }
            return;
        }
        TextView textView3 = this.f69004f;
        if (textView3 != null) {
            KProperty<Object> kProperty3 = C8309d.f125414a[1];
            str = (String) textView3.getTag(C8309d.f125416c);
        } else {
            str = null;
        }
        if (!Intrinsics.areEqual(str, "manager")) {
            jf();
            return;
        }
        kf(true);
        FollowSubFragment followSubFragmentPf4 = pf();
        if (followSubFragmentPf4 != null) {
            C8331z.a(followSubFragmentPf4.f69087q == 1 ? "pgc.my-bangumi.0.manage.click" : "pgc.my-favorite-cinema.0.manage.click", null, C8331z.b(followSubFragmentPf4.f69086p), null);
            C8318m c8318m = followSubFragmentPf4.f69089s;
            if (c8318m != null && (sparseBooleanArray = c8318m.f125442g) != null && sparseBooleanArray.get(followSubFragmentPf4.f69086p)) {
                C8318m c8318m2 = followSubFragmentPf4.f69089s;
                if (c8318m2 != null && (mutableLiveData = c8318m2.f125439d) != null) {
                    mutableLiveData.setValue(Boolean.TRUE);
                }
                followSubFragmentPf4.mf();
                return;
            }
            if (!ConnectivityMonitor.getInstance().isNetworkActive()) {
                ToastHelper.showToastShort(followSubFragmentPf4.getContext(), 2131832113);
                return;
            }
            C8318m c8318m3 = followSubFragmentPf4.f69089s;
            if (c8318m3 == null || !c8318m3.f125440e) {
                followSubFragmentPf4.pf(followSubFragmentPf4.getString(2131821909));
                C8318m c8318m4 = followSubFragmentPf4.f69089s;
                if (c8318m4 != null) {
                    int i7 = followSubFragmentPf4.f69086p;
                    int i8 = followSubFragmentPf4.f69087q;
                    c8318m4.f125440e = true;
                    C8529a c8529a = C8529a.f126681a;
                    c8318m4.f125443i.add(C8529a.a().getFollowMovableIds(com.bilibili.ogv.infra.account.a.f67852b.getAccessKey(), i7, i8).subscribe(new C8316k(c8318m4, i7), new C8317l(c8318m4, i7)));
                }
            }
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f69013p = (C8318m) new ViewModelProvider(this).get(C8318m.class);
        Bundle arguments = getArguments();
        this.f69011n = arguments != null ? arguments.getString("fav_sub_tab", "unknow") : null;
        C8318m c8318m = this.f69013p;
        if (c8318m != null) {
            Bundle arguments2 = getArguments();
            String string = null;
            if (arguments2 != null) {
                string = arguments2.getString("from_spmid");
            }
            c8318m.f125444j = string;
        }
        if (!Intrinsics.areEqual(this.f69011n, "unknow")) {
            String str = this.f69011n;
            int i7 = 1;
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode == 3649490) {
                    i7 = !str.equals("will") ? 1 : 0;
                } else if (iHashCode != 545156275) {
                    i7 = (iHashCode == 1125964206 && str.equals("watched")) ? 2 : 1;
                } else {
                    str.equals("watching");
                    i7 = 1;
                }
            }
            this.f69012o = i7;
        }
        ThemeWatcher.getInstance().subscribe(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131493136, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ThemeWatcher.getInstance().unSubscribe(this);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        AppBarLayout appBarLayoutOf = of();
        if (appBarLayoutOf != null) {
            appBarLayoutOf.removeOnOffsetChangedListener(this);
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentHide(@NotNull Flag flag) {
        super.onFragmentHide(flag);
        jf();
    }

    public final void onOffsetChanged(@NotNull AppBarLayout appBarLayout, int i7) {
        ConstraintLayout constraintLayout = this.h;
        if (constraintLayout != null) {
            constraintLayout.setTranslationY((-appBarLayout.getTotalScrollRange()) - i7);
        }
    }

    @Override // com.bilibili.lib.ui.theme.ThemeWatcher.Observer
    public final void onThemeChanged() {
        ConstraintLayout constraintLayout = this.h;
        if (constraintLayout != null) {
            constraintLayout.setBackgroundColor(ThemeUtils.getColorById(getContext(), R$color.f64616Wh0));
        }
        TextView textView = this.f69004f;
        if (textView != null) {
            textView.setTextColor(ThemeUtils.getColorById(getContext(), R$color.Ga8));
        }
        TextView textView2 = this.f69008k;
        if (textView2 != null) {
            textView2.setTextColor(ThemeUtils.getColorById(getContext(), R$color.Ga8));
        }
        TextView textView3 = this.f69009l;
        if (textView3 != null) {
            textView3.setTextColor(ThemeUtils.getColorById(getContext(), R$color.Ga8));
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        MutableLiveData<Pair<Integer, Integer>> mutableLiveData;
        MutableLiveData<Pair<Integer, Boolean>> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4;
        super.onViewCreated(view, bundle);
        C8318m c8318m = this.f69013p;
        if (c8318m != null && (mutableLiveData4 = c8318m.f125436a) != null) {
            mutableLiveData4.observe(getViewLifecycleOwner(), new C7436a(this, 1));
        }
        C8318m c8318m2 = this.f69013p;
        if (c8318m2 != null && (mutableLiveData3 = c8318m2.f125439d) != null) {
            mutableLiveData3.observe(getViewLifecycleOwner(), new Observer(this) { // from class: pk0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AbsFollowMainFragment f125410a;

                {
                    this.f125410a = this;
                }

                /* JADX WARN: Type inference failed for: r0v133, types: [androidx.recyclerview.widget.RecyclerView$Adapter, qk0.c] */
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SwipeRefreshLayout swipeRefreshLayout;
                    ?? r02;
                    boolean zAreEqual = Intrinsics.areEqual((Boolean) obj, Boolean.TRUE);
                    AbsFollowMainFragment absFollowMainFragment = this.f125410a;
                    if (!zAreEqual) {
                        absFollowMainFragment.kf(false);
                        return;
                    }
                    TextView textView = absFollowMainFragment.f69004f;
                    if (textView != null) {
                        textView.setText(absFollowMainFragment.getString(2131821758));
                    }
                    TextView textView2 = absFollowMainFragment.f69004f;
                    if (textView2 != null) {
                        KProperty<Object> kProperty = C8309d.f125414a[1];
                        textView2.setTag(C8309d.f125416c, "cancel");
                    }
                    absFollowMainFragment.nf(true);
                    FollowSubFragment followSubFragmentPf = absFollowMainFragment.pf();
                    if (followSubFragmentPf != null && (r02 = followSubFragmentPf.f69088r) != 0) {
                        r02.f126089o = true;
                        r02.notifyDataSetChanged();
                    }
                    FollowSubFragment followSubFragmentPf2 = absFollowMainFragment.pf();
                    if (followSubFragmentPf2 != null && (swipeRefreshLayout = followSubFragmentPf2.f64721b) != null) {
                        swipeRefreshLayout.setEnabled(false);
                    }
                    ConstraintLayout constraintLayout = absFollowMainFragment.h;
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(0);
                    }
                    DisableSlideViewPager disableSlideViewPager = absFollowMainFragment.f69005g;
                    Integer numValueOf = disableSlideViewPager != null ? Integer.valueOf(disableSlideViewPager.getCurrentItem()) : null;
                    if (numValueOf != null && numValueOf.intValue() == 0) {
                        TextView textView3 = absFollowMainFragment.f69008k;
                        if (textView3 != null) {
                            Context context = absFollowMainFragment.getContext();
                            textView3.setText(context != null ? context.getString(2131821913) : null);
                        }
                        TextView textView4 = absFollowMainFragment.f69008k;
                        if (textView4 != null) {
                            C8309d.a(textView4, 2);
                        }
                        TextView textView5 = absFollowMainFragment.f69009l;
                        if (textView5 != null) {
                            Context context2 = absFollowMainFragment.getContext();
                            String string = null;
                            if (context2 != null) {
                                string = context2.getString(2131821912);
                            }
                            textView5.setText(string);
                        }
                        TextView textView6 = absFollowMainFragment.f69009l;
                        if (textView6 != null) {
                            C8309d.a(textView6, 3);
                        }
                    } else if (numValueOf != null && numValueOf.intValue() == 1) {
                        TextView textView7 = absFollowMainFragment.f69008k;
                        if (textView7 != null) {
                            Context context3 = absFollowMainFragment.getContext();
                            textView7.setText(context3 != null ? context3.getString(2131821911) : null);
                        }
                        TextView textView8 = absFollowMainFragment.f69008k;
                        if (textView8 != null) {
                            C8309d.a(textView8, 1);
                        }
                        TextView textView9 = absFollowMainFragment.f69009l;
                        if (textView9 != null) {
                            Context context4 = absFollowMainFragment.getContext();
                            String string2 = null;
                            if (context4 != null) {
                                string2 = context4.getString(2131821912);
                            }
                            textView9.setText(string2);
                        }
                        TextView textView10 = absFollowMainFragment.f69009l;
                        if (textView10 != null) {
                            C8309d.a(textView10, 3);
                        }
                    } else if (numValueOf != null && numValueOf.intValue() == 2) {
                        TextView textView11 = absFollowMainFragment.f69008k;
                        if (textView11 != null) {
                            Context context5 = absFollowMainFragment.getContext();
                            textView11.setText(context5 != null ? context5.getString(2131821911) : null);
                        }
                        TextView textView12 = absFollowMainFragment.f69008k;
                        if (textView12 != null) {
                            C8309d.a(textView12, 1);
                        }
                        TextView textView13 = absFollowMainFragment.f69009l;
                        if (textView13 != null) {
                            Context context6 = absFollowMainFragment.getContext();
                            String string3 = null;
                            if (context6 != null) {
                                string3 = context6.getString(2131821913);
                            }
                            textView13.setText(string3);
                        }
                        TextView textView14 = absFollowMainFragment.f69009l;
                        if (textView14 != null) {
                            C8309d.a(textView14, 2);
                        }
                    }
                    absFollowMainFragment.kf(false);
                }
            });
        }
        C8318m c8318m3 = this.f69013p;
        if (c8318m3 != null && (mutableLiveData2 = c8318m3.f125437b) != null) {
            final int i7 = 0;
            mutableLiveData2.observe(getViewLifecycleOwner(), new Observer(i7, this) { // from class: pk0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f125411a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final LifecycleOwner f125412b;

                {
                    this.f125411a = i7;
                    this.f125412b = this;
                }

                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    TextView textView;
                    switch (this.f125411a) {
                        case 0:
                            Pair pair = (Pair) obj;
                            if (pair != null) {
                                int iIntValue = ((Number) pair.getFirst()).intValue();
                                AbsFollowMainFragment absFollowMainFragment = (AbsFollowMainFragment) this.f125412b;
                                int i8 = absFollowMainFragment.f69012o;
                                int i9 = 1;
                                if (i8 != 0) {
                                    i9 = (i8 == 1 || i8 != 2) ? 2 : 3;
                                }
                                if (iIntValue == i9 && (textView = absFollowMainFragment.f69004f) != null) {
                                    textView.setClickable(((Boolean) pair.getSecond()).booleanValue());
                                    textView.setAlpha(((Boolean) pair.getSecond()).booleanValue() ? 1.0f : 0.5f);
                                    break;
                                }
                            }
                            break;
                        default:
                            this.f125412b.L();
                            break;
                    }
                }
            });
        }
        C8318m c8318m4 = this.f69013p;
        if (c8318m4 != null && (mutableLiveData = c8318m4.f125438c) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new Observer(this) { // from class: pk0.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AbsFollowMainFragment f125413a;

                {
                    this.f125413a = this;
                }

                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Pair pair = (Pair) obj;
                    if (pair != null) {
                        int iIntValue = ((Number) pair.getSecond()).intValue();
                        AbsFollowMainFragment absFollowMainFragment = this.f125413a;
                        if (iIntValue == 0) {
                            absFollowMainFragment.lf(true);
                            absFollowMainFragment.mf(true);
                        } else if (((Number) pair.getFirst()).intValue() == 0) {
                            absFollowMainFragment.lf(true);
                            absFollowMainFragment.mf(false);
                        } else {
                            absFollowMainFragment.lf(false);
                            absFollowMainFragment.mf(false);
                        }
                    }
                }
            });
        }
        this.f69000b = view.findViewById(2131316292);
        this.f69001c = (TextView) view.findViewById(2131315552);
        this.f69002d = (TextView) view.findViewById(2131315557);
        this.f69003e = (TextView) view.findViewById(2131315189);
        this.f69004f = (TextView) view.findViewById(2131314792);
        this.f69005g = (DisableSlideViewPager) view.findViewById(2131316429);
        this.h = (ConstraintLayout) view.findViewById(2131304871);
        this.f69006i = (ImageView) view.findViewById(2131298553);
        this.f69007j = view.findViewById(2131305720);
        this.f69008k = (TextView) view.findViewById(2131314990);
        this.f69009l = (TextView) view.findViewById(2131314991);
        AppBarLayout appBarLayoutOf = of();
        if (appBarLayoutOf != null) {
            appBarLayoutOf.addOnOffsetChangedListener(this);
        }
        this.f69010m = new PageAdapter(p3(), getChildFragmentManager());
        qf();
        DisableSlideViewPager disableSlideViewPager = this.f69005g;
        if (disableSlideViewPager != null) {
            disableSlideViewPager.setOffscreenPageLimit(2);
        }
        DisableSlideViewPager disableSlideViewPager2 = this.f69005g;
        if (disableSlideViewPager2 != null) {
            disableSlideViewPager2.setAdapter(this.f69010m);
        }
        sf(this.f69012o);
        TextView textView = this.f69001c;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = this.f69002d;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        TextView textView3 = this.f69003e;
        if (textView3 != null) {
            textView3.setOnClickListener(this);
        }
        TextView textView4 = this.f69004f;
        if (textView4 != null) {
            textView4.setOnClickListener(this);
        }
        TextView textView5 = this.f69008k;
        if (textView5 != null) {
            textView5.setOnClickListener(this);
        }
        TextView textView6 = this.f69009l;
        if (textView6 != null) {
            textView6.setOnClickListener(this);
        }
        TextView textView7 = this.f69004f;
        if (textView7 != null) {
            KProperty<Object> kProperty = C8309d.f125414a[1];
            textView7.setTag(C8309d.f125416c, "manager");
        }
        View view2 = this.f69007j;
        if (view2 != null) {
            view2.setOnClickListener(this);
        }
    }

    @Nullable
    public final FollowSubFragment pf() {
        DisableSlideViewPager disableSlideViewPager = this.f69005g;
        if (disableSlideViewPager == null || disableSlideViewPager.getContext() == null) {
            return null;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        PageAdapter pageAdapter = this.f69010m;
        Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag(PageAdapter.getTagName(2131316429, pageAdapter != null ? pageAdapter.getPage(disableSlideViewPager.getCurrentItem()) : null));
        if (fragmentFindFragmentByTag instanceof FollowSubFragment) {
            return (FollowSubFragment) fragmentFindFragmentByTag;
        }
        return null;
    }

    public abstract void qf();

    public abstract void rf(int i7);

    public final void sf(int i7) {
        String str;
        this.f69012o = i7;
        if (i7 != 0) {
            str = "watching";
            if (i7 != 1) {
                str = i7 != 2 ? "watching" : "watched";
            }
        } else {
            str = "will";
        }
        this.f69011n = str;
        DisableSlideViewPager disableSlideViewPager = this.f69005g;
        if (disableSlideViewPager != null) {
            disableSlideViewPager.setCurrentItem(i7);
        }
        TextView textView = this.f69001c;
        if (textView != null) {
            textView.setSelected(i7 == 0);
        }
        TextView textView2 = this.f69002d;
        if (textView2 != null) {
            textView2.setSelected(i7 == 1);
        }
        TextView textView3 = this.f69003e;
        if (textView3 != null) {
            textView3.setSelected(i7 == 2);
        }
    }
}
