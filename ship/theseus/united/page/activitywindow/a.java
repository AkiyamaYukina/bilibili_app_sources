package com.bilibili.ship.theseus.united.page.activitywindow;

import M3.G;
import M3.H;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f98856a = LazyKt.lazy(new G(7));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy f98857b = LazyKt.lazy(new H(5));

    @NotNull
    public static String a() {
        return "key=dd_united_894_edge_to_edge_window_config, value=" + ((String) f98856a.getValue()) + ", tokens=" + ((Set) f98857b.getValue());
    }

    public static boolean b() {
        Lazy lazy = f98857b;
        return ((Set) lazy.getValue()).contains("edge_to_edge") && ((Set) lazy.getValue()).contains("ime_insets");
    }
}
