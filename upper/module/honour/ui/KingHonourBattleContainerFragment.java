package com.bilibili.upper.module.honour.ui;

import Jf1.h;
import TE0.b;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bilibili.app.comm.aphro.preview.page.g;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.upper.module.honour.ui.KingHonourBattleContainerFragment;
import com.bilibili.upper.widget.NoScrollViewPager;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tw0.f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/ui/KingHonourBattleContainerFragment.class */
@StabilityInferred(parameters = 0)
public final class KingHonourBattleContainerFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f113239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NoScrollViewPager f113240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f113241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f113242e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/ui/KingHonourBattleContainerFragment$a.class */
    public static final class a extends GI0.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KingHonourBattleContainerFragment f113243b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KingHonourBattleContainerFragment kingHonourBattleContainerFragment, FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            this.f113243b = kingHonourBattleContainerFragment;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            String[] strArr = this.f113243b.f113242e;
            String[] strArr2 = strArr;
            if (strArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titles");
                strArr2 = null;
            }
            return strArr2.length;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public final Fragment getItem(int i7) {
            int i8 = i7 == 0 ? 1 : 2;
            boolean z6 = this.f113243b.f113241d;
            Bundle bundle = new Bundle();
            bundle.putInt("king_honour_battle_tab_type", i8);
            bundle.putBoolean("king_honour_user_is_grant", z6);
            bundle.putInt("king_honour_battle_container", 2);
            KingHonourRecentBattleFragment kingHonourRecentBattleFragment = new KingHonourRecentBattleFragment();
            kingHonourRecentBattleFragment.setArguments(bundle);
            return kingHonourRecentBattleFragment;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i7) {
            String[] strArr = this.f113243b.f113242e;
            String[] strArr2 = strArr;
            if (strArr == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titles");
                strArr2 = null;
            }
            return strArr2[i7];
        }
    }

    public static void jf(TextView textView, boolean z6) {
        textView.setSelected(z6);
        if (textView.isSelected()) {
            kf(textView, Color.parseColor("#484C53"), -1);
            textView.setTextColor(-1);
            textView.setTextSize(0, h.c(12));
        } else {
            kf(textView, 0, Color.parseColor("#9499A0"));
            textView.setTextColor(Color.parseColor("#9499A0"));
            textView.setTextSize(0, h.c(12));
        }
    }

    public static void kf(TextView textView, int i7, int i8) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(h.c(100));
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(h.b(0.5f), i8);
        gradientDrawable.setColor(i7);
        textView.setBackground(gradientDrawable);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f113242e = new String[]{getString(2131851203), getString(2131851244)};
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setId(View.generateViewId());
        NoScrollViewPager noScrollViewPager = new NoScrollViewPager(layoutInflater.getContext());
        noScrollViewPager.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        noScrollViewPager.setScrollble(true);
        noScrollViewPager.f114400b = true;
        noScrollViewPager.setId(View.generateViewId());
        this.f113240c = noScrollViewPager;
        final LinearLayout linearLayout2 = new LinearLayout(layoutInflater.getContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.leftMargin = h.c(12);
        linearLayout2.setLayoutParams(marginLayoutParams);
        linearLayout2.setOrientation(0);
        String[] strArr = this.f113242e;
        String[] strArr2 = strArr;
        if (strArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titles");
            strArr2 = null;
        }
        int length = strArr2.length;
        int i7 = 0;
        while (i7 < length) {
            String[] strArr3 = this.f113242e;
            String[] strArr4 = strArr3;
            if (strArr3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titles");
                strArr4 = null;
            }
            String str = strArr4[i7];
            final g gVar = new g(this, 3);
            final TextView textView = new TextView(linearLayout2.getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams2.rightMargin = h.c(8);
            textView.setLayoutParams(marginLayoutParams2);
            textView.setGravity(17);
            textView.setText(str);
            textView.setId(View.generateViewId());
            int iC = h.c(8);
            int iC2 = h.c(2);
            textView.setPadding(iC, iC2, iC, iC2);
            jf(textView, i7 == 0);
            final int i8 = i7;
            textView.setOnClickListener(new View.OnClickListener(this, textView, linearLayout2, gVar, i8) { // from class: dI0.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final KingHonourBattleContainerFragment f116394a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final TextView f116395b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final ViewGroup f116396c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final com.bilibili.app.comm.aphro.preview.page.g f116397d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f116398e;

                {
                    this.f116394a = this;
                    this.f116395b = textView;
                    this.f116396c = linearLayout2;
                    this.f116397d = gVar;
                    this.f116398e = i8;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KingHonourBattleContainerFragment kingHonourBattleContainerFragment = this.f116394a;
                    TextView textView2 = this.f116395b;
                    ViewGroup viewGroup2 = this.f116396c;
                    com.bilibili.app.comm.aphro.preview.page.g gVar2 = this.f116397d;
                    int i9 = this.f116398e;
                    if (view.isSelected()) {
                        return;
                    }
                    TextView textView3 = (TextView) view;
                    boolean zIsSelected = textView2.isSelected();
                    kingHonourBattleContainerFragment.getClass();
                    KingHonourBattleContainerFragment.jf(textView3, !zIsSelected);
                    int childCount = viewGroup2.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        if (!Intrinsics.areEqual(viewGroup2.getChildAt(i10), textView3)) {
                            KingHonourBattleContainerFragment.jf((TextView) viewGroup2.getChildAt(i10), false);
                        }
                    }
                    gVar2.invoke(Integer.valueOf(i9));
                }
            });
            linearLayout2.addView(textView);
            i7++;
        }
        linearLayout2.setId(View.generateViewId());
        this.f113239b = linearLayout2;
        linearLayout.addView(linearLayout2);
        View view = this.f113240c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            view = null;
        }
        linearLayout.addView(view);
        return linearLayout;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        super.onFragmentShow(flag);
        String[] strArr = this.f113242e;
        String[] strArr2 = strArr;
        if (strArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titles");
            strArr2 = null;
        }
        for (String str : strArr2) {
            f fVar = f.f127691a;
            Map mapA = fA0.h.a();
            HashMap map = (HashMap) mapA;
            map.put("game", "王者荣耀");
            map.put("tab", "云端素材");
            map.put("tag", str);
            Unit unit = Unit.INSTANCE;
            f.e("creation.game-cut.material.tab.show", mapA);
        }
        b.f24088a.getClass();
        b.h0(true);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        int i7 = 0;
        this.f113241d = arguments != null ? arguments.getBoolean("king_honour_user_is_grant", false) : false;
        NoScrollViewPager noScrollViewPager = this.f113240c;
        NoScrollViewPager noScrollViewPager2 = noScrollViewPager;
        if (noScrollViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
            noScrollViewPager2 = null;
        }
        noScrollViewPager2.setAdapter(new a(this, getChildFragmentManager()));
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            String string = arguments2.getString("default_game_mode", "");
            if (string != null) {
                if (string.length() <= 0) {
                    string = null;
                }
                if (string != null) {
                    String[] strArr = this.f113242e;
                    String[] strArr2 = strArr;
                    if (strArr == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("titles");
                        strArr2 = null;
                    }
                    int length = strArr2.length;
                    while (true) {
                        if (i7 >= length) {
                            i7 = -1;
                            break;
                        } else if (Intrinsics.areEqual(strArr2[i7], string)) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    Integer numValueOf = Integer.valueOf(i7);
                    if (i7 == -1) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        final int iIntValue = numValueOf.intValue();
                        LinearLayout linearLayout = this.f113239b;
                        if (linearLayout == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("tabLayout");
                            linearLayout = null;
                        }
                        linearLayout.post(new Runnable(iIntValue, this) { // from class: dI0.f

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final int f116392a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final KingHonourBattleContainerFragment f116393b;

                            {
                                this.f116392a = iIntValue;
                                this.f116393b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i8 = this.f116392a;
                                KingHonourBattleContainerFragment kingHonourBattleContainerFragment = this.f116393b;
                                LinearLayout linearLayout2 = kingHonourBattleContainerFragment.f113239b;
                                LinearLayout linearLayout3 = linearLayout2;
                                if (linearLayout2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("tabLayout");
                                    linearLayout3 = null;
                                }
                                if (i8 < linearLayout3.getChildCount()) {
                                    LinearLayout linearLayout4 = kingHonourBattleContainerFragment.f113239b;
                                    if (linearLayout4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("tabLayout");
                                        linearLayout4 = null;
                                    }
                                    View childAt = linearLayout4.getChildAt(i8);
                                    if (childAt != null) {
                                        childAt.performClick();
                                    }
                                }
                            }
                        });
                    }
                }
            }
        }
    }
}
