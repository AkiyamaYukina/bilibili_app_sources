package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/y.class */
@StabilityInferred(parameters = 0)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<StudyRecord> f90289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<StudyRecord> f90290b;

    @Inject
    public y() {
        MutableStateFlow<StudyRecord> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f90289a = MutableStateFlow;
        this.f90290b = FlowKt.asStateFlow(MutableStateFlow);
    }
}
