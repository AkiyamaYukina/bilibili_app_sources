package com.bilibili.ship.theseus.playlist;

import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistActionService$descExpand$1.class */
final class PlaylistActionService$descExpand$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $desc;
    int label;
    final C6241f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistActionService$descExpand$1(String str, C6241f c6241f, Continuation<? super PlaylistActionService$descExpand$1> continuation) {
        super(2, continuation);
        this.$desc = str;
        this.this$0 = c6241f;
    }

    private static final Unit invokeSuspend$lambda$0(C6241f c6241f, com.bilibili.ship.theseus.united.page.intro.module.season.D d7, com.bilibili.ogv.infra.coroutine.c cVar) {
        cVar.b(new PlaylistActionService$descExpand$1$1$1(c6241f, d7, null));
        cVar.b(new PlaylistActionService$descExpand$1$1$2(c6241f, d7, null));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistActionService$descExpand$1(this.$desc, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.united.page.intro.module.season.D d7 = new com.bilibili.ship.theseus.united.page.intro.module.season.D(this.$desc, this.this$0.f95754k);
            C6241f c6241f = this.this$0;
            this.label = 1;
            ArrayList arrayList = new ArrayList();
            invokeSuspend$lambda$0(c6241f, d7, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
            if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
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
