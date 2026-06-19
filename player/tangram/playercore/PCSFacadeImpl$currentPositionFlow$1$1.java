package com.bilibili.player.tangram.playercore;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$currentPositionFlow$1$1.class */
public final class PCSFacadeImpl$currentPositionFlow$1$1 extends SuspendLambda implements Function2<FlowCollector<? super Duration>, Continuation<? super Unit>, Object> {
    final MutableStateFlow<Duration> $it;
    private Object L$0;
    int label;

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSFacadeImpl$currentPositionFlow$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$currentPositionFlow$1$1$1.class */
    public static final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlowCollector<Duration> f79407a;

        public AnonymousClass1(FlowCollector<? super Duration> flowCollector) {
            this.f79407a = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(long r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            /*
                r5 = this;
                r0 = r8
                boolean r0 = r0 instanceof com.bilibili.player.tangram.playercore.PCSFacadeImpl$currentPositionFlow$1$1$1$emit_VtjQ1oo$1
                if (r0 == 0) goto L2c
                r0 = r8
                com.bilibili.player.tangram.playercore.PCSFacadeImpl$currentPositionFlow$1$1$1$emit_VtjQ1oo$1 r0 = (com.bilibili.player.tangram.playercore.PCSFacadeImpl$currentPositionFlow$1$1$1$emit_VtjQ1oo$1) r0
                r10 = r0
                r0 = r10
                int r0 = r0.label
                r9 = r0
                r0 = r9
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L2c
                r0 = r10
                r1 = r9
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.label = r1
                r0 = r10
                r8 = r0
                goto L36
            L2c:
                com.bilibili.player.tangram.playercore.PCSFacadeImpl$currentPositionFlow$1$1$1$emit_VtjQ1oo$1 r0 = new com.bilibili.player.tangram.playercore.PCSFacadeImpl$currentPositionFlow$1$1$1$emit_VtjQ1oo$1
                r1 = r0
                r2 = r5
                r3 = r8
                r1.<init>(r2, r3)
                r8 = r0
            L36:
                r0 = r8
                java.lang.Object r0 = r0.result
                r11 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r10 = r0
                r0 = r8
                int r0 = r0.label
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L72
                r0 = r9
                r1 = 1
                if (r0 == r1) goto L6a
                r0 = r9
                r1 = 2
                if (r0 != r1) goto L60
                r0 = r11
                kotlin.ResultKt.throwOnFailure(r0)
                goto Laa
            L60:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L6a:
                r0 = r11
                kotlin.ResultKt.throwOnFailure(r0)
                goto L96
            L72:
                r0 = r11
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r6
                kotlin.time.Duration r0 = kotlin.time.Duration.box-impl(r0)
                r11 = r0
                r0 = r8
                r1 = 1
                r0.label = r1
                r0 = r5
                kotlinx.coroutines.flow.FlowCollector<kotlin.time.Duration> r0 = r0.f79407a
                r1 = r11
                r2 = r8
                java.lang.Object r0 = r0.emit(r1, r2)
                r1 = r10
                if (r0 != r1) goto L96
                r0 = r10
                return r0
            L96:
                r0 = r8
                r1 = 2
                r0.label = r1
                r0 = 100
                r1 = r8
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r1)
                r1 = r10
                if (r0 != r1) goto Laa
                r0 = r10
                return r0
            Laa:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSFacadeImpl$currentPositionFlow$1$1.AnonymousClass1.a(long, kotlin.coroutines.Continuation):java.lang.Object");
        }

        public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return a(((Duration) obj).unbox-impl(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PCSFacadeImpl$currentPositionFlow$1$1(MutableStateFlow<Duration> mutableStateFlow, Continuation<? super PCSFacadeImpl$currentPositionFlow$1$1> continuation) {
        super(2, continuation);
        this.$it = mutableStateFlow;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PCSFacadeImpl$currentPositionFlow$1$1 pCSFacadeImpl$currentPositionFlow$1$1 = new PCSFacadeImpl$currentPositionFlow$1$1(this.$it, continuation);
        pCSFacadeImpl$currentPositionFlow$1$1.L$0 = obj;
        return pCSFacadeImpl$currentPositionFlow$1$1;
    }

    public final Object invoke(FlowCollector<? super Duration> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            MutableStateFlow<Duration> mutableStateFlow = this.$it;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(flowCollector);
            this.label = 1;
            if (mutableStateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
