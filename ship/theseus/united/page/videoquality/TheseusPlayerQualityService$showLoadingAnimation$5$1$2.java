package com.bilibili.ship.theseus.united.page.videoquality;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$showLoadingAnimation$5$1$2.class */
public final class TheseusPlayerQualityService$showLoadingAnimation$5$1$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final int $quality;
    int label;
    final TheseusPlayerQualityService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService$showLoadingAnimation$5$1$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$showLoadingAnimation$5$1$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<com.bilibili.player.tangram.basic.a, Continuation<? super Boolean>, Object> {
        final int $quality;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$quality = i7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$quality, continuation);
            anonymousClass1.L$0 = (com.bilibili.player.tangram.basic.a) obj;
            return anonymousClass1;
        }

        /* JADX INFO: renamed from: invoke-Ivnldq8, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Object invoke(com.bilibili.player.tangram.basic.a aVar, Continuation<? super Boolean> continuation) {
            return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.bilibili.player.tangram.basic.a aVar = (com.bilibili.player.tangram.basic.a) this.L$0;
            return Boxing.boxBoolean(aVar == null ? false : com.bilibili.player.tangram.basic.a.b(aVar.f79320a, this.$quality));
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService$showLoadingAnimation$5$1$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$showLoadingAnimation$5$1$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Boolean>, Object> {
        Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Boolean> continuation) {
            return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((PlayerAvailability) this.L$0) == PlayerAvailability.READY);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayerQualityService$showLoadingAnimation$5$1$2(TheseusPlayerQualityService theseusPlayerQualityService, int i7, Continuation<? super TheseusPlayerQualityService$showLoadingAnimation$5$1$2> continuation) {
        super(1, continuation);
        this.this$0 = theseusPlayerQualityService;
        this.$quality = i7;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TheseusPlayerQualityService$showLoadingAnimation$5$1$2(this.this$0, this.$quality, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r5
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L3b
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L34
            r0 = r7
            r1 = 2
            if (r0 == r1) goto L2d
            r0 = r7
            r1 = 3
            if (r0 != r1) goto L23
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r0)
            goto La7
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L2d:
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r0)
            goto L7e
        L34:
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r0)
            goto L6c
        L3b:
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService r0 = r0.this$0
            com.bilibili.ship.theseus.keel.player.j r0 = r0.f103789q
            kotlinx.coroutines.flow.Flow r0 = r0.H()
            r9 = r0
            com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService$showLoadingAnimation$5$1$2$1 r0 = new com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService$showLoadingAnimation$5$1$2$1
            r1 = r0
            r2 = r5
            int r2 = r2.$quality
            r3 = 0
            r1.<init>(r2, r3)
            r6 = r0
            r0 = r5
            r1 = 1
            r0.label = r1
            r0 = r9
            r1 = r6
            r2 = r5
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.first(r0, r1, r2)
            r1 = r8
            if (r0 != r1) goto L6c
            r0 = r8
            return r0
        L6c:
            r0 = r5
            r1 = 2
            r0.label = r1
            r0 = 500(0x1f4, double:2.47E-321)
            r1 = r5
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r1)
            r1 = r8
            if (r0 != r1) goto L7e
            r0 = r8
            return r0
        L7e:
            r0 = r5
            com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService r0 = r0.this$0
            com.bilibili.ship.theseus.keel.player.j r0 = r0.f103789q
            kotlinx.coroutines.flow.Flow r0 = r0.d()
            r6 = r0
            com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService$showLoadingAnimation$5$1$2$2 r0 = new com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService$showLoadingAnimation$5$1$2$2
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r9 = r0
            r0 = r5
            r1 = 3
            r0.label = r1
            r0 = r6
            r1 = r9
            r2 = r5
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.first(r0, r1, r2)
            r1 = r8
            if (r0 != r1) goto La7
            r0 = r8
            return r0
        La7:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService$showLoadingAnimation$5$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
