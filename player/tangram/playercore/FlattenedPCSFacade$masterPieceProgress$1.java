package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.basic.WithVideoProgress;
import com.bilibili.player.tangram.playercore.FlattenedPCSFacade;
import kotlin.coroutines.Continuation;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$masterPieceProgress$1.class */
public final class FlattenedPCSFacade$masterPieceProgress$1 implements WithVideoProgress {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Flow<Duration> f79382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlattenedPCSFacade f79383b;

    public FlattenedPCSFacade$masterPieceProgress$1(FlattenedPCSFacade flattenedPCSFacade) {
        this.f79383b = flattenedPCSFacade;
        this.f79382a = FlowKt.transformLatest(flattenedPCSFacade.f79364n, new FlattenedPCSFacade$masterPieceProgress$1$special$$inlined$flatMapLatest$1(null, flattenedPCSFacade, this));
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final long F() {
        int i7;
        int i8;
        FlattenedPCSFacade flattenedPCSFacade = this.f79383b;
        FlattenedPCSFacade.c cVar = (FlattenedPCSFacade.c) flattenedPCSFacade.f79363m.getValue();
        long jF = (cVar != null && (i8 = cVar.f79380a) >= (i7 = flattenedPCSFacade.f79357f)) ? i8 == i7 ? cVar.f79381b.F() : q().unbox-impl() : Duration.Companion.getZERO-UwyO8pc();
        return jF;
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final Flow<Duration> J() {
        return this.f79382a;
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final Object c(long j7, boolean z6, Continuation<? super Boolean> continuation) {
        return this.f79383b.s(j7, z6, continuation);
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final Duration q() {
        FlattenedPCSFacade flattenedPCSFacade = this.f79383b;
        return flattenedPCSFacade.f79355d.get(flattenedPCSFacade.f79357f).b().a;
    }
}
