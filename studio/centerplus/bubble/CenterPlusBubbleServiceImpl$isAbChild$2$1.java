package com.bilibili.studio.centerplus.bubble;

import android.app.Application;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.studio.centerplus.bubble.b;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;
import yw0.C9103a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/bubble/CenterPlusBubbleServiceImpl$isAbChild$2$1.class */
final class CenterPlusBubbleServiceImpl$isAbChild$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    Object L$0;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/bubble/CenterPlusBubbleServiceImpl$isAbChild$2$1$a.class */
    public static final class a implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CancellableContinuationImpl f105098a;

        public a(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f105098a = cancellableContinuationImpl;
        }

        public final Object invoke(Object obj) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            CancellableContinuationImpl cancellableContinuationImpl = this.f105098a;
            if (cancellableContinuationImpl.isActive()) {
                cancellableContinuationImpl.resumeWith(Result.constructor-impl(bool));
            }
            return Unit.INSTANCE;
        }
    }

    public CenterPlusBubbleServiceImpl$isAbChild$2$1(Continuation<? super CenterPlusBubbleServiceImpl$isAbChild$2$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CenterPlusBubbleServiceImpl$isAbChild$2$1(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Application application = BiliContext.application();
            if (application != null && BiliAccounts.get(application).isLogin()) {
                Lazy<Boolean> lazy = b.f105099a;
                BLog.i("CenterPlusBubbleServiceImpl", "isAbChild, enable = " + b.a.a());
                if (!b.a.a()) {
                    return Boxing.boxBoolean(false);
                }
                this.L$0 = application;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                long jMid = BiliAccounts.get(application).mid();
                String str = C9103a.f129912a;
                String strA = C9103a.C1393a.a();
                kntr.app.upper.entrance.bubble.b bVar = kntr.app.upper.entrance.bubble.b.a;
                kntr.app.upper.entrance.bubble.b.c(String.valueOf(jMid), strA, new a(cancellableContinuationImpl));
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                obj = result;
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(false);
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return obj;
    }
}
