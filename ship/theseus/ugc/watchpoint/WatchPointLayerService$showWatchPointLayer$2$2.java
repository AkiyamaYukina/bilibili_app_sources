package com.bilibili.ship.theseus.ugc.watchpoint;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import tv.danmaku.biliplayerv2.service.interact.biz.model.ChronosThumbnailInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/WatchPointLayerService$showWatchPointLayer$2$2.class */
final class WatchPointLayerService$showWatchPointLayer$2$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final yq0.d $adapter;
    final Ref.ObjectRef<b> $bindView;
    final Ref.ObjectRef<ChronosThumbnailInfo.WatchPoint> $currentPoint;
    final Ref.IntRef $seekPosition;
    int label;
    final WatchPointLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchPointLayerService$showWatchPointLayer$2$2(WatchPointLayerService watchPointLayerService, Ref.IntRef intRef, Ref.ObjectRef<ChronosThumbnailInfo.WatchPoint> objectRef, yq0.d dVar, Ref.ObjectRef<b> objectRef2, Continuation<? super WatchPointLayerService$showWatchPointLayer$2$2> continuation) {
        super(1, continuation);
        this.this$0 = watchPointLayerService;
        this.$seekPosition = intRef;
        this.$currentPoint = objectRef;
        this.$adapter = dVar;
        this.$bindView = objectRef2;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new WatchPointLayerService$showWatchPointLayer$2$2(this.this$0, this.$seekPosition, this.$currentPoint, this.$adapter, this.$bindView, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            WatchPointLayerService watchPointLayerService = this.this$0;
            Ref.IntRef intRef = this.$seekPosition;
            Ref.ObjectRef<ChronosThumbnailInfo.WatchPoint> objectRef = this.$currentPoint;
            yq0.d dVar = this.$adapter;
            Ref.ObjectRef<b> objectRef2 = this.$bindView;
            this.label = 1;
            if (WatchPointLayerService.b(watchPointLayerService, intRef, objectRef, dVar, objectRef2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
