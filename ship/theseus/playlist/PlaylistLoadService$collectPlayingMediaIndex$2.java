package com.bilibili.ship.theseus.playlist;

import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistLoadService$collectPlayingMediaIndex$2.class */
final class PlaylistLoadService$collectPlayingMediaIndex$2 extends SuspendLambda implements Function2<PlaylistRepository.e, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final PlaylistLoadService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistLoadService$collectPlayingMediaIndex$2(PlaylistLoadService playlistLoadService, Continuation<? super PlaylistLoadService$collectPlayingMediaIndex$2> continuation) {
        super(2, continuation);
        this.this$0 = playlistLoadService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistLoadService$collectPlayingMediaIndex$2 playlistLoadService$collectPlayingMediaIndex$2 = new PlaylistLoadService$collectPlayingMediaIndex$2(this.this$0, continuation);
        playlistLoadService$collectPlayingMediaIndex$2.L$0 = obj;
        return playlistLoadService$collectPlayingMediaIndex$2;
    }

    public final Object invoke(PlaylistRepository.e eVar, Continuation<? super Unit> continuation) {
        return create(eVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MultiTypeMedia multiTypeMedia = ((PlaylistRepository.e) this.L$0).f95137a;
        List<MultiTypeMedia> listD = this.this$0.f95045b.d();
        Iterator<MultiTypeMedia> it = listD.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (it.next().d() == multiTypeMedia.d()) {
                break;
            }
            i7++;
        }
        if (i7 == -1) {
            return Unit.INSTANCE;
        }
        if (i7 == listD.size() - 1 && ((PlaylistRepository.b) this.this$0.f95050g.getValue()).f95131c && !((PlaylistRepository.b) this.this$0.f95050g.getValue()).f95129a) {
            BLog.i("PlaylistLoadService$collectPlayingMediaIndex$2-invokeSuspend", "[theseus-playlist-PlaylistLoadService$collectPlayingMediaIndex$2-invokeSuspend] reached the end of current media list, try to load next page.");
            this.this$0.f();
        }
        return Unit.INSTANCE;
    }
}
