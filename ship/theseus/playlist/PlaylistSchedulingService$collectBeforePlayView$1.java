package com.bilibili.ship.theseus.playlist;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.BizType;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistSchedulingService$collectBeforePlayView$1.class */
final class PlaylistSchedulingService$collectBeforePlayView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final PlaylistSchedulingService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistSchedulingService$collectBeforePlayView$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistSchedulingService$collectBeforePlayView$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<PlayViewUniteReply, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final PlaylistSchedulingService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlaylistSchedulingService playlistSchedulingService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playlistSchedulingService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(PlayViewUniteReply playViewUniteReply, Continuation<? super Unit> continuation) {
            return create(playViewUniteReply, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object next;
            Object next2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PlayViewUniteReply playViewUniteReply = (PlayViewUniteReply) this.L$0;
            if (playViewUniteReply.getPlayArc().getVideoType() == BizType.BIZ_TYPE_UGC) {
                boolean z6 = (playViewUniteReply.getPlayArc().getIsPreview() || playViewUniteReply.getVodInfo().getStreamListList().isEmpty()) ? false : true;
                long aid = playViewUniteReply.getPlayArc().getAid();
                long cid = playViewUniteReply.getPlayArc().getCid();
                boolean isPreview = playViewUniteReply.getPlayArc().getIsPreview();
                boolean zIsEmpty = playViewUniteReply.getVodInfo().getStreamListList().isEmpty();
                StringBuilder sbA = androidx.compose.runtime.snapshots.z.a(aid, "UGC aid: ", " cid: ");
                com.bilibili.bplus.followingpublish.fragments.publish.c.a(cid, "  enable: ", sbA, z6);
                sbA.append(" isPreview: ");
                sbA.append(isPreview);
                sbA.append(" streamListList empty: ");
                sbA.append(zIsEmpty);
                defpackage.a.b("[theseus-playlist-PlaylistSchedulingService$collectBeforePlayView$1$2-invokeSuspend] ", sbA.toString(), "PlaylistSchedulingService$collectBeforePlayView$1$2-invokeSuspend");
                PlaylistRepository playlistRepository = this.this$0.f95148g;
                long aid2 = playViewUniteReply.getPlayArc().getAid();
                long cid2 = playViewUniteReply.getPlayArc().getCid();
                Iterator<T> it = playlistRepository.d().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((MultiTypeMedia) next).d() == aid2) {
                        break;
                    }
                }
                MultiTypeMedia multiTypeMedia = (MultiTypeMedia) next;
                if (multiTypeMedia != null) {
                    Iterator<T> it2 = multiTypeMedia.f95225M.iterator();
                    do {
                        next2 = null;
                        if (!it2.hasNext()) {
                            break;
                        }
                        next2 = it2.next();
                    } while (((Ou0.c) next2).f18089b != cid2);
                    Ou0.c cVar = (Ou0.c) next2;
                    if (cVar != null) {
                        cVar.f18103q = z6;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistSchedulingService$collectBeforePlayView$1(PlaylistSchedulingService playlistSchedulingService, Continuation<? super PlaylistSchedulingService$collectBeforePlayView$1> continuation) {
        super(2, continuation);
        this.this$0 = playlistSchedulingService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistSchedulingService$collectBeforePlayView$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.asStateFlow(this.this$0.f95149i.f91111e), new PlaylistSchedulingService$collectBeforePlayView$1$invokeSuspend$$inlined$flatMapLatest$1(null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
