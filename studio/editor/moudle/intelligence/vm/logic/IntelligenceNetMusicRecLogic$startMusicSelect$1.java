package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import com.bilibili.studio.editor.moudle.intelligence.vm.logic.I;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/IntelligenceNetMusicRecLogic$startMusicSelect$1.class */
final class IntelligenceNetMusicRecLogic$startMusicSelect$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final I.a $callback;
    final List<String> $musicList;
    final String $picVideoId;
    final long $startTime;
    long J$0;
    private Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final I this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntelligenceNetMusicRecLogic$startMusicSelect$1(long j7, I i7, String str, I.a aVar, List<String> list, Continuation<? super IntelligenceNetMusicRecLogic$startMusicSelect$1> continuation) {
        super(2, continuation);
        this.$startTime = j7;
        this.this$0 = i7;
        this.$picVideoId = str;
        this.$callback = aVar;
        this.$musicList = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IntelligenceNetMusicRecLogic$startMusicSelect$1 intelligenceNetMusicRecLogic$startMusicSelect$1 = new IntelligenceNetMusicRecLogic$startMusicSelect$1(this.$startTime, this.this$0, this.$picVideoId, this.$callback, this.$musicList, continuation);
        intelligenceNetMusicRecLogic$startMusicSelect$1.L$0 = obj;
        return intelligenceNetMusicRecLogic$startMusicSelect$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x040e, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x042b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x013f -> B:20:0x0142). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 1824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.vm.logic.IntelligenceNetMusicRecLogic$startMusicSelect$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
