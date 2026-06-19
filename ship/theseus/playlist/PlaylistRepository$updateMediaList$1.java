package com.bilibili.ship.theseus.playlist;

import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistRepository$updateMediaList$1.class */
public final class PlaylistRepository$updateMediaList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<MultiTypeMedia> $list;
    int label;
    final PlaylistRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepository$updateMediaList$1(PlaylistRepository playlistRepository, List<MultiTypeMedia> list, Continuation<? super PlaylistRepository$updateMediaList$1> continuation) {
        super(2, continuation);
        this.this$0 = playlistRepository;
        this.$list = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistRepository$updateMediaList$1(this.this$0, this.$list, continuation);
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
        PlaylistRepository playlistRepository = this.this$0;
        List<MultiTypeMedia> list = this.$list;
        PlaylistRepository.e eVar = PlaylistRepository.f95077Q;
        playlistRepository.getClass();
        playlistRepository.f95109q = PlaylistRepository.a(list);
        return Unit.INSTANCE;
    }
}
