package com.bilibili.ship.theseus.ugc.play;

import android.os.Parcelable;
import com.bilibili.ship.theseus.ugc.m;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.united.di.o;
import com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import lv0.C7893a;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCPlaybackRepository$driveMediaPlayingEpScope$2.class */
final class UGCPlaybackRepository$driveMediaPlayingEpScope$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    final UGCPlaybackRepository.a.c $state;
    private Object L$0;
    int label;
    final UGCPlaybackRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCPlaybackRepository$driveMediaPlayingEpScope$2(UGCPlaybackRepository.a.c cVar, UGCPlaybackRepository uGCPlaybackRepository, Continuation<? super UGCPlaybackRepository$driveMediaPlayingEpScope$2> continuation) {
        super(2, continuation);
        this.$state = cVar;
        this.this$0 = uGCPlaybackRepository;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UGCPlaybackRepository$driveMediaPlayingEpScope$2 uGCPlaybackRepository$driveMediaPlayingEpScope$2 = new UGCPlaybackRepository$driveMediaPlayingEpScope$2(this.$state, this.this$0, continuation);
        uGCPlaybackRepository$driveMediaPlayingEpScope$2.L$0 = obj;
        return uGCPlaybackRepository$driveMediaPlayingEpScope$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BLog.i("UGCPlaybackRepository$driveMediaPlayingEpScope$2-invokeSuspend", "[theseus-ugc-UGCPlaybackRepository$driveMediaPlayingEpScope$2-invokeSuspend] drive ugc normal ep play scope");
                Pair<Long, Float> pair = this.this$0.f98069n.f123390c;
                if (pair == null || this.$state.f98081b.f98082a.f591b != ((Number) pair.getFirst()).longValue()) {
                    this.this$0.f98069n.f123390c = null;
                }
                C7893a c7893a = this.this$0.f98069n;
                Parcelable.Creator<PlayingAreaDescription> creator = PlayingAreaDescription.CREATOR;
                c7893a.d(PlayingAreaDescription.a.a(this.$state.f98081b.f98082a.f596g));
                m mVar = this.this$0.f98066k;
                o oVar = new o();
                UGCPlaybackRepository.a.c cVar = this.$state;
                mVar.a(coroutineScope, oVar, cVar.f98081b.f98082a, cVar.f98080a);
                this.this$0.f98068m.e(true, false);
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            System.out.println((Object) "Test point!");
            throw th;
        }
    }
}
