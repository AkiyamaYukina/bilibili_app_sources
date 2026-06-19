package com.bilibili.pegasus.components.cny;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.bilibili.bplus.im.pblink.o;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/cny/a.class */
@StabilityInferred(parameters = 0)
public final class a extends ViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final KProperty<Object>[] f75904e = {new PropertyReference0Impl(a.class, "cnyInfoEver", "<v#0>", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f75905a = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f75906b = LazyKt.lazy(new o(this, 1));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<String> f75907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<String> f75908d;

    public a() {
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.f75907c = MutableStateFlow;
        this.f75908d = FlowKt.asStateFlow(MutableStateFlow);
    }

    @Nullable
    public final String I0() {
        return (String) this.f75906b.getValue();
    }
}
