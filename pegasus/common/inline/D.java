package com.bilibili.pegasus.common.inline;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/D.class */
@StabilityInferred(parameters = 0)
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Fragment f75528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<B> f75529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C5586e f75530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f75531d;

    public D(Fragment fragment, List list, C5586e c5586e) {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f75528a = fragment;
        this.f75529b = list;
        this.f75530c = c5586e;
        this.f75531d = MutableStateFlow;
    }
}
