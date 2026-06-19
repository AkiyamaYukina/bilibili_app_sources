package com.bilibili.ship.theseus.ugc.play.media;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.j;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/media/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final j f98111b;

    @Inject
    public b(@NotNull j jVar, @NotNull CoroutineScope coroutineScope) {
        this.f98110a = coroutineScope;
        this.f98111b = jVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UGCPlayableParamsAdjustmentService$1(this, null), 3, (Object) null);
    }
}
