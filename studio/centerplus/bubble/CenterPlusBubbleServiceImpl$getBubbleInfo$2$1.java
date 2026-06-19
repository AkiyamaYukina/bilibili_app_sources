package com.bilibili.studio.centerplus.bubble;

import android.app.Application;
import ci0.InterfaceC5262d;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.studio.centerplus.bubble.b;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;
import yw0.C9103a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/bubble/CenterPlusBubbleServiceImpl$getBubbleInfo$2$1.class */
final class CenterPlusBubbleServiceImpl$getBubbleInfo$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC5262d.a>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final b this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/bubble/CenterPlusBubbleServiceImpl$getBubbleInfo$2$1$a.class */
    public static final class a implements Function1<kntr.app.upper.entrance.bubble.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CancellableContinuationImpl f105096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f105097b;

        public a(CancellableContinuationImpl cancellableContinuationImpl, b bVar) {
            this.f105096a = cancellableContinuationImpl;
            this.f105097b = bVar;
        }

        public final Object invoke(Object obj) {
            InterfaceC5262d.a aVar;
            kntr.app.upper.entrance.bubble.a aVar2 = (kntr.app.upper.entrance.bubble.a) obj;
            CancellableContinuationImpl cancellableContinuationImpl = this.f105096a;
            if (cancellableContinuationImpl.isActive()) {
                Result.Companion companion = Result.Companion;
                Lazy<Boolean> lazy = b.f105099a;
                this.f105097b.getClass();
                if (aVar2 == null) {
                    aVar = null;
                } else {
                    aVar = new InterfaceC5262d.a(aVar2.a, aVar2.b, aVar2.c, aVar2.d, aVar2.e, aVar2.f, aVar2.g, aVar2.h, aVar2.i, aVar2.j, aVar2.k, aVar2.l);
                }
                cancellableContinuationImpl.resumeWith(Result.constructor-impl(aVar));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenterPlusBubbleServiceImpl$getBubbleInfo$2$1(b bVar, Continuation<? super CenterPlusBubbleServiceImpl$getBubbleInfo$2$1> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CenterPlusBubbleServiceImpl$getBubbleInfo$2$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC5262d.a> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Application application = BiliContext.application();
            if (application == null || !BiliAccounts.get(application).isLogin()) {
                return null;
            }
            Lazy<Boolean> lazy = b.f105099a;
            BLog.i("CenterPlusBubbleServiceImpl", "getBubbleInfo, enable = " + b.a.a());
            if (!b.a.a()) {
                return null;
            }
            b bVar = this.this$0;
            this.L$0 = application;
            this.L$1 = bVar;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            long jMid = BiliAccounts.get(application).mid();
            String str = C9103a.f129912a;
            String strA = C9103a.C1393a.a();
            kntr.app.upper.entrance.bubble.b bVar2 = kntr.app.upper.entrance.bubble.b.a;
            kntr.app.upper.entrance.bubble.b.b(String.valueOf(jMid), strA, new a(cancellableContinuationImpl, bVar));
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
