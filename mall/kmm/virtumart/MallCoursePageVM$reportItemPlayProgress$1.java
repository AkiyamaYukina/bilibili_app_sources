package com.bilibili.mall.kmm.virtumart;

import com.bilibili.mall.kmm.virtumart.api.b;
import ih0.C7577d;
import java.util.concurrent.CancellationException;
import kntr.base.log.ILogger;
import kntr.base.log.KLog_androidKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/virtumart/MallCoursePageVM$reportItemPlayProgress$1.class */
public final class MallCoursePageVM$reportItemPlayProgress$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $finished;
    final C7577d $playItem;
    final long $watchProcess;
    long J$0;
    int label;
    final MallCoursePageVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MallCoursePageVM$reportItemPlayProgress$1(C7577d c7577d, boolean z6, long j7, MallCoursePageVM mallCoursePageVM, Continuation<? super MallCoursePageVM$reportItemPlayProgress$1> continuation) {
        super(2, continuation);
        this.$playItem = c7577d;
        this.$finished = z6;
        this.$watchProcess = j7;
        this.this$0 = mallCoursePageVM;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MallCoursePageVM$reportItemPlayProgress$1(this.$playItem, this.$finished, this.$watchProcess, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Long l7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ILogger kLog = KLog_androidKt.getKLog();
                C7577d c7577d = this.$playItem;
                kLog.d("MallCourseDetail-->", "reportItemPlayProgress->sectionId:[" + c7577d.f121704e + "];finished:[" + this.$finished + "];watchProcess:[" + this.$watchProcess + "];needReport:[" + c7577d.f121714p + "]");
                if (Intrinsics.areEqual(this.$playItem.f121714p, Boxing.boxBoolean(true)) && (l7 = this.$playItem.f121704e) != null) {
                    long jLongValue = l7.longValue();
                    b bVar = (b) this.this$0.f65680d.getValue();
                    MallCoursePageVM mallCoursePageVM = this.this$0;
                    String str = mallCoursePageVM.f65679c;
                    String str2 = mallCoursePageVM.f65678b;
                    boolean z6 = this.$finished;
                    long j7 = this.$watchProcess;
                    this.J$0 = jLongValue;
                    this.label = 1;
                    if (bVar.c(str, str2, jLongValue, z6, j7, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } catch (CancellationException e7) {
            throw e7;
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return Unit.INSTANCE;
    }
}
