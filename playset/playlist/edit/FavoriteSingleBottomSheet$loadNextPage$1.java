package com.bilibili.playset.playlist.edit;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/FavoriteSingleBottomSheet$loadNextPage$1.class */
final class FavoriteSingleBottomSheet$loadNextPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final FavoriteSingleBottomSheet this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteSingleBottomSheet$loadNextPage$1(FavoriteSingleBottomSheet favoriteSingleBottomSheet, Continuation<? super FavoriteSingleBottomSheet$loadNextPage$1> continuation) {
        super(2, continuation);
        this.this$0 = favoriteSingleBottomSheet;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FavoriteSingleBottomSheet$loadNextPage$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FavoriteSingleBottomSheet favoriteSingleBottomSheet = this.this$0;
            this.label = 1;
            if (FavoriteSingleBottomSheet.jf(favoriteSingleBottomSheet, false, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
