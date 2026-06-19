package com.bilibili.player.tangram.playercore;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$run$2$pieceJob$1.class */
public final class FlattenedPCSFacade$run$2$pieceJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final CoroutineScope $coordinatingCoroutineScope;
    final Object $legacy;
    final boolean $seeksAccurately;
    final long $targetPosition;
    int label;
    final FlattenedPCSFacade this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlattenedPCSFacade$run$2$pieceJob$1(Object obj, FlattenedPCSFacade flattenedPCSFacade, long j7, boolean z6, CoroutineScope coroutineScope, Continuation<? super FlattenedPCSFacade$run$2$pieceJob$1> continuation) {
        super(2, continuation);
        this.$legacy = obj;
        this.this$0 = flattenedPCSFacade;
        this.$targetPosition = j7;
        this.$seeksAccurately = z6;
        this.$coordinatingCoroutineScope = coroutineScope;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlattenedPCSFacade$run$2$pieceJob$1(this.$legacy, this.this$0, this.$targetPosition, this.$seeksAccurately, this.$coordinatingCoroutineScope, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        int iCoerceAtLeast;
        long j7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.$legacy;
            if (obj2 instanceof Duration) {
                iCoerceAtLeast = this.this$0.f79357f;
                j7 = ((Duration) obj2).unbox-impl();
            } else {
                int i8 = CollectionsKt.i(this.this$0.f79361k, Duration.box-impl(this.$targetPosition));
                int i9 = i8;
                if (i8 < 0) {
                    i9 = (-i8) - 2;
                }
                iCoerceAtLeast = RangesKt.coerceAtLeast(i9, 0);
                j7 = Duration.minus-LRDsOJo(this.$targetPosition, ((Duration) ((ArrayList) this.this$0.f79361k).get(iCoerceAtLeast)).unbox-impl());
            }
            FlattenedPCSFacade flattenedPCSFacade = this.this$0;
            boolean z6 = this.$seeksAccurately;
            CoroutineScope coroutineScope = this.$coordinatingCoroutineScope;
            this.label = 1;
            flattenedPCSFacade.getClass();
            if (CoroutineScopeKt.coroutineScope(new FlattenedPCSFacade$runPiece$2(flattenedPCSFacade, iCoerceAtLeast, j7, coroutineScope, z6, null), this) == coroutine_suspended) {
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
