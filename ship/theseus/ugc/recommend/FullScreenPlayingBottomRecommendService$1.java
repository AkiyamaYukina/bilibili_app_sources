package com.bilibili.ship.theseus.ugc.recommend;

import com.bilibili.app.gemini.ugc.feature.o;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6320j;
import com.bilibili.ship.theseus.united.page.intro.module.relate.o0;
import com.bilibili.ship.theseus.united.page.intro.module.relate.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/recommend/FullScreenPlayingBottomRecommendService$1.class */
final class FullScreenPlayingBottomRecommendService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenPlayingBottomRecommendService$1(g gVar, Continuation<? super FullScreenPlayingBottomRecommendService$1> continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FullScreenPlayingBottomRecommendService$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<q0> stateFlow = this.this$0.f98431c.f100853c;
            this.label = 1;
            Object objA = com.bilibili.ogv.infra.coroutine.b.a(stateFlow, this);
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
        List<o> list = this.this$0.f98433e;
        List<o0> list2 = ((q0) obj).f101364a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            o oVarA = C6320j.a((o0) it.next());
            if (oVarA != null) {
                arrayList.add(oVarA);
            }
        }
        ((ArrayList) list).addAll(arrayList);
        return Unit.INSTANCE;
    }
}
