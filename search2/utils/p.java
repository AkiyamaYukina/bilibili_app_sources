package com.bilibili.search2.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.inline.Option;
import com.bilibili.search2.inline.TrafficConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/p.class */
@StabilityInferred(parameters = 0)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Fragment f88841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TrafficConfig f88842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Function1<Option, Unit> f88843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<BaseSearchItem.ThreePointItem> f88844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Function1<String, Unit> f88845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f88846f;

    public p(Fragment fragment, TrafficConfig trafficConfig, Function1 function1, List list, Function1 function12) {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f88841a = fragment;
        this.f88842b = trafficConfig;
        this.f88843c = function1;
        this.f88844d = list;
        this.f88845e = function12;
        this.f88846f = MutableStateFlow;
    }
}
