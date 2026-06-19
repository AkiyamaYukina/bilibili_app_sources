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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/CreateHdrVideoModel$invoke$1$3.class */
final class CreateHdrVideoModel$invoke$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final InterfaceC5438b $configHelper;
    int label;
    final T this$0;

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.CreateHdrVideoModel$invoke$1$3$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/CreateHdrVideoModel$invoke$1$3$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final InterfaceC5438b $configHelper;
        boolean Z$0;
        int label;
        final T this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC5438b interfaceC5438b, T t7, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$configHelper = interfaceC5438b;
            this.this$0 = t7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$configHelper, this.this$0, continuation);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object invokeSuspend(Object obj) {
            boolean z6 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (z6) {
                this.$configHelper.c();
                if (StringsKt.isBlank((String) this.this$0.f68053g.getValue())) {
                    T t7 = this.this$0;
                    String str = (String) t7.f68052f.getValue();
                    String str2 = str;
                    if (str == null) {
                        str2 = "";
                    }
                    t7.f68053g.setValue(str2);
                }
                this.this$0.b().l();
            } else {
                this.this$0.b().j();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateHdrVideoModel$invoke$1$3(T t7, InterfaceC5438b interfaceC5438b, Continuation<? super CreateHdrVideoModel$invoke$1$3> continuation) {
        super(2, continuation);
        this.this$0 = t7;
        this.$configHelper = interfaceC5438b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean invokeSuspend$lambda$0(T t7) {
        return ((Boolean) t7.f68050d.getValue()).booleanValue();
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateHdrVideoModel$invoke$1$3(this.this$0, this.$configHelper, continuation);
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
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0(t7) { // from class: com.bilibili.ogv.kmm.operation.banner.N

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final T f68042a;

                {
                    this.f68042a = t7;
                }

                public final Object invoke() {
                    return Boolean.valueOf(CreateHdrVideoModel$invoke$1$3.invokeSuspend$lambda$0(this.f68042a));
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$configHelper, this.this$0, null);
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
