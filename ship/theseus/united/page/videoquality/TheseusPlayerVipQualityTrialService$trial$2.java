package com.bilibili.ship.theseus.united.page.videoquality;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreServiceKtxKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerVipQualityTrialService$trial$2.class */
final class TheseusPlayerVipQualityTrialService$trial$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    long J$0;
    private Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final TheseusPlayerVipQualityTrialService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerVipQualityTrialService$trial$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerVipQualityTrialService$trial$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.BooleanRef $hasShowToast;
        final long $timeLength;
        final vk.e $trialInfo;
        int label;
        final TheseusPlayerVipQualityTrialService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(vk.e eVar, TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService, long j7, Ref.BooleanRef booleanRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$trialInfo = eVar;
            this.this$0 = theseusPlayerVipQualityTrialService;
            this.$timeLength = j7;
            this.$hasShowToast = booleanRef;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$trialInfo, this.this$0, this.$timeLength, this.$hasShowToast, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (vk.f.a(this.$trialInfo.i, 2)) {
                    IPlayerCoreService iPlayerCoreService = this.this$0.f103816b;
                    this.label = 1;
                    if (IPlayerCoreServiceKtxKt.a(iPlayerCoreService, Duration.getInWholeMilliseconds-impl(this.$timeLength) - ((long) 5000), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    long j7 = this.$timeLength;
                    Duration.Companion companion = Duration.Companion;
                    long j8 = Duration.minus-LRDsOJo(j7, DurationKt.toDuration(5, DurationUnit.SECONDS));
                    this.label = 2;
                    if (DelayKt.delay-VtjQ1oo(j8, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i7 != 1 && i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            TheseusPlayerVipQualityTrialService.b(this.this$0, this.$trialInfo);
            this.$hasShowToast.element = true;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayerVipQualityTrialService$trial$2(TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService, Continuation<? super TheseusPlayerVipQualityTrialService$trial$2> continuation) {
        super(2, continuation);
        this.this$0 = theseusPlayerVipQualityTrialService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusPlayerVipQualityTrialService$trial$2 theseusPlayerVipQualityTrialService$trial$2 = new TheseusPlayerVipQualityTrialService$trial$2(this.this$0, continuation);
        theseusPlayerVipQualityTrialService$trial$2.L$0 = obj;
        return theseusPlayerVipQualityTrialService$trial$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 693
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerVipQualityTrialService$trial$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
