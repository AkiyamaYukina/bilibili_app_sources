package com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.morefilmlist;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/morefilmlist/OgvMoreFilmsLayerService$showMoreFilmsLayer$1$component$1$1$1.class */
public final /* synthetic */ class OgvMoreFilmsLayerService$showMoreFilmsLayer$1$component$1$1$1 extends AdaptedFunctionReference implements Function0<Unit> {
    public OgvMoreFilmsLayerService$showMoreFilmsLayer$1$component$1$1$1(Object obj) {
        super(0, obj, CoroutineScopeKt.class, "cancel", "cancel(Lkotlinx/coroutines/CoroutineScope;Ljava/util/concurrent/CancellationException;)V", 1);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m9013invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m9013invoke() {
        CoroutineScopeKt.cancel$default((CoroutineScope) ((AdaptedFunctionReference) this).receiver, (CancellationException) null, 1, (Object) null);
    }
}
