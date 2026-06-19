package com.bilibili.ship.theseus.united.page.videoquality;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$switchQualityByUser$2.class */
public final class TheseusPlayerQualityService$switchQualityByUser$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.BooleanRef $hitCtccFree;
    final Ref.BooleanRef $hitTrial;
    final com.bilibili.player.tangram.basic.c $preference;
    final com.bilibili.player.tangram.basic.c $priorPreference;
    Object L$0;
    boolean Z$0;
    int label;
    final TheseusPlayerQualityService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayerQualityService$switchQualityByUser$2(TheseusPlayerQualityService theseusPlayerQualityService, com.bilibili.player.tangram.basic.c cVar, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, com.bilibili.player.tangram.basic.c cVar2, Continuation<? super TheseusPlayerQualityService$switchQualityByUser$2> continuation) {
        super(2, continuation);
        this.this$0 = theseusPlayerQualityService;
        this.$preference = cVar;
        this.$hitTrial = booleanRef;
        this.$hitCtccFree = booleanRef2;
        this.$priorPreference = cVar2;
    }

    private static final Unit invokeSuspend$lambda$0(Ref.BooleanRef booleanRef, TheseusPlayerQualityService theseusPlayerQualityService, com.bilibili.player.tangram.basic.c cVar, Ref.BooleanRef booleanRef2, Ref.BooleanRef booleanRef3, com.bilibili.ogv.infra.coroutine.c cVar2) {
        cVar2.b(new TheseusPlayerQualityService$switchQualityByUser$2$successful$1$1(booleanRef, theseusPlayerQualityService, cVar, null));
        cVar2.b(new TheseusPlayerQualityService$switchQualityByUser$2$successful$1$2(booleanRef2, theseusPlayerQualityService, cVar, booleanRef3, null));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusPlayerQualityService$switchQualityByUser$2(this.this$0, this.$preference, this.$hitTrial, this.$hitCtccFree, this.$priorPreference, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:101:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x09f3  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0b0d  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0b4a  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0b5f  */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 3079
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService$switchQualityByUser$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
