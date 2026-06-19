package com.bilibili.playset.playlist.edit;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/FavoriteSingleBottomSheet$batchCopyV2$1.class */
final class FavoriteSingleBottomSheet$batchCopyV2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $folderId;
    final String $resources;
    private Object L$0;
    int label;
    final FavoriteSingleBottomSheet this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteSingleBottomSheet$batchCopyV2$1(String str, long j7, FavoriteSingleBottomSheet favoriteSingleBottomSheet, Continuation<? super FavoriteSingleBottomSheet$batchCopyV2$1> continuation) {
        super(2, continuation);
        this.$resources = str;
        this.$folderId = j7;
        this.this$0 = favoriteSingleBottomSheet;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FavoriteSingleBottomSheet$batchCopyV2$1 favoriteSingleBottomSheet$batchCopyV2$1 = new FavoriteSingleBottomSheet$batchCopyV2$1(this.$resources, this.$folderId, this.this$0, continuation);
        favoriteSingleBottomSheet$batchCopyV2$1.L$0 = obj;
        return favoriteSingleBottomSheet$batchCopyV2$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0149  */
    /* JADX WARN: Type inference failed for: r0v31, types: [androidx.fragment.app.Fragment, com.bilibili.playset.playlist.edit.FavoriteSingleBottomSheet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.edit.FavoriteSingleBottomSheet$batchCopyV2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
