package com.bilibili.playerbizcommonv2.widget.dowanload;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Pair;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dowanload/h.class */
@StabilityInferred(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StateFlow<Long> f82546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<String> f82547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<String> f82548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f82549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<Pair<Long, Long>> f82550e;

    public h(@NotNull StateFlow<Long> stateFlow, @NotNull StateFlow<String> stateFlow2, @NotNull StateFlow<String> stateFlow3, @NotNull StateFlow<Boolean> stateFlow4, @NotNull StateFlow<Pair<Long, Long>> stateFlow5) {
        this.f82546a = stateFlow;
        this.f82547b = stateFlow2;
        this.f82548c = stateFlow3;
        this.f82549d = stateFlow4;
        this.f82550e = stateFlow5;
    }
}
