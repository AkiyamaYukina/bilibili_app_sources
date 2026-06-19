package com.bilibili.lib.ui.mixin;

import androidx.fragment.app.Fragment;
import com.bilibili.lib.ui.mixin.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/mixin/IFragmentShowHideKt.class */
public final class IFragmentShowHideKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean isFragmentShown(@NotNull Fragment fragment) {
        a visibleManager;
        a.InterfaceC0362a interfaceC0362a = fragment instanceof a.InterfaceC0362a ? (a.InterfaceC0362a) fragment : null;
        return (interfaceC0362a == null || (visibleManager = interfaceC0362a.getVisibleManager()) == null) ? false : visibleManager.f64896d;
    }
}
