package com.bilibili.ship.theseus.ogv.intro.filmlist.floatlayer.allfilm;

import androidx.compose.runtime.State;
import com.bilibili.community.Community;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.ship.theseus.united.utils.q;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/floatlayer/allfilm/OgvAllFilmsLayerService$showAllFilmsLayer$1$component$1$4$1$1.class */
public final class OgvAllFilmsLayerService$showAllFilmsLayer$1$component$1$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $filmListId;
    final State<Boolean> $hasFavored$delegate;
    int label;
    final OgvAllFilmsLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvAllFilmsLayerService$showAllFilmsLayer$1$component$1$4$1$1(OgvAllFilmsLayerService ogvAllFilmsLayerService, long j7, State<Boolean> state, Continuation<? super OgvAllFilmsLayerService$showAllFilmsLayer$1$component$1$4$1$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvAllFilmsLayerService;
        this.$filmListId = j7;
        this.$hasFavored$delegate = state;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvAllFilmsLayerService$showAllFilmsLayer$1$component$1$4$1$1(this.this$0, this.$filmListId, this.$hasFavored$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!com.bilibili.ogv.infra.account.a.f67852b.isLogin()) {
                BLRouter.routeTo(ec.c.a("bilibili://login"), this.this$0.f92698a);
                return Unit.INSTANCE;
            }
            Community community = Community.a;
            long j7 = this.$filmListId;
            boolean zInvokeSuspend$lambda$2$3 = OgvAllFilmsLayerService$showAllFilmsLayer$1.invokeSuspend$lambda$2$3(this.$hasFavored$delegate);
            this.label = 1;
            Object objF = community.f(j7, this, zInvokeSuspend$lambda$2$3);
            obj2 = objF;
            if (objF == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        OgvAllFilmsLayerService ogvAllFilmsLayerService = this.this$0;
        if (Result.isSuccess-impl(obj2)) {
            if (((Boolean) obj2).booleanValue()) {
                q.c(ogvAllFilmsLayerService.f92698a.getString(2131854827));
            } else {
                q.c(ogvAllFilmsLayerService.f92698a.getString(2131854830));
            }
        }
        Result.box-impl(obj2);
        return Unit.INSTANCE;
    }
}
