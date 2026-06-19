package com.bilibili.ship.theseus.playlist.di.driver;

import com.bilibili.ship.theseus.playlist.di.driver.c;
import dagger.internal.Preconditions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlaylistScopeDriverImpl$drivePlaylistScope$2.class */
final class PlaylistScopeDriverImpl$drivePlaylistScope$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final c.b.C0781c $state;
    private Object L$0;
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistScopeDriverImpl$drivePlaylistScope$2(c cVar, c.b.C0781c c0781c, Continuation<? super PlaylistScopeDriverImpl$drivePlaylistScope$2> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$state = c0781c;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistScopeDriverImpl$drivePlaylistScope$2 playlistScopeDriverImpl$drivePlaylistScope$2 = new PlaylistScopeDriverImpl$drivePlaylistScope$2(this.this$0, this.$state, continuation);
        playlistScopeDriverImpl$drivePlaylistScope$2.L$0 = obj;
        return playlistScopeDriverImpl$drivePlaylistScope$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BLog.i("PlaylistScopeDriverImpl$drivePlaylistScope$2-invokeSuspend", "[theseus-playlist-detail-PlaylistScopeDriverImpl$drivePlaylistScope$2-invokeSuspend] Driving PlaylistScope.");
        a.F0 f02 = this.this$0.f95484g;
        c.b.C0781c c0781c = this.$state;
        com.bilibili.ship.theseus.playlist.di.playlist.a aVar = new com.bilibili.ship.theseus.playlist.di.playlist.a(c0781c.f95501a, c0781c.f95502b, c0781c.f95503c);
        Preconditions.checkNotNull(coroutineScope);
        Preconditions.checkNotNull(aVar);
        return Unit.INSTANCE;
    }
}
