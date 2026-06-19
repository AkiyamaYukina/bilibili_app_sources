package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v2;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v2/StrategyManagerImpl$saveCurShowResult$1.class */
final class StrategyManagerImpl$saveCurShowResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Pair<String, String> $cacheKey;
    int label;
    final i<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrategyManagerImpl$saveCurShowResult$1(i<Object> iVar, Pair<String, String> pair, Continuation<? super StrategyManagerImpl$saveCurShowResult$1> continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$cacheKey = pair;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StrategyManagerImpl$saveCurShowResult$1(this.this$0, this.$cacheKey, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.media.strategy.v2.StrategyManagerImpl$saveCurShowResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
