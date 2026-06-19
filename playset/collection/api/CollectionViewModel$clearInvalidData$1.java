package com.bilibili.playset.collection.api;

import com.bilibili.api.BiliApiException;
import com.bilibili.playset.api.i;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/collection/api/CollectionViewModel$clearInvalidData$1.class */
public final class CollectionViewModel$clearInvalidData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $playlistId;
    int label;
    final CollectionViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$clearInvalidData$1(long j7, CollectionViewModel collectionViewModel, Continuation<? super CollectionViewModel$clearInvalidData$1> continuation) {
        super(2, continuation);
        this.$playlistId = j7;
        this.this$0 = collectionViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CollectionViewModel$clearInvalidData$1(this.$playlistId, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
        } catch (Exception e7) {
            if (e7 instanceof BiliApiException) {
                this.this$0.f84210c.setValue(TuplesKt.to(Boxing.boxInt(2), e7.getMessage()));
            } else {
                this.this$0.f84210c.setValue(TuplesKt.to(Boxing.boxInt(2), (Object) null));
            }
        }
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long j7 = this.$playlistId;
            this.label = 1;
            if (i.g(j7, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        CollectionViewModel collectionViewModel = this.this$0;
        long j8 = this.$playlistId;
        this.label = 2;
        collectionViewModel.getClass();
        Duration.Companion companion = Duration.Companion;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        long duration = DurationKt.toDuration(1, durationUnit);
        long duration2 = DurationKt.toDuration(2, durationUnit);
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(getContext().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))), (CoroutineContext) null, (CoroutineStart) null, new CollectionViewModel$queryCleanState$$inlined$queryUntilSuccess_hTMF5Xc$default$1(DurationKt.toDuration(5, durationUnit), duration, duration2, 2, null, collectionViewModel, collectionViewModel, j8, collectionViewModel), 3, (Object) null);
        if (Unit.INSTANCE == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
