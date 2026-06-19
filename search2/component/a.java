package com.bilibili.search2.component;

import J3.G1;
import J3.H1;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/component/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f86397a = LazyKt.lazy(new G1(9));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy f86398b = LazyKt.lazy(new H1(10));

    public static boolean a() {
        return ((Boolean) f86398b.getValue()).booleanValue();
    }

    public static boolean b() {
        return ((Boolean) f86397a.getValue()).booleanValue();
    }
}
