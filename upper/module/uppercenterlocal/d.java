package com.bilibili.upper.module.uppercenterlocal;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bilibili.common.hilowebview.view.HiloWebView;
import com.bilibili.upper.module.uppercenterlocal.UpperCenterLocalDelegate$hiloContainerServer$1$interceptPopGesture$2;
import com.bilibili.upper.module.uppercenterlocal.vm.UpperCenterLocalViewModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/d.class */
public interface d {
    @Nullable
    UpperCenterLocalViewModel H5();

    @Nullable
    HiloWebView Qa();

    @NotNull
    LifecycleCoroutineScope V3();

    void X3();

    @Nullable
    FragmentActivity h0();

    default boolean lc() {
        return false;
    }

    void sc(@NotNull UpperCenterLocalDelegate$hiloContainerServer$1$interceptPopGesture$2.a aVar);
}
