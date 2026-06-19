package com.bilibili.ogv.kmm.operation.banner;

import androidx.compose.runtime.SnapshotStateKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/CreateHdrVideoModel$invoke$1$5.class */
final class CreateHdrVideoModel$invoke$1$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final T this$0;

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.CreateHdrVideoModel$invoke$1$5$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/CreateHdrVideoModel$invoke$1$5$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Float, Continuation<? super Unit>, Object> {
        float F$0;
        int label;
        final T this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(T t7, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = t7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.F$0 = ((Number) obj).floatValue();
            return anonymousClass2;
        }

        public final Object invoke(float f7, Continuation<? super Unit> continuation) {
            return create(Float.valueOf(f7), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).floatValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            float f7 = this.F$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.b().o(f7);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateHdrVideoModel$invoke$1$5(T t7, Continuation<? super CreateHdrVideoModel$invoke$1$5> continuation) {
        super(2, continuation);
        this.this$0 = t7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invokeSuspend$lambda$0(T t7) {
        return t7.h.getFloatValue();
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateHdrVideoModel$invoke$1$5(this.this$0, continuation);
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
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0(t7) { // from class: com.bilibili.ogv.kmm.operation.banner.O

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final T f68043a;

                {
                    this.f68043a = t7;
                }

                public final Object invoke() {
                    return Float.valueOf(CreateHdrVideoModel$invoke$1$5.invokeSuspend$lambda$0(this.f68043a));
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
