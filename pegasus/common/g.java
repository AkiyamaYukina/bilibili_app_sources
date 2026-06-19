package com.bilibili.pegasus.common;

import F3.C1692b;
import F3.C1700c;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/g.class */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f75519a = ListExtentionsKt.lazyUnsafe(new C1692b(9));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy f75520b = LazyKt.lazy(new C1700c(10));

    public static final boolean a() {
        return ((Boolean) f75519a.getValue()).booleanValue();
    }
}
