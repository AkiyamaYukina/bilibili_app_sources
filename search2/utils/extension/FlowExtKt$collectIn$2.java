package com.bilibili.search2.utils.extension;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/extension/FlowExtKt$collectIn$2.class */
final class FlowExtKt$collectIn$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function1<Object, Unit> $action;
    final LifecycleOwner $lifecycleOwner;
    final Lifecycle.State $minActiveState;
    final KProperty1<Object, Object> $prop;
    final Flow<Object> $this_collectIn;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/extension/FlowExtKt$collectIn$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1<Object, Unit> f88812a;

        public a(Function1<Object, Unit> function1) {
            this.f88812a = function1;
        }

        public final Object emit(Object obj, Continuation continuation) {
            this.f88812a.invoke(((d) obj).f88822a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$collectIn$2(Flow<Object> flow, LifecycleOwner lifecycleOwner, Lifecycle.State state, KProperty1<Object, Object> kProperty1, Function1<Object, Unit> function1, Continuation<? super FlowExtKt$collectIn$2> continuation) {
        super(2, continuation);
        this.$this_collectIn = flow;
        this.$lifecycleOwner = lifecycleOwner;
        this.$minActiveState = state;
        this.$prop = kProperty1;
        this.$action = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlowExtKt$collectIn$2(this.$this_collectIn, this.$lifecycleOwner, this.$minActiveState, this.$prop, this.$action, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bilibili.search2.utils.extension.FlowExtKt$collectIn$2$invokeSuspend$$inlined$map$1] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(this.$this_collectIn, this.$lifecycleOwner.getLifecycle(), this.$minActiveState);
            final KProperty1<Object, Object> kProperty1 = this.$prop;
            ?? r02 = new Flow<d<Object>>(flowFlowWithLifecycle, kProperty1) { // from class: com.bilibili.search2.utils.extension.FlowExtKt$collectIn$2$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Flow f88813a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final KProperty1 f88814b;

                /* JADX INFO: renamed from: com.bilibili.search2.utils.extension.FlowExtKt$collectIn$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/extension/FlowExtKt$collectIn$2$invokeSuspend$$inlined$map$1$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f88815a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final KProperty1 f88816b;

                    /* JADX INFO: renamed from: com.bilibili.search2.utils.extension.FlowExtKt$collectIn$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/extension/FlowExtKt$collectIn$2$invokeSuspend$$inlined$map$1$2$1.class */
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

                    public AnonymousClass2(FlowCollector flowCollector, KProperty1 kProperty1) {
                        this.f88815a = flowCollector;
                        this.f88816b = kProperty1;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                        /*
                            r5 = this;
                            r0 = r7
                            boolean r0 = r0 instanceof com.bilibili.search2.utils.extension.FlowExtKt$collectIn$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L29
                            r0 = r7
                            com.bilibili.search2.utils.extension.FlowExtKt$collectIn$2$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.search2.utils.extension.FlowExtKt$collectIn$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            r9 = r0
                            r0 = r9
                            int r0 = r0.label
                            r8 = r0
                            r0 = r8
                            r1 = -2147483648(0xffffffff80000000, float:-0.0)
                            r0 = r0 & r1
                            if (r0 == 0) goto L29
                            r0 = r9
                            r1 = r8
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            int r1 = r1 + r2
                            r0.label = r1
                            r0 = r9
                            r7 = r0
                            goto L33
                        L29:
                            com.bilibili.search2.utils.extension.FlowExtKt$collectIn$2$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.search2.utils.extension.FlowExtKt$collectIn$2$invokeSuspend$$inlined$map$1$2$1
                            r1 = r0
                            r2 = r5
                            r3 = r7
                            r1.<init>(r2, r3)
                            r7 = r0
                        L33:
                            r0 = r7
                            java.lang.Object r0 = r0.result
                            r10 = r0
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            r9 = r0
                            r0 = r7
                            int r0 = r0.label
                            r8 = r0
                            r0 = r8
                            if (r0 == 0) goto L5e
                            r0 = r8
                            r1 = 1
                            if (r0 != r1) goto L54
                            r0 = r10
                            kotlin.ResultKt.throwOnFailure(r0)
                            goto L8d
                        L54:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            r1 = r0
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r0
                        L5e:
                            r0 = r10
                            kotlin.ResultKt.throwOnFailure(r0)
                            com.bilibili.search2.utils.extension.d r0 = new com.bilibili.search2.utils.extension.d
                            r1 = r0
                            r2 = r5
                            kotlin.reflect.KProperty1 r2 = r2.f88816b
                            r3 = r6
                            java.lang.Object r2 = r2.get(r3)
                            r1.<init>(r2)
                            r6 = r0
                            r0 = r7
                            r1 = 1
                            r0.label = r1
                            r0 = r5
                            kotlinx.coroutines.flow.FlowCollector r0 = r0.f88815a
                            r1 = r6
                            r2 = r7
                            java.lang.Object r0 = r0.emit(r1, r2)
                            r1 = r9
                            if (r0 != r1) goto L8d
                            r0 = r9
                            return r0
                        L8d:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.utils.extension.FlowExtKt$collectIn$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f88813a = flowFlowWithLifecycle;
                    this.f88814b = kProperty1;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = this.f88813a.collect(new AnonymousClass2(flowCollector, this.f88814b), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            a aVar = new a(this.$action);
            this.label = 1;
            if (r02.collect(aVar, this) == coroutine_suspended) {
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
