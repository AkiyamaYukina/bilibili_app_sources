package com.bilibili.upper.module.uppercenterlocal;

import EV.i;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import bF0.C4948C;
import com.bilibili.common.hilowebview.view.HiloWebView;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.upper.module.uppercenterlocal.UpperCenterLocalDelegate$hiloContainerServer$1$interceptPopGesture$2;
import com.bilibili.upper.module.uppercenterlocal.vm.UpperCenterLocalViewModel;
import eJ0.r;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/UpperCenterMainLocalActivity.class */
@StabilityInferred(parameters = 0)
public final class UpperCenterMainLocalActivity extends Yv0.b<UpperCenterLocalViewModel, C4948C> implements d {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f114240F = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final Lazy f114241E = LazyKt.lazy(new i(this, 1));

    @Override // com.bilibili.upper.module.uppercenterlocal.d
    @Nullable
    public final UpperCenterLocalViewModel H5() {
        return (UpperCenterLocalViewModel) ((Yv0.b) this).B;
    }

    public final void P6(@Nullable Bundle bundle) {
        V6().b();
        V6().e();
    }

    public final void Q6() {
        V6().getClass();
        UpperCenterLocalDelegate.d();
        UpperCenterLocalDelegate upperCenterLocalDelegateV6 = V6();
        BuildersKt.launch$default(upperCenterLocalDelegateV6.f114226a.V3(), (CoroutineContext) null, (CoroutineStart) null, new UpperCenterLocalDelegate$loadH5$1(upperCenterLocalDelegateV6, null), 3, (Object) null);
    }

    @Override // com.bilibili.upper.module.uppercenterlocal.d
    @Nullable
    public final HiloWebView Qa() {
        C4948C c4948c = (C4948C) ((Yv0.b) this).C;
        return c4948c != null ? c4948c.f54652b : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ViewBinding R6() {
        return C4948C.inflate(getLayoutInflater());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Yv0.c S6() {
        return (UpperCenterLocalViewModel) new ViewModelProvider(this).get(UpperCenterLocalViewModel.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.upper.module.uppercenterlocal.d
    @NotNull
    public final LifecycleCoroutineScope V3() {
        return LifecycleOwnerKt.getLifecycleScope(this);
    }

    public final UpperCenterLocalDelegate V6() {
        return (UpperCenterLocalDelegate) this.f114241E.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void attachBaseContext(Context context) {
        super/*androidx.appcompat.app.AppCompatActivity*/.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.upper.module.uppercenterlocal.d
    @Nullable
    public final FragmentActivity h0() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        V6().f114229d = System.currentTimeMillis();
        super.onCreate(bundle);
        getIntent();
        if (GA0.b.a(this)) {
            finish();
            return;
        }
        Window window = getWindow();
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
        Lazy<r> lazy = r.f117287g;
        r.a.a().g();
    }

    public final void onDestroy() {
        V6().f();
        super.onDestroy();
        Lazy<r> lazy = r.f117287g;
        r.a.a().i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNewIntent(@NotNull Intent intent) {
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        setIntent(intent);
        if (GA0.b.a(this)) {
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.upper.module.uppercenterlocal.d
    public final void sc(@NotNull UpperCenterLocalDelegate$hiloContainerServer$1$interceptPopGesture$2.a aVar) {
        getOnBackPressedDispatcher().addCallback(this, aVar);
    }
}
