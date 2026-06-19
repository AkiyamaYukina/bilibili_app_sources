package com.bilibili.ship.theseus.keel.player;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.player.tangram.playercore.InterfaceC5778f;
import com.bilibili.player.tangram.playercore.PCSFacadeImpl;
import com.bilibili.player.tangram.playercore.u;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/o.class */
public final class o implements InterfaceC5778f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PCSFacadeImpl f91131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PCSFacadeImpl f91132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f91133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f91134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f91135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PlayViewUniteReply f91136f;

    public o(PCSFacadeImpl pCSFacadeImpl, f fVar, long j7, long j8, PlayViewUniteReply playViewUniteReply) {
        this.f91132b = pCSFacadeImpl;
        this.f91133c = fVar;
        this.f91134d = j7;
        this.f91135e = j8;
        this.f91136f = playViewUniteReply;
        this.f91131a = pCSFacadeImpl;
    }

    @Override // com.bilibili.player.tangram.basic.l
    public final Flow<com.bilibili.player.tangram.basic.a> B() {
        return this.f91131a.f79396n;
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final long F() {
        return this.f91131a.F();
    }

    @Override // com.bilibili.player.tangram.basic.l
    public final Flow<com.bilibili.player.tangram.basic.a> H() {
        return this.f91131a.f79395m;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @Override // com.bilibili.player.tangram.basic.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object I(long r16, boolean r18, java.lang.Object r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.keel.player.o.I(long, boolean, java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final Flow<Duration> J() {
        return this.f91131a.J();
    }

    @Override // com.bilibili.player.tangram.basic.l
    public final Object K(com.bilibili.player.tangram.basic.c cVar, ContinuationImpl continuationImpl) {
        return this.f91131a.K(cVar, continuationImpl);
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final long L() {
        return this.f91131a.L();
    }

    @Override // com.bilibili.player.tangram.playercore.InterfaceC5778f
    public final Flow<u> b() {
        return this.f91131a.f79393k;
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final Object c(long j7, boolean z6, Continuation<? super Boolean> continuation) {
        return this.f91131a.c(j7, z6, continuation);
    }

    @Override // com.bilibili.player.tangram.basic.j
    public final Flow<PlayerAvailability> d() {
        return this.f91131a.f79394l;
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final Long h() {
        return this.f91131a.h();
    }

    @Override // com.bilibili.player.tangram.basic.l
    public final com.bilibili.player.tangram.basic.a i() {
        return this.f91131a.i();
    }

    @Override // com.bilibili.player.tangram.basic.j
    public final PlayerAvailability k() {
        return this.f91131a.k();
    }

    @Override // com.bilibili.player.tangram.playercore.G
    public final boolean m(u uVar) {
        return this.f91131a.m(uVar);
    }

    @Override // com.bilibili.player.tangram.playercore.InterfaceC5778f
    public final void n() {
        this.f91131a.n();
    }

    @Override // com.bilibili.player.tangram.playercore.InterfaceC5778f
    public final u o() {
        return this.f91131a.o();
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final Duration q() {
        return this.f91131a.q();
    }

    @Override // com.bilibili.player.tangram.basic.l
    public final Flow<List<com.bilibili.player.tangram.basic.a>> t() {
        return this.f91131a.t();
    }

    @Override // com.bilibili.player.tangram.basic.e
    public final Object w() {
        return this.f91131a.w();
    }

    @Override // com.bilibili.player.tangram.basic.l
    public final com.bilibili.player.tangram.basic.a x() {
        return this.f91131a.x();
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final Object y(long j7, boolean z6, Continuation<? super Boolean> continuation) {
        return this.f91131a.y(j7, z6, continuation);
    }
}
