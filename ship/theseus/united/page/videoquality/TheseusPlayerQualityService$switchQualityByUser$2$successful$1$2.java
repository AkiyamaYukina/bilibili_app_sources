package com.bilibili.ship.theseus.united.page.videoquality;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$switchQualityByUser$2$successful$1$2.class */
public final class TheseusPlayerQualityService$switchQualityByUser$2$successful$1$2 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    final Ref.BooleanRef $hitTrial;
    final com.bilibili.player.tangram.basic.c $preference;
    final Ref.BooleanRef $usesAnimationForQuality;
    int label;
    final TheseusPlayerQualityService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayerQualityService$switchQualityByUser$2$successful$1$2(Ref.BooleanRef booleanRef, TheseusPlayerQualityService theseusPlayerQualityService, com.bilibili.player.tangram.basic.c cVar, Ref.BooleanRef booleanRef2, Continuation<? super TheseusPlayerQualityService$switchQualityByUser$2$successful$1$2> continuation) {
        super(1, continuation);
        this.$usesAnimationForQuality = booleanRef;
        this.this$0 = theseusPlayerQualityService;
        this.$preference = cVar;
        this.$hitTrial = booleanRef2;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TheseusPlayerQualityService$switchQualityByUser$2$successful$1$2(this.$usesAnimationForQuality, this.this$0, this.$preference, this.$hitTrial, continuation);
    }

    public final Object invoke(Continuation<? super Boolean> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService$switchQualityByUser$2$successful$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
