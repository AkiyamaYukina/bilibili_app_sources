package com.bilibili.upper.module.uppercenterlocal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bilibili.common.hilowebview.view.HiloWebView;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbWatcher;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.upper.module.uppercenterlocal.UpperCenterLocalDelegate$hiloContainerServer$1$interceptPopGesture$2;
import com.bilibili.upper.module.uppercenterlocal.vm.UpperCenterLocalViewModel;
import eJ0.r;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/UpperCenterLocalContainerFragment.class */
@StabilityInferred(parameters = 0)
public final class UpperCenterLocalContainerFragment extends BaseFragment implements d, GarbWatcher.Observer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public UpperCenterLocalViewModel f114222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f114223c = LazyKt.lazy(new EV.e(this, 9));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public HiloWebView f114224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public FrameLayout f114225e;

    @Override // com.bilibili.upper.module.uppercenterlocal.d
    @Nullable
    public final UpperCenterLocalViewModel H5() {
        return this.f114222b;
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.d
    @Nullable
    public final HiloWebView Qa() {
        return this.f114224d;
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.d
    @NotNull
    public final LifecycleCoroutineScope V3() {
        return LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner());
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.d
    public final void X3() {
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            fragmentActivityP3.finish();
        }
    }

    public final void jf() {
        Context context;
        FrameLayout frameLayout = this.f114225e;
        if (frameLayout == null || (context = getContext()) == null) {
            return;
        }
        HiloWebView hiloWebView = new HiloWebView(context, (AttributeSet) null, 14);
        hiloWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f114224d = hiloWebView;
        frameLayout.addView(hiloWebView);
        kf().b();
        kf().e();
        kf().getClass();
        UpperCenterLocalDelegate.d();
        UpperCenterLocalDelegate upperCenterLocalDelegateKf = kf();
        BuildersKt.launch$default(upperCenterLocalDelegateKf.f114226a.V3(), (CoroutineContext) null, (CoroutineStart) null, new UpperCenterLocalDelegate$loadH5$1(upperCenterLocalDelegateKf, null), 3, (Object) null);
    }

    public final UpperCenterLocalDelegate kf() {
        return (UpperCenterLocalDelegate) this.f114223c.getValue();
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.d
    public final boolean lc() {
        Bundle arguments = getArguments();
        return arguments != null ? arguments.getBoolean("isEmbedded") : false;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.f114222b = (UpperCenterLocalViewModel) new ViewModelProvider(requireActivity()).get(UpperCenterLocalViewModel.class);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131503011, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        GarbWatcher.INSTANCE.unSubscribe(this);
        kf().f();
        Lazy<r> lazy = r.f117287g;
        r.a.a().i();
        super.onDestroyView();
        HiloWebView hiloWebView = this.f114224d;
        if (hiloWebView != null) {
            hiloWebView.f();
        }
        FrameLayout frameLayout = this.f114225e;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f114224d = null;
        this.f114225e = null;
    }

    @Override // com.bilibili.lib.ui.garb.GarbWatcher.Observer
    public final void onSkinChange(@NotNull Garb garb) {
        if (lc()) {
            HiloWebView hiloWebView = this.f114224d;
            if (hiloWebView != null) {
                hiloWebView.f();
            }
            FrameLayout frameLayout = this.f114225e;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            this.f114224d = null;
            jf();
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f114225e = (FrameLayout) view.findViewById(2131316578);
        GarbWatcher.INSTANCE.subscribe(this);
        if (!lc() && GA0.b.a(requireContext())) {
            FragmentActivity fragmentActivityP3 = p3();
            if (fragmentActivityP3 != null) {
                fragmentActivityP3.finish();
                return;
            }
            return;
        }
        if (!lc()) {
            Bundle arguments = getArguments();
            Bundle bundle2 = arguments != null ? arguments.getBundle("param_control") : null;
            Uri uri = bundle2 != null ? (Uri) bundle2.getParcelable("arg_uri") : null;
            if (uri != null && Intrinsics.areEqual("/audios", uri.getFragment())) {
                BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/manuscript-list/")).extras(new com.bilibili.ship.theseus.cheese.biz.bottomcontainer.b(1)).build(), requireContext());
                FragmentActivity fragmentActivityP32 = p3();
                if (fragmentActivityP32 != null) {
                    fragmentActivityP32.finish();
                    return;
                }
                return;
            }
        }
        if (!lc()) {
            FragmentActivity fragmentActivityP33 = p3();
            Window window = null;
            if (fragmentActivityP33 != null) {
                window = fragmentActivityP33.getWindow();
            }
            if (window != null) {
                window.clearFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
                if (MultipleThemeUtils.isWhiteTheme(window.getContext())) {
                    window.getDecorView().setSystemUiVisibility(9216);
                } else {
                    window.getDecorView().setSystemUiVisibility(1280);
                }
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(0);
            }
        }
        Lazy<r> lazy = r.f117287g;
        r.a.a().g();
        kf().f114229d = System.currentTimeMillis();
        jf();
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.d
    public final void sc(@NotNull UpperCenterLocalDelegate$hiloContainerServer$1$interceptPopGesture$2.a aVar) {
        if (p3() == null) {
            return;
        }
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), aVar);
    }
}
