package com.bilibili.playset.playlist.search2;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/i.class */
@StabilityInferred(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Long f85459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<h> f85460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<o> f85461c = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 6, (Object) null);

    public i(@NotNull String str, @Nullable Long l7) {
        this.f85459a = l7;
        this.f85460b = StateFlowKt.MutableStateFlow(new h(str, PageStatus.INIT, CollectionsKt.emptyList(), null, false, false, 0, 0, 1, 0L, 0, 0, "", false));
    }
}
