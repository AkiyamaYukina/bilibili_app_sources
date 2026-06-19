package com.bilibili.studio.editor.moudle.intelligence.frame;

import com.bilibili.commons.tuple.Pair;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import rz0.i;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/FrameUtils$getMultipleFramesSync$1.class */
final class FrameUtils$getMultipleFramesSync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<Pair<File, Boolean>> $frameFileList;
    final i $frameTask;
    final List<Pair<Long, Integer>> $frameTimePairList;
    final Object $locker;
    private Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameUtils$getMultipleFramesSync$1(List<? extends Pair<Long, Integer>> list, Object obj, i iVar, List<Pair<File, Boolean>> list2, Continuation<? super FrameUtils$getMultipleFramesSync$1> continuation) {
        super(2, continuation);
        this.$frameTimePairList = list;
        this.$locker = obj;
        this.$frameTask = iVar;
        this.$frameFileList = list2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FrameUtils$getMultipleFramesSync$1 frameUtils$getMultipleFramesSync$1 = new FrameUtils$getMultipleFramesSync$1(this.$frameTimePairList, this.$locker, this.$frameTask, this.$frameFileList, continuation);
        frameUtils$getMultipleFramesSync$1.L$0 = obj;
        return frameUtils$getMultipleFramesSync$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0102  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ee -> B:21:0x00f3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.frame.FrameUtils$getMultipleFramesSync$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
