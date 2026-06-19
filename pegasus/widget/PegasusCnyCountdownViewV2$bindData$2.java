package com.bilibili.pegasus.widget;

import androidx.compose.foundation.gestures.o0;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.pegasus.widget.PegasusCnyCountdownViewV2;
import gp0.C7373a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widget/PegasusCnyCountdownViewV2$bindData$2.class */
public final class PegasusCnyCountdownViewV2$bindData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final C7373a $countdownData;
    final Function0<Unit> $onCountdownEnd;
    Object L$0;
    int label;
    final PegasusCnyCountdownViewV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PegasusCnyCountdownViewV2$bindData$2(PegasusCnyCountdownViewV2 pegasusCnyCountdownViewV2, C7373a c7373a, Function0<Unit> function0, Continuation<? super PegasusCnyCountdownViewV2$bindData$2> continuation) {
        super(2, continuation);
        this.this$0 = pegasusCnyCountdownViewV2;
        this.$countdownData = c7373a;
        this.$onCountdownEnd = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PegasusCnyCountdownViewV2$bindData$2(this.this$0, this.$countdownData, this.$onCountdownEnd, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Ref.LongRef longRefB;
        Object obj2;
        long jCoerceAtLeast;
        Object obj3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            longRefB = o0.b(obj);
            obj2 = coroutine_suspended;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            longRefB = (Ref.LongRef) this.L$0;
            ResultKt.throwOnFailure(obj);
            obj2 = coroutine_suspended;
        }
        do {
            PegasusCnyCountdownViewV2 pegasusCnyCountdownViewV2 = this.this$0;
            C7373a c7373a = this.$countdownData;
            int i8 = PegasusCnyCountdownViewV2.h;
            pegasusCnyCountdownViewV2.getClass();
            if (c7373a == null) {
                jCoerceAtLeast = -1;
            } else {
                jCoerceAtLeast = -1;
                if (c7373a.d() > 0) {
                    String strC = c7373a.c();
                    jCoerceAtLeast = -1;
                    if (strC != null) {
                        jCoerceAtLeast = StringsKt.isBlank(strC) ? -1L : RangesKt.coerceAtLeast(c7373a.d() - ij.d.b(), 0L);
                    }
                }
            }
            longRefB.element = jCoerceAtLeast;
            if (jCoerceAtLeast <= 0) {
                this.$onCountdownEnd.invoke();
                return Unit.INSTANCE;
            }
            PegasusCnyCountdownViewV2 pegasusCnyCountdownViewV22 = this.this$0;
            String strB = this.$countdownData.b();
            String strF = this.$countdownData.f();
            String strA = this.$countdownData.a();
            MutableStateFlow<PegasusCnyCountdownViewV2.b> mutableStateFlow = pegasusCnyCountdownViewV22.f79107a;
            long j7 = 86400;
            long j8 = jCoerceAtLeast / j7;
            long j9 = jCoerceAtLeast - (j7 * j8);
            long j10 = 3600;
            long j11 = j9 / j10;
            long jCoerceAtMost = RangesKt.coerceAtMost(jCoerceAtLeast / j10, 99L);
            long j12 = 60;
            mutableStateFlow.setValue(new PegasusCnyCountdownViewV2.b(new PegasusCnyCountdownViewV2.a(PegasusCnyCountdownViewV2.b(j8), PegasusCnyCountdownViewV2.b(jCoerceAtMost), PegasusCnyCountdownViewV2.b((j9 - (j11 * j10)) / j12), PegasusCnyCountdownViewV2.b(jCoerceAtLeast % j12)), ListExtentionsKt.toColorInt(strB, -5104381), ListExtentionsKt.toColorInt(strF, -264193), strA));
            this.L$0 = longRefB;
            this.label = 1;
            obj3 = obj2;
            obj2 = obj3;
        } while (DelayKt.delay(1000L, this) != obj3);
        return obj3;
    }
}
