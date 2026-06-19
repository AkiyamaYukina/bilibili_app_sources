package com.bilibili.ship.theseus.united.page.miniplayer;

import com.bilibili.base.BiliContext;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import sv0.C8627a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/DetailMiniPlayerService$calculateEnterMiniPlayer$1.class */
final class DetailMiniPlayerService$calculateEnterMiniPlayer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final b this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/DetailMiniPlayerService$calculateEnterMiniPlayer$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f102024a;

        public a(b bVar) {
            this.f102024a = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x02c0  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0270  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0278  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x02b0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) {
            /*
                Method dump skipped, instruction units count: 720
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.miniplayer.DetailMiniPlayerService$calculateEnterMiniPlayer$1.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailMiniPlayerService$calculateEnterMiniPlayer$1(b bVar, Continuation<? super DetailMiniPlayerService$calculateEnterMiniPlayer$1> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailMiniPlayerService$calculateEnterMiniPlayer$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.f102062s = BiliContext.isVisible() && BiliContext.topActivity() != null && BiliContext.topActivity() == this.this$0.f102049e;
            b bVar = this.this$0;
            Flow<C8627a> flow = bVar.f102058o;
            a aVar = new a(bVar);
            this.label = 1;
            if (flow.collect(aVar, this) == coroutine_suspended) {
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
