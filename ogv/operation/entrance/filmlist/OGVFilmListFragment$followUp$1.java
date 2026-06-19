package com.bilibili.ogv.operation.entrance.filmlist;

import com.bilibili.community.Community;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/filmlist/OGVFilmListFragment$followUp$1.class */
final class OGVFilmListFragment$followUp$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $mid;
    final boolean $targetFollow;
    int label;
    final OGVFilmListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OGVFilmListFragment$followUp$1(boolean z6, long j7, OGVFilmListFragment oGVFilmListFragment, Continuation<? super OGVFilmListFragment$followUp$1> continuation) {
        super(2, continuation);
        this.$targetFollow = z6;
        this.$mid = j7;
        this.this$0 = oGVFilmListFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OGVFilmListFragment$followUp$1(this.$targetFollow, this.$mid, this.this$0, continuation);
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
            com.bilibili.community.follow.j jVar = new com.bilibili.community.follow.j(this.$targetFollow, this.$mid, 0, this.this$0.f69993f, (String) null, (Map) null, 112);
            this.label = 1;
            if (community.b(jVar, this) == coroutine_suspended) {
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
