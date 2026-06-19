package com.bilibili.ship.theseus.united.page.intro.module.season;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/s.class */
@StabilityInferred(parameters = 0)
public final class C6356s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f101700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f101701b;

    @Inject
    public C6356s() {
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f101700a = MutableStateFlow;
        this.f101701b = MutableStateFlow;
    }
}
