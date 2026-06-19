package com.bilibili.ship.theseus.united.page.videopiece;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.q;
import javax.inject.Inject;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<q<?>> f103682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f103683b;

    @Inject
    public b() {
        MutableStateFlow<q<?>> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f103682a = MutableStateFlow;
        this.f103683b = MutableStateFlow;
    }
}
