package com.bilibili.pegasus.channelv2.base;

import NL.h;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.theme.ThemeWatcher;
import com.bilibili.magicasakura.utils.ThemeUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.swiperefresh.TintSwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/base/BaseButtonSwipeRefreshFragment.class */
@StabilityInferred(parameters = 0)
public abstract class BaseButtonSwipeRefreshFragment extends BaseLifecycleFragment implements SwipeRefreshLayout.OnRefreshListener, ThemeWatcher.Observer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f74973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BiliImageView f74974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f74975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TintSwipeRefreshLayout f74976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f74977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f74978g;
    public TextView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public h f74979i;

    @NotNull
    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.f74977f;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        return null;
    }

    public final void jf() {
        View view;
        h hVar = this.f74979i;
        if (hVar != null && (view = getView()) != null) {
            view.removeCallbacks(hVar);
        }
        this.f74979i = null;
    }

    @NotNull
    public final View kf() {
        View view = this.f74973b;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loadingView");
        return null;
    }

    public final void lf(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @DrawableRes int i7) {
        jf();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kf().getLayoutParams();
        layoutParams.gravity = 17;
        layoutParams.topMargin = 0;
        if (!TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f74975d;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadingText");
                textView = null;
            }
            textView.setText(charSequence);
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView textView2 = this.f74978g;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("errorButton");
                textView2 = null;
            }
            textView2.setText(charSequence2);
        }
        if (i7 != 0) {
            BiliImageView biliImageView = this.f74974c;
            if (biliImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadingImg");
                biliImageView = null;
            }
            biliImageView.setImageResource(i7);
        }
        kf().setVisibility(0);
        TextView textView3 = this.f74975d;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingText");
            textView3 = null;
        }
        textView3.setVisibility(0);
        TextView textView4 = this.f74978g;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorButton");
            textView4 = null;
        }
        textView4.setVisibility(0);
        TextView textView5 = this.h;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorText");
            textView5 = null;
        }
        textView5.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131495426, viewGroup, false);
    }

    @Override // com.bilibili.pegasus.channelv2.base.BaseLifecycleFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ThemeWatcher.getInstance().unSubscribe(this);
    }

    @Override // com.bilibili.lib.ui.theme.ThemeWatcher.Observer
    public final void onThemeChanged() {
        Context context = getContext();
        if (context != null) {
            getRecyclerView().setBackgroundColor(ThemeUtils.getColorById(context, R$color.f64616Wh0));
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f74977f = (RecyclerView) view.findViewById(2131306580);
        this.f74973b = view.findViewById(2131312069);
        this.f74974c = view.findViewById(2131312079);
        this.f74975d = (TextView) view.findViewById(2131308141);
        TintSwipeRefreshLayout tintSwipeRefreshLayoutFindViewById = view.findViewById(2131312764);
        this.f74976e = tintSwipeRefreshLayoutFindViewById;
        if (tintSwipeRefreshLayoutFindViewById == null) {
            Intrinsics.throwUninitializedPropertyAccessException("swipeRefreshLayout");
            tintSwipeRefreshLayoutFindViewById = null;
        }
        tintSwipeRefreshLayoutFindViewById.setOnRefreshListener(this);
        this.f74978g = (TextView) view.findViewById(2131301174);
        this.h = (TextView) view.findViewById(2131301181);
        TintSwipeRefreshLayout tintSwipeRefreshLayout = this.f74976e;
        if (tintSwipeRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("swipeRefreshLayout");
            tintSwipeRefreshLayout = null;
        }
        tintSwipeRefreshLayout.setColorSchemeResources(new int[]{2131103271});
        onThemeChanged();
        ThemeWatcher.getInstance().subscribe(this);
        onThemeChanged();
    }
}
