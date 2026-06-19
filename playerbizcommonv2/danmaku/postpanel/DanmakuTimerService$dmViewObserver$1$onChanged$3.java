package com.bilibili.playerbizcommonv2.danmaku.postpanel;

import com.bapis.bilibili.community.service.dm.v1.PostPanelV2;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/postpanel/DanmakuTimerService$dmViewObserver$1$onChanged$3.class */
public final class DanmakuTimerService$dmViewObserver$1$onChanged$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final a $timerStrategy;
    int label;
    final DanmakuTimerService this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.postpanel.DanmakuTimerService$dmViewObserver$1$onChanged$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/postpanel/DanmakuTimerService$dmViewObserver$1$onChanged$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Hr0.c, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final DanmakuTimerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DanmakuTimerService danmakuTimerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = danmakuTimerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(Hr0.c cVar, Continuation<? super Unit> continuation) {
            return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object next;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Hr0.c cVar = (Hr0.c) this.L$0;
            List<PostPanelV2> list = this.this$0.f81214e.get(cVar != null ? Boxing.boxLong(cVar.f8753a) : null);
            List<PostPanelV2> listEmptyList = list;
            if (list == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (cVar == null || listEmptyList.isEmpty()) {
                DanmakuTimerService.e(this.this$0, null);
                return Unit.INSTANCE;
            }
            listEmptyList.size();
            DanmakuTimerService danmakuTimerService = this.this$0;
            Iterator<T> it = listEmptyList.iterator();
            do {
                next = null;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            } while (!e.a((PostPanelV2) next, cVar.f8754b));
            DanmakuTimerService.e(danmakuTimerService, (PostPanelV2) next);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DanmakuTimerService$dmViewObserver$1$onChanged$3(a aVar, DanmakuTimerService danmakuTimerService, Continuation<? super DanmakuTimerService$dmViewObserver$1$onChanged$3> continuation) {
        super(2, continuation);
        this.$timerStrategy = aVar;
        this.this$0 = danmakuTimerService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DanmakuTimerService$dmViewObserver$1$onChanged$3(this.$timerStrategy, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow stateFlowA = this.$timerStrategy.a();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowA, anonymousClass1, this) == coroutine_suspended) {
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
