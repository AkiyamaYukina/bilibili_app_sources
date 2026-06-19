package com.bilibili.studio.comm.manager;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/AbsIgvRepositoryStrategy$getWithTimeout$2$1.class */
final class AbsIgvRepositoryStrategy$getWithTimeout$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<Object>>, Object> {
    Object L$0;
    int label;
    final c<Object> this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/AbsIgvRepositoryStrategy$getWithTimeout$2$1$a.class */
    public static final class a implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c<Object> f105372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CancellableContinuationImpl f105373b;

        public a(c cVar, CancellableContinuationImpl cancellableContinuationImpl) {
            this.f105372a = cVar;
            this.f105373b = cancellableContinuationImpl;
        }

        public final Object invoke() {
            c<Object> cVar = this.f105372a;
            List<? extends Object> list = cVar.f105381a;
            cVar.e("获取服务端策略, 接口返回 : " + (list != null ? Integer.valueOf(list.size()) : null));
            CancellableContinuationImpl cancellableContinuationImpl = this.f105373b;
            if (cancellableContinuationImpl.isActive()) {
                List<? extends Object> list2 = cVar.f105381a;
                List<? extends Object> listC = list2;
                if (list2 == null) {
                    listC = cVar.c();
                }
                cancellableContinuationImpl.resumeWith(Result.constructor-impl(listC));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsIgvRepositoryStrategy$getWithTimeout$2$1(c<Object> cVar, Continuation<? super AbsIgvRepositoryStrategy$getWithTimeout$2$1> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AbsIgvRepositoryStrategy$getWithTimeout$2$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<Object>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            c<Object> cVar = this.this$0;
            this.L$0 = cVar;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            a aVar = new a(cVar, cancellableContinuationImpl);
            synchronized (cVar) {
                List<Function0<Unit>> list = cVar.f105385e;
                if (list != null) {
                    ((ArrayList) list).add(aVar);
                }
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            obj = result;
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
