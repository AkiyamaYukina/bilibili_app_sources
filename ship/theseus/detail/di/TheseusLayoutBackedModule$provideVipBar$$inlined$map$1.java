package com.bilibili.ship.theseus.detail.di;

import com.bilibili.ship.theseus.united.page.intro.module.promptbar.c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/di/TheseusLayoutBackedModule$provideVipBar$$inlined$map$1.class */
public final class TheseusLayoutBackedModule$provideVipBar$$inlined$map$1 implements Flow<c.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Flow f90992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6143c f90993b;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.di.TheseusLayoutBackedModule$provideVipBar$$inlined$map$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/di/TheseusLayoutBackedModule$provideVipBar$$inlined$map$1$2.class */
    public static final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlowCollector f90994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C6143c f90995b;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.di.TheseusLayoutBackedModule$provideVipBar$$inlined$map$1$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/di/TheseusLayoutBackedModule$provideVipBar$$inlined$map$1$2$1.class */
        public static final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
            int label;
            Object result;
            final AnonymousClass2 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                super(continuation);
                this.this$0 = anonymousClass2;
            }

            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector, C6143c c6143c) {
            this.f90994a = flowCollector;
            this.f90995b = c6143c;
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
                boolean r0 = r0 instanceof com.bilibili.ship.theseus.detail.di.TheseusLayoutBackedModule$provideVipBar$$inlined$map$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L29
                r0 = r7
                com.bilibili.ship.theseus.detail.di.TheseusLayoutBackedModule$provideVipBar$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.detail.di.TheseusLayoutBackedModule$provideVipBar$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                r10 = r0
                r0 = r10
                int r0 = r0.label
                r8 = r0
                r0 = r8
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L29
                r0 = r10
                r1 = r8
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                int r1 = r1 + r2
                r0.label = r1
                r0 = r10
                r7 = r0
                goto L33
            L29:
                com.bilibili.ship.theseus.detail.di.TheseusLayoutBackedModule$provideVipBar$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.detail.di.TheseusLayoutBackedModule$provideVipBar$$inlined$map$1$2$1
                r1 = r0
                r2 = r5
                r3 = r7
                r1.<init>(r2, r3)
                r7 = r0
            L33:
                r0 = r7
                java.lang.Object r0 = r0.result
                r11 = r0
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r10 = r0
                r0 = r7
                int r0 = r0.label
                r8 = r0
                r0 = r8
                if (r0 == 0) goto L5e
                r0 = r8
                r1 = 1
                if (r0 != r1) goto L54
                r0 = r11
                kotlin.ResultKt.throwOnFailure(r0)
                goto Laf
            L54:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r0
            L5e:
                r0 = r11
                kotlin.ResultKt.throwOnFailure(r0)
                r0 = r6
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                r9 = r0
                r0 = r5
                com.bilibili.ship.theseus.detail.di.c r0 = r0.f90995b
                r6 = r0
                r0 = r9
                if (r0 == 0) goto L88
                com.bilibili.ship.theseus.united.page.intro.module.promptbar.c$a r0 = new com.bilibili.ship.theseus.united.page.intro.module.promptbar.c$a
                r1 = r0
                r2 = r6
                pu0.b r2 = r2.b()
                android.widget.FrameLayout r2 = r2.f125596s
                r1.<init>(r2)
                r6 = r0
                goto L97
            L88:
                com.bilibili.ship.theseus.united.page.intro.module.promptbar.c$a r0 = new com.bilibili.ship.theseus.united.page.intro.module.promptbar.c$a
                r1 = r0
                r2 = r6
                pu0.c r2 = r2.a()
                com.bilibili.ship.theseus.united.page.behavior.CollapsableChildFrameLayout r2 = r2.f125627z
                r1.<init>(r2)
                r6 = r0
            L97:
                r0 = r7
                r1 = 1
                r0.label = r1
                r0 = r5
                kotlinx.coroutines.flow.FlowCollector r0 = r0.f90994a
                r1 = r6
                r2 = r7
                java.lang.Object r0 = r0.emit(r1, r2)
                r1 = r10
                if (r0 != r1) goto Laf
                r0 = r10
                return r0
            Laf:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.detail.di.TheseusLayoutBackedModule$provideVipBar$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public TheseusLayoutBackedModule$provideVipBar$$inlined$map$1(Flow flow, C6143c c6143c) {
        this.f90992a = flow;
        this.f90993b = c6143c;
    }

    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f90992a.collect(new AnonymousClass2(flowCollector, this.f90993b), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
