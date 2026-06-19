package com.bilibili.search2.interceptor;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bilibili.droid.BVCompat;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/interceptor/b.class */
@StabilityInferred(parameters = 1)
public final class b implements d {
    @Override // com.bilibili.search2.interceptor.d
    public final boolean a(@NotNull String str) {
        return BVCompat.a && BVCompat.b(str);
    }

    @Override // com.bilibili.search2.interceptor.d
    public final boolean b(@NotNull FragmentActivity fragmentActivity, @NotNull String str, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope) {
        Os0.e eVar = Os0.e.f18030a;
        Os0.e.c(fragmentActivity, str);
        return true;
    }
}
