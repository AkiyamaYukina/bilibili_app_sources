package com.bilibili.lib.push;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/RedDotHelper$setRedDot$1.class */
public final class RedDotHelper$setRedDot$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Context $context;
    final int $num;
    final int $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedDotHelper$setRedDot$1(int i7, Context context, int i8, Continuation<? super RedDotHelper$setRedDot$1> continuation) {
        super(2, continuation);
        this.$source = i7;
        this.$context = context;
        this.$num = i8;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RedDotHelper$setRedDot$1(this.$source, this.$context, this.$num, continuation);
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
            int i8 = this.$source;
            if (i8 != RedDotBiz.FOLLOWING.getCode()) {
                if (i8 == RedDotBiz.SDK.getCode()) {
                    Context context = this.$context;
                    int i9 = this.$num;
                    B bA = A.a(context);
                    if (bA != null) {
                        bA.b(i9, context);
                    }
                }
                return Unit.INSTANCE;
            }
            Context context2 = this.$context;
            this.label = 1;
            Object objB = A.f64160e == null ? A.f64156a.b(context2, this) : Boxing.boxBoolean(A.f64158c);
            obj2 = objB;
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        }
        if (((Boolean) obj2).booleanValue()) {
            Context context3 = this.$context;
            int i10 = this.$num;
            B bA2 = A.a(context3);
            if (bA2 != null) {
                bA2.b(i10, context3);
            }
        } else {
            BPushLog.i("RedDotHelper", "setRedDot not in exp, biz = " + this.$source);
        }
        return Unit.INSTANCE;
    }
}
