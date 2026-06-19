package com.bilibili.ogv.kmm.operation.banner;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kntr.common.dionysus.basic.PlayingState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/CreateHdrVideoModel$invoke$1$1.class */
final class CreateHdrVideoModel$invoke$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final T this$0;

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.CreateHdrVideoModel$invoke$1$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/CreateHdrVideoModel$invoke$1$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<PlayingState, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final T this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(T t7, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = t7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(PlayingState playingState, Continuation<? super Unit> continuation) {
            return create(playingState, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            PlayingState playingState = (PlayingState) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            boolean z6 = false;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (playingState != PlayingState.COMPLETED) {
                    MutableState<Boolean> mutableState = this.this$0.f68048b;
                    if (playingState == PlayingState.READY) {
                        z6 = true;
                    }
                    mutableState.setValue(Boxing.boxBoolean(z6));
                    return Unit.INSTANCE;
                }
                this.this$0.f68057l.setValue(Boolean.TRUE);
                this.L$0 = SpillingKt.nullOutSpilledVariable(playingState);
                this.label = 1;
                if (DelayKt.delay(1500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.f68049c.setValue(Boolean.TRUE);
            this.this$0.f68048b.setValue(Boxing.boxBoolean(false));
            this.this$0.f68054i = "fade";
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateHdrVideoModel$invoke$1$1(T t7, Continuation<? super CreateHdrVideoModel$invoke$1$1> continuation) {
        super(2, continuation);
        this.this$0 = t7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayingState invokeSuspend$lambda$0(T t7) {
        return t7.b().i();
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateHdrVideoModel$invoke$1$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final T t7 = this.this$0;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0(t7) { // from class: com.bilibili.ogv.kmm.operation.banner.M

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final T f68041a;

                {
                    this.f68041a = t7;
                }

                public final Object invoke() {
                    return CreateHdrVideoModel$invoke$1$1.invokeSuspend$lambda$0(this.f68041a);
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowSnapshotFlow, anonymousClass2, this) == coroutine_suspended) {
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
