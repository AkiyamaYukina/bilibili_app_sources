package com.bilibili.music.podcast.data;

import com.bilibili.api.BiliApiException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/MusicCollectionViewModel$clearInvalidData$1.class */
public final class MusicCollectionViewModel$clearInvalidData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $playlistId;
    int label;
    final MusicCollectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicCollectionViewModel$clearInvalidData$1(long j7, MusicCollectionViewModel musicCollectionViewModel, Continuation<? super MusicCollectionViewModel$clearInvalidData$1> continuation) {
        super(2, continuation);
        this.$playlistId = j7;
        this.this$0 = musicCollectionViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MusicCollectionViewModel$clearInvalidData$1(this.$playlistId, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.playset.widget.favorite.f fVar = com.bilibili.playset.widget.favorite.f.f85754a;
            long j7 = this.$playlistId;
            this.label = 1;
            Object objA = fVar.a(j7, this);
            obj2 = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        MusicCollectionViewModel musicCollectionViewModel = this.this$0;
        if (Result.isSuccess-impl(obj2)) {
            Pair<Integer, String> value = musicCollectionViewModel.f66419c.getValue();
            if (value == null || ((Number) value.getFirst()).intValue() != 1) {
                musicCollectionViewModel.f66419c.setValue(TuplesKt.to(Boxing.boxInt(1), (Object) null));
            }
        }
        MusicCollectionViewModel musicCollectionViewModel2 = this.this$0;
        Throwable th = Result.exceptionOrNull-impl(obj2);
        if (th != null) {
            if (th instanceof BiliApiException) {
                musicCollectionViewModel2.f66419c.setValue(TuplesKt.to(Boxing.boxInt(2), th.getMessage()));
            } else {
                musicCollectionViewModel2.f66419c.setValue(TuplesKt.to(Boxing.boxInt(2), (Object) null));
            }
        }
        return Unit.INSTANCE;
    }
}
