package com.bilibili.ship.theseus.ugc.weblayer;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$seekPosition$1$2.class */
final class NoteFloatLayerService$seekPosition$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $position;
    int label;
    final NoteFloatLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFloatLayerService$seekPosition$1$2(NoteFloatLayerService noteFloatLayerService, int i7, Continuation<? super NoteFloatLayerService$seekPosition$1$2> continuation) {
        super(2, continuation);
        this.this$0 = noteFloatLayerService;
        this.$position = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NoteFloatLayerService$seekPosition$1$2(this.this$0, this.$position, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.keel.player.j jVarJ = this.this$0.f98598c.j();
            if (jVarJ != null) {
                long j7 = this.$position;
                this.label = 1;
                Object objY = jVarJ.y(j7, false, this);
                obj = objY;
                if (objY == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
