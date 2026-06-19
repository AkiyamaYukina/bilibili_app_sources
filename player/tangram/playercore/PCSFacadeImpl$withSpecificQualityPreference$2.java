package com.bilibili.player.tangram.playercore;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$withSpecificQualityPreference$2.class */
final class PCSFacadeImpl$withSpecificQualityPreference$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.bilibili.player.tangram.basic.c>, Object> {
    final int $specifiedQuality;
    final boolean $usePriorityQuality;
    private Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final PCSFacadeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PCSFacadeImpl$withSpecificQualityPreference$2(int i7, boolean z6, PCSFacadeImpl pCSFacadeImpl, Continuation<? super PCSFacadeImpl$withSpecificQualityPreference$2> continuation) {
        super(2, continuation);
        this.$specifiedQuality = i7;
        this.$usePriorityQuality = z6;
        this.this$0 = pCSFacadeImpl;
    }

    private static final Job invokeSuspend$runCore(CoroutineScope coroutineScope, PCSFacadeImpl pCSFacadeImpl, int i7) {
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PCSFacadeImpl$withSpecificQualityPreference$2$runCore$1(pCSFacadeImpl, i7, null), 3, (Object) null);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PCSFacadeImpl$withSpecificQualityPreference$2 pCSFacadeImpl$withSpecificQualityPreference$2 = new PCSFacadeImpl$withSpecificQualityPreference$2(this.$specifiedQuality, this.$usePriorityQuality, this.this$0, continuation);
        pCSFacadeImpl$withSpecificQualityPreference$2.L$0 = obj;
        return pCSFacadeImpl$withSpecificQualityPreference$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.bilibili.player.tangram.basic.c> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0266  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x02a1 -> B:86:0x0247). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01ee -> B:73:0x01f4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSFacadeImpl$withSpecificQualityPreference$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
