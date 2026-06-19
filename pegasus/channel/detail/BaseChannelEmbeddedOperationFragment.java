package com.bilibili.pegasus.channel.detail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.comm.list.common.channel.detail.IChannelDetailPage;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.pegasus.channel.detail.BaseChannelEmbeddedOperationFragment;
import com.bilibili.pegasus.promo.operation.BaseOperationFragment;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/detail/BaseChannelEmbeddedOperationFragment.class */
@StabilityInferred(parameters = 0)
public abstract class BaseChannelEmbeddedOperationFragment extends BaseOperationFragment implements IChannelDetailPage {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final KProperty<Object>[] f74827T = {new MutablePropertyReference1Impl(BaseChannelEmbeddedOperationFragment.class, "publishButton", "getPublishButton()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f74830Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f74831R;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.comm.list.common.widget.a f74828O = new com.bilibili.app.comm.list.common.widget.a(jf());

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @NotNull
    public final Nn0.a f74829P = new AppBarLayout.OnOffsetChangedListener(this) { // from class: Nn0.a

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BaseChannelEmbeddedOperationFragment f17304a;

        {
            this.f17304a = this;
        }

        public final void onOffsetChanged(AppBarLayout appBarLayout, int i7) {
            KProperty<Object>[] kPropertyArr = BaseChannelEmbeddedOperationFragment.f74827T;
            BaseChannelEmbeddedOperationFragment baseChannelEmbeddedOperationFragment = this.f17304a;
            baseChannelEmbeddedOperationFragment.f74831R = i7;
            View viewJf = baseChannelEmbeddedOperationFragment.Jf();
            if (viewJf != null) {
                viewJf.setTranslationY((-i7) - baseChannelEmbeddedOperationFragment.f74830Q);
            }
        }
    };

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @NotNull
    public String f74832S = "";

    @Nullable
    public final View Jf() {
        com.bilibili.app.comm.list.common.widget.a aVar = this.f74828O;
        KProperty<Object> kProperty = f74827T[0];
        return (View) aVar.b;
    }

    public final void Kf(boolean z6) {
        if (z6) {
            View viewJf = Jf();
            if (viewJf != null) {
                viewJf.setVisibility(0);
                return;
            }
            return;
        }
        View viewJf2 = Jf();
        if (viewJf2 != null) {
            viewJf2.setVisibility(8);
        }
    }

    @NotNull
    public final Fragment getFragment() {
        return this;
    }

    @NotNull
    public final String getPageId() {
        return this.f74832S;
    }

    @Override // com.bilibili.pegasus.promo.operation.BaseOperationFragment, androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131495230, viewGroup, false);
    }

    @Override // com.bilibili.pegasus.promo.operation.BaseOperationFragment, com.bilibili.pegasus.promo.BasePromoFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AppBarLayout appBarLayoutFindViewById;
        Window window;
        FragmentActivity fragmentActivityP3 = p3();
        View decorView = (fragmentActivityP3 == null || (window = fragmentActivityP3.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null && (appBarLayoutFindViewById = decorView.findViewById(2131296646)) != null) {
            appBarLayoutFindViewById.removeOnOffsetChangedListener(this.f74829P);
        }
        super.onDestroyView();
    }

    public final void onDetailRefresh() {
        ListExtentionsKt.smoothScrollToTop(getMRecyclerView());
        onRefresh();
    }

    @Override // com.bilibili.pegasus.promo.operation.BaseOperationFragment, com.bilibili.pegasus.promo.BasePromoFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        AppBarLayout appBarLayoutFindViewById;
        Window window;
        super.onViewCreated(view, bundle);
        this.f74828O.a(view.findViewById(2131309659), f74827T[0]);
        FragmentActivity fragmentActivityP3 = p3();
        View decorView = (fragmentActivityP3 == null || (window = fragmentActivityP3.getWindow()) == null) ? null : window.getDecorView();
        if (decorView == null || (appBarLayoutFindViewById = decorView.findViewById(2131296646)) == null) {
            return;
        }
        appBarLayoutFindViewById.addOnOffsetChangedListener(this.f74829P);
    }

    public final void setInitOffset(int i7) {
        this.f74830Q = i7;
        this.f74831R = this.f74831R;
        View viewJf = Jf();
        if (viewJf != null) {
            viewJf.setTranslationY((-r0) - this.f74830Q);
        }
    }

    public final void setPageId(@NotNull String str) {
        this.f74832S = str;
    }

    public final void setRefreshCallback(@NotNull Fh.a aVar) {
    }
}
