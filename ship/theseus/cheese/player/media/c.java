package com.bilibili.ship.theseus.cheese.player.media;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.j;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/media/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final j f90640b;

    @Inject
    public c(@NotNull j jVar, @NotNull CoroutineScope coroutineScope) {
        this.f90639a = coroutineScope;
        this.f90640b = jVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CheesePlayableParamsAdjustmentService$1(this, null), 3, (Object) null);
    }
}
