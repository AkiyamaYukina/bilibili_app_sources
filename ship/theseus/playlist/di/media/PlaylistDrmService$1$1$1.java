package com.bilibili.ship.theseus.playlist.di.media;

import Ou0.c;
import com.bilibili.ship.theseus.united.di.BusinessType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import video.biz.offline.base.facade.b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/media/PlaylistDrmService$1$1$1.class */
final class PlaylistDrmService$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final BusinessType $bizType;
    final long $expireTs;
    final c $playingEpisode;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/media/PlaylistDrmService$1$1$1$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f95574a;

        static {
            int[] iArr = new int[BusinessType.values().length];
            try {
                iArr[BusinessType.OGV.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f95574a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistDrmService$1$1$1(BusinessType businessType, c cVar, long j7, Continuation<? super PlaylistDrmService$1$1$1> continuation) {
        super(2, continuation);
        this.$bizType = businessType;
        this.$playingEpisode = cVar;
        this.$expireTs = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistDrmService$1$1$1(this.$bizType, this.$playingEpisode, this.$expireTs, continuation);
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
        BusinessType businessType = this.$bizType;
        c cVar = this.$playingEpisode;
        long j7 = cVar.f18088a;
        long j8 = this.$expireTs;
        StringBuilder sb = new StringBuilder("update drm expireTs for playing media, bizType:");
        sb.append(businessType);
        sb.append(", avid:");
        sb.append(j7);
        sb.append(", cid:");
        sb.append(cVar.f18089b);
        defpackage.a.b("[theseus-playlist-PlaylistDrmService$1$1$1-invokeSuspend] ", Ld.c.a(sb, j8, ", expireTs:"), "PlaylistDrmService$1$1$1-invokeSuspend");
        video.biz.offline.base.facade.a aVar = b.a;
        BusinessType businessType2 = this.$bizType;
        int[] iArr = a.f95574a;
        aVar.l(CollectionsKt.listOf(new video.biz.offline.base.model.entity.b(iArr[businessType2.ordinal()] == 1 ? this.$playingEpisode.f18090c : this.$playingEpisode.f18088a, iArr[this.$bizType.ordinal()] == 1 ? this.$playingEpisode.f18091d : this.$playingEpisode.f18089b, this.$bizType.ordinal(), Boxing.boxLong(this.$expireTs), (String) null, 16)));
        return Unit.INSTANCE;
    }
}
