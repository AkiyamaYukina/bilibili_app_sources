package com.bilibili.ogv.story;

import com.bilibili.community.Community;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/OgvStorySeasonListDialog$1$1.class */
final class OgvStorySeasonListDialog$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $followed;
    int label;
    final OgvStorySeasonListDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvStorySeasonListDialog$1$1(boolean z6, OgvStorySeasonListDialog ogvStorySeasonListDialog, Continuation<? super OgvStorySeasonListDialog$1$1> continuation) {
        super(2, continuation);
        this.$followed = z6;
        this.this$0 = ogvStorySeasonListDialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvStorySeasonListDialog$1$1(this.$followed, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Community community = Community.a;
            com.bilibili.community.follow.d dVar = new com.bilibili.community.follow.d(this.$followed, this.this$0.f73032a, (Long) null);
            this.label = 1;
            if (community.g(dVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((Result) obj).unbox-impl();
        }
        return Unit.INSTANCE;
    }
}
