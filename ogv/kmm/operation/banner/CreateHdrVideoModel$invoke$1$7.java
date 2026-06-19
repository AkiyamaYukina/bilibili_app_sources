package com.bilibili.ogv.kmm.operation.banner;

import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/CreateHdrVideoModel$invoke$1$7.class */
final class CreateHdrVideoModel$invoke$1$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final T this$0;

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.CreateHdrVideoModel$invoke$1$7$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/CreateHdrVideoModel$invoke$1$7$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Pair<? extends String, ? extends Boolean>, Continuation<? super Unit>, Object> {
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

        public final Object invoke(Pair<String, Boolean> pair, Continuation<? super Unit> continuation) {
            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = (String) pair.component1();
            if (((Boolean) pair.component2()).booleanValue() && str != null && !StringsKt.isBlank(str) && !Intrinsics.areEqual((String) this.this$0.f68053g.getValue(), str)) {
                this.this$0.f68053g.setValue(str);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateHdrVideoModel$invoke$1$7(T t7, Continuation<? super CreateHdrVideoModel$invoke$1$7> continuation) {
        super(2, continuation);
        this.this$0 = t7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Pair invokeSuspend$lambda$0(T t7) {
        String str = (String) t7.f68052f.getValue();
        Boolean bool = (Boolean) t7.f68050d.getValue();
        bool.booleanValue();
        return TuplesKt.to(str, bool);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateHdrVideoModel$invoke$1$7(this.this$0, continuation);
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
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0(t7) { // from class: com.bilibili.ogv.kmm.operation.banner.P

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final T f68044a;

                {
                    this.f68044a = t7;
                }

                public final Object invoke() {
                    return CreateHdrVideoModel$invoke$1$7.invokeSuspend$lambda$0(this.f68044a);
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
