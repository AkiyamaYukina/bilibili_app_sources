package com.bilibili.playset.playlist.edit;

import com.bilibili.playset.api.MultitypeMedia;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/FavoriteSingleBottomSheet$batchCopy$1.class */
final class FavoriteSingleBottomSheet$batchCopy$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $folderId;
    final List<MultitypeMedia> $resources;
    private Object L$0;
    int label;
    final FavoriteSingleBottomSheet this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FavoriteSingleBottomSheet$batchCopy$1(FavoriteSingleBottomSheet favoriteSingleBottomSheet, List<? extends MultitypeMedia> list, long j7, Continuation<? super FavoriteSingleBottomSheet$batchCopy$1> continuation) {
        super(2, continuation);
        this.this$0 = favoriteSingleBottomSheet;
        this.$resources = list;
        this.$folderId = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FavoriteSingleBottomSheet$batchCopy$1 favoriteSingleBottomSheet$batchCopy$1 = new FavoriteSingleBottomSheet$batchCopy$1(this.this$0, this.$resources, this.$folderId, continuation);
        favoriteSingleBottomSheet$batchCopy$1.L$0 = obj;
        return favoriteSingleBottomSheet$batchCopy$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.edit.FavoriteSingleBottomSheet$batchCopy$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
