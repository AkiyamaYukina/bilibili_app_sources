package com.bilibili.ogv.story;

import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.community.follow.FollowSeasonRepository$flowOfFollowSeason$;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/OgvStoryEpisodeListVm$observeIfAttached$1.class */
public final class OgvStoryEpisodeListVm$observeIfAttached$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final OgvStoryEpisodeListVm this$0;

    /* JADX INFO: renamed from: com.bilibili.ogv.story.OgvStoryEpisodeListVm$observeIfAttached$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/OgvStoryEpisodeListVm$observeIfAttached$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<com.bilibili.community.follow.b, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final OgvStoryEpisodeListVm this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvStoryEpisodeListVm ogvStoryEpisodeListVm, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvStoryEpisodeListVm;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(com.bilibili.community.follow.b bVar, Continuation<? super Unit> continuation) {
            return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.bilibili.community.follow.b bVar = (com.bilibili.community.follow.b) this.L$0;
            OgvStoryEpisodeListVm ogvStoryEpisodeListVm = this.this$0;
            BangumiUniformSeason bangumiUniformSeason = ogvStoryEpisodeListVm.f73011i;
            if (bangumiUniformSeason != null) {
                ogvStoryEpisodeListVm.n(bangumiUniformSeason, bVar.a);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvStoryEpisodeListVm$observeIfAttached$1(OgvStoryEpisodeListVm ogvStoryEpisodeListVm, Continuation<? super OgvStoryEpisodeListVm$observeIfAttached$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvStoryEpisodeListVm;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvStoryEpisodeListVm$observeIfAttached$1 ogvStoryEpisodeListVm$observeIfAttached$1 = new OgvStoryEpisodeListVm$observeIfAttached$1(this.this$0, continuation);
        ogvStoryEpisodeListVm$observeIfAttached$1.L$0 = obj;
        return ogvStoryEpisodeListVm$observeIfAttached$1;
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
        long j7 = this.this$0.f73005b;
        com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
        FlowKt.launchIn(FlowKt.onEach(new FollowSeasonRepository$flowOfFollowSeason$.inlined.map.1(com.bilibili.community.follow.c.c.b(com.bilibili.community.follow.c.a(j7))), new AnonymousClass1(this.this$0, null)), coroutineScope);
        return Unit.INSTANCE;
    }
}
