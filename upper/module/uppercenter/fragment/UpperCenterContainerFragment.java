package com.bilibili.upper.module.uppercenter.fragment;

import QE0.e;
import U81.f;
import U81.j;
import Xz0.j;
import YI0.b;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import bolts.Task;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbWatcher;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.lib.videoupload.speeddetect.UploadLineSpeedDetect;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.upper.module.uppercenter.model.UpperCenterViewModel;
import eJ0.r;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qw0.C8488a;
import rw0.C8554a;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/fragment/UpperCenterContainerFragment.class */
@StabilityInferred(parameters = 0)
public final class UpperCenterContainerFragment extends BaseFragment implements GarbWatcher.Observer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public UpperCenterViewModel f114086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ActivityResultLauncher<RouteRequest> f114087c = registerForActivityResult(new ActivityResultContract(), new b(this));

    public final boolean lc() {
        Bundle arguments = getArguments();
        return arguments != null ? arguments.getBoolean("isEmbedded") : false;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onAttach(@NotNull Context context) {
        super.onAttach(context);
        BLog.e("UpperCenterContainerFragment", "onAttach, object=" + this);
        this.f114086b = (UpperCenterViewModel) new ViewModelProvider(requireActivity()).get(UpperCenterViewModel.class);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setId(View.generateViewId());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        BLog.e("UpperCenterContainerFragment", "onDestroyView, object=" + this);
        GarbWatcher.INSTANCE.unSubscribe(this);
        super.onDestroyView();
        Lazy<r> lazy = r.f117287g;
        if (r.a.b()) {
            r.a.a().i();
        }
        j.d("first_entrance");
        Lazy<C8488a> lazy2 = C8488a.f126360e;
        C8488a.C1345a.a().b();
    }

    @Override // com.bilibili.lib.ui.garb.GarbWatcher.Observer
    public final void onSkinChange(@NotNull Garb garb) {
        View view;
        if (!lc() || (view = getView()) == null) {
            return;
        }
        int id = view.getId();
        UpperCenterMainFragmentV4 upperCenterMainFragmentV4 = new UpperCenterMainFragmentV4();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isEmbedded", lc());
        upperCenterMainFragmentV4.setArguments(bundle);
        getChildFragmentManager().beginTransaction().replace(id, upperCenterMainFragmentV4, "UpperCenterMainFragmentV4").commitAllowingStateLoss();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
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
            FragmentActivity fragmentActivityP32 = p3();
            Window window = fragmentActivityP32 != null ? fragmentActivityP32.getWindow() : null;
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
        Bundle arguments = getArguments();
        Bundle bundle2 = arguments != null ? arguments.getBundle("param_control") : null;
        Uri uri = bundle2 != null ? (Uri) bundle2.getParcelable("arg_uri") : null;
        if (!lc() && uri != null && Intrinsics.areEqual("/audios", uri.getFragment())) {
            final int i7 = 0;
            BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/manuscript-list/")).extras(new Function1(i7) { // from class: YI0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f28681a;

                {
                    this.f28681a = i7;
                }

                public final Object invoke(Object obj) {
                    switch (this.f28681a) {
                        case 0:
                            Bundle bundle3 = new Bundle();
                            bundle3.putInt("SELECT_TAB", 2);
                            ((MutableBundleLike) obj).put("param_control", bundle3);
                            return Unit.INSTANCE;
                        default:
                            j.a aVarC = U81.q.c((U81.p) obj);
                            return Boolean.valueOf((aVarC instanceof j.a) && (aVarC.d instanceof f.c));
                    }
                }
            }).build(), requireContext());
            FragmentActivity fragmentActivityP33 = p3();
            if (fragmentActivityP33 != null) {
                fragmentActivityP33.finish();
                return;
            }
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag("UpperCenterMainFragmentV4");
        UpperCenterMainFragmentV4 upperCenterMainFragmentV4 = null;
        if (fragmentFindFragmentByTag instanceof UpperCenterMainFragmentV4) {
            upperCenterMainFragmentV4 = (UpperCenterMainFragmentV4) fragmentFindFragmentByTag;
        }
        if (upperCenterMainFragmentV4 == null) {
            UpperCenterMainFragmentV4 upperCenterMainFragmentV42 = new UpperCenterMainFragmentV4();
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("isEmbedded", lc());
            upperCenterMainFragmentV42.setArguments(bundle3);
            childFragmentManager.beginTransaction().replace(view.getId(), upperCenterMainFragmentV42, "UpperCenterMainFragmentV4").commitAllowingStateLoss();
        }
        Task.callInBackground(new e(requireContext()));
        Lazy<C8554a> lazy = C8554a.f127050c;
        C8554a.C1351a.a().a();
        Lazy<C8488a> lazy2 = C8488a.f126360e;
        C8488a.C1345a.a().a();
        UploadLineSpeedDetect.c();
        Lazy<r> lazy3 = r.f117287g;
        if (r.a.b()) {
            r.a.a().g();
        }
    }
}
