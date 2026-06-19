package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyCompletedLayerService$playAnimation$2.class */
final class CheeseStudyCompletedLayerService$playAnimation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final CheeseStudyCompletedComponent.a $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseStudyCompletedLayerService$playAnimation$2(CheeseStudyCompletedComponent.a aVar, Continuation<? super CheeseStudyCompletedLayerService$playAnimation$2> continuation) {
        super(2, continuation);
        this.$state = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final CheeseStudyCompletedComponent.a.c invokeSuspend$lambda$0(CheeseStudyCompletedComponent.a aVar) {
        return (CheeseStudyCompletedComponent.a.c) aVar.f90148i.getValue();
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseStudyCompletedLayerService$playAnimation$2(this.$state, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.studyrecord.CheeseStudyCompletedLayerService$playAnimation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
