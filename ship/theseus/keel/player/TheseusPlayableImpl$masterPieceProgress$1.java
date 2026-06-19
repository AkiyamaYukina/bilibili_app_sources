package com.bilibili.ship.theseus.keel.player;

import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import com.bilibili.player.tangram.basic.WithVideoProgress;
import com.bilibili.player.tangram.playercore.FlattenedPCSFacade;
import com.bilibili.player.tangram.playercore.FlattenedPCSFacade$masterPieceProgress$1;
import com.bilibili.player.tangram.playercore.InterfaceC5778f;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableImpl$masterPieceProgress$1.class */
public final class TheseusPlayableImpl$masterPieceProgress$1 implements WithVideoProgress {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f91074a;

    public TheseusPlayableImpl$masterPieceProgress$1(k kVar) {
        this.f91074a = kVar;
    }

    public static FlattenedPCSFacade d(ResolveAndPlayPlayable.c cVar) {
        FlattenedPCSFacade flattenedPCSFacade = null;
        ResolveAndPlayPlayable.c.C0510c c0510c = cVar instanceof ResolveAndPlayPlayable.c.C0510c ? (ResolveAndPlayPlayable.c.C0510c) cVar : null;
        InterfaceC5778f interfaceC5778f = c0510c != null ? (InterfaceC5778f) c0510c.f79314a : null;
        if (interfaceC5778f instanceof FlattenedPCSFacade) {
            flattenedPCSFacade = (FlattenedPCSFacade) interfaceC5778f;
        }
        return flattenedPCSFacade;
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final long F() {
        FlattenedPCSFacade$masterPieceProgress$1 flattenedPCSFacade$masterPieceProgress$1;
        k kVar = this.f91074a;
        FlattenedPCSFacade flattenedPCSFacadeD = d(kVar.f91114b.f79417e.h0());
        return (flattenedPCSFacadeD == null || (flattenedPCSFacade$masterPieceProgress$1 = flattenedPCSFacadeD.f79366p) == null) ? kVar.f91114b.f79417e.F() : flattenedPCSFacade$masterPieceProgress$1.F();
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final Flow<Duration> J() {
        k kVar = this.f91074a;
        ResolveAndPlayPlayable<InterfaceC5778f> resolveAndPlayPlayable = kVar.f91114b.f79417e;
        return FlowKt.transformLatest(resolveAndPlayPlayable.f79303b, new TheseusPlayableImpl$masterPieceProgress$1$special$$inlined$flatMapLatest$1(null, this, kVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r7, boolean r9, kotlin.coroutines.Continuation<? super java.lang.Boolean> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.keel.player.TheseusPlayableImpl$masterPieceProgress$1.c(long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.time.Duration q() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.ship.theseus.keel.player.k r0 = r0.f91074a
            r4 = r0
            r0 = r4
            com.bilibili.player.tangram.playercore.PCSPlayableImpl r0 = r0.f91114b
            com.bilibili.player.tangram.basic.ResolveAndPlayPlayable<com.bilibili.player.tangram.playercore.f> r0 = r0.f79417e
            com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$c r0 = r0.h0()
            com.bilibili.player.tangram.playercore.FlattenedPCSFacade r0 = d(r0)
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L2c
            r0 = r3
            com.bilibili.player.tangram.playercore.FlattenedPCSFacade$masterPieceProgress$1 r0 = r0.f79366p
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L2c
            r0 = r3
            kotlin.time.Duration r0 = r0.q()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L2c
            goto L37
        L2c:
            r0 = r4
            com.bilibili.player.tangram.playercore.PCSPlayableImpl r0 = r0.f91114b
            com.bilibili.player.tangram.basic.ResolveAndPlayPlayable<com.bilibili.player.tangram.playercore.f> r0 = r0.f79417e
            kotlin.time.Duration r0 = r0.q()
            r3 = r0
        L37:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.keel.player.TheseusPlayableImpl$masterPieceProgress$1.q():kotlin.time.Duration");
    }
}
