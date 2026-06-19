package com.bilibili.pegasus.fakepegasus;

import androidx.fragment.app.FragmentActivity;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/fakepegasus/e.class */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f77448a = LazyKt.lazy(new A8.j(7));

    public static final void a() {
        Lazy lazy = f77448a;
        for (FragmentActivity fragmentActivity : (Set) lazy.getValue()) {
            fragmentActivity.finish();
            fragmentActivity.overridePendingTransition(0, 0);
        }
        ((Set) lazy.getValue()).clear();
    }
}
