package com.bilibili.ship.theseus.ogv;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvMiniPlayerService$2$invokeSuspend$$inlined$map$1$2.class */
public final class OgvMiniPlayerService$2$invokeSuspend$$inlined$map$1$2<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowCollector f91301a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvMiniPlayerService$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvMiniPlayerService$2$invokeSuspend$$inlined$map$1$2$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;
        final OgvMiniPlayerService$2$invokeSuspend$$inlined$map$1$2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvMiniPlayerService$2$invokeSuspend$$inlined$map$1$2 ogvMiniPlayerService$2$invokeSuspend$$inlined$map$1$2, Continuation continuation) {
            super(continuation);
            this.this$0 = ogvMiniPlayerService$2$invokeSuspend$$inlined$map$1$2;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.emit(null, this);
        }
    }

    public OgvMiniPlayerService$2$invokeSuspend$$inlined$map$1$2(FlowCollector flowCollector) {
        this.f91301a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.ogv.OgvMiniPlayerService$2$invokeSuspend$$inlined$map$1$2.AnonymousClass1
            if (r0 == 0) goto L29
            r0 = r7
            com.bilibili.ship.theseus.ogv.OgvMiniPlayerService$2$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.ogv.OgvMiniPlayerService$2$invokeSuspend$$inlined$map$1$2.AnonymousClass1) r0
            r11 = r0
            r0 = r11
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r11
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r11
            r7 = r0
            goto L33
        L29:
            com.bilibili.ship.theseus.ogv.OgvMiniPlayerService$2$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.ogv.OgvMiniPlayerService$2$invokeSuspend$$inlined$map$1$2$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L33:
            r0 = r7
            java.lang.Object r0 = r0.result
            r12 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L5e
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L54
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)
            goto La9
        L54:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5e:
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            com.bilibili.lib.media.resource.ExtraInfo r0 = (com.bilibili.lib.media.resource.ExtraInfo) r0
            r6 = r0
            r0 = 0
            r10 = r0
            r0 = r10
            r9 = r0
            r0 = r6
            if (r0 == 0) goto L8b
            r0 = r10
            r9 = r0
            tb0.h r0 = Ju0.a.f11694a
            r1 = r6
            java.lang.Object r0 = r0.a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 != r1) goto L8b
            r0 = 1
            r9 = r0
        L8b:
            r0 = r9
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            r6 = r0
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r5
            kotlinx.coroutines.flow.FlowCollector r0 = r0.f91301a
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.emit(r1, r2)
            r1 = r11
            if (r0 != r1) goto La9
            r0 = r11
            return r0
        La9:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.OgvMiniPlayerService$2$invokeSuspend$$inlined$map$1$2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
