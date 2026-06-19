package com.bilibili.ogv.kmm.operation.banner;

import androidx.compose.runtime.SnapshotStateKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/CreateHdrVideoModel$invoke$1$8.class */
final class CreateHdrVideoModel$invoke$1$8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final T this$0;

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.CreateHdrVideoModel$invoke$1$8$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/CreateHdrVideoModel$invoke$1$8$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
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

        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return create(str, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (StringsKt.isBlank(str)) {
                this.this$0.b().p();
            } else {
                this.this$0.b().k(str);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateHdrVideoModel$invoke$1$8(T t7, Continuation<? super CreateHdrVideoModel$invoke$1$8> continuation) {
        super(2, continuation);
        this.this$0 = t7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String invokeSuspend$lambda$0(T t7) {
        return (String) t7.f68053g.getValue();
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateHdrVideoModel$invoke$1$8(this.this$0, continuation);
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
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0(t7) { // from class: com.bilibili.ogv.kmm.operation.banner.Q

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final T f68045a;

                {
                    this.f68045a = t7;
                }

                public final Object invoke() {
                    return CreateHdrVideoModel$invoke$1$8.invokeSuspend$lambda$0(this.f68045a);
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
