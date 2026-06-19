package com.bilibili.ship.theseus.ogv.media;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/n.class */
@StabilityInferred(parameters = 0)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j f94021b;

    @Inject
    public n(@NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull CoroutineScope coroutineScope) {
        this.f94020a = coroutineScope;
        this.f94021b = jVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new OgvPlayableParamsAdjustmentService$1(this, null), 3, (Object) null);
    }
}
