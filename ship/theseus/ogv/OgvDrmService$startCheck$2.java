package com.bilibili.ship.theseus.ogv;

import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvDrmService$startCheck$2.class */
final class OgvDrmService$startCheck$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final OgvDrmService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvDrmService$startCheck$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvDrmService$startCheck$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final CoroutineScope $$this$coroutineScope;
        Object L$0;
        boolean Z$0;
        int label;
        final OgvDrmService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CoroutineScope coroutineScope, OgvDrmService ogvDrmService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$$this$coroutineScope = coroutineScope;
            this.this$0 = ogvDrmService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.this$0, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0078 -> B:16:0x007e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r14 = r0
                r0 = r8
                int r0 = r0.label
                r10 = r0
                r0 = r10
                if (r0 == 0) goto L35
                r0 = r10
                r1 = 1
                if (r0 != r1) goto L2b
                r0 = r8
                boolean r0 = r0.Z$0
                r11 = r0
                r0 = r8
                java.lang.Object r0 = r0.L$0
                kotlinx.coroutines.Deferred r0 = (kotlinx.coroutines.Deferred) r0
                r13 = r0
                r0 = r9
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r13
                r9 = r0
                goto L7e
            L2b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L35:
                r0 = r9
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r8
                boolean r0 = r0.Z$0
                r12 = r0
            L3f:
                r0 = r12
                if (r0 == 0) goto L97
                r0 = r8
                kotlinx.coroutines.CoroutineScope r0 = r0.$$this$coroutineScope
                r1 = 0
                r2 = 0
                com.bilibili.ship.theseus.ogv.OgvDrmService$startCheck$2$1$requestDeferred$1 r3 = new com.bilibili.ship.theseus.ogv.OgvDrmService$startCheck$2$1$requestDeferred$1
                r4 = r3
                r5 = r8
                com.bilibili.ship.theseus.ogv.OgvDrmService r5 = r5.this$0
                r6 = 0
                r4.<init>(r5, r6)
                r4 = 3
                r5 = 0
                kotlinx.coroutines.Deferred r0 = kotlinx.coroutines.BuildersKt.async$default(r0, r1, r2, r3, r4, r5)
                r9 = r0
                r0 = r8
                r1 = r9
                r0.L$0 = r1
                r0 = r8
                r1 = r12
                r0.Z$0 = r1
                r0 = r8
                r1 = 1
                r0.label = r1
                r0 = r12
                r11 = r0
                r0 = 900000(0xdbba0, double:4.44659E-318)
                r1 = r8
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r1)
                r1 = r14
                if (r0 != r1) goto L7e
                r0 = r14
                return r0
            L7e:
                r0 = r11
                r12 = r0
                r0 = r9
                boolean r0 = r0.isCompleted()
                if (r0 != 0) goto L3f
                r0 = r9
                r1 = 0
                r2 = 1
                r3 = 0
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(r0, r1, r2, r3)
                r0 = r11
                r12 = r0
                goto L3f
            L97:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.OgvDrmService$startCheck$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvDrmService$startCheck$2(OgvDrmService ogvDrmService, Continuation<? super OgvDrmService$startCheck$2> continuation) {
        super(2, continuation);
        this.this$0 = ogvDrmService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvDrmService$startCheck$2 ogvDrmService$startCheck$2 = new OgvDrmService$startCheck$2(this.this$0, continuation);
        ogvDrmService$startCheck$2.L$0 = obj;
        return ogvDrmService$startCheck$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        com.bilibili.player.tangram.basic.a aVarI;
        int i7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            OgvDrmService ogvDrmService = this.this$0;
            this.L$0 = coroutineScope;
            this.label = 1;
            Object objA = OgvDrmService.a(ogvDrmService, this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue() && (aVarI = this.this$0.h.i()) != null) {
            Integer intOrNull = StringsKt.toIntOrNull(Hj0.a.b("drm_quality"));
            int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
            if (iIntValue != 0 && (i7 = aVarI.f79320a) > 0 && i7 > iIntValue) {
                BLog.i("OgvDrmService$startCheck$2-invokeSuspend", "[theseus-ogv-OgvDrmService$startCheck$2-invokeSuspend] Limited by quality strategy. No need to check further.");
                return Unit.INSTANCE;
            }
        }
        Flow<Boolean> flowD = CompoundPlayStateProviderKt.d(this.this$0.f91274g);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, this.this$0, null);
        this.L$0 = null;
        this.label = 2;
        if (FlowKt.collectLatest(flowD, anonymousClass1, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
