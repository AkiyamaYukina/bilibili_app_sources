package com.bilibili.ship.theseus.united.page.danmaku;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuRefreshTriggerRepository.class */
@StabilityInferred(parameters = 0)
public final class DanmakuRefreshTriggerRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f99416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f99417c;

    @Inject
    public DanmakuRefreshTriggerRepository(@NotNull CoroutineScope coroutineScope) {
        this.f99415a = coroutineScope;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f99416b = mutableSharedFlowMutableSharedFlow$default;
        this.f99417c = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final void a() {
        BuildersKt.launch$default(this.f99415a, (CoroutineContext) null, (CoroutineStart) null, new DanmakuRefreshTriggerRepository$trigger$1(this, null), 3, (Object) null);
    }
}
