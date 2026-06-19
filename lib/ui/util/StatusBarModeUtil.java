package com.bilibili.lib.ui.util;

import F3.P5;
import Wf0.C3029b;
import Wf0.C3032e;
import Wf0.InterfaceC3030c;
import android.app.Activity;
import android.view.Window;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/util/StatusBarModeUtil.class */
public final class StatusBarModeUtil {

    @NotNull
    public static final a Companion = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy<C3029b> f64949a = LazyKt.lazy(new P5(4));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/util/StatusBarModeUtil$a.class */
    public static final class a {
    }

    @JvmStatic
    public static final boolean isStatusBarModeAvailable() {
        Companion.getClass();
        C3032e.a();
        return true;
    }

    @JvmStatic
    public static final void set(@NotNull Activity activity, boolean z6) {
        Companion.getClass();
        ((InterfaceC3030c) f64949a.getValue()).a(activity, z6);
    }

    @JvmStatic
    public static final void set(@NotNull Window window, boolean z6) {
        Companion.getClass();
        ((InterfaceC3030c) f64949a.getValue()).b(window, z6);
    }
}
