package com.bilibili.pegasus.verticaltab;

import EB.o;
import HS0.F;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.inline.control.IInlineControl;
import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final VerticalTabFragment f78928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public IInlineControl f78929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f78930c = ListExtentionsKt.lazyUnsafe(new B11.a(11));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f78931d = ListExtentionsKt.lazyUnsafe(new o(this, 4));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f78932e = ListExtentionsKt.lazyUnsafe(new F(this, 5));

    public a(@NotNull VerticalTabFragment verticalTabFragment) {
        this.f78928a = verticalTabFragment;
    }
}
