package com.bilibili.ship.theseus.playlist.util;

import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/util/KOfflineDataHelperKt$processKOfflineData$2.class */
public final class KOfflineDataHelperKt$processKOfflineData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends MultiTypeMedia>>, Object> {
    final int $type;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KOfflineDataHelperKt$processKOfflineData$2(int i7, Continuation<? super KOfflineDataHelperKt$processKOfflineData$2> continuation) {
        super(2, continuation);
        this.$type = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KOfflineDataHelperKt$processKOfflineData$2(this.$type, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<MultiTypeMedia>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, video.biz.offline.base.facade.viewmodel.a] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, video.biz.offline.base.facade.viewmodel.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.util.KOfflineDataHelperKt$processKOfflineData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
