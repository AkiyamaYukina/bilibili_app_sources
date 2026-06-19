package com.bilibili.ogv.kmm.operation.banner;

import com.bilibili.framework.exposure.core.ExposureLayoutInfo;
import com.bilibili.framework.exposure.core.transformer.ExposureAreaVisibilityTransformerKt;
import j$.time.Clock;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/CreateHdrVideoModel$invoke$1$9.class */
final class CreateHdrVideoModel$invoke$1$9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final InterfaceC5438b $configHelper;
    int label;
    final T this$0;

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.CreateHdrVideoModel$invoke$1$9$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/CreateHdrVideoModel$invoke$1$9$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<ExposureLayoutInfo, Boolean, Continuation<? super Boolean>, Object> {
        Object L$0;
        boolean Z$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        public final Object invoke(ExposureLayoutInfo exposureLayoutInfo, boolean z6, Continuation<? super Boolean> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = exposureLayoutInfo;
            anonymousClass1.Z$0 = z6;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((ExposureLayoutInfo) obj, ((Boolean) obj2).booleanValue(), (Continuation<? super Boolean>) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            ExposureLayoutInfo exposureLayoutInfo = (ExposureLayoutInfo) this.L$0;
            boolean z6 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (exposureLayoutInfo == null) {
                return Boxing.boxBoolean(false);
            }
            boolean zNoticeableWhenAreaRatioIsAtLeast = ExposureAreaVisibilityTransformerKt.noticeableWhenAreaRatioIsAtLeast(exposureLayoutInfo, 1.0f);
            boolean z7 = false;
            if (z6) {
                z7 = false;
                if (zNoticeableWhenAreaRatioIsAtLeast) {
                    z7 = true;
                }
            }
            return Boxing.boxBoolean(z7);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.CreateHdrVideoModel$invoke$1$9$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/CreateHdrVideoModel$invoke$1$9$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        boolean Z$0;
        int label;
        final T this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(T t7, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = t7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
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
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (z6) {
                    T t7 = this.this$0;
                    q91.i.Companion.getClass();
                    t7.f68051e = new q91.i(Clock.systemUTC().instant());
                    this.this$0.f68054i = "close";
                } else if (this.this$0.f68048b.getValue().booleanValue() || ((Boolean) this.this$0.f68049c.getValue()).booleanValue()) {
                    T t8 = this.this$0;
                    Map<String, String> mapA = T.a(t8);
                    this.Z$0 = z6;
                    this.label = 1;
                    U u7 = t8.f68061p;
                    u7.f68065c.a("pgc." + u7.f68064b + ".pop.0.show", mapA);
                    Object objA = u7.f68066d.a(1, mapA, this);
                    if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objA = Unit.INSTANCE;
                    }
                    if (objA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.f68050d.setValue(Boolean.valueOf(z6));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateHdrVideoModel$invoke$1$9(T t7, InterfaceC5438b interfaceC5438b, Continuation<? super CreateHdrVideoModel$invoke$1$9> continuation) {
        super(2, continuation);
        this.this$0 = t7;
        this.$configHelper = interfaceC5438b;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateHdrVideoModel$invoke$1$9(this.this$0, this.$configHelper, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(this.this$0.f68047a, this.$configHelper.a(), new AnonymousClass1(null)));
            Duration.Companion companion = Duration.Companion;
            Flow flow = FlowKt.debounce-HG0u8IE(flowDistinctUntilChanged, DurationKt.toDuration(100, DurationUnit.MILLISECONDS));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
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
