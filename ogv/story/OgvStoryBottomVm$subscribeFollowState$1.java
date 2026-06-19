package com.bilibili.ogv.story;

import android.content.Context;
import com.bilibili.community.follow.FollowSeasonRepository$flowOfFollowSeason$;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/OgvStoryBottomVm$subscribeFollowState$1.class */
final class OgvStoryBottomVm$subscribeFollowState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Context $context;
    private Object L$0;
    int label;
    final OgvStoryBottomVm this$0;

    /* JADX INFO: renamed from: com.bilibili.ogv.story.OgvStoryBottomVm$subscribeFollowState$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/OgvStoryBottomVm$subscribeFollowState$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<com.bilibili.community.follow.b, Continuation<? super Unit>, Object> {
        final Context $context;
        Object L$0;
        int label;
        final OgvStoryBottomVm this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvStoryBottomVm ogvStoryBottomVm, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvStoryBottomVm;
            this.$context = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$context, continuation);
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
            OgvStoryBottomVm ogvStoryBottomVm = this.this$0;
            ogvStoryBottomVm.f72973K = bVar.a;
            ogvStoryBottomVm.D(ogvStoryBottomVm.f72974L, this.$context);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvStoryBottomVm$subscribeFollowState$1(OgvStoryBottomVm ogvStoryBottomVm, Context context, Continuation<? super OgvStoryBottomVm$subscribeFollowState$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvStoryBottomVm;
        this.$context = context;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvStoryBottomVm$subscribeFollowState$1 ogvStoryBottomVm$subscribeFollowState$1 = new OgvStoryBottomVm$subscribeFollowState$1(this.this$0, this.$context, continuation);
        ogvStoryBottomVm$subscribeFollowState$1.L$0 = obj;
        return ogvStoryBottomVm$subscribeFollowState$1;
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
        long j7 = this.this$0.f72972J;
        com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
        FlowKt.launchIn(FlowKt.onEach(new FollowSeasonRepository$flowOfFollowSeason$.inlined.map.1(com.bilibili.community.follow.c.c.b(com.bilibili.community.follow.c.a(j7))), new AnonymousClass1(this.this$0, this.$context, null)), coroutineScope);
        return Unit.INSTANCE;
    }
}
