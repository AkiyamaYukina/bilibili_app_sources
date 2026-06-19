package com.bilibili.ship.theseus.ogv.heavyviewdelay;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.AutoPlayService;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/heavyviewdelay/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f92195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h f92196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Deferred<Unit> f92197c;

    @Inject
    public a(@NotNull CoroutineScope coroutineScope, @NotNull h hVar, @NotNull AutoPlayService autoPlayService) {
        this.f92195a = coroutineScope;
        this.f92196b = hVar;
        CompletableDeferred completableDeferredAsync$default = (Hj0.a.a("ogv_delays_heavy_views", false) && autoPlayService.h) ? BuildersKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AllowingHeavyViewsRepository$provideAllowingHeavyViewsDeferred$1(this, null), 3, (Object) null) : CompletableDeferredKt.CompletableDeferred(Unit.INSTANCE);
        this.f92197c = completableDeferredAsync$default;
    }
}
