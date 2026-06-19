package com.bilibili.ogv.infra.tempfile;

import com.bilibili.ogv.infra.tempfile.e;
import java.io.File;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/tempfile/TempFileManager$State$job$1.class */
final class TempFileManager$State$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final e.a this$0;
    final e this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TempFileManager$State$job$1(e.a aVar, e eVar, Continuation<? super TempFileManager$State$job$1> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.this$1 = eVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TempFileManager$State$job$1 tempFileManager$State$job$1 = new TempFileManager$State$job$1(this.this$0, this.this$1, continuation);
        tempFileManager$State$job$1.L$0 = obj;
        return tempFileManager$State$job$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                e.a aVar = this.this$0;
                Result.Companion companion = Result.Companion;
                this.label = 1;
                Object objA = aVar.a(this);
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
            obj2 = Result.constructor-impl((File) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th));
        }
        this.this$0.f67947b = Result.box-impl(obj2);
        if (Result.isFailure-impl(obj2)) {
            this.this$1.f67945d.remove(this.this$0.f67946a.a());
        }
        return Unit.INSTANCE;
    }
}
