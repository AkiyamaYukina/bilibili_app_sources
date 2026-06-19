package com.bilibili.mediastreaming.flashpoint;

import androidx.compose.runtime.C4277b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/BiliDispatchManagementFlaspoint$startDumpReport$1$1.class */
final class BiliDispatchManagementFlaspoint$startDumpReport$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $intervalTimeMinute;
    int label;
    final BiliDispatchManagementFlaspoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliDispatchManagementFlaspoint$startDumpReport$1$1(BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint, int i7, Continuation<? super BiliDispatchManagementFlaspoint$startDumpReport$1$1> continuation) {
        super(2, continuation);
        this.this$0 = biliDispatchManagementFlaspoint;
        this.$intervalTimeMinute = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliDispatchManagementFlaspoint$startDumpReport$1$1(this.this$0, this.$intervalTimeMinute, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint = this.this$0;
        final int i7 = this.$intervalTimeMinute;
        biliDispatchManagementFlaspoint.getClass();
        biliDispatchManagementFlaspoint.logInfo("innerChangeDumpReportLoopTime, intervalTimeMinute:" + i7, null, null, null);
        Boolean bool = (Boolean) biliDispatchManagementFlaspoint.p("innerChangeDumpReportLoopTime", new Function0(biliDispatchManagementFlaspoint, i7) { // from class: com.bilibili.mediastreaming.flashpoint.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliDispatchManagementFlaspoint f66011a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f66012b;

            {
                this.f66011a = biliDispatchManagementFlaspoint;
                this.f66012b = i7;
            }

            public final Object invoke() {
                Boolean bool2;
                StringBuilder sb = new StringBuilder("innerChangeDumpReportLoopTime, intervalTime ");
                int i8 = this.f66012b;
                String strA = C4277b.a(i8, "minute", sb);
                BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint2 = this.f66011a;
                biliDispatchManagementFlaspoint2.logInfo(strA, null, null, null);
                if (i8 < 1) {
                    bool2 = Boolean.FALSE;
                } else {
                    biliDispatchManagementFlaspoint2.f65998t = i8 * 60000;
                    biliDispatchManagementFlaspoint2.f65995q = 0L;
                    bool2 = Boolean.TRUE;
                }
                return bool2;
            }
        });
        if (!(bool != null ? bool.booleanValue() : false)) {
            return Unit.INSTANCE;
        }
        BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint2 = this.this$0;
        biliDispatchManagementFlaspoint2.logInfo(com.bilibili.app.comm.bh.x5.b.a("isStartDoDumpReports:", biliDispatchManagementFlaspoint2.f65992n), null, null, null);
        BiliDispatchManagementFlaspoint biliDispatchManagementFlaspoint3 = this.this$0;
        if (!biliDispatchManagementFlaspoint3.f65992n) {
            BiliDispatchManagementFlaspoint.m(biliDispatchManagementFlaspoint3);
            this.this$0.f65992n = true;
        }
        return Unit.INSTANCE;
    }
}
