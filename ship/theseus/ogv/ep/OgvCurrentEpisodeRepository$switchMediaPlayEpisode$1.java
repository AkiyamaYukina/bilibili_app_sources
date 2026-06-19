package com.bilibili.ship.theseus.ogv.ep;

import androidx.compose.runtime.snapshots.z;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.united.page.preload.PreloadRepository;
import ev0.i;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvCurrentEpisodeRepository$switchMediaPlayEpisode$1.class */
public final class OgvCurrentEpisodeRepository$switchMediaPlayEpisode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final OgvEpisode $episode;
    final i $landingPosition;
    final GeminiCommonPlayableParams $playableParams;
    int label;
    final OgvCurrentEpisodeRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvCurrentEpisodeRepository$switchMediaPlayEpisode$1(OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, OgvEpisode ogvEpisode, GeminiCommonPlayableParams geminiCommonPlayableParams, i iVar, Continuation<? super OgvCurrentEpisodeRepository$switchMediaPlayEpisode$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvCurrentEpisodeRepository;
        this.$episode = ogvEpisode;
        this.$playableParams = geminiCommonPlayableParams;
        this.$landingPosition = iVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvCurrentEpisodeRepository$switchMediaPlayEpisode$1(this.this$0, this.$episode, this.$playableParams, this.$landingPosition, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            PreloadRepository preloadRepository = this.this$0.f92113p;
            long jA = this.$episode.a();
            long j7 = this.$episode.f93561g;
            this.label = 1;
            Object objA = preloadRepository.a(jA, j7, this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        long jA2 = this.$episode.a();
        defpackage.a.b("[theseus-ogv-OgvCurrentEpisodeRepository$switchMediaPlayEpisode$1-invokeSuspend] ", android.support.v4.media.session.a.a(z.a(jA2, "can not find valid preload data for avid:", ", cid:"), this.$episode.f93561g, ", switch media scope without preload data"), "OgvCurrentEpisodeRepository$switchMediaPlayEpisode$1-invokeSuspend");
        OgvCurrentEpisodeRepository.k(this.this$0, this.$episode, this.$playableParams, this.$landingPosition, (com.bilibili.ship.theseus.keel.player.e) obj);
        return Unit.INSTANCE;
    }
}
