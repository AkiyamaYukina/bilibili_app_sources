package com.bilibili.playset.playlist.edit;

import com.bilibili.playset.api.MultitypeMedia;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/FavoriteSingleBottomSheet$batchMove$1.class */
final class FavoriteSingleBottomSheet$batchMove$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<MultitypeMedia> $resources;
    final long $sourceMediaId;
    final long $targetMediaId;
    private Object L$0;
    int label;
    final FavoriteSingleBottomSheet this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FavoriteSingleBottomSheet$batchMove$1(FavoriteSingleBottomSheet favoriteSingleBottomSheet, List<? extends MultitypeMedia> list, long j7, long j8, Continuation<? super FavoriteSingleBottomSheet$batchMove$1> continuation) {
        super(2, continuation);
        this.this$0 = favoriteSingleBottomSheet;
        this.$resources = list;
        this.$sourceMediaId = j7;
        this.$targetMediaId = j8;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FavoriteSingleBottomSheet$batchMove$1 favoriteSingleBottomSheet$batchMove$1 = new FavoriteSingleBottomSheet$batchMove$1(this.this$0, this.$resources, this.$sourceMediaId, this.$targetMediaId, continuation);
        favoriteSingleBottomSheet$batchMove$1.L$0 = obj;
        return favoriteSingleBottomSheet$batchMove$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.edit.FavoriteSingleBottomSheet$batchMove$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
