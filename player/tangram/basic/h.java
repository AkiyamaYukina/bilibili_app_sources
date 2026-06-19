package com.bilibili.player.tangram.basic;

import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/h.class */
public final class h<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResolveAndPlayPlayable<e> f79323a;

    public h(ResolveAndPlayPlayable<e> resolveAndPlayPlayable) {
        this.f79323a = resolveAndPlayPlayable;
    }

    public final Object emit(Object obj, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new ResolveAndPlayPlayable$receiveResolveActions$2$1(this.f79323a, (ResolveAndPlayPlayable.a) obj, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }
}
