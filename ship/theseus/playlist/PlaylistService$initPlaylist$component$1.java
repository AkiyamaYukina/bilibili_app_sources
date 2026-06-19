package com.bilibili.ship.theseus.playlist;

import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.PlaylistInfo;
import com.bilibili.ship.theseus.playlist.uicomponent.D;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$initPlaylist$component$1.class */
final class PlaylistService$initPlaylist$component$1 extends SuspendLambda implements Function5<PlaylistInfo, PlaylistRepository.e, PlaylistOrderEnum, Boolean, Continuation<? super D.g.a>, Object> {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final E this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistService$initPlaylist$component$1(E e7, Continuation<? super PlaylistService$initPlaylist$component$1> continuation) {
        super(5, continuation);
        this.this$0 = e7;
    }

    public final Object invoke(PlaylistInfo playlistInfo, PlaylistRepository.e eVar, PlaylistOrderEnum playlistOrderEnum, boolean z6, Continuation<? super D.g.a> continuation) {
        PlaylistService$initPlaylist$component$1 playlistService$initPlaylist$component$1 = new PlaylistService$initPlaylist$component$1(this.this$0, continuation);
        playlistService$initPlaylist$component$1.L$0 = playlistInfo;
        playlistService$initPlaylist$component$1.L$1 = playlistOrderEnum;
        playlistService$initPlaylist$component$1.Z$0 = z6;
        return playlistService$initPlaylist$component$1.invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return invoke((PlaylistInfo) obj, (PlaylistRepository.e) obj2, (PlaylistOrderEnum) obj3, ((Boolean) obj4).booleanValue(), (Continuation<? super D.g.a>) obj5);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.PlaylistService$initPlaylist$component$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
