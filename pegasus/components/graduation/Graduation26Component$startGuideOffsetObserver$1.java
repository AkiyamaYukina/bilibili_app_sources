package com.bilibili.pegasus.components.graduation;

import androidx.compose.ui.platform.ComposeView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.bili.khome.vm.HomeFrameViewModel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$startGuideOffsetObserver$1.class */
final class Graduation26Component$startGuideOffsetObserver$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final Graduation26Component this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.graduation.Graduation26Component$startGuideOffsetObserver$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$startGuideOffsetObserver$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        int I$0;
        int label;
        final Graduation26Component this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Graduation26Component graduation26Component, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = graduation26Component;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.I$0 = ((Number) obj).intValue();
            return anonymousClass2;
        }

        public final Object invoke(int i7, Continuation<? super Unit> continuation) {
            return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i7 = this.I$0;
            ComposeView composeView = ((G) this.this$0.f75990q.getValue()).f75977d;
            if (composeView != null) {
                composeView.setTranslationY(-i7);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Graduation26Component$startGuideOffsetObserver$1(Graduation26Component graduation26Component, Continuation<? super Graduation26Component$startGuideOffsetObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = graduation26Component;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Graduation26Component$startGuideOffsetObserver$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final Flow flow = ((HomeFrameViewModel) this.this$0.f75987n.getValue()).c;
            final Graduation26Component graduation26Component = this.this$0;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Integer>(flow, graduation26Component) { // from class: com.bilibili.pegasus.components.graduation.Graduation26Component$startGuideOffsetObserver$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Flow f76013a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Graduation26Component f76014b;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.graduation.Graduation26Component$startGuideOffsetObserver$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$startGuideOffsetObserver$1$invokeSuspend$$inlined$map$1$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f76015a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Graduation26Component f76016b;

                    /* JADX INFO: renamed from: com.bilibili.pegasus.components.graduation.Graduation26Component$startGuideOffsetObserver$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/Graduation26Component$startGuideOffsetObserver$1$invokeSuspend$$inlined$map$1$2$1.class */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        Object result;
                        final AnonymousClass2 this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                            super(continuation);
                            this.this$0 = anonymousClass2;
                        }

                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return this.this$0.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, Graduation26Component graduation26Component) {
                        this.f76015a = flowCollector;
                        this.f76016b = graduation26Component;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                        /*
                            r5 = this;
                            r0 = r7
                            boolean r0 = r0 instanceof com.bilibili.pegasus.components.graduation.Graduation26Component$startGuideOffsetObserver$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L2c
                            r0 = r7
                            com.bilibili.pegasus.components.graduation.Graduation26Component$startGuideOffsetObserver$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.pegasus.components.graduation.Graduation26Component$startGuideOffsetObserver$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            r10 = r0
                            r0 = r10
                            int r0 = r0.label
                            r9 = r0
                            r0 = r9
                            r1 = -2147483648(0xffffffff80000000, float:-0.0)
                            r0 = r0 & r1
                            if (r0 == 0) goto L2c
                            r0 = r10
                            r1 = r9
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            int r1 = r1 + r2
                            r0.label = r1
                            r0 = r10
                            r7 = r0
                            goto L36
                        L2c:
                            com.bilibili.pegasus.components.graduation.Graduation26Component$startGuideOffsetObserver$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.pegasus.components.graduation.Graduation26Component$startGuideOffsetObserver$1$invokeSuspend$$inlined$map$1$2$1
                            r1 = r0
                            r2 = r5
                            r3 = r7
                            r1.<init>(r2, r3)
                            r7 = r0
                        L36:
                            r0 = r7
                            java.lang.Object r0 = r0.result
                            r11 = r0
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            r10 = r0
                            r0 = r7
                            int r0 = r0.label
                            r9 = r0
                            r0 = r9
                            if (r0 == 0) goto L64
                            r0 = r9
                            r1 = 1
                            if (r0 != r1) goto L5a
                            r0 = r11
                            kotlin.ResultKt.throwOnFailure(r0)
                            goto Lac
                        L5a:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            r1 = r0
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r0
                        L64:
                            r0 = r11
                            kotlin.ResultKt.throwOnFailure(r0)
                            r0 = r6
                            od1.d r0 = (od1.d) r0
                            od1.a r0 = r0.i
                            float r0 = r0.a
                            r8 = r0
                            r0 = r5
                            com.bilibili.pegasus.components.graduation.Graduation26Component r0 = r0.f76016b
                            int r0 = r0.h()
                            r9 = r0
                            r0 = 1065353216(0x3f800000, float:1.0)
                            r1 = r8
                            r2 = 0
                            r3 = 1065353216(0x3f800000, float:1.0)
                            float r1 = kotlin.ranges.RangesKt.coerceIn(r1, r2, r3)
                            float r0 = r0 - r1
                            r1 = r9
                            r2 = 0
                            int r1 = kotlin.ranges.RangesKt.coerceAtLeast(r1, r2)
                            float r1 = (float) r1
                            float r0 = r0 * r1
                            int r0 = kotlin.math.MathKt.roundToInt(r0)
                            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
                            r6 = r0
                            r0 = r7
                            r1 = 1
                            r0.label = r1
                            r0 = r5
                            kotlinx.coroutines.flow.FlowCollector r0 = r0.f76015a
                            r1 = r6
                            r2 = r7
                            java.lang.Object r0 = r0.emit(r1, r2)
                            r1 = r10
                            if (r0 != r1) goto Lac
                            r0 = r10
                            return r0
                        Lac:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.graduation.Graduation26Component$startGuideOffsetObserver$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f76013a = flow;
                    this.f76014b = graduation26Component;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = this.f76013a.collect(new AnonymousClass2(flowCollector, this.f76014b), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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
