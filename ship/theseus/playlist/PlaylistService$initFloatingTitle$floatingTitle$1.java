package com.bilibili.ship.theseus.playlist;

import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.PlaylistInfo;
import com.bilibili.ship.theseus.playlist.uicomponent.C6257f;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$initFloatingTitle$floatingTitle$1.class */
final class PlaylistService$initFloatingTitle$floatingTitle$1 extends SuspendLambda implements Function3<PlaylistInfo, PlaylistRepository.e, Continuation<? super C6257f.a.C0804a>, Object> {
    Object L$0;
    Object L$1;
    int label;

    public PlaylistService$initFloatingTitle$floatingTitle$1(Continuation<? super PlaylistService$initFloatingTitle$floatingTitle$1> continuation) {
        super(3, continuation);
    }

    public final Object invoke(PlaylistInfo playlistInfo, PlaylistRepository.e eVar, Continuation<? super C6257f.a.C0804a> continuation) {
        PlaylistService$initFloatingTitle$floatingTitle$1 playlistService$initFloatingTitle$floatingTitle$1 = new PlaylistService$initFloatingTitle$floatingTitle$1(continuation);
        playlistService$initFloatingTitle$floatingTitle$1.L$0 = playlistInfo;
        playlistService$initFloatingTitle$floatingTitle$1.L$1 = eVar;
        return playlistService$initFloatingTitle$floatingTitle$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PlaylistInfo playlistInfo = (PlaylistInfo) this.L$0;
        PlaylistRepository.e eVar = (PlaylistRepository.e) this.L$1;
        String str = playlistInfo.f95281n;
        String string = FoundationAlias.getFapp().getString(2131858121);
        if (playlistInfo.f95282o != 1) {
            string = null;
        }
        return new C6257f.a.C0804a(str, string, playlistInfo.f95279l, eVar.f95137a.f95236j + 1);
    }
}
